/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.swingUI;

import cis43project.model.Student;
import javax.swing.JFrame;

/**
 * @author msingh9001
 * @author bkanungo
 */

public class TestStudent {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // User has to login first
        try {
            Student student = new Student();
            student.setLastName("Blow");
            student.setFirstName("Joe");
            student.setRole("student");
            student.setDegreeProgram("");
            student.setMajor("Computer Science");
        
            StudentScreen studentUI = new StudentScreen(student);
            studentUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            studentUI.setVisible(true);
        }
        catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
