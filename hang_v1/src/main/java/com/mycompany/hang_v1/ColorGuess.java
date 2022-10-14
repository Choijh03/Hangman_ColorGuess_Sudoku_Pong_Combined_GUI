/*************************************************************** 
* file: ColorGuess.java 
* author: Jihun Choi
* date last modified: 10/02/2022 
* 
* 
* purpose: This class is jFrmae class that is used for Color Guess game screen
* Once this class is constucted, User will be playing game of color guess for 5 rounds
* 
****************************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hang_v1;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
/**
 *
 * @author PC
 */
public class ColorGuess extends javax.swing.JFrame {
    private String roundString ="";
    private int round = 0;
    private String scoreString = "";
    private int day, month,year; //used for clock
    private int hour, minute, second; //used for clock
    private String daystr,timestr; //usedf for jlabel and clock
    private int score =0;
    private int[] newButtons = new int[5];
    private int buttonCounter = 5;
    private String answer ="";
    private String button1 = "";
    private String button2 = "";
    private String button3 = "";
    private String button4 = "";
    private String button5 = "";
    private String button6 = "";
    private String button7 = "";
    private String button8 = "";
    private String button9 = "";
    private String button10 = "";
    private String button11 = "";
    private String button12 = "";
    private String button13 = "";
    private String button14 = "";
    private String button15 = "";
    private String button16 = "";
    /**
     * Creates new form ColorGuess
     */
    public ColorGuess() {
        initComponents();
        this.setBounds(0, 0, 610, 435); //setting the bound
        this.setLocationRelativeTo(null); //setting the screen to center
        textLabel();    
        newButtons = randomButton();                  
        colorController(newButtons);     
        currentTime(); //calling clokc function
        read("current_score.txt");        
        read_roundCounter("round_counter.txt");
        
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
    
    // method: read_roundCounter
    // purpose: this method is to read the round information from file named "round_counter.txt
    public void read_roundCounter(String filename)
    {
       try {
            FileReader reader = new FileReader(filename);
            int character;
 
            while ((character = reader.read()) != -1) {                   
                roundString += (char)character;
            }
            round = Integer.parseInt(roundString);
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    // method: write_roundCounter
    // purpose: this method is to write to the round information to file named "round_counter.txt
    public void write_roundCounter(String current_round)
    {
        try  
    {         
        File f= new File("round_counter.txt");  //file to be delete  
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
            FileWriter writer = new FileWriter("round_counter.txt", true);
            writer.write(current_round);           
            writer.close();
        } 
    catch (IOException e) 
        {
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
    
    // method: colorController
    // method to show 5 random buttons by changing setVisible() to true
    // method to set random color to 5 random buttons
    public void colorController(int[] newButtons)
    {
        //red -0
        //blue -1
        //purple-2 - magenta
        //green -3
        //yellow -4
         for (int i = 0; i < newButtons.length; i++)
         {            
             if(newButtons[i]==0)
             {
                 jButton1.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton1.setBackground(Color.yellow);
                         button1 = "Yellow";
                         break;
                     case 3:
                         jButton1.setBackground(Color.green);
                         button1 = "Green";
                         break;
                     case 2:
                         jButton1.setBackground(Color.magenta);
                         button1 = "Purple";
                         break;
                     case 1:
                         jButton1.setBackground(Color.blue);
                         button1 = "Blue";
                         break;
                     case 0:
                         jButton1.setBackground(Color.red);
                         button1 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==1)
             {
                 jButton2.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton2.setBackground(Color.yellow);  
                         button2 = "Yellow";
                         break;
                     case 3:
                         jButton2.setBackground(Color.green);
                         button2 = "Green";
                         break;
                     case 2:
                         jButton2.setBackground(Color.magenta);
                         button2 = "Purple";
                         break;
                     case 1:
                         jButton2.setBackground(Color.blue);
                         button2 = "Blue";
                         break;
                     case 0:
                         jButton2.setBackground(Color.red);
                         button2 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==2)
             {
                 jButton3.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton3.setBackground(Color.yellow);   
                         button3 = "Yellow";
                         break;
                     case 3:
                         jButton3.setBackground(Color.green);
                         button3 = "Green";
                         break;
                     case 2:
                         jButton3.setBackground(Color.magenta);
                         button3 = "Purple";
                         break;
                     case 1:
                         jButton3.setBackground(Color.blue);
                         button3 = "Blue";
                         break;
                     case 0:
                         jButton3.setBackground(Color.red);
                         button3 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==3)
             {
                 jButton4.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton4.setBackground(Color.yellow);     
                         button4 = "Yellow";
                         break;
                     case 3:
                         jButton4.setBackground(Color.green);
                         button4 = "Green";
                         break;
                     case 2:
                         jButton4.setBackground(Color.magenta);
                         button4 = "Purple";
                         break;
                     case 1:
                         jButton4.setBackground(Color.blue);
                         button4 = "Blue";
                         break;
                     case 0:
                         jButton4.setBackground(Color.red);
                         button4 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==4)
             {
                 jButton5.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton5.setBackground(Color.yellow);  
                         button5 = "Yellow";
                         break;
                     case 3:
                         jButton5.setBackground(Color.green);
                         button5 = "Green";
                         break;
                     case 2:
                         jButton5.setBackground(Color.magenta);
                         button5 = "Purple";
                         break;
                     case 1:
                         jButton5.setBackground(Color.blue);
                         button5 = "Blue";
                         break;
                     case 0:
                         jButton5.setBackground(Color.red);
                         button5 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==5)
             {
                 jButton6.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton6.setBackground(Color.yellow);         
                         button6 = "Yellow";
                         break;
                     case 3:
                         jButton6.setBackground(Color.green);
                         button6 = "Green";
                         break;
                     case 2:
                         jButton6.setBackground(Color.magenta);
                         button6 = "Purple";
                         break;
                     case 1:
                         jButton6.setBackground(Color.blue);
                         button6 = "Blue";
                         break;
                     case 0:
                         jButton6.setBackground(Color.red);
                         button6 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==6)
             {
                 jButton7.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton7.setBackground(Color.yellow);    
                         button7 = "Yellow";
                         break;
                     case 3:
                         jButton7.setBackground(Color.green);
                         button7 = "Green";
                         break;
                     case 2:
                         jButton7.setBackground(Color.magenta);
                         button7 = "Purple";
                         break;
                     case 1:
                         jButton7.setBackground(Color.blue);
                         button7 = "Blue";
                         break;
                     case 0:
                         jButton7.setBackground(Color.red);
                         button7 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==7)
             {
                 jButton8.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton8.setBackground(Color.yellow);     
                         button8 = "Yellow";
                         break;
                     case 3:
                         jButton8.setBackground(Color.green);
                         button8 = "Green";
                         break;
                     case 2:
                         jButton8.setBackground(Color.magenta);
                         button8 = "Purple";
                         break;
                     case 1:
                         jButton8.setBackground(Color.blue);
                         button8 = "Blue";
                         break;
                     case 0:
                         jButton8.setBackground(Color.red);
                         button8 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==8)
             {
                 jButton9.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton9.setBackground(Color.yellow); 
                         button9 = "Yellow";
                         break;
                     case 3:
                         jButton9.setBackground(Color.green);
                         button9 = "Green";
                         break;
                     case 2:
                         jButton9.setBackground(Color.magenta);
                         button9 = "Purple";
                         break;
                     case 1:
                         jButton9.setBackground(Color.blue);
                         button9 = "Blue";
                         break;
                     case 0:
                         jButton9.setBackground(Color.red);
                         button9 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==9)
             {
                 jButton10.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton10.setBackground(Color.yellow);     
                         button10 = "Yellow";
                         break;
                     case 3:
                         jButton10.setBackground(Color.green);
                         button10 = "Green";
                         break;
                     case 2:
                         jButton10.setBackground(Color.magenta);
                         button10 = "Purple";
                         break;
                     case 1:
                         jButton10.setBackground(Color.blue);
                         button10 = "Blue";
                         break;
                     case 0:
                         jButton10.setBackground(Color.red);
                         button10 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==10)
             {
                 jButton11.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton11.setBackground(Color.yellow);  
                         button11 = "Yellow";
                         break;
                     case 3:
                         jButton11.setBackground(Color.green);
                         button11 = "Green";
                         break;
                     case 2:
                         jButton11.setBackground(Color.magenta);
                         button11 = "Purple";
                         break;
                     case 1:
                         jButton11.setBackground(Color.blue);
                         button11 = "Blue";
                         break;
                     case 0:
                         jButton11.setBackground(Color.red);
                         button11 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==11)
             {
                 jButton12.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton12.setBackground(Color.yellow); 
                         button12 = "Yellow";
                         break;
                     case 3:
                         jButton12.setBackground(Color.green);
                         button12 = "Green";
                         break;
                     case 2:
                         jButton12.setBackground(Color.magenta);
                         button12 = "Purple";
                         break;
                     case 1:
                         jButton12.setBackground(Color.blue);
                         button12 = "Blue";
                         break;
                     case 0:
                         jButton12.setBackground(Color.red);
                         button12 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==12)
             {
                 jButton13.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton13.setBackground(Color.yellow);      
                         button13 = "Yellow";
                         break;
                     case 3:
                         jButton13.setBackground(Color.green);
                         button13 = "Green";
                         break;
                     case 2:
                         jButton13.setBackground(Color.magenta);
                         button13 = "Purple";
                         break;
                     case 1:
                         jButton13.setBackground(Color.blue);
                         button13 = "Blue";
                         break;
                     case 0:
                         jButton13.setBackground(Color.red);
                         button13 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==13)
             {
                 jButton14.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton14.setBackground(Color.yellow);   
                         button14 = "Yellow";
                         break;
                     case 3:
                         jButton14.setBackground(Color.green);
                         button14 = "Green";
                         break;
                     case 2:
                         jButton14.setBackground(Color.magenta);
                         button14 = "Purple";
                         break;
                     case 1:
                         jButton14.setBackground(Color.blue);
                         button14 = "Blue";
                         break;
                     case 0:
                         jButton14.setBackground(Color.red);
                         button14 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             else if(newButtons[i]==14)
             {
                 jButton15.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton15.setBackground(Color.yellow);   
                         button15 = "Yellow";
                         break;
                     case 3:
                         jButton15.setBackground(Color.green);
                         button15 = "Green";
                         break;
                     case 2:
                         jButton15.setBackground(Color.magenta);
                         button15 = "Purple";
                         break;
                     case 1:
                         jButton15.setBackground(Color.blue);
                         button15 = "Blue";
                         break;
                     case 0:
                         jButton15.setBackground(Color.red);
                         button15 = "Red";
                         break;
                     default:
                         break;
                 }
                 
             }
             else if(newButtons[i]==15)
             {
                 jButton16.setVisible(true);
                 buttonCounter--;
                 switch (buttonCounter) {
                     case 4:
                         jButton16.setBackground(Color.yellow); 
                         button16 = "Yellow";
                         break;
                     case 3:
                         jButton16.setBackground(Color.green);
                         button16 = "Green";
                         break;
                     case 2:
                         jButton16.setBackground(Color.magenta);
                         button16 = "Purple";
                         break;
                     case 1:
                         jButton16.setBackground(Color.blue);
                         button16 = "Blue";
                         break;
                     case 0:
                         jButton16.setBackground(Color.red);
                         button16 = "Red";
                         break;
                     default:
                         break;
                 }
             }
             
             
         }
    }
    
      
    // method: randomButton    
    //method to chosee 5 random buttons out of 16 buttons available
    public int[] randomButton()
    {
        int [] buttons = new int[16];
        int [] newButtons = new int[5];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = i;      
        }
        
        Random rand = new Random();
        
       for (int i = 0; i < buttons.length; i++) {
			int randomIndexToSwap = rand.nextInt(buttons.length);
			int temp = buttons[randomIndexToSwap];
			buttons[randomIndexToSwap] = buttons[i];
			buttons[i] = temp;
		}
       
       for (int i = 0; i < newButtons.length; i++) {
            newButtons[i] = buttons[i];      
        }        
       
       return newButtons;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton2 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton3 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton4 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton5 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton6 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton7 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton8 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton9 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton10 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton11 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton12 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton13 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton14 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton15 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };
        jButton16 = new javax.swing.JButton(){
            //Paint the round background and label.
            protected void paintComponent(Graphics g)
            {
                if (getModel().isArmed())
                //You might want to make the highlight color
                //a property of the RoundButton class.
                g.setColor(Color.lightGray);
                else
                g.setColor(getBackground());
                g.fillOval(0, 0, getSize().width-1, getSize().height-1);
                //This call will paint label and focus rectangle.
                super.paintComponent(g);
            }

            //Paint the border of the button using a simple stroke.
            protected void paintBorder(Graphics g)
            {
                g.setColor(getForeground());
                g.drawOval(0, 0, getSize().width-1, getSize().height-1);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 20, 140, 50);

        jLabel2.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 10, 110, 40);

        jLabel3.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 10, 120, 40);

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 90, 100, 60);
        jButton1.setVisible(false);
        jButton1.setContentAreaFilled(false);

        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 90, 100, 60);
        jButton2.setVisible(false);
        jButton2.setContentAreaFilled(false);

        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 90, 100, 60);
        jButton3.setVisible(false);
        jButton3.setContentAreaFilled(false);

        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(450, 90, 100, 60);
        jButton4.setVisible(false);
        jButton4.setContentAreaFilled(false);

        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(60, 160, 100, 60);
        jButton5.setVisible(false);
        jButton5.setContentAreaFilled(false);

        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(190, 160, 100, 60);
        jButton6.setVisible(false);
        jButton6.setContentAreaFilled(false);

        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(320, 160, 100, 60);
        jButton7.setVisible(false);
        jButton7.setContentAreaFilled(false);

        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(450, 160, 100, 60);
        jButton8.setVisible(false);
        jButton8.setContentAreaFilled(false);

        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(60, 230, 100, 60);
        jButton9.setVisible(false);
        jButton9.setContentAreaFilled(false);

        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(190, 230, 100, 60);
        jButton10.setVisible(false);
        jButton10.setContentAreaFilled(false);

        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(320, 230, 100, 60);
        jButton11.setVisible(false);
        jButton11.setContentAreaFilled(false);

        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(450, 230, 100, 60);
        jButton12.setVisible(false);
        jButton12.setContentAreaFilled(false);

        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(60, 300, 100, 60);
        jButton13.setVisible(false);
        jButton13.setContentAreaFilled(false);

        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(190, 300, 100, 60);
        jButton14.setVisible(false);
        jButton14.setContentAreaFilled(false);

        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton15MouseExited(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(320, 300, 100, 60);
        jButton15.setVisible(false);
        jButton15.setContentAreaFilled(false);

        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton16MouseExited(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(450, 300, 100, 60);
        jButton16.setVisible(false);
        jButton16.setContentAreaFilled(false);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:     
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button1))
        {      
           score += 100; //add 100 points if it's correct  
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0) //if round ==0, game should end 
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button2))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
           new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button3))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button4))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
           new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button5))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button6))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button7))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button8))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button9))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button10))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button11))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button12))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button13))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
       if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button14))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
       if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button15))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        round--;
        roundString = Integer.toString(round);       
        write_roundCounter(roundString);
        if(answer.equals(button16))
        {      
           score += 100;                
        }
        scoreString = Integer.toString(score);
        write(scoreString);  
        if(round ==0)
        {
            new Sudoku().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            this.setVisible(false);   
            new ColorGuess().setVisible(true);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(Color.lightGray);
        jButton1.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        if(button1 == "Red")
        {
            jButton1.setBackground(Color.red);
        }
        else if(button1 == "Yellow")
        {
            jButton1.setBackground(Color.yellow);
        }
        else if(button1 == "Purple")
        {
            jButton1.setBackground(Color.magenta);
        }
        else if(button1 == "Green")
        {
            jButton1.setBackground(Color.green);
        }
        if(button1 == "Blue")
        {
            jButton1.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBackground(Color.lightGray);
        jButton2.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        if(button2 == "Red")
        {
            jButton2.setBackground(Color.red);
        }
        else if(button2 == "Yellow")
        {
            jButton2.setBackground(Color.yellow);
        }
        else if(button2 == "Purple")
        {
            jButton2.setBackground(Color.magenta);
        }
        else if(button2 == "Green")
        {
            jButton2.setBackground(Color.green);
        }
        if(button2 == "Blue")
        {
            jButton2.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(Color.lightGray);
        jButton3.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        if(button3 == "Red")
        {
            jButton3.setBackground(Color.red);
        }
        else if(button3 == "Yellow")
        {
            jButton3.setBackground(Color.yellow);
        }
        else if(button3 == "Purple")
        {
            jButton3.setBackground(Color.magenta);
        }
        else if(button3 == "Green")
        {
            jButton3.setBackground(Color.green);
        }
        if(button3 == "Blue")
        {
            jButton3.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(Color.lightGray);
        jButton4.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        if(button4 == "Red")
        {
            jButton4.setBackground(Color.red);
        }
        else if(button4 == "Yellow")
        {
            jButton4.setBackground(Color.yellow);
        }
        else if(button4 == "Purple")
        {
            jButton4.setBackground(Color.magenta);
        }
        else if(button4 == "Green")
        {
            jButton4.setBackground(Color.green);
        }
        if(button4 == "Blue")
        {
            jButton4.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setBackground(Color.lightGray);    
        jButton5.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        if(button5 == "Red")
        {
            jButton5.setBackground(Color.red);
        }
        else if(button5 == "Yellow")
        {
            jButton5.setBackground(Color.yellow);
        }
        else if(button5 == "Purple")
        {
            jButton5.setBackground(Color.magenta);
        }
        else if(button5 == "Green")
        {
            jButton5.setBackground(Color.green);
        }
        if(button5 == "Blue")
        {
            jButton5.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        jButton6.setBackground(Color.lightGray);
        jButton6.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        if(button6 == "Red")
        {
            jButton6.setBackground(Color.red);
        }
        else if(button6 == "Yellow")
        {
            jButton6.setBackground(Color.yellow);
        }
        else if(button6 == "Purple")
        {
            jButton6.setBackground(Color.magenta);
        }
        else if(button6 == "Green")
        {
            jButton6.setBackground(Color.green);
        }
        if(button6 == "Blue")
        {
            jButton6.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        jButton7.setBackground(Color.lightGray);
        jButton7.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        if(button7 == "Red")
        {
            jButton7.setBackground(Color.red);
        }
        else if(button7 == "Yellow")
        {
            jButton7.setBackground(Color.yellow);
        }
        else if(button7 == "Purple")
        {
            jButton7.setBackground(Color.magenta);
        }
        else if(button7 == "Green")
        {
            jButton7.setBackground(Color.green);
        }
        if(button7 == "Blue")
        {
            jButton7.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jButton8.setBackground(Color.lightGray);  
        jButton8.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        // TODO add your handling code here:
        if(button8 == "Red")
        {
            jButton8.setBackground(Color.red);
        }
        else if(button8 == "Yellow")
        {
            jButton8.setBackground(Color.yellow);
        }
        else if(button8 == "Purple")
        {
            jButton8.setBackground(Color.magenta);
        }
        else if(button8 == "Green")
        {
            jButton8.setBackground(Color.green);
        }
        if(button8 == "Blue")
        {
            jButton8.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
        jButton9.setBackground(Color.lightGray);
        jButton9.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
        if(button9 == "Red")
        {
            jButton9.setBackground(Color.red);
        }
        else if(button9 == "Yellow")
        {
            jButton9.setBackground(Color.yellow);
        }
        else if(button9 == "Purple")
        {
            jButton9.setBackground(Color.magenta);
        }
        else if(button9 == "Green")
        {
            jButton9.setBackground(Color.green);
        }
        if(button9 == "Blue")
        {
            jButton9.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        // TODO add your handling code here:
        jButton10.setBackground(Color.lightGray);
        jButton10.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        // TODO add your handling code here:
        if(button10 == "Red")
        {
            jButton10.setBackground(Color.red);
        }
        else if(button10 == "Yellow")
        {
            jButton10.setBackground(Color.yellow);
        }
        else if(button10 == "Purple")
        {
            jButton10.setBackground(Color.magenta);
        }
        else if(button10 == "Green")
        {
            jButton10.setBackground(Color.green);
        }
        if(button10 == "Blue")
        {
            jButton10.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        // TODO add your handling code here:
        jButton11.setBackground(Color.lightGray);
        jButton11.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        // TODO add your handling code here:
        if(button11 == "Red")
        {
            jButton11.setBackground(Color.red);
        }
        else if(button11 == "Yellow")
        {
            jButton11.setBackground(Color.yellow);
        }
        else if(button11 == "Purple")
        {
            jButton11.setBackground(Color.magenta);
        }
        else if(button11 == "Green")
        {
            jButton11.setBackground(Color.green);
        }
        if(button11 == "Blue")
        {
            jButton11.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        // TODO add your handling code here:
        jButton12.setBackground(Color.lightGray);
        jButton12.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        // TODO add your handling code here:
        if(button12 == "Red")
        {
            jButton12.setBackground(Color.red);
        }
        else if(button12 == "Yellow")
        {
            jButton12.setBackground(Color.yellow);
        }
        else if(button12 == "Purple")
        {
            jButton12.setBackground(Color.magenta);
        }
        else if(button12 == "Green")
        {
            jButton12.setBackground(Color.green);
        }
        if(button12 == "Blue")
        {
            jButton12.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        // TODO add your handling code here:
        jButton13.setBackground(Color.lightGray);
        jButton13.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        // TODO add your handling code here:
        if(button13 == "Red")
        {
            jButton13.setBackground(Color.red);
        }
        else if(button13 == "Yellow")
        {
            jButton13.setBackground(Color.yellow);
        }
        else if(button13 == "Purple")
        {
            jButton13.setBackground(Color.magenta);
        }
        else if(button13 == "Green")
        {
            jButton13.setBackground(Color.green);
        }
        if(button13 == "Blue")
        {
            jButton13.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        // TODO add your handling code here:
        jButton14.setBackground(Color.lightGray);
        jButton14.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton14MouseEntered

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        // TODO add your handling code here:
        if(button14 == "Red")
        {
            jButton14.setBackground(Color.red);
        }
        else if(button14 == "Yellow")
        {
            jButton14.setBackground(Color.yellow);
        }
        else if(button14 == "Purple")
        {
            jButton14.setBackground(Color.magenta);
        }
        else if(button14 == "Green")
        {
            jButton14.setBackground(Color.green);
        }
        if(button14 == "Blue")
        {
            jButton14.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseEntered
        // TODO add your handling code here:
        jButton15.setBackground(Color.lightGray);
        jButton15.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton15MouseEntered

    private void jButton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseExited
        // TODO add your handling code here:
        if(button15 == "Red")
        {
            jButton15.setBackground(Color.red);
        }
        else if(button15 == "Yellow")
        {
            jButton15.setBackground(Color.yellow);
        }
        else if(button15 == "Purple")
        {
            jButton15.setBackground(Color.magenta);
        }
        else if(button15 == "Green")
        {
            jButton15.setBackground(Color.green);
        }
        if(button15 == "Blue")
        {
            jButton15.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton15MouseExited

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        // TODO add your handling code here:
        jButton16.setBackground(Color.lightGray);
        jButton16.setToolTipText("Click this button if you think it's correct.");
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseExited
        // TODO add your handling code here:
        if(button16 == "Red")
        {
            jButton16.setBackground(Color.red);
        }
        else if(button16 == "Yellow")
        {
            jButton16.setBackground(Color.yellow);
        }
        else if(button16 == "Purple")
        {
            jButton16.setBackground(Color.magenta);
        }
        else if(button16 == "Green")
        {
            jButton16.setBackground(Color.green);
        }
        if(button16 == "Blue")
        {
            jButton16.setBackground(Color.blue);
        }      
    }//GEN-LAST:event_jButton16MouseExited

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
                        jLabel2.setText(daystr);
                        
                    }catch(Exception e){
                        
                    }
                }
                        }
           };
            clock.start();
    }
    
    //method to control jlabel text
    public void textLabel()
    {
        String[] color_list = {"Green", "Yellow", "Red","Blue", "Purple"};
        Random rand = new Random(); //random function is used to choose one of five words      
        int random1 = rand.nextInt(5);
        int random2 = rand.nextInt(5);
        if(random1 ==0)           
        {
            jLabel1.setText(color_list[0]);           
            if(random2 ==0)
            {               
                jLabel1.setForeground(Color.red);
                answer = "Red";
            }
            else  if(random2 ==1)
            {
                jLabel1.setForeground(Color.blue);
                answer = "Blue";
            }
            else if(random2 ==2)
            {
                jLabel1.setForeground(Color.yellow);
                answer = "Yellow";
            }
             else if(random2 ==3)
            {
                jLabel1.setForeground(Color.green);
                answer = "Green";
            }
             else if(random2 ==4)
            {
                jLabel1.setForeground(Color.magenta);
                answer = "Purple";
            }
        }
        else if(random1 ==1)           
        {
            jLabel1.setText(color_list[1]);           
            if(random2 ==0)
            {               
                jLabel1.setForeground(Color.red);
                answer = "Red";
            }
            else  if(random2 ==1)
            {
                jLabel1.setForeground(Color.blue);
                answer = "Blue";
            }
            else if(random2 ==2)
            {
                jLabel1.setForeground(Color.yellow);
                answer = "Yellow";
            }
             else if(random2 ==3)
            {
                jLabel1.setForeground(Color.green);
                answer = "Green";
            }
             else if(random2 ==4)
            {
                jLabel1.setForeground(Color.magenta);
                answer = "Purple";
            }
        }
         else if(random1 ==2)           
        {
            jLabel1.setText(color_list[2]);           
            if(random2 ==0)
            {               
                jLabel1.setForeground(Color.red);
                answer = "Red";
            }
            else  if(random2 ==1)
            {
                jLabel1.setForeground(Color.blue);
                answer = "Blue";
            }
            else if(random2 ==2)
            {
                jLabel1.setForeground(Color.yellow);
                answer = "Yellow";
            }
             else if(random2 ==3)
            {
                jLabel1.setForeground(Color.green);
                answer = "Green";
            }
             else if(random2 ==4)
            {
                jLabel1.setForeground(Color.magenta);
                answer = "Purple";
            }
        }
         else if(random1 ==3)           
        {
            jLabel1.setText(color_list[3]);           
            if(random2 ==0)
            {               
                jLabel1.setForeground(Color.red);
                answer = "Red";
            }
            else  if(random2 ==1)
            {
                jLabel1.setForeground(Color.blue);
                answer = "Blue";
            }
            else if(random2 ==2)
            {
                jLabel1.setForeground(Color.yellow);
                answer = "Yellow";
            }
             else if(random2 ==3)
            {
                jLabel1.setForeground(Color.green);
                answer = "Green";
            }
             else if(random2 ==4)
            {
                jLabel1.setForeground(Color.magenta);
                answer = "Purple";
            }
        }
         else if(random1 ==4)           
        {
           jLabel1.setText(color_list[4]);           
            if(random2 ==0)
            {               
                jLabel1.setForeground(Color.red);
                answer = "Red";
            }
            else  if(random2 ==1)
            {
                jLabel1.setForeground(Color.blue);
                answer = "Blue";
            }
            else if(random2 ==2)
            {
                jLabel1.setForeground(Color.yellow);
                answer = "Yellow";
            }
             else if(random2 ==3)
            {
                jLabel1.setForeground(Color.green);
                answer = "Green";
            }
             else if(random2 ==4)
            {
                jLabel1.setForeground(Color.magenta);
                answer = "Purple";
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(ColorGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColorGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColorGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColorGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColorGuess().setVisible(true);
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
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
