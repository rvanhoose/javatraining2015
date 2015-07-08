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
public class BaseClass8 {
    protected String message;
    protected int id;
    public BaseClass8(String message, int id) {
        this.message = message;
        this.id = id;
    }
    
    
    public String getDisplayText() {
        return String.format("%s: %d", message, id);
    }
    
    public int getId() {
        return id;
    }
}
