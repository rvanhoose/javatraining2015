package org.rollarobotics.training2015;

import org.rollarobotics.training2015.inheritance.Animal;
import org.rollarobotics.training2015.inheritance.Dog;
import org.rollarobotics.training2015.inheritance.Lion;

/**
 * This program demonstrates object inheritance
 * @author rob
 */
public class Exercise09 {
    public static void main(String[] args) {
        Animal snail = new Animal("snail", true);
        
        Dog tucker = new Dog("Tucker", "Rob");
        
        Lion simba = new Lion();
        
        System.out.println(snail);
        snail.speak();
        System.out.println(tucker);
        tucker.speak();
        System.out.println(simba);
        simba.speak();
        
    }
    
    
}
