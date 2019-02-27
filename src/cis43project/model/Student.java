/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.model;
import java.util.*;
/**
 * @author bkanungo
 * 
 */
public class Student extends User {
    private String major;
    private String degree_program;
    private List<String[]> lst_c_t; // list for course and term
                                   // e.g. ("CIS56", "Fall2018")
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getDegreeProgram() {
        return degree_program;
    }
    
    public void setDegreeProgram(String dpgm) {
        degree_program = dpgm;
    }
    
    public void addCourse(String course, String term) {
        
    }
    
    public void dropCourse(String course, String term) {
        
    }
    
    public void saveStudentFile() {
        
    }
    
    @Override
    public String toString() {
        return String.format("Student: %s %s %s", getFirstName(), getLastName(),
                getMajor());
    }
    
}
