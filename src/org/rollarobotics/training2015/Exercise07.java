package org.rollarobotics.training2015;

/**
 * This program demonstrates features of classes. Fields, methods,
 * access modifiers, and constructors
 * @author rob
 */
public class Exercise07 {
    public static void main(String[] args) {
        //Create an instance of the Exercise7 class using the constructor that
        // default to 5 times
        Exercise07 exerciseA = new Exercise07("Show it 5 times.");
        exerciseA.displayMessage();
        
        //This instance passes an argument for the number of times.
        Exercise07 exerciseB = new Exercise07("Show it 3 times.", 3);
        exerciseB.displayMessage();
        
        //Use the default constructor and set values using setter or assignment
        Exercise07 exerciseC = new Exercise07();
        exerciseC.setMsg("Show it 2 times.");
        exerciseC.times = 2;
        exerciseC.displayMessage();
    }
    
    //This field is only visible from within the Exercise7 class
    private String msg; 
    
    //This fiels is visible everywhere
    public int times = 0;
    
    //This constructor takes no arguments. If you don't explicitly write
    // a constructor, then this default one will exist.
    public Exercise07() {
        msg = "default message";
        times = 5;
    }
    
    //This constructor takes two arguments: a message and how many times to
    // print it.
    public Exercise07(String message, int times) {
        this();
        msg = message;
        this.times = times;
        
    }
    //This constructor calls another constructor on the same class
    public Exercise07(String message) {
        this(message, 5);
    }
    
    //This method is visible only to the class
    private String getTextToDisplay() {
        return msg;
    }
    
    
    //This method is visible to the world
    public void displayMessage() {
        for (int i = 0; i< times; i++) {
            System.out.println(getTextToDisplay());
        }
    }
    
    //This is a "getter"
    public String getMsg() {
        return msg;
    }
    //This is a "setter"
    public void setMsg(String msg) {
        
        //Using the keyword "this" disambiguates between the field "msg"
        // and the method argument "msg"
        this.msg = msg;
    }
}
