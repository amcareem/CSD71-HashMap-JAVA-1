package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> userCredentials = new HashMap<>();

        userCredentials.put("john123","101520");
        userCredentials.put("peter123","123456");
        userCredentials.put("Hizmy","1212");
        userCredentials.put("Zaid","1111");
        userCredentials.put("Dilum","1313");
        userCredentials.put("Saajith","1414");

        Scanner scan = new Scanner(System.in);

        System.out.print("User name: ");
        String enteredUserName = scan.nextLine();

        System.out.print("Password: ");
        String enteredPassword = scan.nextLine();

        if(userCredentials.containsKey(enteredUserName)){
            String keyValue = userCredentials.get(enteredUserName);
            if(keyValue.equals(enteredPassword)){
                MainMenu ClsMenu = new MainMenu();
                ClsMenu.menu();
            }else {
                System.out.println("Not valid");
            }
        }else {
            System.out.println("Not available");
        }

    }
}
