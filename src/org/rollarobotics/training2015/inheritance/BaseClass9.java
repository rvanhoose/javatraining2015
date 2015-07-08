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
public abstract class BaseClass9 {
    protected int N1;
    protected int N2;
    
    public BaseClass9(int num1, int num2) {
        N1 = num1;
        N2 = num2;
    }
    
    public int getSum() {
        return N1 + N2;
    }
}
