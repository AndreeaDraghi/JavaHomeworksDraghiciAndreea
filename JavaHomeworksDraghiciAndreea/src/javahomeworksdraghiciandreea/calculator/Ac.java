/*
 * AC class will
 */
package javahomeworksdraghiciandreea.calculator;

/**
 *
 * @author Andreea
 */
public class Ac {
    
    /**
     * if AC pressed by user it will display 0;
     * @param s
     */
    public static void stergeRezultatul(String s ){
        if (s.equalsIgnoreCase("AC")){
            System.out.println("0");
        
            Calculator.calculate();
        }
        
    }
}
