/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.model;

import java.util.*;

/**
 * @author msingh9001
 * @author bkanungo
 */
public class Course {
    private String courseID;
    private String courseName;
    private int units;
    private int[] preReq;
    
    public void Course(String id, String name) {
        courseID = id;
        courseName = name;
    }
    
    public String getCourseID() {
        return courseID;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public int getUnits() {
        return units;
    }
    
    public void setCourseID(String id) {
        courseID = id;
    }
    
    public void setCourseName(String name) {
        courseName = name;
    }
    
    public void setUnits(int units){
        this.units = units;
    }
    
    public String[] getPrerequisits() {
        return null;        // to be implemented
    }
    
    public void setPrerequisites(String[] preReq) {
        
    }
    
    @Override
    public String toString() {
        return String.format("Course: %s %s %d units", getCourseID(),
                getCourseName(), getUnits());
    }
}
