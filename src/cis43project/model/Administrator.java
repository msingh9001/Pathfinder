/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.model;
import java.util.*;
/**
 * @author bZhou
 * @author bkanungo
 */
public class Administrator extends User {
    private List<String>  students; // list of student user
    private List<String> courses;  // list of courses
    
    public List<String> getStudentList() {
        return null; // to do correct return list
        
    }
    
    public List<String> getCourseList() {
        return null; // to be implemented
    }
    public void addStudent(Student student) {
        
    }
    
    public List<String> getStudentCourseList() {
        return null;
    }
    
    public void deleteStudent(Student student) {
        
    }
    
    public void addCourse(Course course) {
        
    }
    
    public void deleteCourse(Course course) {
        
    }
    
    public void saveCourseList() {
        
    }
    
    @Override
    public String toString() {
        return String.format("Administrator %s %s", getFirstName(),
                getLastName());
    }
}
