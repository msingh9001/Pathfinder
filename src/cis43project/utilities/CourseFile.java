/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.utilities;

/**
 * @author bkanungo
 * 
 */

import cis43project.model.Course;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class CourseFile {
    
    List<Course> courses;
    private String fileName;
    
    public CourseFile(String filename) {
        this.fileName = filename;
        // constructor to read from file only
    }
    
    // use to save a list of courses - admin use
    public CourseFile(String filename, List<Course> courses) {
        this.fileName = filename;
        this.courses = courses;
        // write out to file
    }
    
    // combine course and term and save - student use
    public CourseFile(String filename, List<Course> course, List<String> term) {
        // both list must be of same size, throw execption if it is not
        
        this.fileName = filename;
        // write out to file
        
    }
    
    public String getCourseFileName() {
        return fileName;
    }
    
    public void setCourseFileName(String filename) {
        this.fileName = filename;
    }
    
    public void save() throws IOException {
        ObjectOutputStream oos = null;
        FileOutputStream fout;
        
        try {
            fout = new FileOutputStream("courses.ser", true);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(courses);
        }
        catch (IOException ex) {
        }
        finally {
            if (oos != null) {
                oos.close();
            }
        }
    }
    
    public List<Course> readCourseList() throws IOException, ClassNotFoundException {
        ObjectInputStream oin = null;
        Course readItem;
        List<Course> courseList = null;
        
        try {
            FileInputStream streamIn = new FileInputStream("courses.ser");
            oin = new ObjectInputStream(streamIn);
            
            readItem = (Course)oin.readObject();
            while (readItem != null) {
                courseList.add(readItem);
                readItem = (Course)oin.readObject();
            }
            streamIn.close();
        }
        finally {
            if (oin != null)
                oin.close();
        }
        return courseList;
    }
}
