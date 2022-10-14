/*************************************************************** 
* file: Hang_v1.java 
* author: Jihun Choi
* date last modified: 10/02/2022 
* 
* 
* purpose: This class is main class that actually gets compiled when program runs
* It will construct title screen and close it after 3 seconds
* and it will constuct Home screen, from there logic in each jFrmae class will take over
* 
****************************************************************/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hang_v1;



/**
 *
 * @author PC
 */
public class Hang_v1  {
    
     
   
    
    public static void main(String[] args) {
        Title ti = new Title();
        ti.setVisible(true);
         try{
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(30);
            }
        }catch(Exception e){

        }
        ti.setVisible(false);
        Home hm = new Home();
        hm.setVisible(true);
        
        
                              
    }
}
