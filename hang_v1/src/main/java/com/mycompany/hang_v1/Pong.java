/*************************************************************** 
* file: Pong.java 
* author: Jihun Choi
* date last modified: 10/02/2022 
* 
* 
* purpose: This class is jFrmae class that is used for Pong game
* Once this class is constucted, 2 users can play pong game
* 
****************************************************************/
package com.mycompany.hang_v1;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Pong extends javax.swing.JFrame{
    
    private int day, month,year; //used for clock
    private int hour, minute, second; //used for clock
    private String daystr,timestr; //usedf for jlabel and clock
    public int paddle1 = 165;
    public boolean paddle1Up = false;
    public boolean paddle1Down = false;
    public boolean paddle2Up = false;
    public boolean paddle2Down = false;
    public int paddle2 = 165;
    public int ballX = 200;
    public int ballY = 200;
    public int ballXVel = 0;
    public int ballYVel = 0;
    public int score1 = 0;
    public int score2 = 0;
    public boolean playing = false;
    
    public Pong() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        currentTime(); //calling clokc function
        this.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()) {
                //p1 inputs
                case KeyEvent.VK_W:
                    paddle1Up = true;
                    break;
                case KeyEvent.VK_S:
                    paddle1Down = true;
                    break;
                //p2 inputs
                case KeyEvent.VK_UP:
                    paddle2Up = true;
                    break;
                case KeyEvent.VK_DOWN:
                    paddle2Down = true;
                    break;
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                switch(e.getKeyCode()) {
                //p1 inputs
                    case KeyEvent.VK_W:
                        paddle1Up = false;
                        break;
                    case KeyEvent.VK_S:
                        paddle1Down = false;
                        break;
                    //p2 inputs
                    case KeyEvent.VK_UP:
                        paddle2Up = false;
                        break;
                    case KeyEvent.VK_DOWN:
                        paddle2Down = false;
                        break;
                }
            }
        });
        
        jLabel5.setText(score1 + "");
        jLabel3.setText(score2 + "");
        
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
        
        // Start the game 
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "Start");
        getRootPane().getActionMap().put("Start", new AbstractAction()
          { 
              public void actionPerformed(ActionEvent e)
              {
                    if(!playing)
                        play();
              }
       });  
        
        
        
               
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
                        jLabel8.setText(timestr);
                        jLabel7.setText(daystr);
                        
                    }catch(Exception e){
                        
                    }
                }
                        }
           };
            clock.start();
    }
    
    public void end1(){
        this.setVisible(false);
        new Win1().setVisible(true);
    }
    
    public void end2(){
        this.setVisible(false);
        new Win2().setVisible(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Board = new javax.swing.JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);

                //paint the ball
                g.fillOval(ballX, ballY, 10, 10);

                //paint the paddles
                g.fillRect(10, paddle1, 10, 70);
                g.fillRect(380, paddle2, 10, 70);
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton1.setText("Quit");
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

        javax.swing.GroupLayout BoardLayout = new javax.swing.GroupLayout(Board);
        Board.setLayout(BoardLayout);
        BoardLayout.setHorizontalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        BoardLayout.setVerticalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("P1 Score:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("P2 Score:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("nm2");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("nm1");

        jLabel6.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Press space to start");

        jLabel7.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PONG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setToolTipText("Click this button to go back to Home.");
    }//GEN-LAST:event_jButton1MouseEntered

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
            java.util.logging.Logger.getLogger(Pong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pong().setVisible(true);
            }
        });
    }


    public void play(){
        playing = true;
        //set ball direction to random
        Random random = new Random();
        if (random.nextBoolean()) {
            ballXVel = 5;
        } else {
            ballXVel = -5;
        }
        ballYVel = (int) ((Math.random() - 0.5) * 7);
        Thread clock = new Thread(){
            public void run() {
                //the main game loop
                while(true){
                    try{
                        Thread.sleep(30);
                    }catch(Exception e){}
 
                    //move the ball
                    ballX+= ballXVel;
                    ballY+= ballYVel;
                    
                    //left paddle movement
                    if (paddle1Up && paddle1 >= 0){
                        paddle1-=5;
                    }
                    else if (paddle1Down && paddle1 <= 330){
                        paddle1+=5;
                    }
                    
                    //right paddle movement
                    if (paddle2Up && paddle2 >= 0){
                        paddle2-=5;
                    }
                    else if (paddle2Down && paddle2 <= 330){
                        paddle2+=5;
                    }
                    
                    //check if ball is has hit paddle
                    if(ballX >= 376 && ballY >= paddle2 && ballY <= paddle2 + 70) {
                        
                        ballXVel = -5;
                        
                        if(ballYVel >= 0)
                            ballYVel = ballYVel/2 + ((ballY - paddle2 - 35) / 10);
                        else
                            ballYVel = ballYVel/2 - ((ballY - paddle2 - 35) / 10);
                        
                    }
                    else if(ballX <= 18 && ballY >= paddle1 && ballY <= paddle1 + 70) {
                        
                        ballXVel = 5;
                        
                        if(ballYVel >= 0)
                            ballYVel = ballYVel/2 + ((ballY - paddle1 - 35) / 10);
                        else
                            ballYVel = ballYVel/2 - ((ballY - paddle1 - 35) / 10);
                        
                    }

                    //check if ball is out of top/bottom bounds
                    if(ballY >= 395 || ballY <= 5) {
                        
                        ballYVel = -ballYVel;
                    }
                    
                    //check if ball is out of left/right bounds
                    if(ballX >= 395) {
                        ballX = 200;
                        ballY = 200;                       
                        score2+=10;
                        if(score2 ==100){
                          end1();                        
                        }
                        jLabel3.setText(score2 + "");
                        repaint();
                        playing = false;
                        return;
                    }
                    else if(ballX <= 5) {
                        ballX = 200;
                        ballY = 200;
                        score1+=10;
                        if(score1 ==100){
                          end2();                          
                        }
                        jLabel5.setText(score1 + "");
                        repaint();
                        playing = false;
                        return;
                    }
                    
                    repaint();
                }
            }
        };
        clock.start();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Board;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}