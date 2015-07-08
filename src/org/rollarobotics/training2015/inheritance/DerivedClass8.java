/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rollarobotics.training2015.inheritance;

/**
 *
 * @author rob
 */
//The "extends" keyword tells Java that this new class is "derived" from
//another class. Exercise8 is a class that "is-a" BaseClass8.

public class DerivedClass8 extends BaseClass8 {
    public DerivedClass8(String message, int id) {
        //Invoke the base class's constructor
        super(message, id);
    }
    
    //Our derived class (subclass) has method with the same name
    // and signature as the super class (base class), so we must use
    // the @Override annotation to replace it.
    @Override
    public String getDisplayText() {
        //The derived class in this case modifies the behavior of the super
        // class. It can call the method on the super class by using the 
        // "super" keyword.
        //It would be just as valid to do something altogether different.
        return "DERIVED: " + super.getDisplayText();
    }
    
    //Here we completely replace the behavior of the superclass...
    @Override
    public int getId() {
        return 0;
    }
    
    
    public void someMethod() {
        //The "id" field of the superclass is available to us, because
        //it is marked with the "protected" access modifier. This means
        //it is visible to the base class and any dervied classes
        int result = this.id + 20;
        
    }
}
