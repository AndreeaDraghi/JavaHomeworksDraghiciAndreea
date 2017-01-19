/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomeworksdraghiciandreea.stringsAndNumbers;

import java.util.Scanner;

/**
 *
 * @author Andreea
 */
public class stringsAndNumbers {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        String hannah = "Did Hannah see bees? Hannah did.";
        String hi = "Hi, ";
        String mom = "mom.";
        String yourName;
        
        System.out.println("1. What is the initial capacity of the following string builder?\n"
                + "StringBuilder sb = new StringBuilder(\"Able was I ere I saw Elba.\");");
        System.out.println("Initial capacity is sb.length()= " + sb.length() + " + 16 = 42 " + "\n");
        
        System.out.println("2. Consider the following string:\n"
                + "String hannah = \"Did Hannah see bees? Hannah did.\";\n");
        
        System.out.println("a) What is the value displayed by the expression hannah.length()?\n"
                + "hannah.length()= " + hannah.length() + "\n");
        
        System.out.println("b) What is the value returned by the method call hannah.charAt(12)?\n"
                + "hannah.charAt(12) = " + hannah.charAt(12) + "\n");
        
        System.out.println("c) Write an expression that refers to the letter b in the string referred to by hannah.");
        
        System.out.println(" How long is the string returned by the following expression? What is the string?");
        System.out.println("\"Was it a car or a cat I saw?\".substring(9, 12) = " 
                           +"Was it a car or a cat I saw?".substring(9, 12));
        System.out.println("\"Was it a car or a cat I saw?\".substring(9, 12).length() = " 
                           +"Was it a car or a cat I saw?".substring(9, 12).length());
        System.out.println("hannah containes \'b\' at index "+hannah.indexOf('b'));
        
        System.out.println("\n4. Show two ways to concatenate the following two strings together to get the string \"Hi, mom.\":\n"
                + "String hi = \"Hi, \";\n"
                + "String mom = \"mom.\";\n");
        System.out.println("hi + mom = " + hi + mom);
        System.out.println("hi.concat(\"mom.\")=" + hi.concat(mom) + "\n");
        System.out.println("5. Write a program that computes your initials from your full name and displays them.");
        System.out.println("Write your name:");
        yourName = input.nextLine();
        String[] yourNameSplited = yourName.split(" ");
        System.out.print("Your initial are: ");
        for (String k : yourNameSplited) {
            System.out.print(k.substring(0, 1));
        }
    System.out.println(" ");
    }
}
