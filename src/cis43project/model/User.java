/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.model;

/**
 * @author bkanungo
 *
 */
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class User {
    private static Scanner input;
    private String userID;
    private String lastName;
    private String firstName;
    private String role;
    
    // open user file 
    public static void openUserFile() {
        try {
            input = new Scanner(Paths.get("user.txt"));
        }
        catch (IOException ioException) {
            System.err.println("Error opening file. Terminiting.");
            System.exit(1);
        }
    }
    
     public static void closeUserFile() {
        if (input != null)
            input.close();
    }
     
    public boolean findUser(String user, String pwd) {
        
        try {
            while (input.hasNext()) {
                if (user.equals(input.next()) && pwd.equals(input.next())) {
                    setUser(user);
                    setFirstName(input.next());
                    setLastName(input.next());
                    setRole(input.next());
                    break;
                }
            }
            if (null == this.userID) {
               closeUserFile();
               return false;
            }
        }
        catch (NoSuchElementException elementException) {
            System.err.println("File improperly formatted");
            closeUserFile();
            return false;
        }
        catch (IllegalStateException stateException)  {
            System.err.println("Error reading from file.");
            closeUserFile();
            return false;
        }
        closeUserFile();
        return true;
    }
    
    public String getUserId() {
        return userID;
    }
    
    public void setUser(String user) {
        userID = user;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lname) {
        lastName = lname;
    }
    
    public void setFirstName(String fname) {
        firstName = fname;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return String.format("User: %s %s", getFirstName(), getLastName());
    }
    
}
