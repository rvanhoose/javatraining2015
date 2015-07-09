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
public class Animal {
    private String type;
    private boolean wild=true;
    
    public Animal(String type, boolean isTame) {
        this.type = type;
        wild = !isTame;
    }
    
    public String getType() {
        return type;
    }
    public boolean isWild() {
        return wild;
    }
    public void speak() {
        System.out.println(String.format("A %s says ...", type));
    }

    @Override
    public String toString() {
        return "Here sits a " + (wild?"wild":"tame") + " " + type + ".";
    }
    
    
}
