/*
 * Homework 2
 * Exercise 3: Do the exercise from point 2 using wrapper classes defined in Java (from Integer to ...Boolean).
 */
package javahomeworksdraghiciandreea;

import java.util.Objects;

/**
 *
 * @author Andreea
 */
public class WrappersAndOperators {
     public static void main(String[] args){
         
        // I start this program creating the Integer Wrapper Class  wa and wb;
        System.out.println("\n********** Operations with Integer Wrapper Class**********");
  
    Integer wa = 400;
    Integer wb = 50;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for Integer Wrapper Class where wa = 400 and wb = 50 ");
        System.out.println("\nThe result of the '+ operator' for (wa+wb) is: " + (wa+wb));
        System.out.println("The result of the '- operator' for (wa-wb) is: " + (wa-wb) );
        System.out.println("The result of the '* operator' for (wa*wb) is: " + (wa*wb));
        System.out.println("The result of the '/ operator' for (wa/wb) is: " +  (wa/wb));
        System.out.println("The result of the '% operator' for (wa%wb) is: " + (wa%wb));
        System.out.println("The result of the 'Postfix ++ operator' for (wa++) is: " +  (wa++));
        wa--;
        System.out.println("The result of the 'Prefix ++ operator' for (++wb) is: " + (++wb));
        --wb;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for Integer Wrapper Class  when wa = 400 and wb = 50 ");
        
        System.out.println("\na < wb : "+(wa < wb)); 
        System.out.println("wa > wb : "+(wa > wb)); 
        System.out.println("wa >= wb : "+(wa >= wb)); 
        System.out.println("wa <= wb : "+(wa <= wb)); 
        System.out.println("wa == wb : "+(Objects.equals(wa, wb)));
        System.out.println("wa != wb : "+(!Objects.equals(wa, wb)));
        
        // Here are operations with the bitwise operators
        System.out.println("\nBitwise Operators for Integer Wrapper Class  when wa = 400 and wb = 50 ");
        System.out.println("\na & wb : " + (wa & wb)); 
        System.out.println("wa | wb : " + (wa | wb)); 
        System.out.println("wa ^ wb : " + (wa ^ wb)); 
        System.out.println("~wa : " + (~wa)); 
        System.out.println("wa << wb : " + (wa << wb)); 
        System.out.println("wa >> wb : " + (wa >> wb));
        System.out.println("wa >>> wb : " + (wa >>> wb));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for Integer Wrapper Class  when wa = 400 and wb = 50 ");
        if ( (wa == 400) && (wb == 50) ) {
                 System.out.println("\nIt is TRUE that wa = 400 and wb = 50");
             }
        if ( (wa == 10) || (wb == 50) ) {
                 System.out.println("It is TRUE that wa = 10 or wb = 50");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for Integer Wrapper Class  when wa = 400 and wb = 50 ");
        
	System.out.println("\nThe result of the '= operator' for (wa=wb) is " +( wa = wb));
        System.out.println("The result of the '+= operator' for (wa+=wb) is " +( wa += wb));
        System.out.println("The result of the '-= operator' for (wa-=wb) is " +( wa -= wb));
        System.out.println("The result of the '*= operator' for (wa*=wb) is " +( wa *= wb));  
        System.out.println("The result of the '/= operator' for (wa/=wb) is " +( wa /= wb)); 
        System.out.println("The result of the '%= operator' for (wa%=wb) is " +( wa %= wb)); 
        System.out.println("The result of the '>>= operator' for (wa>>=wb) is " +( wa >>= wb)); 
        System.out.println("The result of the '<<= operator' for (wa<<=wb) is " +( wa <<= wb)); 
        System.out.println("The result of the '|= operator' for (wa|=wb) is " +( wa |= wb)); 
        System.out.println("The result of the '&= operator' for (wa&=wb) is " +( wa &= wb)); 
        System.out.println("The result of the '^= operator' for (wa^=wb) is " +( wa ^= wb));  
        
        // Here are operations with the misc operators;
        System.out.println("\nMisc Operators for Integer Wrapper Class  when wa = 400 and wb = 50 ");
        wa = 400;
        System.out.println("\nConditional result for '(wa==wb)?wa:wb is' " + ((Objects.equals(wa, wb)) ? wa : wb) );
        if (wa instanceof Integer){
             System.out.println("The following Integer object is an instance of Integer class:" + wa);
         }
         if (wb instanceof Integer){
            System.out.println("The following Integer object is an instance of Integer class:" + wb);
         }
                // Here i've created the Long Wrapper Class  wc and wd;
         System.out.println("\n********** Operations with Long Wrapper Class  **********");
         
         

 
    Long wc = 100000L;
    Long wd = 50000L;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for Long Wrapper Class  when wc = 100000 and wd = 50000 ");
        System.out.println("\nThe result of the '+ operator' for (wc+wd) is: " + (wc+wd));
        System.out.println("The result of the '- operator' for (wc-wd) is: " + (wc - wd));
        System.out.println("The result of the '* operator' for (wc*wd) is: " + (wc*wd));
        System.out.println("The result of the '/ operator' for (wc/wd) is: " + (wc/wd));
        System.out.println("The result of the '% operator' for (wc%wd) is: " + (wc%wd));
        System.out.println("The result of the 'Postfix ++ operator' for (wc++) is: " + (wc++));
        wc--;
        System.out.println("The result of the 'Prefix ++ operator' for (++wd) is: " + (++wd));
        --wd;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for Long Wrapper Class  when wc = 100000 and wd = 50000 ");
        
        System.out.println("\na < wd : "+(wc < wd)); 
        System.out.println("wc > wd : "+(wc > wd)); 
        System.out.println("wc >= wd : "+(wc >= wd)); 
        System.out.println("wc <= wd : "+(wc <= wd)); 
        System.out.println("wc == wd : "+(Objects.equals(wc, wd)));
        System.out.println("wc != wd : "+(!Objects.equals(wc, wd)));
        
        // Here are operations with the bitwise operators
        System.out.println("\nBitwise Operators for Long Wrapper Class  when wc = 100000 and wd = 50000 ");
        System.out.println("\na & wd : " + (wc & wd)); 
        System.out.println("wc | wd : " + (wc | wd)); 
        System.out.println("wc ^ wd : " + (wc ^ wd)); 
        System.out.println("~wc : " + (~wc)); 
        System.out.println("wc << wd : " + (wc << wd)); 
        System.out.println("wc >> wd : " + (wc >> wd));
        System.out.println("wc >>> wd : " + (wc >>> wd));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for Long Wrapper Class  when wc = 100000 and wd = 50000 ");
        if ( (wc == 100000) && (wd == 50000) ) {
                 System.out.println("\nIt is TRUE that wc = 100000 and wd = 50000");
             }
        if ( (wc == 100) || (wd == 50000) ) {
                 System.out.println("It is TRUE that wc = 100 or wd = 50000");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for Long Wrapper Class  when wc = 100000 and wd = 50000 ");
        
	System.out.println("\nThe result of the '= operator' for (wc=wd) is " +( wc = wd));
        System.out.println("The result of the '+= operator' for (wc+=wd) is " +( wc += wd));
        System.out.println("The result of the '-= operator' for (wc-=wd) is " +( wc -= wd));
        System.out.println("The result of the '*= operator' for (wc*=wd) is " +( wc *= wd));  
        System.out.println("The result of the '/= operator' for (wc/=wd) is " +( wc /= wd)); 
        System.out.println("The result of the '%= operator' for (wc%=wd) is " +( wc %= wd)); 
        System.out.println("The result of the '>>= operator' for (wc>>=wd) is " +( wc >>= wd)); 
        System.out.println("The result of the '<<= operator' for (wc<<=wd) is " +( wc <<= wd)); 
        System.out.println("The result of the '|= operator' for (wc|=wd) is " +( wc |= wd)); 
        System.out.println("The result of the '&= operator' for (wc&=wd) is " +( wc &= wd)); 
        System.out.println("The result of the '^= operator' for (wc^=wd) is " +( wc ^= wd)); 
        wc = 100000L;
        // Here are operations with the misc operators;
        System.out.println("\nMisc Operators for Long Wrapper Class  when wc = 100000 and wd = 50000 ");
        System.out.println("\nConditional result for '(wc==wd)?wc:wd is' " + ((Objects.equals(wc, wd)) ? wc : wd) );
        
        if (wc instanceof Long){
             System.out.println("The following Long object is an instance of Long class:" + wc);
         }
         if (wd instanceof Long){
            System.out.println("The following Long object is an instance of Long class:" + wd);
         }
         
                // Here i've created the Short Wrapper Class  we and wf;
         System.out.println("\n********** Operations with Short Wrapper Class  **********");
    
    Short we = 10;
    Short wf = 5;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for Short Wrapper Class  when we = 10 and wf = 5 ");
        System.out.println("\nThe result of the '+ operator' for (we+wf) is: " + (we + wf));
        System.out.println("The result of the '- operator' for (we-wf) is: " + (we - wf));
        System.out.println("The result of the '* operator' for (we*wf) is: " + (we * wf));
        System.out.println("The result of the '/ operator' for (we/wf) is: " + (we / wf));
        System.out.println("The result of the '% operator' for (we%wf) is: " + (we % wf));
        System.out.println("The result of the 'Postfix ++ operator' for (we++) is: " + (we++));
        we--;
        System.out.println("The result of the 'Prefix ++ operator' for (++wf) is: " + ( ++wf ));
        --wf;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for Short Wrapper Class  when we = 10 and wf = 5 ");
        
        System.out.println("\na < wf : "+(we < wf)); 
        System.out.println("we > wf : "+(we > wf)); 
        System.out.println("we >= wf : "+(we >= wf)); 
        System.out.println("we <= wf : "+(we <= wf)); 
        System.out.println("we == wf : "+(Objects.equals(we, wf)));
        System.out.println("we != wf : "+(!Objects.equals(we, wf)));
        
        // Here are operations with the bitwise operators
        System.out.println("\nBitwise Operators for Short Wrapper Class  when we = 10 and wf = 5 ");
        System.out.println("\na & wf : " + (we & wf)); 
        System.out.println("we | wf : " + (we | wf)); 
        System.out.println("we ^ wf : " + (we ^ wf)); 
        System.out.println("~we : " + (~we)); 
        System.out.println("we << wf : " + (we << wf)); 
        System.out.println("we >> wf : " + (we >> wf));
        System.out.println("we >>> wf : " + (we >>> wf));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for Short Wrapper Class  when we = 10 and wf = 5 ");
        if ( (we == 10) && (wf == 5) ) {
                 System.out.println("\nIt is TRUE that we = 10 and wf = 5");
             }
        if ( (we == 10) || (wf == 50) ) {
                 System.out.println("It is TRUE that we = 10 or wf = 5");
             }
         
        
        // Here are operations with the misc operators;
        System.out.println("\nMisc Operators for Short Wrapper Class  when we = 10 and wf = 5 ");
        System.out.println("\nConditional result for '(we==wf)?we:wf is' " + ((Objects.equals(we, wf)) ? we : wf) );
        if (we instanceof Short){
            System.out.println("The following Short object is an instance of Short class:" + we);
         }
        if (wf instanceof Short){
            System.out.println("The following Short object is an instance of Short class:" + wf);
         }
                // Here wi've created the Float Wrapper Class  wi and wj;
         System.out.println("\n********** Operations with Float Wrapper Class  **********");
    
    Float wi = 451.6f;
    Float wj = 273.8f;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for Float Wrapper Class  when wi = 451.6f and wj = 273.8f ");
        System.out.println("\nThe result of the '+ operator' for (wi+wj) is: " + (wi + wj));
        System.out.println("The result of the '- operator' for (wi-wj) is: " + (wi - wj));
        System.out.println("The result of the '* operator' for (wi*wj) is: " + (wi*wj));
        System.out.println("The result of the '/ operator' for (wi/wj) is: " + (wi/wj));
        System.out.println("The result of the '% operator' for (wi%wj) is: " + (wi%wj));
        System.out.println("The result of the 'Postfix ++ operator' for (wi++) is: " + (wi++));
        wi--;
        System.out.println("The result of the 'Prefix ++ operator' for (++wj) is: " + (++wj));
        --wj;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for Float Wrapper Class  when wi = 451.6f and wj = 273.8f ");
        
        System.out.println("\na < wj : "+(wi < wj)); 
        System.out.println("wi > wj : "+(wi > wj)); 
        System.out.println("wi >= wj : "+(wi >= wj)); 
        System.out.println("wi <= wj : "+(wi <= wj)); 
        System.out.println("wi == wj : "+(Objects.equals(wi, wj)));
        System.out.println("wi != wj : "+(!Objects.equals(wi, wj)));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for Float Wrapper Class  when wi = 451.6 and wj = 273.8 ");
        if ( (wi == 451.6f) && (wj == 273.8f) ) {
                 System.out.println("\nIt is TRUE that wi = 451.6f and wj = 273.8f");
             }
        if ( (wi == 451.6f) || (wj == 50f) ) {
                 System.out.println("It is TRUE that wi = 451.6 or wj = 273.8");
             }
     
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for Float Wrapper Class  when wi = 451.6 and wj = 273.8 ");
        
        System.out.println("\nThe result of the '= operator' for (wi=wj) is " +( wi = wj));
        System.out.println("The result of the '+= operator' for (wi+=wj) is " +( wi += wj));
        System.out.println("The result of the '-= operator' for (wi-=wj) is " +( wi -= wj));
        System.out.println("The result of the '*= operator' for (wi*=wj) is " +( wi *= wj));  
        System.out.println("The result of the '/= operator' for (wi/=wj) is " +( wi /= wj)); 
        System.out.println("The result of the '%= operator' for (wi%=wj) is " +( wi %= wj)); 
        wi = 451.6f;
        // Here are operations with the misc operators;
        System.out.println("\nMisc Operators for Float Wrapper Class  when wi = 451.6f and wj = 273.8f ");
        System.out.println("\nConditional result for '(wi==wj)?wi:wj is' " + ((Objects.equals(wi, wj)) ? wi : wj) );
	if (wi instanceof Float){
             System.out.println("The following Float object is an instance of Float class:" + wi);
         }
         if (wj instanceof Float){
            System.out.println("The following Float object is an instance of Float class:" + wj);
          }  
            
        // Here i've created the Double Wrapper Class  wk and wl
         System.out.println("\n********** Operations with Double Wrapper Class  **********");
    Double wk = 19765.41d;
    Double wl = 18837.27d;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for Double Wrapper Class  when wk = 19765.41d and wl = 18837.27d ");
        System.out.println("\nThe result of the '+ operator' for (wk+wl) is: " + (wk + wl));
        System.out.println("The result of the '- operator' for (wk-wl) is: " + (wk - wl));
        System.out.println("The result of the '* operator' for (wk*wl) is: " + (wk*wl));
        System.out.println("The result of the '/ operator' for (wk/wl) is: " + (wk/wl));
        System.out.println("The result of the '% operator' for (wk%wl) is: " + (wk%wl));
        System.out.println("The result of the 'Postfix ++ operator' for (wk++) is: " + (wk++));
        wk--;
        System.out.println("The result of the 'Prefix ++ operator' for (++wl) is: " + (++wl));
        --wl;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for Double Wrapper Class  when wk = 19765.41d and wl = 18837.27d ");
        
        System.out.println("\na < wl : "+(wk < wl)); 
        System.out.println("wk > wl : "+(wk > wl)); 
        System.out.println("wk >= wl : "+(wk >= wl)); 
        System.out.println("wk <= wl : "+(wk <= wl)); 
        System.out.println("wk == wl : "+(Objects.equals(wk, wl)));
        System.out.println("wk != wl : "+(!Objects.equals(wk, wl)));
        
        // There are no bitwise operations for Double Wrapper Class 
        System.out.println("\nThere are no bitwise operations for Double Wrapper Class ");
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for Double Wrapper Class  when wk = 451.6 and wl = 273.8 ");
        if ( (wk == 19765.41d) && (wl == 18837.27d) ) {
                 System.out.println("\nIt is TRUE that wk = 19765.41d and wl = 18837.27d");
             }
        if ( (wk == 19765.41d) || (wl == 50f) ) {
                 System.out.println("It is TRUE that wk = 19765.41d or wl = 18837.27d");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for Double Wrapper Class  when wk = 451.6 and wl = 273.8 ");
        
	System.out.println("\nThe result of the '= operator' for (wk=wl) is " +( wk = wl));
        System.out.println("The result of the '+= operator' for (wk+=wl) is " +( wk += wl));
        System.out.println("The result of the '-= operator' for (wk-=wl) is " +( wk -= wl));
        System.out.println("The result of the '*= operator' for (wk*=wl) is " +( wk *= wl));  
        System.out.println("The result of the '/= operator' for (wk/=wl) is " +( wk /= wl)); 
        System.out.println("The result of the '%= operator' for (wk%=wl) is " +( wk %= wl)); 
 
        wk = 19765.41d;
        // Here are operations with the misc operators;
        System.out.println("\nMisc Operators for Double Wrapper Class  when wk = 451.6 and wl = 273.8 ");
        System.out.println("\nConditional result for '(wk==wl)?wk:wl is' " + ((Objects.equals(wk, wl)) ? wk : wl) );
	if (wk instanceof Double){
             System.out.println("The following Double object is an instance of Double class:" + wk);
         }
         if (wl instanceof Double){
            System.out.println("The following Double object is an instance of Double class:" + wl);
         }
                  // Here I've created the Character Wrapper Class  wx and wy;
         System.out.println("\n********** Operations with Character Wrapper Class  **********");
    
    Character wx= 'a';
    Character wy = 'b';
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for Character Wrapper Class  when wx= 'a' and wy = 'b' ");
        
        System.out.println("\na < wy : "+(wx< wy)); 
        System.out.println("wx> wy : "+(wx> wy)); 
        System.out.println("wx>= wy : "+(wx>= wy)); 
        System.out.println("wx<= wy : "+(wx<= wy)); 
        System.out.println("wx== wy : "+(Objects.equals(wx, wy)));
        System.out.println("wx!= wy : "+(!Objects.equals(wx, wy)));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for Character Wrapper Class  when wx= 'a' and wy = 'b' ");
        if ( (wx== 'a') && (wy == 'b') ) {
                 System.out.println("\nIt is TRUE that wx= 'a' and wy = 'b' ");
             }
        if ( (wx== 'a') || (wy == 'c') ) {
                 System.out.println("It is TRUE that wx= 'a' or wy = 'c'");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for Character Wrapper Class  when wx= 'a' and wy = 'b' ");
	System.out.println("\nThe result of the '= operator' for (k=wy) is " +( wx = wy));
        wx = 'a';
        // Here are operations with the misc operators;
        System.out.println("\nMisc Operators for Character Wrapper Class  when wx= 'a' and wy = 'b' ");
        System.out.println("\nConditional result for '(k==wy)?k:wy is' " + ((Objects.equals(wx, wy)) ? wx: wy) );
        	if (wx instanceof Character){
             System.out.println("The following Character object is an instance of Character class:" + wx);
         }
         if (wy instanceof Character){
            System.out.println("The following Character object is an instance of Character class:" + wy);
         }
                 
         // Here I've created the Boolean Wrapper Class  ww and wz;
         System.out.println("\n********** Operations with Boolean Wrapper Class  **********");
    
    Boolean ww= true;
    Boolean wz = false;

       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for Boolean Wrapper Class  when ww= true and wz = false ");

        System.out.println("ww== wz : "+(Objects.equals(ww, wz)));
        System.out.println("ww!= wz : "+(!Objects.equals(ww, wz)));
        System.out.println("ww & wz : " + (ww & wz));
        System.out.println("ww && wz : " + (ww && wz));
        System.out.println("ww | wz : " + (ww | wz));
	System.out.println("ww || wz: " + (ww || wz));
	System.out.println("ww ^ wz : " + (ww ^ wz));
        System.out.println("!ww : " + (!ww));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for Boolean Wrapper Class  when ww = true and wz = false ");
        if ( (ww== true) && (wz == false) ) {
                 System.out.println("\nIt is TRUE that ww= true and wz = false ");
             }
        if ( (ww== true) || (wz == true) ) {
                 System.out.println("It is TRUE that ww= true or wz = false");
             }
         
        
        // Here are operations with the misc operators (k used just the conditional one);
        System.out.println("\nMisc Operators for Boolean Wrapper Class  when ww= true and wz = false ");
        System.out.println("\nConditional result for '(ww==wz)?ww:wz is' " + ((Objects.equals(ww, wz)) ? ww: wz) );


	if (ww instanceof Boolean){
             System.out.println("The following Boolean object is an instance of Boolean class:" + ww);
         }
         if (wz instanceof Boolean){
            System.out.println("The following Boolean object is an instance of Boolean class:" + wz);
         }

         }

    
}
