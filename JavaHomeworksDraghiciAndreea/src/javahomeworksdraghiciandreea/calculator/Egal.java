/*
 * Egal class will return the result of the operations
 */
package javahomeworksdraghiciandreea.calculator;

import java.util.Scanner;

/**
 *
 * @author Andreea
 */
public class Egal {

    

    // the displayed method will be called rezultatEgal;
    
    public void rezultatEgal(double deAfisat){
        System.out.println("To get the result press '='!");
        Scanner scan2 = new Scanner(System.in);
        String s = scan2.nextLine();
        // if the user press = than the result will be listed;
        if (s.equals("=")){
            System.out.println("Your result is: " + deAfisat);
        }
        else{ //othervise the calculator stops with error;
            System.out.println("In order to run the application you should press =. Please try it again!");
            Ac.stergeRezultatul(s);
        }
        Calculator.closeCalculator(s);

        
        }


}


