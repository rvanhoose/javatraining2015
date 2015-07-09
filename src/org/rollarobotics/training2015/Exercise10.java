package org.rollarobotics.training2015;

import org.rollarobotics.training2015.objectoriented.SecureAccount;


/**
 * This program demonstrates the use of arrays
 * @author rob
 */
public class Exercise10 {
    public static void main(String[] args) {
        
        //Often we need to store a group of numbers or strings together for
        // some purpose. Perhaps we want to keep a list of values that were
        // generated a different times, but want to think of them as a single
        // variable. This is where arrays come in...
        
        //Arrays are defined by using a type name with square brackets.
        //This is not an int, but an array of integers. Arrays are given a
        // size when they are created; in this case, the array can store 5
        // int values.
        int[] intArray = new int[5];
        
        //The array above will be initialized to the default value of int,
        //which is zero. If we examine any element in the array, it contains
        // a zero. We access the elements of the array by using a subscript.
        
        intArray[0] = 100; // Arrays are indexed starting with zero
        intArray[1] = 200;
        intArray[2] = 300;
        intArray[3] = 400;
        intArray[4] = 500; //Last element in this array
        //intArray[5] = 600; //THIS CAUSES AN EXCEPTION!!
        
        //Arrays are objects and have a read-only "length" field to tell us the size.
        System.out.println(intArray.length); //What is the size of the array?
        
        //We can create arrays of any type
        String[] arrayOfStrings = new String[10];
        double[] arrayOfDoubles = new double[10];
        SecureAccount[] arrayOfDerivedClass9 = new SecureAccount[10];
        
        
        //Arrays can be initalized using array literal notation
        //Creates an int[] array with 5 elements and initalizes to 1,2,3,4,5
        int[] arrayOfInts = {1, 2, 3, 4 ,5};
        
        
        //We can "iterate" over an array by using a for loop with a loop index
        // variable
        for(int i =0; i< arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i]);
        }
        
        //There is a shorthand for iterating over an array without an explicit
        // loop index
        for(int value: arrayOfInts) {
            System.out.println(value);
        }
        
    }
}
