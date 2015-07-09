package org.rollarobotics.training2015.objectoriented;

/**
 * This class encapsulates its data using private fields with getters and
 * setters. Rules are applied when the balance is updated. Constructors
 * are used to initialize the values.
 * @author rob
 */
public class SecureAccount {
    private String name;
    private String address;
    private double balance;
    
    public SecureAccount(String name, String address, double initialBalance) {
        this.name = name;
        this.address = address;
        this.balance = initialBalance;
    }
    public SecureAccount(String name, String address) {
        this(name, address, 0.0);
    }
    
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    
    public boolean depositFunds(double amount) {
        if (amount >=0) {
            balance += amount;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean withdrawFunds(double amount) {
        if (amount >= 0) {
            if (amount <= balance) {
                balance -= amount;
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public String display() {
        return String.format("%s, Current balance: $%.2f", name, balance);
    }
}
