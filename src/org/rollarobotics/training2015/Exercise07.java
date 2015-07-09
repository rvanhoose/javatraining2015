package org.rollarobotics.training2015;

import org.rollarobotics.training2015.objectoriented.Account;

/**
 * This program demonstrates the most basic way of creating a class.
 * @author rob
 */
public class Exercise07 {
    public static void main(String[] args) {
        //Create an instance of the Account class
        
        Account robAccount = new Account();
        robAccount.name = "Rob Van Hoose";
        robAccount.address = "Rolla, MO";
        robAccount.balance = 101.52;
        
        //Create another instance for some other person
        Account johnAccount = new Account();
        johnAccount.name = "John Doe";
        johnAccount.address = "123 Fake Street";
        johnAccount.balance = 5214.10;
        
        
    }
    
    
}
