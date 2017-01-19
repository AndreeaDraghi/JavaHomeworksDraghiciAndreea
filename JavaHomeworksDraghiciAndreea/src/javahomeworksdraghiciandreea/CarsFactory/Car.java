    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomeworksdraghiciandreea.CarsFactory;

/**
 *
 * @author Andreea
 */
public class Car {
    
    // CREATE ATTRIBUTES
    private final String name;
    private final String color;
    
    
    // first consturctor  
    public  Car(String name, String color){
        this.name = name;
        this.color = color;
      
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }



    public String getColor() {
        return color;
    }

 
}
