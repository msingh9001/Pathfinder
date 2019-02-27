/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.swingUI;

import cis43project.model.Administrator;
import javax.swing.JFrame;

/**
 * @author bkanungo
 * 
 */
public class TestAdmin {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // User has to login first
        try {
            Administrator admin = new Administrator();
            admin.setLastName("Jobs");
            admin.setFirstName("Big");
            admin.setRole("admin");
        
            AdminScreen adminUI = new AdminScreen(admin);
            adminUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            adminUI.setVisible(true);
        }
        catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
