/*************************************************************** 
* file: Play.java 
* author: Jihun Choi
* date last modified: 10/02/2022 
* 
* purpose: This class is jFrmae class that is used for Play screen
* Once this class is constucted, User will be playing game of hangman
* 
****************************************************************/

//Button logic are basically same except skip button which is Jbutton1.
//Same code are copied and pasted for each button from jbutton 2 to 27.
//it has lots of redundancy since of copy and paste, method will be extracted in next version to reduce the redundancy
//Please read jButton3ActionPerfromed method to understand how logic for buttons are applied.
package com.mycompany.hang_v1;


import java.util.ArrayList;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Play extends javax.swing.JFrame {
       private int day, month,year; //used for clock
       private int hour, minute, second; //used for clock
       private String daystr,timestr; //usedf for jlabel and clock
       private String word = ""; //word saver
       private int score = 100; //socre saver, it starts from 100 points
       private int answerCheck; //used as correct letter counter, starts from length of word, and subract 1 whenever correct letter is guessedd
       private String hidden = ""; // used to write "-" for word length
       private String score1 = String.valueOf(score); //used for String saver once int socre converted to String data type       
       
          
        
    /**
     * Creates new form Play
     */
    public Play() {
        initComponents();
        this.setBounds(0, 0, 610, 435); //setting the bound
        this.setLocationRelativeTo(null); //setting the screen to center
        currentTime(); //calling clokc function
        
       ArrayList<String> word_bank = new ArrayList<>(); //creating word bank
       
       word_bank.add("ABSTRACT"); //adding words that are used
       word_bank.add("CEMETERY");
       word_bank.add("NURSE");
       word_bank.add("PHARMACY");
       word_bank.add("CLIMBING");
       
       
       Random rand = new Random(); //random function is used to choose one of five words
        int upper_bound = 5; 
        int int_random = rand.nextInt(upper_bound);
        String hang_word = word_bank.get(int_random); //word is chosen
            
        word = hang_word; //assigning word to saver
        answerCheck = word.length(); //assigning how many letter needs to be guessed.
          
        //for loop to write word in hidden format by using "-"
        for (int i = 0; i < this.word.length(); i++) 
        {
            hidden += "-";
        }
        jLabel1.setText(hidden); //setting jLabel with hidden word format
        jLabel2.setText("Score: " + score1);// setting jLabel with score        
        
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
          KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
          getRootPane().getActionMap().put("Cancel", new AbstractAction()
          { 
              public void actionPerformed(ActionEvent e)
              {
                  System.exit(0);
              }
       });
          
      getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
          KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "Open");
          getRootPane().getActionMap().put("Open", new AbstractAction()
          { 
              public void actionPerformed(ActionEvent e)
              {
                  JOptionPane.showMessageDialog(null, "Jihun Choi \ntkarnrwlehtk@gmail.com");
              }
       });       
       
        
    }
    // method: write
    // purpose: this method is to write to the score information to file named "current_socre.txt
    public void write(String current_score)
    {
        try  
    {         
        File f= new File("current_score.txt");  //file to be delete  
        if(f.delete())                      //returns Boolean value  
        {  
            System.out.println(f.getName() + " deleted");   //getting and printing the file name  
        }  
        else  
        {  
            System.out.println("failed");  
        }  
    }  
    catch(Exception e)  
    {  
        e.printStackTrace();  
    }  
        
    try {
            FileWriter writer = new FileWriter("current_score.txt", true);
            writer.write(current_score);           
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    
    // method: currentTime
    // purpose: this method uses the Calendar and SimplDataFormat class to present correct local time on the screen
    public void currentTime(){
        
        Thread clock = new Thread(){
                public void run(){
                    while(true)
                {
                    try{
                        Calendar c = Calendar.getInstance();
                        minute = c.get(Calendar.MINUTE);
                        second = c.get(Calendar.SECOND);
                        hour = c.get(Calendar.HOUR);
                        if(hour>12)
                        {
                            hour = hour - 12;
                        }
                        day = c.get(Calendar.DAY_OF_MONTH);
                        month = c.get(Calendar.MONTH);
                        year = c.get(Calendar.YEAR);
                        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
                        Date dat = c.getTime();
                        timestr = sdf.format(dat);
                        daystr = sd.format(dat);
                        jLabel3.setText(timestr);
                        jLabel4.setText(daystr);
                        
                    }catch(Exception e){
                        
                    }
                }
                        }
           };
            clock.start();
    }
    
   // method: gameLoigc
   // purpose: this method check if user guess correct letter or not and control socre depends on user's reaction
   public void gameLogic(char letter)
   {
       boolean wordIn = false;     
       char[] hiddens = hidden.toCharArray();
       
        for (int i = 0; i < this.word.length(); i++) 
        {
            if(this.word.charAt(i) == letter)
            {
                wordIn = true; //showing that letter is part of the word
                
                //show the words
                hiddens[i]= letter;
                    
                answerCheck -= 1;
                
                if(answerCheck == 0)
                {                
                    //check the score
                    
                    switch (score) {                      
                        case 100:
                                write(Integer.toString(score));
                                new ColorGuess().setVisible(true);
                                this.setVisible(false);
                            break;
                    
                        case 90:
                                write(Integer.toString(score));
                                new ColorGuess().setVisible(true);
                                this.setVisible(false);
                            break;
                   
                        case 80:
                                write(Integer.toString(score));
                                new ColorGuess().setVisible(true);
                                this.setVisible(false);
                            break;
                    
                        case 70:
                                write(Integer.toString(score));
                                new ColorGuess().setVisible(true);
                                this.setVisible(false);
                            break;                   
                    
                        case 60:
                                write(Integer.toString(score));
                                new ColorGuess().setVisible(true);
                                this.setVisible(false);
                            break;
                            
                        case 50:
                                write(Integer.toString(score));
                                new ColorGuess().setVisible(true);
                                this.setVisible(false);
                            break;
                            
                        default:
                            break;
                    }
                }
            }                 
        }
        
        if(wordIn == false)
        {
            
            if(score > 50)
            {               
                score -= 10;
                
                switch (score) {
                    case 90:
                        JOptionPane.showMessageDialog(null, "1st wrong guess, 5 chances left");
                        jPanel8.setVisible(false);
                        jPanel10.setVisible(false);
                        break;
                    case 80:
                        JOptionPane.showMessageDialog(null, "2nd wrong guess, 4 chances left");
                        jPanel8.setVisible(false);
                        jPanel10.setVisible(false);
                        jPanel7.setVisible(false);
                        jPanel9.setVisible(false);
                        break;
                    case 70:
                        JOptionPane.showMessageDialog(null, "3rd wrong guess, 3 chances left");
                        jPanel8.setVisible(false);
                        jPanel10.setVisible(false);
                        jPanel7.setVisible(false);
                        jPanel9.setVisible(false);
                        jPanel6.setVisible(false);
                        jPanel11.setVisible(false);
                        break;
                    case 60:
                        JOptionPane.showMessageDialog(null, "4th wrong guess, 2 chances left");
                        jPanel8.setVisible(false);
                        jPanel10.setVisible(false);
                        jPanel7.setVisible(false);
                        jPanel9.setVisible(false);
                        jPanel6.setVisible(false);
                        jPanel11.setVisible(false);
                        jPanel5.setVisible(false);
                        jPanel12.setVisible(false);
                        break;
                    case 50:
                        JOptionPane.showMessageDialog(null, "5th wrong guess, 1 chances left");
                        jPanel8.setVisible(false);
                        jPanel10.setVisible(false);
                        jPanel7.setVisible(false);
                        jPanel9.setVisible(false);
                        jPanel6.setVisible(false);
                        jPanel11.setVisible(false);
                        jPanel5.setVisible(false);
                        jPanel12.setVisible(false);      
                        jPanel4.setVisible(false);
                        jPanel13.setVisible(false);                      
                        break;
                    default:
                        break;
                }
                
                                        
            }
                
            else
            {                               
                    //show complete hangman with score 40                                    
                    new ColorGuess().setVisible(true);
                    this.setVisible(false);
                    score = 40;
                    write(Integer.toString(score));
            }                   
        }
              
        hidden = String.valueOf(hiddens);
        jLabel1.setText(hidden); 
        jLabel2.setText("Score: " + Integer.toString(score));       
   }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("pictwo.jpg");
                Image i = im.getImage();

                g.drawImage(i,0,0,100,100,this);
            }
        };
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("picone.jpg");
                Image i = im.getImage();

                g.drawImage(i,0,0,150,150,this);
            }
        };
        jPanel6 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("picthree.jpg");
                Image i = im.getImage();

                g.drawImage(i,0,0,100,100,this);
            }
        };
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("picfour.jpg");
                Image i = im.getImage();

                g.drawImage(i,0,0,100,100,this);
            }
        };
        jPanel11 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("picfive.jpg");
                Image i = im.getImage();

                g.drawImage(i,0,0,100,100,this);
            }
        };
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon im = new ImageIcon("picsix.jpg");
                Image i = im.getImage();

                g.drawImage(i,0,0,100,100,this);
            }
        };
        jPanel13 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton1.setText("Skip");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 10, 90, 31);

        jButton21.setText("T");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton21MouseEntered(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(110, 350, 46, 27);

        jButton22.setText("U");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton22MouseEntered(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(160, 350, 46, 27);

        jButton23.setText("V");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton23MouseEntered(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(210, 350, 46, 27);

        jButton24.setText("W");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton24MouseEntered(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);
        jButton24.setBounds(260, 350, 46, 27);

        jButton25.setText("X");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton25MouseEntered(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);
        jButton25.setBounds(310, 350, 46, 27);

        jButton26.setText("Y");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton26MouseEntered(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);
        jButton26.setBounds(360, 350, 46, 27);

        jButton27.setText("Z");
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton27MouseEntered(evt);
            }
        });
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);
        jButton27.setBounds(410, 350, 46, 27);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("word");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 200, 255, 60);

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(17, 6, 189, 44);

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(356, 16, 116, 25);

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(229, 16, 109, 25);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(10, 70, 100, 100);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(120, 70, 100, 100);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(230, 70, 100, 100);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(340, 70, 100, 100);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(450, 70, 100, 100);

        jButton2.setText("A");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 270, 45, 27);

        jButton3.setText("B");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(100, 270, 45, 27);

        jButton4.setText("C");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(150, 270, 45, 27);

        jButton5.setText("D");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(200, 270, 45, 27);

        jButton6.setText("E");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(250, 270, 45, 27);

        jButton7.setText("F");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(300, 270, 45, 27);

        jButton8.setText("G");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(350, 270, 45, 27);

        jButton9.setText("H");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(400, 270, 45, 27);

        jButton10.setText("I");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(450, 270, 45, 27);

        jButton11.setText("J");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(500, 270, 45, 27);

        jButton12.setText("K");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(70, 310, 45, 27);

        jButton13.setText("L");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(120, 310, 45, 27);

        jButton14.setText("M");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(170, 310, 45, 27);

        jButton15.setText("N");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(220, 310, 45, 27);

        jButton16.setText("O");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(270, 310, 45, 27);

        jButton17.setText("P");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton17MouseEntered(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(320, 310, 45, 27);

        jButton18.setText("Q");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton18MouseEntered(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(370, 310, 45, 27);

        jButton19.setText("R");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton19MouseEntered(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(420, 310, 45, 27);

        jButton20.setText("S");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton20MouseEntered(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(470, 310, 45, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        score = 0;
        write(Integer.toString(score));
        new ColorGuess().setVisible(true); //in case user clicks skip
        this.setVisible(false); //score of 0 ending screen pops up and play screen closed
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.jButton3.setEnabled(false); //making letter button for only one time use
        gameLogic('B');                  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.jButton5.setEnabled(false);
        gameLogic('D');
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.jButton9.setEnabled(false);
        gameLogic('H');
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.jButton10.setEnabled(false);
       gameLogic('I');
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        this.jButton14.setEnabled(false);
        gameLogic('M');
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jButton2.setEnabled(false);
      gameLogic('A');     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.jButton4.setEnabled(false);
        gameLogic('C');
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.jButton6.setEnabled(false);
        gameLogic('E');
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.jButton7.setEnabled(false);
        gameLogic('F');
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.jButton8.setEnabled(false);
        gameLogic('G');
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        this.jButton11.setEnabled(false);
        gameLogic('J');
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        this.jButton12.setEnabled(false);
        gameLogic('K');
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.jButton13.setEnabled(false);
        gameLogic('L');
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        this.jButton15.setEnabled(false);
        gameLogic('N');
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        this.jButton16.setEnabled(false);
        gameLogic('O');
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        this.jButton17.setEnabled(false);
        gameLogic('P');
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        this.jButton18.setEnabled(false);
       gameLogic('Q');
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        this.jButton19.setEnabled(false);
       gameLogic('R');
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        this.jButton20.setEnabled(false);
        gameLogic('S');
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        this.jButton21.setEnabled(false);
        gameLogic('T');
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        this.jButton22.setEnabled(false);
        gameLogic('U');
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        this.jButton23.setEnabled(false);
        gameLogic('V');
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        this.jButton24.setEnabled(false);
        gameLogic('W');
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        this.jButton25.setEnabled(false);
        gameLogic('X');
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        this.jButton26.setEnabled(false);
        gameLogic('Y');
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        this.jButton27.setEnabled(false);
      gameLogic('Z');     
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
         jButton1.setToolTipText("Click this button to skip to next game.");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
         jButton2.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        jButton6.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        jButton7.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jButton8.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
        jButton9.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        // TODO add your handling code here:
        jButton10.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        // TODO add your handling code here:
        jButton11.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        // TODO add your handling code here:
        jButton12.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        // TODO add your handling code here:
        jButton13.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        // TODO add your handling code here:
        jButton14.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton14MouseEntered

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        // TODO add your handling code here:
        jButton15.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton15MouseEntered

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        // TODO add your handling code here:
        jButton16.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseEntered
        // TODO add your handling code here:
        jButton17.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton17MouseEntered

    private void jButton18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseEntered
        // TODO add your handling code here:
        jButton18.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton18MouseEntered

    private void jButton19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseEntered
        // TODO add your handling code here:
        jButton19.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton19MouseEntered

    private void jButton20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseEntered
        // TODO add your handling code here:
        jButton20.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton20MouseEntered

    private void jButton21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseEntered
        // TODO add your handling code here:
        jButton21.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton21MouseEntered

    private void jButton22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseEntered
        // TODO add your handling code here:
        jButton22.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton22MouseEntered

    private void jButton23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseEntered
        // TODO add your handling code here:
        jButton23.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton23MouseEntered

    private void jButton24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseEntered
        // TODO add your handling code here:
        jButton24.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton24MouseEntered

    private void jButton25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseEntered
        // TODO add your handling code here:
        jButton25.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton25MouseEntered

    private void jButton26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseEntered
        // TODO add your handling code here:
        jButton26.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton26MouseEntered

    private void jButton27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseEntered
        // TODO add your handling code here:
        jButton27.setToolTipText("Click this button if you think it's part of the answer word.");
    }//GEN-LAST:event_jButton27MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
