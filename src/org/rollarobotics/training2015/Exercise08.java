
package org.rollarobotics.training2015;

import org.rollarobotics.training2015.inheritance.BaseClass8;
import org.rollarobotics.training2015.inheritance.DerivedClass8;

/**
 * This program demonstrates the concept of class inheritance
 * @author rob
 */

public class Exercise08 {
    public static void main(String[] args) {
        DerivedClass8 derived = new DerivedClass8("Derived8", 1);
        BaseClass8 base = new BaseClass8("Base8", 2);
        
        
        //Because DerivedClass8 "is-a" BaseClass8, we can pass it to a method
        // that expects an object of the type BaseClass8
        displayBaseClass8(base);
        displayBaseClass8(derived);
        
    }
    
    private static void displayBaseClass8(BaseClass8 bc) {
        System.out.println(bc.getDisplayText());
    }
}
