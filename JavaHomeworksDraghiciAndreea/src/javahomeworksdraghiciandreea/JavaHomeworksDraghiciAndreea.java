/*
 * Homework n. 2
 */
package javahomeworksdraghiciandreea;

import java.util.Scanner;
/**
 * import the Scanner class
 * @author gheorgheaurelpacurar
 */
public class JavaHomeworksDraghiciAndreea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Homework 2.1 "short Java program that reads your name from keyboard and writes it in console"
      
      System.out.println(" ***** What's my name? *****");
      
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: " );  
        System.out.println("Enter your second name: " ); 
        String FirstName = (scan.nextLine());
        String SecondName = (scan.nextLine());
        System.out.println("Your full name is: " + FirstName + " " + SecondName);
    }
    
}
