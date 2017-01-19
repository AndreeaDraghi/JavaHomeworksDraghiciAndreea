/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomeworksdraghiciandreea.CarsFactory;

import java.util.Scanner;

/**
 *
 * @author Andreea
 */
public class Main {
    static String getCommand() {
                
        Scanner input;
        String command;
        
        while(true) {  
            System.out.println("Do you want to deliver a new car? YES/NO");
                                            
            input = new Scanner(System.in);
            command = input.nextLine(); 
            
            if(command.matches("YES|NO") == true) {
                
                break;
            } 
            else {
                
                System.out.println("Please respond with YES or NO!");
                System.out.println();
            }            
        }    
          
       return command;
    } 

    static String getBrandFromUser() {
        
        String name;
        Scanner input;
        
                    
            System.out.print("Car name: ");
            
            input = new Scanner(System.in);
            name = input.nextLine();

        
        return name;
    }

    static String getColorFromUser() {
        

        String color;
        Scanner input;
        
           
            System.out.print("Car color: ");
            
            input = new Scanner(System.in);
            color = input.nextLine();
        
        return color;
    }
    
    public static void main(String[] args) {
        
        CarsFactory myCarFactory = new CarsFactory();
        
        System.out.println("Welcome to my Car factory!");
                
        String command;
        
        do {
            System.out.println();
            
            command = getCommand();
            
            switch(command) {
                
                case "YES":
                    String name;
                    String color;
                    
                    name = getBrandFromUser();
                    color = getColorFromUser();
                    
                    myCarFactory.buildCar(name, color);
                    
                    System.out.println("A new " + color+ " " + name +" was delivered!");
                    myCarFactory.listDeliveredCars();
               break;
                
    
                case "NO":    
                    System.out.println("OK! Good bye!");
                    break;

                default:
                    System.out.println("Please try again introducing the recommended choices!");
                    break;
            }

        } while("YES".equals(command));
    }
}
