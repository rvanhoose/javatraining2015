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
public class DerivedClass9 extends BaseClass9 {

    public DerivedClass9(int num1, int num2) {
        super(num1, num2);
    }
    
    public int getMultiple() {
        return N1 * N2;
    }
}
