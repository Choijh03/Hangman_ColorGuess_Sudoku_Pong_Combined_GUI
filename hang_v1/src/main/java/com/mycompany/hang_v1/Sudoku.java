/*************************************************************** 
* file: Sudoku.java 
* author: Jihun Choi
* date last modified: 10/02/2022 
* 
* 
* purpose: This class is jFrmae class that is used for Sudoku game screen
* Once this class is constucted, User will be playing game of Sudoku
* 
****************************************************************/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hang_v1;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class Sudoku extends javax.swing.JFrame {

    private int day, month,year; //used for clock
    private int hour, minute, second; //used for clock
    private String daystr,timestr; //usedf for jlabel and clock
    private int sudoku_score = 540;
    private String scoreString = "";
    private int score = 0; 
    private boolean jt1 = false;
    private boolean jt2 = false; 
    private boolean jt3 = false;
    private boolean jt4 = false;
    private boolean jt5 = false;
    private boolean jt6 = false;
    private boolean jt7 = false;
    private boolean jt8 = false;
    private boolean jt9 = false;
    private boolean jt10 = false;
    private boolean jt11 = false;
    private boolean jt12 = false;
    private boolean jt13 = false;
    private boolean jt14 = false;
    private boolean jt15 = false;
    private boolean jt16 = false;
    private boolean jt17 = false;
    private boolean jt18 = false;
    private boolean jt19 = false;
    private boolean jt20 = false;
    private boolean jt21 = false;
    private boolean jt22 = false;
    private boolean jt23 = false;
    private boolean jt24 = false;
    private boolean jt25 = false;
    private boolean jt26 = false;
    private boolean jt27 = false;
    private boolean jt28 = false;
    private boolean jt29 = false;
    private boolean jt30 = false;
    private boolean jt31 = false;
    private boolean jt32 = false;
    private boolean jt33 = false;
    private boolean jt34 = false;
    private boolean jt35 = false;
    private boolean jt36 = false;
    private boolean jt37 = false;
    private boolean jt38 = false;
    private boolean jt39 = false;
    private boolean jt40 = false;
    private boolean jt41 = false;
    private boolean jt42 = false;
    private boolean jt43 = false;
    private boolean jt44 = false;
    private boolean jt45 = false;
    private boolean jt46 = false;
    private boolean jt47 = false;
    private boolean jt48 = false;
    private boolean jt49 = false;
    private boolean jt50 = false;
    private boolean jt51 = false;
    private boolean jt52 = false;
    private boolean jt53 = false;
    private boolean jt54 = false;
    //row1
    private String jt1a = "3";
    private String jt2a = "5";
    private String jt3a = "1";
    private String jt4a = "9";
    private String jt5a = "2";
    //row2
    private String jt6a = "2";
    private String jt7a = "9";
    private String jt8a = "6";
    private String jt9a = "8";
    private String jt10a = "5";
    private String jt11a = "7";
    private String jt12a = "3";
    private String jt13a = "1";
    //row3
    private String jt14a = "4";
    private String jt15a = "7";
    private String jt16a = "2";
    private String jt17a = "9";
    private String jt18a = "3";
    private String jt19a = "8";
    //row4
    private String jt20a = "6";
    private String jt21a = "1";
    private String jt22a = "4";
    private String jt23a = "2";
    //row5
    private String jt24a = "1";
    private String jt25a = "2";
    private String jt26a = "3";
    private String jt27a = "6";
    private String jt28a = "8";
    private String jt29a = "5";
    private String jt30a = "4";
    private String jt31a = "9";
    //row6
    private String jt32a = "7";
    private String jt33a = "5";
    private String jt34a = "9";
    private String jt35a = "6";
    //row7
    private String jt36a = "6";
    private String jt37a = "7";
    private String jt38a = "8";
    private String jt39a = "1";
    private String jt40a = "3";
    private String jt41a = "4";
    //row8
    private String jt42a = "9";
    private String jt43a = "8";
    private String jt44a = "3";
    private String jt45a = "4";
    private String jt46a = "5";
    private String jt47a = "2";
    private String jt48a = "7";
    private String jt49a = "6";
    //row9
    private String jt50a = "7";
    private String jt51a = "4";
    private String jt52a = "6";
    private String jt53a = "8";
    private String jt54a = "1";
    
    private String e ="";
   
           
      
    /**
     * Creates new form Sudoku
     */
    public Sudoku() {
        initComponents();
        this.setBounds(0, 0, 610, 435); //setting the bound
        this.setLocationRelativeTo(null); //setting the screen to center
        currentTime(); //calling clokc function
        read("current_score.txt");
        
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
          
       jButton1.setEnabled(false);
       
       
                          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // method: submit
    // purpose: this method is to decide either enable submit button or disable submit button
    public void submit()
    {
        if(e.equals(jTextField1.getText()) || e.equals(jTextField2.getText()) || e.equals(jTextField3.getText()) || e.equals(jTextField4.getText()) 
                || e.equals(jTextField5.getText()) || e.equals(jTextField6.getText()) || e.equals(jTextField7.getText()) || e.equals(jTextField8.getText())
                || e.equals(jTextField9.getText()) || e.equals(jTextField10.getText()) || e.equals(jTextField11.getText()) || e.equals(jTextField12.getText())
                || e.equals(jTextField13.getText()) || e.equals(jTextField14.getText()) || e.equals(jTextField15.getText()) || e.equals(jTextField16.getText())
                || e.equals(jTextField17.getText()) || e.equals(jTextField18.getText()) || e.equals(jTextField19.getText()) || e.equals(jTextField20.getText())
                || e.equals(jTextField21.getText()) || e.equals(jTextField22.getText()) || e.equals(jTextField23.getText()) || e.equals(jTextField24.getText())
                || e.equals(jTextField25.getText()) || e.equals(jTextField26.getText()) || e.equals(jTextField27.getText()) || e.equals(jTextField28.getText())
                || e.equals(jTextField29.getText()) || e.equals(jTextField30.getText()) || e.equals(jTextField31.getText()) || e.equals(jTextField32.getText())
                || e.equals(jTextField33.getText()) || e.equals(jTextField34.getText()) || e.equals(jTextField35.getText()) || e.equals(jTextField36.getText())
                || e.equals(jTextField37.getText()) || e.equals(jTextField38.getText()) || e.equals(jTextField39.getText()) || e.equals(jTextField40.getText())
                || e.equals(jTextField41.getText()) || e.equals(jTextField42.getText()) || e.equals(jTextField43.getText()) || e.equals(jTextField44.getText())
                || e.equals(jTextField45.getText()) || e.equals(jTextField46.getText()) || e.equals(jTextField47.getText()) || e.equals(jTextField48.getText())
                || e.equals(jTextField49.getText()) || e.equals(jTextField50.getText()) || e.equals(jTextField51.getText()) || e.equals(jTextField52.getText())
                || e.equals(jTextField53.getText()) || e.equals(jTextField54.getText()))
        {           
           jButton1.setEnabled(false);
        }
        else
        {
            jButton1.setEnabled(true);
        }
    }
    
    // method: read
    // purpose: this method is to read the score information from file named "current_score.txt
     public void read(String filename)
    {
       try {
            FileReader reader = new FileReader(filename);
            int character;
 
            while ((character = reader.read()) != -1) {                   
                scoreString += (char)character;
            }
            score = Integer.parseInt(scoreString);
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                        jLabel2.setText(timestr);
                        jLabel1.setText(daystr);
                        
                    }catch(Exception e){
                        
                    }
                }
                        }
           };
            clock.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("8");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 40, 40);

        jTextField1.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(40, 0, 40, 40);

        jTextField2.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField2MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(80, 0, 40, 40);

        jLabel5.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("4");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(120, 0, 40, 40);

        jTextField3.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField3CaretUpdate(evt);
            }
        });
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField3MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(160, 0, 40, 40);

        jLabel6.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(200, 0, 40, 40);

        jTextField4.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField4CaretUpdate(evt);
            }
        });
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField4MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(240, 0, 40, 40);

        jTextField5.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField5CaretUpdate(evt);
            }
        });
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField5MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(280, 0, 40, 40);

        jLabel7.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(320, 0, 40, 40);

        jTextField6.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField6CaretUpdate(evt);
            }
        });
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField6MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(0, 40, 40, 40);

        jTextField7.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField7CaretUpdate(evt);
            }
        });
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField7MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(40, 40, 40, 40);

        jTextField8.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField8CaretUpdate(evt);
            }
        });
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField8MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField8);
        jTextField8.setBounds(80, 40, 40, 40);

        jTextField9.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField9CaretUpdate(evt);
            }
        });
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField9MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField9);
        jTextField9.setBounds(120, 40, 40, 40);

        jTextField10.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField10CaretUpdate(evt);
            }
        });
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField10MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField10);
        jTextField10.setBounds(160, 40, 40, 40);

        jTextField11.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField11CaretUpdate(evt);
            }
        });
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField11MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField11);
        jTextField11.setBounds(200, 40, 40, 40);

        jLabel8.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("4");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(240, 40, 40, 40);

        jTextField12.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField12CaretUpdate(evt);
            }
        });
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField12MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField12);
        jTextField12.setBounds(280, 40, 40, 40);

        jTextField13.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField13CaretUpdate(evt);
            }
        });
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField13MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField13);
        jTextField13.setBounds(320, 40, 40, 40);

        jTextField14.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField14CaretUpdate(evt);
            }
        });
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField14MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField14);
        jTextField14.setBounds(0, 80, 40, 40);

        jLabel9.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 80, 40, 40);

        jTextField15.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField15CaretUpdate(evt);
            }
        });
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField15MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField15);
        jTextField15.setBounds(80, 80, 40, 40);

        jTextField16.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField16CaretUpdate(evt);
            }
        });
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField16MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField16);
        jTextField16.setBounds(120, 80, 40, 40);

        jTextField17.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField17CaretUpdate(evt);
            }
        });
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField17MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField17);
        jTextField17.setBounds(160, 80, 40, 40);

        jTextField18.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField18CaretUpdate(evt);
            }
        });
        jTextField18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField18MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField18);
        jTextField18.setBounds(200, 80, 40, 40);

        jLabel10.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("6");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(240, 80, 40, 40);

        jLabel11.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("5");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(280, 80, 40, 40);

        jTextField19.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField19CaretUpdate(evt);
            }
        });
        jTextField19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField19MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField19);
        jTextField19.setBounds(320, 80, 40, 40);

        jLabel12.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("5");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 120, 40, 40);

        jTextField20.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField20CaretUpdate(evt);
            }
        });
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField20MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField20);
        jTextField20.setBounds(40, 120, 40, 40);

        jLabel13.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("9");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(80, 120, 40, 40);

        jTextField21.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setToolTipText("");
        jTextField21.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField21CaretUpdate(evt);
            }
        });
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField21MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField21);
        jTextField21.setBounds(120, 120, 40, 40);

        jLabel14.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("3");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(160, 120, 40, 40);

        jTextField22.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField22CaretUpdate(evt);
            }
        });
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField22MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField22);
        jTextField22.setBounds(200, 120, 40, 40);

        jLabel15.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("7");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(240, 120, 40, 40);

        jLabel16.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("8");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(280, 120, 40, 40);

        jTextField23.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField23CaretUpdate(evt);
            }
        });
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField23MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField23);
        jTextField23.setBounds(320, 120, 40, 40);

        jTextField24.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField24CaretUpdate(evt);
            }
        });
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField24MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField24);
        jTextField24.setBounds(0, 160, 40, 40);

        jTextField25.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField25CaretUpdate(evt);
            }
        });
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField25MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField25);
        jTextField25.setBounds(40, 160, 40, 40);

        jTextField26.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField26CaretUpdate(evt);
            }
        });
        jTextField26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField26MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField26);
        jTextField26.setBounds(80, 160, 40, 40);

        jTextField27.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField27CaretUpdate(evt);
            }
        });
        jTextField27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField27MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField27);
        jTextField27.setBounds(120, 160, 40, 40);

        jLabel17.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("7");
        jLabel17.setToolTipText("");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(160, 160, 40, 40);

        jTextField28.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField28CaretUpdate(evt);
            }
        });
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField28MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField28);
        jTextField28.setBounds(200, 160, 40, 40);

        jTextField29.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField29CaretUpdate(evt);
            }
        });
        jTextField29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField29MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField29);
        jTextField29.setBounds(240, 160, 40, 40);

        jTextField30.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField30CaretUpdate(evt);
            }
        });
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField30MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField30);
        jTextField30.setBounds(280, 160, 40, 40);

        jTextField31.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField31CaretUpdate(evt);
            }
        });
        jTextField31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField31MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField31);
        jTextField31.setBounds(320, 160, 40, 40);

        jTextField32.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField32CaretUpdate(evt);
            }
        });
        jTextField32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField32MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField32);
        jTextField32.setBounds(0, 200, 40, 40);

        jLabel18.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("4");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 200, 40, 40);

        jLabel19.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("8");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(80, 200, 40, 40);

        jTextField33.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField33CaretUpdate(evt);
            }
        });
        jTextField33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField33MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField33);
        jTextField33.setBounds(120, 200, 40, 40);

        jLabel20.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("2");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(160, 200, 40, 40);

        jTextField34.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField34CaretUpdate(evt);
            }
        });
        jTextField34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField34MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField34);
        jTextField34.setBounds(200, 200, 40, 40);

        jLabel21.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("1");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(240, 200, 40, 40);

        jTextField35.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField35CaretUpdate(evt);
            }
        });
        jTextField35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField35MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField35);
        jTextField35.setBounds(280, 200, 40, 40);

        jLabel22.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("3");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(320, 200, 40, 40);

        jTextField36.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField36CaretUpdate(evt);
            }
        });
        jTextField36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField36MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField36);
        jTextField36.setBounds(0, 240, 40, 40);

        jLabel23.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("5");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(40, 240, 40, 40);

        jLabel24.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("2");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(80, 240, 40, 40);

        jTextField37.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField37CaretUpdate(evt);
            }
        });
        jTextField37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField37MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField37);
        jTextField37.setBounds(120, 240, 40, 40);

        jTextField38.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField38CaretUpdate(evt);
            }
        });
        jTextField38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField38MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField38);
        jTextField38.setBounds(160, 240, 40, 40);

        jTextField39.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField39CaretUpdate(evt);
            }
        });
        jTextField39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField39MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField39);
        jTextField39.setBounds(200, 240, 40, 40);

        jTextField40.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField40CaretUpdate(evt);
            }
        });
        jTextField40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField40MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField40);
        jTextField40.setBounds(240, 240, 40, 40);

        jLabel25.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("9");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(280, 240, 40, 40);

        jTextField41.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField41CaretUpdate(evt);
            }
        });
        jTextField41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField41MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField41);
        jTextField41.setBounds(320, 240, 40, 40);

        jTextField42.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField42CaretUpdate(evt);
            }
        });
        jTextField42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField42MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField42);
        jTextField42.setBounds(0, 280, 40, 40);

        jTextField43.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField43CaretUpdate(evt);
            }
        });
        jTextField43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField43MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField43);
        jTextField43.setBounds(40, 280, 40, 40);

        jLabel26.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("1");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(80, 280, 40, 40);

        jTextField44.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField44CaretUpdate(evt);
            }
        });
        jTextField44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField44MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField44);
        jTextField44.setBounds(120, 280, 40, 40);

        jTextField45.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField45CaretUpdate(evt);
            }
        });
        jTextField45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField45MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField45);
        jTextField45.setBounds(160, 280, 40, 40);

        jTextField46.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField46CaretUpdate(evt);
            }
        });
        jTextField46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField46MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField46);
        jTextField46.setBounds(200, 280, 40, 40);

        jTextField47.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField47CaretUpdate(evt);
            }
        });
        jTextField47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField47MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField47);
        jTextField47.setBounds(240, 280, 40, 40);

        jTextField48.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField48CaretUpdate(evt);
            }
        });
        jTextField48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField48MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField48);
        jTextField48.setBounds(280, 280, 40, 40);

        jTextField49.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField49CaretUpdate(evt);
            }
        });
        jTextField49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField49MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField49);
        jTextField49.setBounds(320, 280, 40, 40);

        jLabel27.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("3");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(0, 320, 40, 40);

        jTextField50.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField50CaretUpdate(evt);
            }
        });
        jTextField50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField50MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField50);
        jTextField50.setBounds(40, 320, 40, 40);

        jTextField51.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField51CaretUpdate(evt);
            }
        });
        jTextField51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField51MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField51);
        jTextField51.setBounds(80, 320, 40, 40);

        jLabel28.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("9");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(120, 320, 40, 40);

        jTextField52.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField52CaretUpdate(evt);
            }
        });
        jTextField52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField52MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField52);
        jTextField52.setBounds(160, 320, 40, 40);

        jLabel29.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("2");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(200, 320, 40, 40);

        jTextField53.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField53CaretUpdate(evt);
            }
        });
        jTextField53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField53MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField53);
        jTextField53.setBounds(240, 320, 40, 40);

        jTextField54.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField54CaretUpdate(evt);
            }
        });
        jTextField54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField54MouseEntered(evt);
            }
        });
        jPanel2.add(jTextField54);
        jTextField54.setBounds(280, 320, 40, 40);

        jLabel30.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("5");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(320, 320, 40, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 10, 360, 360);

        jButton1.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jButton1.setText("Submit");
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
        jButton1.setBounds(10, 337, 100, 40);

        jButton2.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jButton2.setText("Quit");
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
        jButton2.setBounds(497, 337, 90, 40);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 10, 100, 30);

        jLabel2.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(490, 50, 110, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setText("Sudoku");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 10, 90, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
        if(jTextField1.getText().equals(""))
        {}
        else if(jTextField1.getText().equals("1"))
        {}
        else if(jTextField1.getText().equals("2"))
        {}
        else if(jTextField1.getText().equals("3"))
        {}
        else if(jTextField1.getText().equals("4"))
        {}
        else if(jTextField1.getText().equals("5"))
        {}
        else if(jTextField1.getText().equals("6"))
        {}
        else if(jTextField1.getText().equals("7"))
        {}
        else if(jTextField1.getText().equals("8"))
        {}
        else if(jTextField1.getText().equals("9"))
        {}
        else    
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();                  
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        // TODO add your handling code here:
        if(jTextField2.getText().equals(""))
        {}
        else if(jTextField2.getText().equals("1"))
        {}
        else if(jTextField2.getText().equals("2"))
        {}
        else if(jTextField2.getText().equals("3"))
        {}
        else if(jTextField2.getText().equals("4"))
        {}
        else if(jTextField2.getText().equals("5"))
        {}
        else if(jTextField2.getText().equals("6"))
        {}
        else if(jTextField2.getText().equals("7"))
        {}
        else if(jTextField2.getText().equals("8"))
        {}
        else if(jTextField2.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField2CaretUpdate

    private void jTextField3CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField3CaretUpdate
        // TODO add your handling code here:
        if(jTextField3.getText().equals(""))
        {}
        else if(jTextField3.getText().equals("1"))
        {}
        else if(jTextField3.getText().equals("2"))
        {}
        else if(jTextField3.getText().equals("3"))
        {}
        else if(jTextField3.getText().equals("4"))
        {}
        else if(jTextField3.getText().equals("5"))
        {}
        else if(jTextField3.getText().equals("6"))
        {}
        else if(jTextField3.getText().equals("7"))
        {}
        else if(jTextField3.getText().equals("8"))
        {}
        else if(jTextField3.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField3CaretUpdate

    private void jTextField4CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField4CaretUpdate
        // TODO add your handling code here:
        if(jTextField4.getText().equals(""))
        {}
        else if(jTextField4.getText().equals("1"))
        {}
        else if(jTextField4.getText().equals("2"))
        {}
        else if(jTextField4.getText().equals("3"))
        {}
        else if(jTextField4.getText().equals("4"))
        {}
        else if(jTextField4.getText().equals("5"))
        {}
        else if(jTextField4.getText().equals("6"))
        {}
        else if(jTextField4.getText().equals("7"))
        {}
        else if(jTextField4.getText().equals("8"))
        {}
        else if(jTextField4.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField4CaretUpdate

    private void jTextField5CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField5CaretUpdate
        // TODO add your handling code here:
        if(jTextField5.getText().equals(""))
        {}
        else if(jTextField5.getText().equals("1"))
        {}
        else if(jTextField5.getText().equals("2"))
        {}
        else if(jTextField5.getText().equals("3"))
        {}
        else if(jTextField5.getText().equals("4"))
        {}
        else if(jTextField5.getText().equals("5"))
        {}
        else if(jTextField5.getText().equals("6"))
        {}
        else if(jTextField5.getText().equals("7"))
        {}
        else if(jTextField5.getText().equals("8"))
        {}
        else if(jTextField5.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField5CaretUpdate

    private void jTextField6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField6CaretUpdate
        // TODO add your handling code here:
        if(jTextField6.getText().equals(""))
        {}
        else if(jTextField6.getText().equals("1"))
        {}
        else if(jTextField6.getText().equals("2"))
        {}
        else if(jTextField6.getText().equals("3"))
        {}
        else if(jTextField6.getText().equals("4"))
        {}
        else if(jTextField6.getText().equals("5"))
        {}
        else if(jTextField6.getText().equals("6"))
        {}
        else if(jTextField6.getText().equals("7"))
        {}
        else if(jTextField6.getText().equals("8"))
        {}
        else if(jTextField6.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField6CaretUpdate

    private void jTextField7CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField7CaretUpdate
        // TODO add your handling code here:
        if(jTextField7.getText().equals(""))
        {}
        else if(jTextField7.getText().equals("1"))
        {}
        else if(jTextField7.getText().equals("2"))
        {}
        else if(jTextField7.getText().equals("3"))
        {}
        else if(jTextField7.getText().equals("4"))
        {}
        else if(jTextField7.getText().equals("5"))
        {}
        else if(jTextField7.getText().equals("6"))
        {}
        else if(jTextField7.getText().equals("7"))
        {}
        else if(jTextField7.getText().equals("8"))
        {}
        else if(jTextField7.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField7CaretUpdate

    private void jTextField8CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField8CaretUpdate
        // TODO add your handling code here:
        if(jTextField8.getText().equals(""))
        {}
        else if(jTextField8.getText().equals("1"))
        {}
        else if(jTextField8.getText().equals("2"))
        {}
        else if(jTextField8.getText().equals("3"))
        {}
        else if(jTextField8.getText().equals("4"))
        {}
        else if(jTextField8.getText().equals("5"))
        {}
        else if(jTextField8.getText().equals("6"))
        {}
        else if(jTextField8.getText().equals("7"))
        {}
        else if(jTextField8.getText().equals("8"))
        {}
        else if(jTextField8.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField8CaretUpdate

    private void jTextField9CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField9CaretUpdate
        // TODO add your handling code here:
        if(jTextField9.getText().equals(""))
        {}
        else if(jTextField9.getText().equals("1"))
        {}
        else if(jTextField9.getText().equals("2"))
        {}
        else if(jTextField9.getText().equals("3"))
        {}
        else if(jTextField9.getText().equals("4"))
        {}
        else if(jTextField9.getText().equals("5"))
        {}
        else if(jTextField9.getText().equals("6"))
        {}
        else if(jTextField9.getText().equals("7"))
        {}
        else if(jTextField9.getText().equals("8"))
        {}
        else if(jTextField9.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField9CaretUpdate

    private void jTextField10CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField10CaretUpdate
        // TODO add your handling code here:
        if(jTextField10.getText().equals(""))
        {}
        else if(jTextField10.getText().equals("1"))
        {}
        else if(jTextField10.getText().equals("2"))
        {}
        else if(jTextField10.getText().equals("3"))
        {}
        else if(jTextField10.getText().equals("4"))
        {}
        else if(jTextField10.getText().equals("5"))
        {}
        else if(jTextField10.getText().equals("6"))
        {}
        else if(jTextField10.getText().equals("7"))
        {}
        else if(jTextField10.getText().equals("8"))
        {}
        else if(jTextField10.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField10CaretUpdate

    private void jTextField11CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField11CaretUpdate
        // TODO add your handling code here:
        if(jTextField11.getText().equals(""))
        {}
        else if(jTextField11.getText().equals("1"))
        {}
        else if(jTextField11.getText().equals("2"))
        {}
        else if(jTextField11.getText().equals("3"))
        {}
        else if(jTextField11.getText().equals("4"))
        {}
        else if(jTextField11.getText().equals("5"))
        {}
        else if(jTextField11.getText().equals("6"))
        {}
        else if(jTextField11.getText().equals("7"))
        {}
        else if(jTextField11.getText().equals("8"))
        {}
        else if(jTextField11.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField11CaretUpdate

    private void jTextField12CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField12CaretUpdate
        // TODO add your handling code here:
        if(jTextField12.getText().equals(""))
        {}
        else if(jTextField12.getText().equals("1"))
        {}
        else if(jTextField12.getText().equals("2"))
        {}
        else if(jTextField12.getText().equals("3"))
        {}
        else if(jTextField12.getText().equals("4"))
        {}
        else if(jTextField12.getText().equals("5"))
        {}
        else if(jTextField12.getText().equals("6"))
        {}
        else if(jTextField12.getText().equals("7"))
        {}
        else if(jTextField12.getText().equals("8"))
        {}
        else if(jTextField12.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField12CaretUpdate

    private void jTextField13CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField13CaretUpdate
        // TODO add your handling code here:
        if(jTextField13.getText().equals(""))
        {}
        else if(jTextField13.getText().equals("1"))
        {}
        else if(jTextField13.getText().equals("2"))
        {}
        else if(jTextField13.getText().equals("3"))
        {}
        else if(jTextField13.getText().equals("4"))
        {}
        else if(jTextField13.getText().equals("5"))
        {}
        else if(jTextField13.getText().equals("6"))
        {}
        else if(jTextField13.getText().equals("7"))
        {}
        else if(jTextField13.getText().equals("8"))
        {}
        else if(jTextField13.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField13CaretUpdate

    private void jTextField14CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField14CaretUpdate
        // TODO add your handling code here:
        if(jTextField14.getText().equals(""))
        {}
        else if(jTextField14.getText().equals("1"))
        {}
        else if(jTextField14.getText().equals("2"))
        {}
        else if(jTextField14.getText().equals("3"))
        {}
        else if(jTextField14.getText().equals("4"))
        {}
        else if(jTextField14.getText().equals("5"))
        {}
        else if(jTextField14.getText().equals("6"))
        {}
        else if(jTextField14.getText().equals("7"))
        {}
        else if(jTextField14.getText().equals("8"))
        {}
        else if(jTextField14.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField14CaretUpdate

    private void jTextField15CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField15CaretUpdate
        // TODO add your handling code here:
        if(jTextField15.getText().equals(""))
        {}
        else if(jTextField15.getText().equals("1"))
        {}
        else if(jTextField15.getText().equals("2"))
        {}
        else if(jTextField15.getText().equals("3"))
        {}
        else if(jTextField15.getText().equals("4"))
        {}
        else if(jTextField15.getText().equals("5"))
        {}
        else if(jTextField15.getText().equals("6"))
        {}
        else if(jTextField15.getText().equals("7"))
        {}
        else if(jTextField15.getText().equals("8"))
        {}
        else if(jTextField15.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField15CaretUpdate

    private void jTextField16CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField16CaretUpdate
        // TODO add your handling code here:
        if(jTextField16.getText().equals(""))
        {}
        else if(jTextField16.getText().equals("1"))
        {}
        else if(jTextField16.getText().equals("2"))
        {}
        else if(jTextField16.getText().equals("3"))
        {}
        else if(jTextField16.getText().equals("4"))
        {}
        else if(jTextField16.getText().equals("5"))
        {}
        else if(jTextField16.getText().equals("6"))
        {}
        else if(jTextField16.getText().equals("7"))
        {}
        else if(jTextField16.getText().equals("8"))
        {}
        else if(jTextField16.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField16CaretUpdate

    private void jTextField17CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField17CaretUpdate
        // TODO add your handling code here:
        if(jTextField17.getText().equals(""))
        {}
        else if(jTextField17.getText().equals("1"))
        {}
        else if(jTextField17.getText().equals("2"))
        {}
        else if(jTextField17.getText().equals("3"))
        {}
        else if(jTextField17.getText().equals("4"))
        {}
        else if(jTextField17.getText().equals("5"))
        {}
        else if(jTextField17.getText().equals("6"))
        {}
        else if(jTextField17.getText().equals("7"))
        {}
        else if(jTextField17.getText().equals("8"))
        {}
        else if(jTextField17.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField17CaretUpdate

    private void jTextField18CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField18CaretUpdate
        // TODO add your handling code here:
        if(jTextField18.getText().equals(""))
        {}
        else if(jTextField18.getText().equals("1"))
        {}
        else if(jTextField18.getText().equals("2"))
        {}
        else if(jTextField18.getText().equals("3"))
        {}
        else if(jTextField18.getText().equals("4"))
        {}
        else if(jTextField18.getText().equals("5"))
        {}
        else if(jTextField18.getText().equals("6"))
        {}
        else if(jTextField18.getText().equals("7"))
        {}
        else if(jTextField18.getText().equals("8"))
        {}
        else if(jTextField18.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField18CaretUpdate

    private void jTextField19CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField19CaretUpdate
        // TODO add your handling code here:
        if(jTextField19.getText().equals(""))
        {}
        else if(jTextField19.getText().equals("1"))
        {}
        else if(jTextField19.getText().equals("2"))
        {}
        else if(jTextField19.getText().equals("3"))
        {}
        else if(jTextField19.getText().equals("4"))
        {}
        else if(jTextField19.getText().equals("5"))
        {}
        else if(jTextField19.getText().equals("6"))
        {}
        else if(jTextField19.getText().equals("7"))
        {}
        else if(jTextField19.getText().equals("8"))
        {}
        else if(jTextField19.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
        
    }//GEN-LAST:event_jTextField19CaretUpdate

    private void jTextField20CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField20CaretUpdate
        // TODO add your handling code here:
        if(jTextField20.getText().equals(""))
        {}
        else if(jTextField20.getText().equals("1"))
        {}
        else if(jTextField20.getText().equals("2"))
        {}
        else if(jTextField20.getText().equals("3"))
        {}
        else if(jTextField20.getText().equals("4"))
        {}
        else if(jTextField20.getText().equals("5"))
        {}
        else if(jTextField20.getText().equals("6"))
        {}
        else if(jTextField20.getText().equals("7"))
        {}
        else if(jTextField20.getText().equals("8"))
        {}
        else if(jTextField20.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField20CaretUpdate

    private void jTextField21CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField21CaretUpdate
        // TODO add your handling code here:
        if(jTextField21.getText().equals(""))
        {}
        else if(jTextField21.getText().equals("1"))
        {}
        else if(jTextField21.getText().equals("2"))
        {}
        else if(jTextField21.getText().equals("3"))
        {}
        else if(jTextField21.getText().equals("4"))
        {}
        else if(jTextField21.getText().equals("5"))
        {}
        else if(jTextField21.getText().equals("6"))
        {}
        else if(jTextField21.getText().equals("7"))
        {}
        else if(jTextField21.getText().equals("8"))
        {}
        else if(jTextField21.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField21CaretUpdate

    private void jTextField22CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField22CaretUpdate
        // TODO add your handling code here:
        if(jTextField22.getText().equals(""))
        {}
        else if(jTextField22.getText().equals("1"))
        {}
        else if(jTextField22.getText().equals("2"))
        {}
        else if(jTextField22.getText().equals("3"))
        {}
        else if(jTextField22.getText().equals("4"))
        {}
        else if(jTextField22.getText().equals("5"))
        {}
        else if(jTextField22.getText().equals("6"))
        {}
        else if(jTextField22.getText().equals("7"))
        {}
        else if(jTextField22.getText().equals("8"))
        {}
        else if(jTextField22.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField22CaretUpdate

    private void jTextField23CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField23CaretUpdate
        // TODO add your handling code here:
        if(jTextField23.getText().equals(""))
        {}
        else if(jTextField23.getText().equals("1"))
        {}
        else if(jTextField23.getText().equals("2"))
        {}
        else if(jTextField23.getText().equals("3"))
        {}
        else if(jTextField23.getText().equals("4"))
        {}
        else if(jTextField23.getText().equals("5"))
        {}
        else if(jTextField23.getText().equals("6"))
        {}
        else if(jTextField23.getText().equals("7"))
        {}
        else if(jTextField23.getText().equals("8"))
        {}
        else if(jTextField23.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField23CaretUpdate

    private void jTextField24CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField24CaretUpdate
        // TODO add your handling code here:
        if(jTextField24.getText().equals(""))
        {}
        else if(jTextField24.getText().equals("1"))
        {}
        else if(jTextField24.getText().equals("2"))
        {}
        else if(jTextField24.getText().equals("3"))
        {}
        else if(jTextField24.getText().equals("4"))
        {}
        else if(jTextField24.getText().equals("5"))
        {}
        else if(jTextField24.getText().equals("6"))
        {}
        else if(jTextField24.getText().equals("7"))
        {}
        else if(jTextField24.getText().equals("8"))
        {}
        else if(jTextField24.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField24CaretUpdate

    private void jTextField25CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField25CaretUpdate
        // TODO add your handling code here:
        if(jTextField25.getText().equals(""))
        {}
        else if(jTextField25.getText().equals("1"))
        {}
        else if(jTextField25.getText().equals("2"))
        {}
        else if(jTextField25.getText().equals("3"))
        {}
        else if(jTextField25.getText().equals("4"))
        {}
        else if(jTextField25.getText().equals("5"))
        {}
        else if(jTextField25.getText().equals("6"))
        {}
        else if(jTextField25.getText().equals("7"))
        {}
        else if(jTextField25.getText().equals("8"))
        {}
        else if(jTextField25.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField25CaretUpdate

    private void jTextField26CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField26CaretUpdate
        // TODO add your handling code here:
        if(jTextField26.getText().equals(""))
        {}
        else if(jTextField26.getText().equals("1"))
        {}
        else if(jTextField26.getText().equals("2"))
        {}
        else if(jTextField26.getText().equals("3"))
        {}
        else if(jTextField26.getText().equals("4"))
        {}
        else if(jTextField26.getText().equals("5"))
        {}
        else if(jTextField26.getText().equals("6"))
        {}
        else if(jTextField26.getText().equals("7"))
        {}
        else if(jTextField26.getText().equals("8"))
        {}
        else if(jTextField26.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField26CaretUpdate

    private void jTextField27CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField27CaretUpdate
        // TODO add your handling code here:
        if(jTextField27.getText().equals(""))
        {}
        else if(jTextField27.getText().equals("1"))
        {}
        else if(jTextField27.getText().equals("2"))
        {}
        else if(jTextField27.getText().equals("3"))
        {}
        else if(jTextField27.getText().equals("4"))
        {}
        else if(jTextField27.getText().equals("5"))
        {}
        else if(jTextField27.getText().equals("6"))
        {}
        else if(jTextField27.getText().equals("7"))
        {}
        else if(jTextField27.getText().equals("8"))
        {}
        else if(jTextField27.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField27CaretUpdate

    private void jTextField28CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField28CaretUpdate
        // TODO add your handling code here:
        if(jTextField28.getText().equals(""))
        {}
        else if(jTextField28.getText().equals("1"))
        {}
        else if(jTextField28.getText().equals("2"))
        {}
        else if(jTextField28.getText().equals("3"))
        {}
        else if(jTextField28.getText().equals("4"))
        {}
        else if(jTextField28.getText().equals("5"))
        {}
        else if(jTextField28.getText().equals("6"))
        {}
        else if(jTextField28.getText().equals("7"))
        {}
        else if(jTextField28.getText().equals("8"))
        {}
        else if(jTextField28.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField28CaretUpdate

    private void jTextField29CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField29CaretUpdate
        // TODO add your handling code here:
        if(jTextField29.getText().equals(""))
        {}
        else if(jTextField29.getText().equals("1"))
        {}
        else if(jTextField29.getText().equals("2"))
        {}
        else if(jTextField29.getText().equals("3"))
        {}
        else if(jTextField29.getText().equals("4"))
        {}
        else if(jTextField29.getText().equals("5"))
        {}
        else if(jTextField29.getText().equals("6"))
        {}
        else if(jTextField29.getText().equals("7"))
        {}
        else if(jTextField29.getText().equals("8"))
        {}
        else if(jTextField29.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField29CaretUpdate

    private void jTextField30CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField30CaretUpdate
        // TODO add your handling code here:
        if(jTextField30.getText().equals(""))
        {}
        else if(jTextField30.getText().equals("1"))
        {}
        else if(jTextField30.getText().equals("2"))
        {}
        else if(jTextField30.getText().equals("3"))
        {}
        else if(jTextField30.getText().equals("4"))
        {}
        else if(jTextField30.getText().equals("5"))
        {}
        else if(jTextField30.getText().equals("6"))
        {}
        else if(jTextField30.getText().equals("7"))
        {}
        else if(jTextField30.getText().equals("8"))
        {}
        else if(jTextField30.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField30CaretUpdate

    private void jTextField31CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField31CaretUpdate
        // TODO add your handling code here:
        if(jTextField31.getText().equals(""))
        {}
        else if(jTextField31.getText().equals("1"))
        {}
        else if(jTextField31.getText().equals("2"))
        {}
        else if(jTextField31.getText().equals("3"))
        {}
        else if(jTextField31.getText().equals("4"))
        {}
        else if(jTextField31.getText().equals("5"))
        {}
        else if(jTextField31.getText().equals("6"))
        {}
        else if(jTextField31.getText().equals("7"))
        {}
        else if(jTextField31.getText().equals("8"))
        {}
        else if(jTextField31.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField31CaretUpdate

    private void jTextField32CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField32CaretUpdate
        // TODO add your handling code here:
        if(jTextField32.getText().equals(""))
        {}
        else if(jTextField32.getText().equals("1"))
        {}
        else if(jTextField32.getText().equals("2"))
        {}
        else if(jTextField32.getText().equals("3"))
        {}
        else if(jTextField32.getText().equals("4"))
        {}
        else if(jTextField32.getText().equals("5"))
        {}
        else if(jTextField32.getText().equals("6"))
        {}
        else if(jTextField32.getText().equals("7"))
        {}
        else if(jTextField32.getText().equals("8"))
        {}
        else if(jTextField32.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField32CaretUpdate

    private void jTextField33CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField33CaretUpdate
        // TODO add your handling code here:
        if(jTextField33.getText().equals(""))
        {}
        else if(jTextField33.getText().equals("1"))
        {}
        else if(jTextField33.getText().equals("2"))
        {}
        else if(jTextField33.getText().equals("3"))
        {}
        else if(jTextField33.getText().equals("4"))
        {}
        else if(jTextField33.getText().equals("5"))
        {}
        else if(jTextField33.getText().equals("6"))
        {}
        else if(jTextField33.getText().equals("7"))
        {}
        else if(jTextField33.getText().equals("8"))
        {}
        else if(jTextField33.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField33CaretUpdate

    private void jTextField34CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField34CaretUpdate
        // TODO add your handling code here:
        if(jTextField34.getText().equals(""))
        {}
        else if(jTextField34.getText().equals("1"))
        {}
        else if(jTextField34.getText().equals("2"))
        {}
        else if(jTextField34.getText().equals("3"))
        {}
        else if(jTextField34.getText().equals("4"))
        {}
        else if(jTextField34.getText().equals("5"))
        {}
        else if(jTextField34.getText().equals("6"))
        {}
        else if(jTextField34.getText().equals("7"))
        {}
        else if(jTextField34.getText().equals("8"))
        {}
        else if(jTextField34.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField34CaretUpdate

    private void jTextField35CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField35CaretUpdate
        // TODO add your handling code here:
        if(jTextField35.getText().equals(""))
        {}
        else if(jTextField35.getText().equals("1"))
        {}
        else if(jTextField35.getText().equals("2"))
        {}
        else if(jTextField35.getText().equals("3"))
        {}
        else if(jTextField35.getText().equals("4"))
        {}
        else if(jTextField35.getText().equals("5"))
        {}
        else if(jTextField35.getText().equals("6"))
        {}
        else if(jTextField35.getText().equals("7"))
        {}
        else if(jTextField35.getText().equals("8"))
        {}
        else if(jTextField35.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField35CaretUpdate

    private void jTextField36CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField36CaretUpdate
        // TODO add your handling code here:
        if(jTextField36.getText().equals(""))
        {}
        else if(jTextField36.getText().equals("1"))
        {}
        else if(jTextField36.getText().equals("2"))
        {}
        else if(jTextField36.getText().equals("3"))
        {}
        else if(jTextField36.getText().equals("4"))
        {}
        else if(jTextField36.getText().equals("5"))
        {}
        else if(jTextField36.getText().equals("6"))
        {}
        else if(jTextField36.getText().equals("7"))
        {}
        else if(jTextField36.getText().equals("8"))
        {}
        else if(jTextField36.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField36CaretUpdate

    private void jTextField37CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField37CaretUpdate
        // TODO add your handling code here:
        if(jTextField37.getText().equals(""))
        {}
        else if(jTextField37.getText().equals("1"))
        {}
        else if(jTextField37.getText().equals("2"))
        {}
        else if(jTextField37.getText().equals("3"))
        {}
        else if(jTextField37.getText().equals("4"))
        {}
        else if(jTextField37.getText().equals("5"))
        {}
        else if(jTextField37.getText().equals("6"))
        {}
        else if(jTextField37.getText().equals("7"))
        {}
        else if(jTextField37.getText().equals("8"))
        {}
        else if(jTextField37.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField37CaretUpdate

    private void jTextField38CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField38CaretUpdate
        // TODO add your handling code here:
        if(jTextField38.getText().equals(""))
        {}
        else if(jTextField38.getText().equals("1"))
        {}
        else if(jTextField38.getText().equals("2"))
        {}
        else if(jTextField38.getText().equals("3"))
        {}
        else if(jTextField38.getText().equals("4"))
        {}
        else if(jTextField38.getText().equals("5"))
        {}
        else if(jTextField38.getText().equals("6"))
        {}
        else if(jTextField38.getText().equals("7"))
        {}
        else if(jTextField38.getText().equals("8"))
        {}
        else if(jTextField38.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField38CaretUpdate

    private void jTextField39CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField39CaretUpdate
        // TODO add your handling code here:
        if(jTextField39.getText().equals(""))
        {}
        else if(jTextField39.getText().equals("1"))
        {}
        else if(jTextField39.getText().equals("2"))
        {}
        else if(jTextField39.getText().equals("3"))
        {}
        else if(jTextField39.getText().equals("4"))
        {}
        else if(jTextField39.getText().equals("5"))
        {}
        else if(jTextField39.getText().equals("6"))
        {}
        else if(jTextField39.getText().equals("7"))
        {}
        else if(jTextField39.getText().equals("8"))
        {}
        else if(jTextField39.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField39CaretUpdate

    private void jTextField40CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField40CaretUpdate
        // TODO add your handling code here:
        if(jTextField40.getText().equals(""))
        {}
        else if(jTextField40.getText().equals("1"))
        {}
        else if(jTextField40.getText().equals("2"))
        {}
        else if(jTextField40.getText().equals("3"))
        {}
        else if(jTextField40.getText().equals("4"))
        {}
        else if(jTextField40.getText().equals("5"))
        {}
        else if(jTextField40.getText().equals("6"))
        {}
        else if(jTextField40.getText().equals("7"))
        {}
        else if(jTextField40.getText().equals("8"))
        {}
        else if(jTextField40.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField40CaretUpdate

    private void jTextField41CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField41CaretUpdate
        // TODO add your handling code here:
        if(jTextField41.getText().equals(""))
        {}
        else if(jTextField41.getText().equals("1"))
        {}
        else if(jTextField41.getText().equals("2"))
        {}
        else if(jTextField41.getText().equals("3"))
        {}
        else if(jTextField41.getText().equals("4"))
        {}
        else if(jTextField41.getText().equals("5"))
        {}
        else if(jTextField41.getText().equals("6"))
        {}
        else if(jTextField41.getText().equals("7"))
        {}
        else if(jTextField41.getText().equals("8"))
        {}
        else if(jTextField41.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField41CaretUpdate

    private void jTextField42CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField42CaretUpdate
        // TODO add your handling code here:
        if(jTextField42.getText().equals(""))
        {}
        else if(jTextField42.getText().equals("1"))
        {}
        else if(jTextField42.getText().equals("2"))
        {}
        else if(jTextField42.getText().equals("3"))
        {}
        else if(jTextField42.getText().equals("4"))
        {}
        else if(jTextField42.getText().equals("5"))
        {}
        else if(jTextField42.getText().equals("6"))
        {}
        else if(jTextField42.getText().equals("7"))
        {}
        else if(jTextField42.getText().equals("8"))
        {}
        else if(jTextField42.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField42CaretUpdate

    private void jTextField43CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField43CaretUpdate
        // TODO add your handling code here:
        if(jTextField43.getText().equals(""))
        {}
        else if(jTextField43.getText().equals("1"))
        {}
        else if(jTextField43.getText().equals("2"))
        {}
        else if(jTextField43.getText().equals("3"))
        {}
        else if(jTextField43.getText().equals("4"))
        {}
        else if(jTextField43.getText().equals("5"))
        {}
        else if(jTextField43.getText().equals("6"))
        {}
        else if(jTextField43.getText().equals("7"))
        {}
        else if(jTextField43.getText().equals("8"))
        {}
        else if(jTextField43.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField43CaretUpdate

    private void jTextField44CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField44CaretUpdate
        // TODO add your handling code here:
        if(jTextField44.getText().equals(""))
        {}
        else if(jTextField44.getText().equals("1"))
        {}
        else if(jTextField44.getText().equals("2"))
        {}
        else if(jTextField44.getText().equals("3"))
        {}
        else if(jTextField44.getText().equals("4"))
        {}
        else if(jTextField44.getText().equals("5"))
        {}
        else if(jTextField44.getText().equals("6"))
        {}
        else if(jTextField44.getText().equals("7"))
        {}
        else if(jTextField44.getText().equals("8"))
        {}
        else if(jTextField44.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField44CaretUpdate

    private void jTextField45CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField45CaretUpdate
        // TODO add your handling code here:
        if(jTextField45.getText().equals(""))
        {}
        else if(jTextField45.getText().equals("1"))
        {}
        else if(jTextField45.getText().equals("2"))
        {}
        else if(jTextField45.getText().equals("3"))
        {}
        else if(jTextField45.getText().equals("4"))
        {}
        else if(jTextField45.getText().equals("5"))
        {}
        else if(jTextField45.getText().equals("6"))
        {}
        else if(jTextField45.getText().equals("7"))
        {}
        else if(jTextField45.getText().equals("8"))
        {}
        else if(jTextField45.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField45CaretUpdate

    private void jTextField46CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField46CaretUpdate
        // TODO add your handling code here:
        if(jTextField46.getText().equals(""))
        {}
        else if(jTextField46.getText().equals("1"))
        {}
        else if(jTextField46.getText().equals("2"))
        {}
        else if(jTextField46.getText().equals("3"))
        {}
        else if(jTextField46.getText().equals("4"))
        {}
        else if(jTextField46.getText().equals("5"))
        {}
        else if(jTextField46.getText().equals("6"))
        {}
        else if(jTextField46.getText().equals("7"))
        {}
        else if(jTextField46.getText().equals("8"))
        {}
        else if(jTextField46.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField46CaretUpdate

    private void jTextField47CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField47CaretUpdate
        // TODO add your handling code here:
        if(jTextField47.getText().equals(""))
        {}
        else if(jTextField47.getText().equals("1"))
        {}
        else if(jTextField47.getText().equals("2"))
        {}
        else if(jTextField47.getText().equals("3"))
        {}
        else if(jTextField47.getText().equals("4"))
        {}
        else if(jTextField47.getText().equals("5"))
        {}
        else if(jTextField47.getText().equals("6"))
        {}
        else if(jTextField47.getText().equals("7"))
        {}
        else if(jTextField47.getText().equals("8"))
        {}
        else if(jTextField47.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField47CaretUpdate

    private void jTextField48CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField48CaretUpdate
        // TODO add your handling code here:
        if(jTextField48.getText().equals(""))
        {}
        else if(jTextField48.getText().equals("1"))
        {}
        else if(jTextField48.getText().equals("2"))
        {}
        else if(jTextField48.getText().equals("3"))
        {}
        else if(jTextField48.getText().equals("4"))
        {}
        else if(jTextField48.getText().equals("5"))
        {}
        else if(jTextField48.getText().equals("6"))
        {}
        else if(jTextField48.getText().equals("7"))
        {}
        else if(jTextField48.getText().equals("8"))
        {}
        else if(jTextField48.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField48CaretUpdate

    private void jTextField49CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField49CaretUpdate
        // TODO add your handling code here:
        if(jTextField49.getText().equals(""))
        {}
        else if(jTextField49.getText().equals("1"))
        {}
        else if(jTextField49.getText().equals("2"))
        {}
        else if(jTextField49.getText().equals("3"))
        {}
        else if(jTextField49.getText().equals("4"))
        {}
        else if(jTextField49.getText().equals("5"))
        {}
        else if(jTextField49.getText().equals("6"))
        {}
        else if(jTextField49.getText().equals("7"))
        {}
        else if(jTextField49.getText().equals("8"))
        {}
        else if(jTextField49.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField49CaretUpdate

    private void jTextField50CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField50CaretUpdate
        // TODO add your handling code here:
        if(jTextField50.getText().equals(""))
        {}
        else if(jTextField50.getText().equals("1"))
        {}
        else if(jTextField50.getText().equals("2"))
        {}
        else if(jTextField50.getText().equals("3"))
        {}
        else if(jTextField50.getText().equals("4"))
        {}
        else if(jTextField50.getText().equals("5"))
        {}
        else if(jTextField50.getText().equals("6"))
        {}
        else if(jTextField50.getText().equals("7"))
        {}
        else if(jTextField50.getText().equals("8"))
        {}
        else if(jTextField50.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField50CaretUpdate

    private void jTextField51CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField51CaretUpdate
        // TODO add your handling code here:
        if(jTextField51.getText().equals(""))
        {}
        else if(jTextField51.getText().equals("1"))
        {}
        else if(jTextField51.getText().equals("2"))
        {}
        else if(jTextField51.getText().equals("3"))
        {}
        else if(jTextField51.getText().equals("4"))
        {}
        else if(jTextField51.getText().equals("5"))
        {}
        else if(jTextField51.getText().equals("6"))
        {}
        else if(jTextField51.getText().equals("7"))
        {}
        else if(jTextField51.getText().equals("8"))
        {}
        else if(jTextField51.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField51CaretUpdate

    private void jTextField52CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField52CaretUpdate
        // TODO add your handling code here:
        if(jTextField52.getText().equals(""))
        {}
        else if(jTextField52.getText().equals("1"))
        {}
        else if(jTextField52.getText().equals("2"))
        {}
        else if(jTextField52.getText().equals("3"))
        {}
        else if(jTextField52.getText().equals("4"))
        {}
        else if(jTextField52.getText().equals("5"))
        {}
        else if(jTextField52.getText().equals("6"))
        {}
        else if(jTextField52.getText().equals("7"))
        {}
        else if(jTextField52.getText().equals("8"))
        {}
        else if(jTextField52.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField52CaretUpdate

    private void jTextField53CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField53CaretUpdate
        // TODO add your handling code here:
        if(jTextField53.getText().equals(""))
        {}
        else if(jTextField53.getText().equals("1"))
        {}
        else if(jTextField53.getText().equals("2"))
        {}
        else if(jTextField53.getText().equals("3"))
        {}
        else if(jTextField53.getText().equals("4"))
        {}
        else if(jTextField53.getText().equals("5"))
        {}
        else if(jTextField53.getText().equals("6"))
        {}
        else if(jTextField53.getText().equals("7"))
        {}
        else if(jTextField53.getText().equals("8"))
        {}
        else if(jTextField53.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField53CaretUpdate

    private void jTextField54CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField54CaretUpdate
        // TODO add your handling code here:
        if(jTextField54.getText().equals(""))
        {}
        else if(jTextField54.getText().equals("1"))
        {}
        else if(jTextField54.getText().equals("2"))
        {}
        else if(jTextField54.getText().equals("3"))
        {}
        else if(jTextField54.getText().equals("4"))
        {}
        else if(jTextField54.getText().equals("5"))
        {}
        else if(jTextField54.getText().equals("6"))
        {}
        else if(jTextField54.getText().equals("7"))
        {}
        else if(jTextField54.getText().equals("8"))
        {}
        else if(jTextField54.getText().equals("9"))
        {}
        else
            JOptionPane.showMessageDialog(null,"you entered something wrong\n please enter 1~9");
        submit();
    }//GEN-LAST:event_jTextField54CaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        sudoku_score = 0;
        score = sudoku_score + score;
        scoreString = String.valueOf(score);
        write(scoreString);   
        this.setVisible(false);
        new End().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jt1a.equals(jTextField1.getText())){}
        else 
        {
            if(jt1==false)
            {
                sudoku_score -= 10;
                jt1 = true;              
            }                
        }
        
        if(jt2a.equals(jTextField2.getText())){}
        else 
        {
            if(jt2==false)
            {
                sudoku_score -= 10;
                jt2 = true;               
            }      
           
        }
        
        if(jt3a.equals(jTextField3.getText())){}
        else 
        {
            if(jt3==false)
            {
                sudoku_score -= 10;
                jt3 = true;             
            }     
            
        }
        
        if(jt4a.equals(jTextField4.getText())){}
        else 
        {
            if(jt4==false)
            {
                sudoku_score -= 10;
                jt4 = true;              
            }    
            
        }
        
        if(jt5a.equals(jTextField5.getText())){}
        else 
        {
            if(jt5==false)
            {
                sudoku_score -= 10;
                jt5 = true;              
            }      
            
        }
        
        if(jt6a.equals(jTextField6.getText())){}
        else 
        {
            if(jt6==false)
            {
                sudoku_score -= 10;
                jt6 = true;             
            }    
            
        }
        
        if(jt7a.equals(jTextField7.getText())){}
        else 
        {
            if(jt7==false)
            {
                sudoku_score -= 10;
                jt7 = true;
            }
                
        }
        
        if(jt8a.equals(jTextField8.getText())){}
        else 
        {
            if(jt8==false)
            {
                sudoku_score -= 10;
                jt8 = true;               
            }           
            
        }
        
        if(jt9a.equals(jTextField9.getText())){}
        else 
        {
            if(jt9==false)
            {
                sudoku_score -= 10;
                jt9 = true;               
            }   
           
        }
        
        if(jt10a.equals(jTextField10.getText())){}
        else 
        {
            if(jt10==false)
            {
                sudoku_score -= 10;
                jt10 = true;              
            }  
            
        }
        
        if(jt11a.equals(jTextField11.getText())){}
        else 
        {
            if(jt11==false)
            {
                sudoku_score -= 10;
                jt11 = true;             
            }          
                   }
        
        if(jt12a.equals(jTextField12.getText())){}
        else 
        {
            if(jt12==false)
            {
                sudoku_score -= 10;
                jt12 = true;              
            }  
            
        }
        
        if(jt13a.equals(jTextField13.getText())){}
        else 
        {
            if(jt13==false)
            {
                sudoku_score -= 10;
                jt13 = true;              
            }      
        }
        
        if(jt14a.equals(jTextField14.getText())){}
        else 
        {
            if(jt14==false)
            {
                sudoku_score -= 10;
                jt14 = true;               
            }            
        }
        
        if(jt15a.equals(jTextField15.getText())){}
        else 
        {
            if(jt15==false)
            {
                sudoku_score -= 10;
                jt15 = true;              
            }      
        }
        
        if(jt16a.equals(jTextField16.getText())){}
        else 
        {
            if(jt16==false)
            {
                sudoku_score -= 10;
                jt16 = true;              
            }      
        }
        
        if(jt17a.equals(jTextField17.getText())){}
        else 
        {
            if(jt17==false)
            {
                sudoku_score -= 10;
                jt17 = true;             
            }     
        }
        
        if(jt18a.equals(jTextField18.getText())){}
        else 
        {
            if(jt18==false)
            {
                sudoku_score -= 10;
                jt18 = true;           
            }     
        }
        
        if(jt19a.equals(jTextField19.getText())){}
        else 
        {
            if(jt19==false)
            {
                sudoku_score -= 10;
                jt19 = true;             
            }     
        }
        
        if(jt20a.equals(jTextField20.getText())){}
        else 
        {
            if(jt20==false)
            {
                sudoku_score -= 10;
                jt20 = true;             
            }        
        }
        
        if(jt21a.equals(jTextField21.getText())){}
        else 
        {
            if(jt21==false)
            {
                sudoku_score -= 10;
                jt21 = true;              
            }        
        }
        
        if(jt22a.equals(jTextField22.getText())){}
        else 
        {
            if(jt22==false)
            {
                sudoku_score -= 10;
                jt22 = true;               
            }     
        }
        
        if(jt23a.equals(jTextField23.getText())){}
        else 
        {
            if(jt23==false)
            {
                sudoku_score -= 10;
                jt23 = true;               
            }            
        }
        
        if(jt24a.equals(jTextField24.getText())){}
        else 
        {
            if(jt24==false)
            {
                sudoku_score -= 10;
                jt24 = true;              
            }      
        }
        
        if(jt25a.equals(jTextField25.getText())){}
        else 
        {
            if(jt25==false)
            {
                sudoku_score -= 10;
                jt25 = true;              
            }    
        }
        
        if(jt26a.equals(jTextField26.getText())){}
        else 
        {
            if(jt26==false)
            {
                sudoku_score -= 10;
                jt26 = true;               
            }
            
        }
        
          if(jt27a.equals(jTextField27.getText())){}
        else 
        {
            if(jt27==false)
            {
                sudoku_score -= 10;
                jt27 = true;               
            }
            
        }
        
        if(jt28a.equals(jTextField28.getText())){}
        else 
        {
            if(jt28==false)
            {
                sudoku_score -= 10;
                jt28 = true;                
            }     
        }
        
        if(jt29a.equals(jTextField29.getText())){}
        else 
        {
            if(jt29==false)
            {
                sudoku_score -= 10;
                jt29 = true;               
            }      
        }
        
        if(jt30a.equals(jTextField30.getText())){}
        else 
        {
            if(jt30==false)
            {
                sudoku_score -= 10;
                jt30 = true;              
            }       
        }
        
        if(jt31a.equals(jTextField31.getText())){}
        else 
        {
            if(jt31==false)
            {
                sudoku_score -= 10;
                jt31 = true;               
            }    
        }
         
        if(jt32a.equals(jTextField32.getText())){}
        else 
        {
            if(jt32==false)
            {
                sudoku_score -= 10;
                jt32 = true;               
            }     
        }
        
        if(jt33a.equals(jTextField33.getText())){}
        else 
        {
            if(jt33==false)
            {
                sudoku_score -= 10;
                jt33 = true;              
            }      
        }
        
        if(jt34a.equals(jTextField34.getText())){}
        else 
        {
            if(jt34==false)
            {
                sudoku_score -= 10;
                jt34 = true;               
            }    
        }
        
        if(jt35a.equals(jTextField35.getText())){}
        else 
        {
            if(jt35==false)
            {
                sudoku_score -= 10;
                jt35 = true;              
            }    
        }
        
        if(jt36a.equals(jTextField36.getText())){}
        else 
        {
            if(jt36==false)
            {
                sudoku_score -= 10;
                jt36 = true;               
            }    
        }
        
        if(jt37a.equals(jTextField37.getText())){}
        else 
        {
            if(jt37==false)
            {
                sudoku_score -= 10;
                jt37 = true;
            }    
        }
        
        if(jt38a.equals(jTextField38.getText())){}
        else 
        {
            if(jt38==false)
            {
                sudoku_score -= 10;
                jt38 = true;
            }    
        }
        
        if(jt39a.equals(jTextField39.getText())){}
        else 
        {
            if(jt39==false)
            {
                sudoku_score -= 10;
                jt39 = true;
            }    
        }
        
        if(jt40a.equals(jTextField40.getText())){}
        else 
        {
            if(jt40==false)
            {
                sudoku_score -= 10;
                jt40 = true;
            }    
        }
        
        if(jt41a.equals(jTextField41.getText())){}
        else 
        {
            if(jt41==false)
            {
                sudoku_score -= 10;
                jt41 = true;
            }    
        }
        
        if(jt42a.equals(jTextField42.getText())){}
        else 
        {
            if(jt42==false)
            {
                sudoku_score -= 10;
                jt42 = true;
            }    
        }
        
        if(jt43a.equals(jTextField43.getText())){}
        else 
        {
            if(jt43==false)
            {
                sudoku_score -= 10;
                jt43 = true;
            }    
        }
        
        if(jt44a.equals(jTextField44.getText())){}
        else 
        {
            if(jt44==false)
            {
                sudoku_score -= 10;
                jt44 = true;
            }    
        }
        
        if(jt45a.equals(jTextField45.getText())){}
        else 
        {
            if(jt45==false)
            {
                sudoku_score -= 10;
                jt45 = true;
            }    
        }
        
        if(jt46a.equals(jTextField46.getText())){}
        else 
        {
            if(jt46==false)
            {
                sudoku_score -= 10;
                jt46 = true;
            }    
        }
        
        if(jt47a.equals(jTextField47.getText())){}
        else 
        {
            if(jt47==false)
            {
                sudoku_score -= 10;
                jt47 = true;
            }    
        }
        
        if(jt48a.equals(jTextField48.getText())){}
        else 
        {
            if(jt48==false)
            {
                sudoku_score -= 10;
                jt48 = true;
            }    
        }
        
        if(jt49a.equals(jTextField49.getText())){}
        else 
        {
            if(jt49==false)
            {
                sudoku_score -= 10;
                jt49 = true;
            }    
        }
        
        if(jt50a.equals(jTextField50.getText())){}
        else 
        {
            if(jt50==false)
            {
                sudoku_score -= 10;
                jt50 = true;
            }    
        }
        
        if(jt51a.equals(jTextField51.getText())){}
        else 
        {
            if(jt51==false)
            {
                sudoku_score -= 10;
                jt51 = true;
            }    
        }
        
        if(jt52a.equals(jTextField52.getText())){}
        else 
        {
            if(jt52==false)
            {
                sudoku_score -= 10;
                jt52 = true;
            }    
        }
        
        if(jt53a.equals(jTextField53.getText())){}
        else 
        {
            if(jt53==false)
            {
                sudoku_score -= 10;
                jt53 = true;
            }    
        }
        
        if(jt54a.equals(jTextField54.getText())){}
        else 
        {
            if(jt54==false)
            {
                sudoku_score -= 10;
                jt54 = true;
            }    
        }
        
        if(jt1a.equals(jTextField1.getText()) && jt2a.equals(jTextField2.getText()) && jt3a.equals(jTextField3.getText()) && jt4a.equals(jTextField4.getText()) 
                && jt5a.equals(jTextField5.getText()) && jt6a.equals(jTextField6.getText()) && jt7a.equals(jTextField7.getText()) && jt8a.equals(jTextField8.getText())
                && jt9a.equals(jTextField9.getText()) && jt10a.equals(jTextField10.getText()) && jt11a.equals(jTextField11.getText()) && jt12a.equals(jTextField12.getText())
                && jt13a.equals(jTextField13.getText()) && jt14a.equals(jTextField14.getText()) && jt15a.equals(jTextField15.getText()) && jt16a.equals(jTextField16.getText())
                && jt17a.equals(jTextField17.getText()) && jt18a.equals(jTextField18.getText()) && jt19a.equals(jTextField19.getText()) && jt20a.equals(jTextField20.getText())
                && jt21a.equals(jTextField21.getText()) && jt22a.equals(jTextField22.getText()) && jt23a.equals(jTextField23.getText()) && jt24a.equals(jTextField24.getText())
                && jt25a.equals(jTextField25.getText()) && jt26a.equals(jTextField26.getText()) && jt27a.equals(jTextField27.getText()) && jt28a.equals(jTextField28.getText())
                && jt29a.equals(jTextField29.getText()) && jt30a.equals(jTextField30.getText()) && jt31a.equals(jTextField31.getText()) && jt32a.equals(jTextField32.getText())
                && jt33a.equals(jTextField33.getText()) && jt34a.equals(jTextField34.getText()) && jt35a.equals(jTextField35.getText()) && jt36a.equals(jTextField36.getText())
                && jt37a.equals(jTextField37.getText()) && jt38a.equals(jTextField38.getText()) && jt39a.equals(jTextField39.getText()) && jt40a.equals(jTextField40.getText())
                && jt41a.equals(jTextField41.getText()) && jt42a.equals(jTextField42.getText()) && jt43a.equals(jTextField43.getText()) && jt44a.equals(jTextField44.getText())
                && jt45a.equals(jTextField45.getText()) && jt46a.equals(jTextField46.getText()) && jt47a.equals(jTextField47.getText()) && jt48a.equals(jTextField48.getText())
                && jt49a.equals(jTextField49.getText()) && jt50a.equals(jTextField50.getText()) && jt51a.equals(jTextField51.getText()) && jt52a.equals(jTextField52.getText())
                && jt53a.equals(jTextField53.getText()) && jt54a.equals(jTextField54.getText()))
        {           
            score = sudoku_score + score;
            scoreString = String.valueOf(score);
            write(scoreString);   
            this.setVisible(false);
            new End().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Wrong Answer, Try again!");
        }
        
                             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setToolTipText("Click to submit your Answer. Submit button is only enabled when all 54 textfield are not empty");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setToolTipText("Click to skip the game.");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
        // TODO add your handling code here:
        jTextField1.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseEntered
        // TODO add your handling code here:
        jTextField2.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField2MouseEntered

    private void jTextField3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseEntered
        // TODO add your handling code here:
        jTextField3.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField3MouseEntered

    private void jTextField4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseEntered
        // TODO add your handling code here:
        jTextField4.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField4MouseEntered

    private void jTextField5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseEntered
        // TODO add your handling code here:
        jTextField5.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField5MouseEntered

    private void jTextField6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseEntered
        // TODO add your handling code here:
        jTextField6.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField6MouseEntered

    private void jTextField7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseEntered
        // TODO add your handling code here:
        jTextField7.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField7MouseEntered

    private void jTextField8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseEntered
        // TODO add your handling code here:
        jTextField8.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField8MouseEntered

    private void jTextField9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseEntered
        // TODO add your handling code here:
        jTextField9.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField9MouseEntered

    private void jTextField10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseEntered
        // TODO add your handling code here:
        jTextField10.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField10MouseEntered

    private void jTextField11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseEntered
        // TODO add your handling code here:
        jTextField11.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField11MouseEntered

    private void jTextField12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseEntered
        // TODO add your handling code here:
        jTextField12.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField12MouseEntered

    private void jTextField13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseEntered
        // TODO add your handling code here:
        jTextField13.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField13MouseEntered

    private void jTextField14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseEntered
        // TODO add your handling code here:
        jTextField14.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField14MouseEntered

    private void jTextField15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseEntered
        // TODO add your handling code here:
        jTextField15.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField15MouseEntered

    private void jTextField16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseEntered
        // TODO add your handling code here:
        jTextField16.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField16MouseEntered

    private void jTextField17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseEntered
        // TODO add your handling code here:
        jTextField17.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField17MouseEntered

    private void jTextField18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField18MouseEntered
        // TODO add your handling code here:
        jTextField18.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField18MouseEntered

    private void jTextField19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField19MouseEntered
        // TODO add your handling code here:
        jTextField19.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField19MouseEntered

    private void jTextField20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseEntered
        // TODO add your handling code here:
        jTextField20.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField20MouseEntered

    private void jTextField21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseEntered
        // TODO add your handling code here:
        jTextField21.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField21MouseEntered

    private void jTextField22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseEntered
        // TODO add your handling code here:
        jTextField22.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField22MouseEntered

    private void jTextField23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseEntered
        // TODO add your handling code here:
        jTextField23.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField23MouseEntered

    private void jTextField24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseEntered
        // TODO add your handling code here:
        jTextField24.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField24MouseEntered

    private void jTextField25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseEntered
        // TODO add your handling code here:
        jTextField25.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField25MouseEntered

    private void jTextField26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseEntered
        // TODO add your handling code here:
        jTextField26.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField26MouseEntered

    private void jTextField27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField27MouseEntered
        // TODO add your handling code here:
        jTextField27.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField27MouseEntered

    private void jTextField28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseEntered
        // TODO add your handling code here:
        jTextField28.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField28MouseEntered

    private void jTextField29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseEntered
        // TODO add your handling code here:
        jTextField29.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField29MouseEntered

    private void jTextField30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseEntered
        // TODO add your handling code here:
        jTextField30.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField30MouseEntered

    private void jTextField31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField31MouseEntered
        // TODO add your handling code here:
        jTextField31.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField31MouseEntered

    private void jTextField32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField32MouseEntered
        // TODO add your handling code here:
        jTextField32.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField32MouseEntered

    private void jTextField33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField33MouseEntered
        // TODO add your handling code here:
        jTextField33.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField33MouseEntered

    private void jTextField34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField34MouseEntered
        // TODO add your handling code here:
        jTextField34.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField34MouseEntered

    private void jTextField35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField35MouseEntered
        // TODO add your handling code here:
        jTextField35.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField35MouseEntered

    private void jTextField36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField36MouseEntered
        // TODO add your handling code here:
        jTextField36.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField36MouseEntered

    private void jTextField37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField37MouseEntered
        // TODO add your handling code here:
        jTextField37.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField37MouseEntered

    private void jTextField38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField38MouseEntered
        // TODO add your handling code here:
        jTextField38.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField38MouseEntered

    private void jTextField39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField39MouseEntered
        // TODO add your handling code here:
        jTextField39.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField39MouseEntered

    private void jTextField40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField40MouseEntered
        // TODO add your handling code here:
        jTextField40.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField40MouseEntered

    private void jTextField41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField41MouseEntered
        // TODO add your handling code here:
        jTextField41.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField41MouseEntered

    private void jTextField42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField42MouseEntered
        // TODO add your handling code here:
        jTextField42.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField42MouseEntered

    private void jTextField43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField43MouseEntered
        // TODO add your handling code here:
        jTextField43.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField43MouseEntered

    private void jTextField44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField44MouseEntered
        // TODO add your handling code here:
        jTextField44.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField44MouseEntered

    private void jTextField45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField45MouseEntered
        // TODO add your handling code here:
        jTextField45.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField45MouseEntered

    private void jTextField46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField46MouseEntered
        // TODO add your handling code here:
        jTextField46.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField46MouseEntered

    private void jTextField47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField47MouseEntered
        // TODO add your handling code here:
        jTextField47.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField47MouseEntered

    private void jTextField48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField48MouseEntered
        // TODO add your handling code here:
        jTextField48.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField48MouseEntered

    private void jTextField49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField49MouseEntered
        // TODO add your handling code here:
        jTextField49.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField49MouseEntered

    private void jTextField50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField50MouseEntered
        // TODO add your handling code here:
        jTextField50.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField50MouseEntered

    private void jTextField51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField51MouseEntered
        // TODO add your handling code here:
        jTextField51.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField51MouseEntered

    private void jTextField52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField52MouseEntered
        // TODO add your handling code here:
        jTextField52.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField52MouseEntered

    private void jTextField53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField53MouseEntered
        // TODO add your handling code here:
        jTextField53.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField53MouseEntered

    private void jTextField54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField54MouseEntered
        // TODO add your handling code here:
        jTextField54.setToolTipText("Enter 1~9 Only.");
    }//GEN-LAST:event_jTextField54MouseEntered

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
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
