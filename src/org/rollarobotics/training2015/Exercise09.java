package org.rollarobotics.training2015;

import org.rollarobotics.training2015.inheritance.BaseClass9;
import org.rollarobotics.training2015.inheritance.DerivedClass9;

/**
 * This program demonstrates the "abstract" keyword
 * @author rob
 */
public class Exercise09 {
    public static void main(String[] args) {
        
        //Unlike our previous example, BaseClass9 is marked with the
        // abstract keyword. We cannot create an instance of the class
        // directly. We must derive from it in order to use it.
        
        //THIS DOESN'T WORK!!
        //BaseClass9 base = new BaseClass9(4, 5);
        
        DerivedClass9 derived = new DerivedClass9(4, 4);
        
        //The functionality in the abstract class is available, as is the
        // functionality we added in the derived class.
        System.out.println(derived.getMultiple());
        System.out.println(derived.getSum());
    }
    
    
}
