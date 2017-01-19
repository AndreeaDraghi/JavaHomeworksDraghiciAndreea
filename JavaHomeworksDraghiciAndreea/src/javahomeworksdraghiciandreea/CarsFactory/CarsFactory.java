/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomeworksdraghiciandreea.CarsFactory;

import java.util.ArrayList;

/**
 *
 * @author Andreea
 */
public class CarsFactory {
    private int maxNameLength;
    private int maxColorLength;

    private final ArrayList<Car> carsDelivered;
    String getBrandFromUser;
    
    public CarsFactory() {
        
        carsDelivered = new ArrayList<>();
        maxNameLength = "Car name".length();
        maxColorLength = "Car color".length();
    }
      void listDeliveredCars() {
          System.out.println("We delivered " + carsDelivered.size() + " cars as follows:");
          System.out.println();
            String nameColumn;
            String colorColumn;
            String line;
            
            nameColumn = TextFormatter.addPadding("Car name", maxNameLength);
            colorColumn = TextFormatter.addPadding("Car color", maxColorLength);
            line = "No.  " + "Car name" + "  " + "Car color";
            
            System.out.println(line);

            
            line = String.format("%1$" + (maxNameLength + maxColorLength + 7) + "s", "");
            line = line.replace(' ', '=');
            
            System.out.println(line);
            
            int counter = 0;            
            
            for(Car curentCar : carsDelivered) {
                
                counter++;                                
                
                nameColumn = TextFormatter.addPadding(curentCar.getName(), maxNameLength);
                colorColumn = TextFormatter.addPadding(curentCar.getColor(), maxColorLength);
                line = counter + ".  " + nameColumn + "  " + colorColumn;
                
                if(counter < 10) {
                    line = " " + line;
                }
                
                System.out.println(line);
            }
      }
    
    void buildCar(String name, String color) {
        
        Car newCar = new Car(name, color);
        
        carsDelivered.add(newCar);

        
        if(name.length() > maxNameLength) {
            
            maxNameLength = name.length();
        }
    
        if(color.length() > maxColorLength) {
            
            maxColorLength = color.length();
        }
    }
    }

