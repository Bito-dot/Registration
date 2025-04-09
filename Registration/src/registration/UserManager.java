/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import java.io.*;

public class UserManager {
    
    public static void saveCredentials(String username, String email, String password) {
        try (FileWriter writer = new FileWriter("users.txt", true)) {
            writer.write(username + "," + email + "," + password + "\n");
        } catch (IOException e) {
        }
    }
    
    public static boolean validateLogin(String email, String password) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String storedEmail = parts[1].trim();
                    String storedPassword = parts[2].trim();
                    if (email.equals(storedEmail) && password.equals(storedPassword)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean emailExists(String email) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                   String storedEmail = parts[1].trim();
                   if (email.equals(storedEmail)) {
                       return true;
                   }
            }
        }
        return false;
    }
}
}