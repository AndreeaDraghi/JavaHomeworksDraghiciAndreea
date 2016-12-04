/*
 * This program implements a computer.
 */
package javahomeworksdraghiciandreea.calculator;

/**
 * @author Andreea
 */
import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Computer displays 0 value by default;
        System.out.println("0");
        //run the method calculate
        calculate();
    }

    // implemets the calculate method
    public static void calculate() {
        //declare a string variable named "operator";
        String operator;
        //Create a Scanner object named "scan";
        Scanner scan = new Scanner(System.in);
        //Create a Plus 'actor'
        Plus add = new Plus();
        //Create an Egal 'actor'
        Egal equals = new Egal();
        //Create a Minus 'actor'
        Minus substract = new Minus();
        //Create an Inmultire 'actor'
        Inmultire multiply = new Inmultire();
        //Create an Impartire 'actor'
        Impartire divide = new Impartire();

        // Read first parameter
        double oper1;
        oper1 = readParam1(scan);
        // Read operator
        operator = readOper(scan);
        // Read second parameter
        double oper2;
        oper2 = readParam2(scan);

        // Compute the result, depending on the selected operator 
        switch (operator) {
            case "+": {
                equals.rezultatEgal(Plus.aduna(oper1, oper2));
                break;
            }
            case "-": {
                equals.rezultatEgal(Minus.scade(oper1, oper2));
                break;
            }
            case "*": {
                equals.rezultatEgal(Inmultire.inmulteste(oper1, oper2));
                break;
            }
            case "/": {
                equals.rezultatEgal(Impartire.imparte(oper1, oper2));
                break;
            }

            default: {
                System.out.println("The operator you choose is not valid. Take it from the beginning.");
                Ac.stergeRezultatul(operator);
                closeCalculator(operator);
                break;
            }
        }
    }

    /**
     * if any letter key [a-z] is introduced will exit the application
     *
     * @param s
     */

    public static void closeCalculator(String s) {
        if (s.matches(".*[a-z].*")) {
            System.out.println("Invalid action!You can use only numbers. Take it from the beginning.");
            System.exit(0);
        }
    }

    /**
     * read parameters from keyboard
     *
     * @param scan
     * @return
     */

    public static double readParam1(Scanner scan) {
        System.out.println("Enter first parameter: ");
        String s = scan.next();
        Ac.stergeRezultatul(s);
        closeCalculator(s);
        return Double.parseDouble(s);
    }

    public static double readParam2(Scanner scan) {
        System.out.println("Enter second parameter: ");
        String s = scan.next();
        Ac.stergeRezultatul(s);
        closeCalculator(s);
        return Double.parseDouble(s);
    }

    /**
     * read operator from keyboard
     *
     * @param scan
     * @return
     */
    public static String readOper(Scanner scan) {
        System.out.println("Select your operator from the following: +, -, *, /");
        String s = scan.next();
        Ac.stergeRezultatul(s);
        closeCalculator(s);
        return s;
    }
}
