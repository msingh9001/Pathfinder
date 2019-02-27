/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project;

import cis43project.swingUI.LoginScreen;
import javax.swing.JFrame;

/**
 * @author bkanungo
 * 
 */
public class CIS43Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // User has to login first
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginScreen.setVisible(true);
    }
    
}
