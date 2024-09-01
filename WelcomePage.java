/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginsystem;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Connect
 */
public class WelcomePage {
    
    JFrame frame = new JFrame();  
    JLabel welcomeLabel = new JLabel("Hello");
    
    WelcomePage(String userID){
    
        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Hello " + userID);
        
    frame.add(welcomeLabel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setLayout(null);
    frame.setVisible(true);
    
    }

    
}
