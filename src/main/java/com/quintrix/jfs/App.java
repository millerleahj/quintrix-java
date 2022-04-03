package com.quintrix.jfs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int num = 1; 
        double dec = 0.5; 
        long bigNum = 100000; 
        //int bigToSmall = bigNum; 
        	//cannot go from long to int
        long smallToBig = num; 
        //int decNum = num + dec; 
        	//created error; dec cannot convert to int
        double approx = 0.1; 
        approx = approx + 0.2; 
        float fl = 1.5f; 
        
       
        System.out.println("Numbers: " + num + ", " + dec + ", " + bigNum + ", " + smallToBig + ", " + fl); 
        System.out.println("Add all Numbers: " + (num + dec + bigNum + smallToBig)); 
        System.out.println("Approximations: " + approx); 
        
        char alpha = 'A'; 
        char beta = 65; 
        char delta = '\u00E1'; 
        char omega = '\u2764'; 
        
        System.out.println("Characters: \n " + alpha + beta + delta + omega); 
        
        Integer i = new Integer(1); 
       int findI =  i.intValue(); 
        
        System.out.println("Wrapper: Primitive to Object Example " + i + ", " + findI);
        
        if(num == i) {
        	System.out.println("They are equal.");
        }
        else {
        	System.out.println("They are not equal.");
        }
    }
    
    public void Notes() {
    	/*PRIMITIVE DATA TYPES
    	 * 
    	 * 
    	 * numerical: int, float, long, double
    	 * 		A float has 7 decimal digits of precision and occupies 32 bits . 
    	 * 		A double is a 64-bit IEEE 754 double-precision floating-point number. 
    	 * 		1 bit for the sign, 11 bits for the exponent, and 52 bits for the value. 
    	 * 		A double has 15 decimal digits of precision and occupies a total of 64 bits .
    	 * Boolean: true, false
    	 * 
    	 * ALWAYS INITIALIZE VARIABLES
    	 * 
    	 * THE PLUS SIGN
    	 * adds numbers together; combines two variables
    	 * 
    	 * 
    	 * 
    	 * CHAR ESCAPE SEQUENCES
    	 * 
    	 * \n = new line
    	 * \r = carriage return
    	 * \f = form feed
    	 * \b = backspace
    	 * \t = tab
    	 * \\ = \
    	 * \' = '
    	 * \" = "
    	 * 
    	 * 
    	 * 
    	 * CANNOT USE FUNCTION ON PRIMITIVE; ONLY ON OBJECTS
    	 * num.TestFunction : primitive type
    	 * human.TestFunction : object 
    	 * 
    	 * WRAPPERS
    	 * turn primitive to object
    	 * long -> Long; int -> Integer\
    	 * can use null
    	 * 
    	 * 
    	 * CONDITIONAL
    	 * IF
    	 * if(value </>/==/!= value) {condition}
    	 * 	else {other condition}
    	 * 
    	 */
    }
}
