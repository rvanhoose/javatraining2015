package org.rollarobotics.training2015;

/**
 * This class demonstrates declaration of variables, assignment of values,
 * several variable types, variable scope
 * @author rob
 */
public class Exercise02 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare an integer and assign a value to it.
        int integer1;
        integer1 = 123;

        //Declare an integer and initialize it with a value.
        int integer2 = 456;
        
        //Declare and intialize several types of primitive variables
        long bigInteger = 1_000_000_000;
        
        float decimalNumber1 = 123.456f;
        double decimalNumber2 = 789.123;
        
        char aSingleCharacter = 'c';
        
        boolean aTrueValue = true;
        boolean aFalseValue = false;

        String aWord = "word";
        String aSentenceWithEscapedCharacters = "Field1\tField2\tField3";
        
        int changingValue = 0;
        int ChangingValue = 1;
        
        changingValue = 1;
        
        changingValue = 2;
        
    }

    String classInstanceVariable = "visible throughout the entire object instance";
    
    static String classStaticVariable = "shared by all instances/doesn't require new()";
    
     
    private void aMethod(int argVariable) {
        //argVariable is in scope only inside "aMethod()"
        
        String methodVariable = "visible inside aMethod()";
    
        int val1 = 0;
        if (val1 == 0) {
            
            String blockVariable = "visible inside if statement block.";
            
        }
        
        
        
    }
    
    
    
    
}
