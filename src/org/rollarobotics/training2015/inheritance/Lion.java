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
public class Lion extends Animal {
    
    public Lion() {
        super("lion", false);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("ROAR!");
    }
    
    
}
