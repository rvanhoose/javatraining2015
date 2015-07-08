package org.rollarobotics.training2015;

/**
 * This class demonstrates the arithmetic operators, increment/decrement,
 * String concatenation, and assignment operators
 * @author rob
 */
public class Exercise04 {
    public static void main(String[] args) {
        //Addition
        int add = 1 + 2; // Result 3
        //Subtraction
        int subtract = 1 - 2; // Result -1 
        //Multiplication
        double multiply = 1.2 * 10; //Result 12
        //Division
        double divide = 33 / 3; //Result 11
        //Modulus (find the remainder)
        int mod = 12 % 10; //Result 2
        
        //Increment a number by one after evaluation
        int inc1 = 1;
        System.out.println(inc1++);
        System.out.println(inc1);
        //Prints "1" then "2"
        
        int inc2 = 1;
        System.out.println(++inc2);
        System.out.println(inc2);
        //Prints "2" then "2" again
        
        //Decrement operator "--" works in the same way, but subtracts one
        
        //Strings can be pasted together (concatenated) using the + operator
        String part1 = "The quick brown fox";
        String part2 = " jumped over the lazy dog";
        System.out.println(part1 + part2);
        //Prints "The quick brown fox jumped over the lazy dog"
        
        //Assignment operators can do arithmetic and assign in one step
        int assign1 = 5;
        assign1 += 5; //Result 10
        
        double assign2 = 10;
        assign2 /= 5; //Result 2
        
        double assign3 = 15;
        assign2 %= 7; //Result 1
        
        
        
        
        
        
        
    }
}
