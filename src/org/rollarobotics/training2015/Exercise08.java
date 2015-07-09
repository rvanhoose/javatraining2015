
package org.rollarobotics.training2015;

import org.rollarobotics.training2015.objectoriented.SecureAccount;

/**
 * This program demonstrates using classes to keep data private,
 * also known as encapsulation.
 * @author rob
 */

public class Exercise08 {
    public static void main(String[] args) {
        SecureAccount robAccount = new SecureAccount("Rob V", "Rolla, MO", 100.0);
        SecureAccount timAccount = new SecureAccount("Tim", "999 Cyber St.");
        
        
        addMoney(robAccount, 500);
        addMoney(robAccount, -1000);
        
        
        removeMoney(timAccount, 500);
        addMoney(timAccount, 1100);
        removeMoney(timAccount, 500);
        
    }
    
    
    private static void addMoney(SecureAccount account, double amt) {
        System.out.println(account.display());
        System.out.println(String.format("Depositing $%.2f...", amt));
        if (account.depositFunds(amt)) {
            System.out.println("Transaction succeeded");
        }
        else {
            System.out.println("Transaction failed.");
        }
        System.out.println(account.display());
        System.out.println("******* Transaction Complete **********");
    }
    private static void removeMoney(SecureAccount account, double amt) {
        System.out.println(account.display());
        System.out.println(String.format("Withdrawing $%.2f...", amt));
        if (account.withdrawFunds(amt)) {
            System.out.println("Transaction succeeded.");
        }
        else {
            System.out.println("Transaction failed.");
        }
        System.out.println(account.display());
        System.out.println("******* Transaction Complete **********");
    }
}
