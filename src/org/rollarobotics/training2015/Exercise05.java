
package org.rollarobotics.training2015;

/**
 * This class demonstrates the use of if/then statements and the 
 * switch statement.
 * @author rob
 */
public class Exercise05 {
    public static void main(String[] args) {
    
        // Basic "if" statement consists of if (condition) { block }
        // "condition" is any expression that evaluates to a boolean value.
        int value1 = 5;
        
        if (value1 == 5) {
            System.out.println("value1 equals 5.");
        }
        if (value1 != 6) {
            System.out.println("value1 is not equal to 6.");
        }
        if (value1 == 0) {
            System.out.println("This statement is not executed.");
        }
        // Conditions can be combined with the logical operators
        if (value1 > 0 && value1 <= 10) {
            System.out.println("value 1 is between 0 and 10.");
        }
        if (value1 == 5 || value1 == 6) {
            System.out.println("value1 is equal to 5 or equal to 6.");
        }
        
        
        // else clause can be used to specify an alternative when if condition
        // is false
        if (value1 < 5) {
            System.out.println("This statement is not executed.");
        }
        else {
            System.out.println("value1 is greater than or equal to 5");
        }
        
        //Multiple conditions can be tested by using "else if"
        if (value1 == 1) {
            System.out.println("value1 equals 1.");
        }
        else if (value1 == 2) {
            System.out.println("value1 equals 2.");
        }
        else if (value1 == 3) {
            System.out.println("value1 equals 3.");
        }
        else if (value1 == 4) {
            System.out.println("value1 equals 4.");
        }
        else if (value1 == 5) {
            System.out.println("value1 equals 5.");
        }
        else {
            System.out.println("value1 is not 1,2,3,4,5.");
        }
        
        //A more concise way to do the above is to use a "switch" statement
        switch(value1) {
            case 1:
                System.out.println("value1 equals 1.");
                break;
            case 2:
                System.out.println("value1 equals 2.");
                break;
            case 3:
                System.out.println("value1 equals 3.");
                break;
            case 4:
                System.out.println("value1 equals 4.");
                break;    
            case 5:
                System.out.println("value1 equals 5.");
                break;    
            default:
                System.out.println("value1 is not 1,2,3,4,5.");
                break;
        }
        
        
        
    }
}
