package org.rollarobotics.training2015;

/**
 * This class demonstrates some differences between primitive and reference 
 * types.
 * @author rob
 */
public class Exercise03 {
    public static void main(String[] args) {
        //The main division in variable types is "primitive" vs. "reference".
        //Primitives are NOT objects. They contain a value alone.
        //Reference variable ARE objects. In addition to data, they possess
        //methods that allow us to do work with data. Of the basic Java types,
        //only String is a reference type.
        
        String aString = "The Quick Brown Fox";
        //Change it to all lower case
        String aStringLower = aString.toLowerCase();
        //Change it to all upper case
        String aStringUpper = aString.toUpperCase();
        //Get the first 2 characters in the string
        String firstThree = aString.substring(0, 2);
        
        //Comparisons of primitive vs. reference types
        
        //If we use the equality operator (==) with primitives, it compares
        //based on the value stored in the variables.
        int a = 123;
        int b = 123;
        boolean aEqualsB = a == b;
        //In this case "aEqualsB" has a value of true because the values
        //of the two variables are the same.
        
        //If we use the equality operator (==) with reference types, it
        //compares based on the reference identifier, not the value stored
        //at the reference
        String j = "word";
        String k = "word";
        boolean jEqualsK = j == k;
        //In this case "jEqualsK" has a value of false because even though
        //both string variables contain the string "word", j and k are different
        //variables and thus have different reference identifiers.
        boolean jEqualsKcorrect = j.equals(k);
        
        //Reference equivalents of primitive types
        //All primitives have reference equivalents.
        
        int aPrimitive = 123;
        Integer aReference = 123;
        
        //Java will automatically coerce/convert primitives into the
        //corresponding primitive type and vice versa (auto-boxing).
        aReference = aPrimitive;
        aPrimitive = aReference;
        
        //The reference types have methods that allow us to do useful things
        //with primitive values; such as convert them to a string for display.
        String intForDisplay = aReference.toString();
        //Or convert the value to an object of a different type.
        double aDouble = aReference.doubleValue();
        
        
    }
}
