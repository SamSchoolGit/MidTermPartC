/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.*;
/**
 *
 * @author sverdejo
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your User ID");
        String userID = in.next();
        
        System.out.println("Select a genre: "
                + "0: Comedy, "
                + "1: Drama, "
                + "2: Action, "
                + "3: Mystery ");
        
        int selection = in.nextInt();
        
        UserProfile user = new UserProfile(userID, UserProfile.getGenres()[selection]);
        
        System.out.println("User profile: " + user.getUserID() + " created, favorite genre: " + user.getGenre());
    }
}
