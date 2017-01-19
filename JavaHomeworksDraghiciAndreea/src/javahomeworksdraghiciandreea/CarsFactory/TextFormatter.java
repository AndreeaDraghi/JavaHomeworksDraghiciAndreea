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
public class TextFormatter {
    public static String addPadding(String text, int maxLength) {
        String formattedText;
        int padLentgh = maxLength - text.length();
        
        if(padLentgh == 0) {
            
            formattedText = text;
        } else {
            
            formattedText = String.format("%1$" + padLentgh + "s", "");
            
            StringBuilder builder = new StringBuilder(formattedText);
            
            builder.insert(builder.length()/2, text);
            
            formattedText = builder.toString();
        }
        
        return formattedText;
    }

}
