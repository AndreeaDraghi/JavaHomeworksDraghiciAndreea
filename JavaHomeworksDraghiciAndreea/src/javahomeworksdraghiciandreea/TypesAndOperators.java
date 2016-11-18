/*
 * Homework 2
 * Exercise 2: Create variables having one of the 8 standard types we defined 
in java(from int to... boolean). Display in console all possible operations 
(apply all operators) for all standard types.
 */
package javahomeworksdraghiciandreea;

/**
 *
 * @author Andreea
 */
public class TypesAndOperators {
     public static void main(String[] args){
         // I start this program creating the int variables a, b and resultint;
         System.out.println("\n********** Operations with int standard type variables **********");
    
    int a = 100;
    int b = 50;
    int resultint;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for int variables when a = 100 and b = 50 ");
        resultint = a + b;
        System.out.println("\nThe result of the '+ operator' for (a+b) is: " + resultint);
        resultint = a - b;
        System.out.println("The result of the '- operator' for (a-b) is: " + resultint);
        resultint = a * b;
        System.out.println("The result of the '* operator' for (a*b) is: " + resultint);
        resultint = a / b;
        System.out.println("The result of the '/ operator' for (a/b) is: " + resultint);
        resultint = a % b;
        System.out.println("The result of the '% operator' for (a%b) is: " + resultint);
        resultint = a++;
        System.out.println("The result of the 'Postfix ++ operator' for (a++) is: " + resultint);
        a--;
        resultint = ++b;
        System.out.println("The result of the 'Prefix ++ operator' for (++b) is: " + resultint);
        --b;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for int variables when a = 100 and b = 50 ");
        
        System.out.println("\na < b : "+(a < b)); 
        System.out.println("a > b : "+(a > b)); 
        System.out.println("a >= b : "+(a >= b)); 
        System.out.println("a <= b : "+(a <= b)); 
        System.out.println("a == b : "+(a == b));
        System.out.println("a != b : "+(a != b));
        
        // Here are operations with the bitwise operators
        System.out.println("\nBitwise Operators for int variables when a = 100 and b = 50 ");
        System.out.println("\na & b : " + (a & b)); 
        System.out.println("a | b : " + (a | b)); 
        System.out.println("a ^ b : " + (a ^ b)); 
        System.out.println("~a : " + (~a)); 
        System.out.println("a << b : " + (a << b)); 
        System.out.println("a >> b : " + (a >> b));
        System.out.println("a >>> b : " + (a >>> b));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for int variables when a = 100 and b = 50 ");
        if ( (a == 100) && (b == 50) ) {
                 System.out.println("\nIt is TRUE that a = 100 and b = 50");
             }
        if ( (a == 10) || (b == 50) ) {
                 System.out.println("It is TRUE that a = 10 or b = 50");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for int variables when a = 100 and b = 50 ");
        
	System.out.println("\nThe result of the '= operator' for (a=b) is " +( a = b));
        System.out.println("The result of the '+= operator' for (a+=b) is " +( a += b));
        System.out.println("The result of the '-= operator' for (a-=b) is " +( a -= b));
        System.out.println("The result of the '*= operator' for (a*=b) is " +( a *= b));  
        System.out.println("The result of the '/= operator' for (a/=b) is " +( a /= b)); 
        System.out.println("The result of the '%= operator' for (a%=b) is " +( a %= b)); 
        System.out.println("The result of the '>>= operator' for (a>>=b) is " +( a >>= b)); 
        System.out.println("The result of the '<<= operator' for (a<<=b) is " +( a <<= b)); 
        System.out.println("The result of the '|= operator' for (a|=b) is " +( a |= b)); 
        System.out.println("The result of the '&= operator' for (a&=b) is " +( a &= b)); 
        System.out.println("The result of the '^= operator' for (a^=b) is " +( a ^= b)); 
        
        // Here are operations with the misc operators (i used just the conditional one);
        System.out.println("\nMisc Operators for int variables when a = 100 and b = 50 ");
        System.out.println("\nConditional result for '(a==b)?a:b is' " + ((a==b) ? a : b) );
        
        
        // Here i've created the long variables c, d and resultlong;
         System.out.println("\n********** Operations with long standard type variables **********");
    
    long c = 100000;
    long d = 50000;
    long resultlong;
    
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for long variables when c = 100000 and d = 50000 ");
        resultlong = c + d;
        System.out.println("\nThe result of the '+ operator' for (c+d) is: " + resultlong);
        resultlong = c - d;
        System.out.println("The result of the '- operator' for (c-d) is: " + resultlong);
        resultlong = c * d;
        System.out.println("The result of the '* operator' for (c*d) is: " + resultlong);
        resultlong = c / d;
        System.out.println("The result of the '/ operator' for (c/d) is: " + resultlong);
        resultlong = c % d;
        System.out.println("The result of the '% operator' for (c%d) is: " + resultlong);
        resultlong = c++;
        System.out.println("The result of the 'Postfix ++ operator' for (c++) is: " + resultlong);
        c--;
        resultlong = ++d;
        System.out.println("The result of the 'Prefix ++ operator' for (++d) is: " + resultlong);
        --d;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for long variables when c = 100000 and d = 50000 ");
        
        System.out.println("\na < d : "+(c < d)); 
        System.out.println("c > d : "+(c > d)); 
        System.out.println("c >= d : "+(c >= d)); 
        System.out.println("c <= d : "+(c <= d)); 
        System.out.println("c == d : "+(c == d));
        System.out.println("c != d : "+(c != d));
        
        // Here are operations with the bitwise operators
        System.out.println("\nBitwise Operators for long variables when c = 100000 and d = 50000 ");
        System.out.println("\na & d : " + (c & d)); 
        System.out.println("c | d : " + (c | d)); 
        System.out.println("c ^ d : " + (c ^ d)); 
        System.out.println("~c : " + (~c)); 
        System.out.println("c << d : " + (c << d)); 
        System.out.println("c >> d : " + (c >> d));
        System.out.println("c >>> d : " + (c >>> d));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for long variables when c = 100000 and d = 50000 ");
        if ( (c == 100000) && (d == 50000) ) {
                 System.out.println("\nIt is TRUE that c = 100000 and d = 50000");
             }
        if ( (c == 100) || (d == 50000) ) {
                 System.out.println("It is TRUE that c = 100 or d = 50000");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for long variables when c = 100000 and d = 50000 ");
        
	System.out.println("\nThe result of the '= operator' for (c=d) is " +( c = d));
        System.out.println("The result of the '+= operator' for (c+=d) is " +( c += d));
        System.out.println("The result of the '-= operator' for (c-=d) is " +( c -= d));
        System.out.println("The result of the '*= operator' for (c*=d) is " +( c *= d));  
        System.out.println("The result of the '/= operator' for (c/=d) is " +( c /= d)); 
        System.out.println("The result of the '%= operator' for (c%=d) is " +( c %= d)); 
        System.out.println("The result of the '>>= operator' for (c>>=d) is " +( c >>= d)); 
        System.out.println("The result of the '<<= operator' for (c<<=d) is " +( c <<= d)); 
        System.out.println("The result of the '|= operator' for (c|=d) is " +( c |= d)); 
        System.out.println("The result of the '&= operator' for (c&=d) is " +( c &= d)); 
        System.out.println("The result of the '^= operator' for (c^=d) is " +( c ^= d)); 
        
        // Here are operations with the misc operators (i used just the conditional one);
        System.out.println("\nMisc Operators for long variables when c = 100000 and d = 50000 ");
        System.out.println("\nConditional result for '(c==d)?c:d is' " + ((c==d) ? c : d) );
        
        // Here i've created the short variables e and f;
         System.out.println("\n********** Operations with short standard type variables **********");
    
    short e = 10;
    short f = 5;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for short variables when e = 10 and f = 5 ");
        System.out.println("\nThe result of the '+ operator' for (e+f) is: " + (e + f));
        System.out.println("The result of the '- operator' for (e-f) is: " + (e - f));
        System.out.println("The result of the '* operator' for (e*f) is: " + (e * f));
        System.out.println("The result of the '/ operator' for (e/f) is: " + (e / f));
        System.out.println("The result of the '% operator' for (e%f) is: " + (e % f));
        System.out.println("The result of the 'Postfix ++ operator' for (e++) is: " + (e++));
        e--;
        System.out.println("The result of the 'Prefix ++ operator' for (++f) is: " + ( ++f ));
        --f;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for short variables when e = 10 and f = 5 ");
        
        System.out.println("\na < f : "+(e < f)); 
        System.out.println("e > f : "+(e > f)); 
        System.out.println("e >= f : "+(e >= f)); 
        System.out.println("e <= f : "+(e <= f)); 
        System.out.println("e == f : "+(e == f));
        System.out.println("e != f : "+(e != f));
        
        // Here are operations with the bitwise operators
        System.out.println("\nBitwise Operators for short variables when e = 10 and f = 5 ");
        System.out.println("\na & f : " + (e & f)); 
        System.out.println("e | f : " + (e | f)); 
        System.out.println("e ^ f : " + (e ^ f)); 
        System.out.println("~e : " + (~e)); 
        System.out.println("e << f : " + (e << f)); 
        System.out.println("e >> f : " + (e >> f));
        System.out.println("e >>> f : " + (e >>> f));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for short variables when e = 10 and f = 5 ");
        if ( (e == 10) && (f == 5) ) {
                 System.out.println("\nIt is TRUE that e = 10 and f = 5");
             }
        if ( (e == 10) || (f == 50) ) {
                 System.out.println("It is TRUE that e = 10 or f = 5");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for short variables when e = 10 and f = 5 ");
        
	System.out.println("\nThe result of the '= operator' for (e=f) is " +( e = f));
        System.out.println("The result of the '+= operator' for (e+=f) is " +( e += f));
        System.out.println("The result of the '-= operator' for (e-=f) is " +( e -= f));
        System.out.println("The result of the '*= operator' for (e*=f) is " +( e *= f));  
        System.out.println("The result of the '/= operator' for (e/=f) is " +( e /= f)); 
        System.out.println("The result of the '%= operator' for (e%=f) is " +( e %= f)); 
        System.out.println("The result of the '>>= operator' for (e>>=f) is " +( e >>= f)); 
        System.out.println("The result of the '<<= operator' for (e<<=f) is " +( e <<= f)); 
        System.out.println("The result of the '|= operator' for (e|=f) is " +( e |= f)); 
        System.out.println("The result of the '&= operator' for (e&=f) is " +( e &= f)); 
        System.out.println("The result of the '^= operator' for (e^=f) is " +( e ^= f)); 
        
        // Here are operations with the misc operators (i used just the conditional one);
        System.out.println("\nMisc Operators for short variables when e = 10 and f = 5 ");
        System.out.println("\nConditional result for '(e==f)?e:f is' " + ((e==f) ? e : f) );
        
        // Here i've created the float variables i and j;
         System.out.println("\n********** Operations with float standard type variables **********");
    
    float i = 451.6f;
    float j = 273.8f;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for float variables when i = 451.6f and j = 273.8f ");
        System.out.println("\nThe result of the '+ operator' for (i+j) is: " + (i + j));
        System.out.println("The result of the '- operator' for (i-j) is: " + (i - j));
        System.out.println("The result of the '* operator' for (i*j) is: " + (i*j));
        System.out.println("The result of the '/ operator' for (i/j) is: " + (i/j));
        System.out.println("The result of the '% operator' for (i%j) is: " + (i%j));
        System.out.println("The result of the 'Postfix ++ operator' for (i++) is: " + (i++));
        i--;
        System.out.println("The result of the 'Prefix ++ operator' for (++j) is: " + (++j));
        --j;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for float variables when i = 451.6f and j = 273.8f ");
        
        System.out.println("\na < j : "+(i < j)); 
        System.out.println("i > j : "+(i > j)); 
        System.out.println("i >= j : "+(i >= j)); 
        System.out.println("i <= j : "+(i <= j)); 
        System.out.println("i == j : "+(i == j));
        System.out.println("i != j : "+(i != j));
        
        // There are no bitwise operations for float variables
        System.out.println("\nThere are no bitwise operations for float variables");
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for float variables when i = 451.6 and j = 273.8 ");
        if ( (i == 451.6f) && (j == 273.8f) ) {
                 System.out.println("\nIt is TRUE that i = 451.6f and j = 273.8f");
             }
        if ( (i == 451.6f) || (j == 50f) ) {
                 System.out.println("It is TRUE that i = 451.6 or j = 273.8");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for float variables when i = 451.6 and j = 273.8 ");
        
	System.out.println("\nThe result of the '= operator' for (i=j) is " +( i = j));
        System.out.println("The result of the '+= operator' for (i+=j) is " +( i += j));
        System.out.println("The result of the '-= operator' for (i-=j) is " +( i -= j));
        System.out.println("The result of the '*= operator' for (i*=j) is " +( i *= j));  
        System.out.println("The result of the '/= operator' for (i/=j) is " +( i /= j)); 
        System.out.println("The result of the '%= operator' for (i%=j) is " +( i %= j)); 
 
        
        // Here are operations with the misc operators (i used just the conditional one);
        System.out.println("\nMisc Operators for float variables when i = 451.6 and j = 273.8 ");
        System.out.println("\nConditional result for '(i==j)?i:j is' " + ((i==j) ? i : j) );
        
         // Here k've created the double variables k and l
         System.out.println("\n********** Operations with double standard type variables **********");
    
    double k = 19765.41d;
    double l = 18837.27d;
        // Here are operations with the arithmetic operators
        System.out.println("\nArithmetic Operators for double variables when k = 19765.41d and l = 18837.27d ");
        System.out.println("\nThe result of the '+ operator' for (k+l) is: " + (k + l));
        System.out.println("The result of the '- operator' for (k-l) is: " + (k - l));
        System.out.println("The result of the '* operator' for (k*l) is: " + (k*l));
        System.out.println("The result of the '/ operator' for (k/l) is: " + (k/l));
        System.out.println("The result of the '% operator' for (k%l) is: " + (k%l));
        System.out.println("The result of the 'Postfix ++ operator' for (k++) is: " + (k++));
        k--;
        System.out.println("The result of the 'Prefix ++ operator' for (++l) is: " + (++l));
        --l;
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for double variables when k = 19765.41d and l = 18837.27d ");
        
        System.out.println("\na < l : "+(k < l)); 
        System.out.println("k > l : "+(k > l)); 
        System.out.println("k >= l : "+(k >= l)); 
        System.out.println("k <= l : "+(k <= l)); 
        System.out.println("k == l : "+(k == l));
        System.out.println("k != l : "+(k != l));
        
        // There are no bitwise operations for double variables
        System.out.println("\nThere are no bitwise operations for double variables");
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for double variables when k = 451.6 and l = 273.8 ");
        if ( (k == 19765.41d) && (l == 18837.27d) ) {
                 System.out.println("\nIt is TRUE that k = 19765.41d and l = 18837.27d");
             }
        if ( (k == 19765.41d) || (l == 50f) ) {
                 System.out.println("It is TRUE that k = 19765.41d or l = 18837.27d");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for double variables when k = 451.6 and l = 273.8 ");
        
	System.out.println("\nThe result of the '= operator' for (k=l) is " +( k = l));
        System.out.println("The result of the '+= operator' for (k+=l) is " +( k += l));
        System.out.println("The result of the '-= operator' for (k-=l) is " +( k -= l));
        System.out.println("The result of the '*= operator' for (k*=l) is " +( k *= l));  
        System.out.println("The result of the '/= operator' for (k/=l) is " +( k /= l)); 
        System.out.println("The result of the '%= operator' for (k%=l) is " +( k %= l)); 
 
        
        // Here are operations with the misc operators (k used just the conditional one);
        System.out.println("\nMisc Operators for double variables when k = 451.6 and l = 273.8 ");
        System.out.println("\nConditional result for '(k==l)?k:l is' " + ((k==l) ? k : l) );
        
          // Here I've created the char variables x and y;
         System.out.println("\n********** Operations with char standard type variables **********");
    
    char x= 'A';
    char y = 'B';
       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for char variables when x= 'A' and y = 'B' ");
        
        System.out.println("\na < y : "+(x< y)); 
        System.out.println("x> y : "+(x> y)); 
        System.out.println("x>= y : "+(x>= y)); 
        System.out.println("x<= y : "+(x<= y)); 
        System.out.println("x== y : "+(x== y));
        System.out.println("x!= y : "+(x!= y));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for char variables when x= 451.6 and y = 273.8 ");
        if ( (x== 'A') && (y == 'B') ) {
                 System.out.println("\nIt is TRUE that x= 'A' and y = 'B' ");
             }
        if ( (x== 'A') || (y == 50f) ) {
                 System.out.println("It is TRUE that x= 'A' or y = 'B'");
             }
         
        // Here are operations with the assignment operators
        System.out.println("\nAssignment Operators for char variables when x= 'A' and y = 'B' ");
	System.out.println("\nThe result of the '= operator' for (k=y) is " +( x= y));
        
        // Here are operations with the misc operators (k used just the conditional one);
        System.out.println("\nMisc Operators for char variables when x= 'A' and y = 'B' ");
        System.out.println("\nConditional result for '(k==y)?k:y is' " + ((k==y) ? x: y) );
        
        
         // Here I've created the boolean variables w and z;
         System.out.println("\n********** Operations with boolean standard type variables **********");
    
    boolean w= true;
    boolean z = false;

       
        // Here are operations with the relational operators
        System.out.println("\nRelational Operators for boolean variables when w= true and z = false ");

        System.out.println("w== z : "+(w== z));
        System.out.println("w!= z : "+(w!= z));
        System.out.println("w & z : " + (w & z));
        System.out.println("w && z : " + (w && z));
        System.out.println("w | z : " + (w | z));
	System.out.println("w || z: " + (w || z));
	System.out.println("w ^ z : " + (w ^ z));
        System.out.println("!w : " + (!w));
        
        // Here are operations with the logical operators
        System.out.println("\nLogical Operators for boolean variables when w = true and z = false ");
        if ( (w== true) && (z == false) ) {
                 System.out.println("\nIt is TRUE that w= true and z = false ");
             }
        if ( (w== true) || (z == true) ) {
                 System.out.println("It is TRUE that w= true or z = false");
             }
         
        
        // Here are operations with the misc operators (k used just the conditional one);
        System.out.println("\nMisc Operators for boolean variables when w= true and z = false ");
        System.out.println("\nConditional result for '(w==z)?w:z is' " + ((w==z) ? w: z) );
        

}
}