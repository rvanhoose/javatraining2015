
package org.rollarobotics.training2015.inheritance;

/**
 *
 * @author rob
 */
public class Dog extends Animal {
    private String name;
    private String owner;
    
    
    public Dog(String name, String owner) {
        super("dog", true);
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }
    
    public String getOwner() {
        return owner;
    }
    @Override
    public void speak() {
         System.out.println(name + " says: \"Woof\".");
    }

    @Override
    public String toString() {
        return super.toString() + " Name: " + name + ", Owner: " + owner;
    }
    
    
}
