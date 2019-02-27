/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis43project.model;

/**
 * @author bkanungo
 * Test Program for User
 */
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUser {
    public static void main(String args[]) {
         
        Path path = Paths.get("");
        System.out.println("Current Path: " + path.toAbsolutePath().toString());
        
        User.openUserFile();
        User user = new User();
        
        if(user.findUser("test_user1", "cis43u1")) {
            System.out.printf("User %s\n last name: %s, first name: %s Role: %s%n",
                    user.getUserId(), user.getLastName(), user.getFirstName(),
                    user.getRole());
        }
        else
            System.out.println("user not found");

    }
}
