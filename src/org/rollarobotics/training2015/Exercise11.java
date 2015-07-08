
package org.rollarobotics.training2015;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates the use of collections in Java
 * @author rob
 */
public class Exercise11 {
    public static void main(String[] args) {
        
        //Arrays are great, but they suffer from a tragic shortcoming...
        // Once you create an array, you cannot resize it.
        
        //The collection classes overcome this issue. Let's say I need to 
        //keep track of a list of values, but I don't know in advance how many
        //will be needed. I can create a List that will grow as I add more
        //entries.
        
        List<Integer> intList1 = new ArrayList<>();
        
        //What's going on here ?!??
        //To fully understand the collection classes we need to add a couple 
        // more concepts to our toolbox, generics and interfaces. For now, 
        // let's just say that the type (in this case Integer) between the 
        // angle brackets tells what type of variable is stored in the list. 
        // List<> is a bit like an abstract class; we can't create a List<> 
        // directly, but we can create an object of a type that is 
        // interchangable - in this case "ArrayList<>"
        
        intList1.add(100);
        intList1.add(200);
        intList1.add(300);
        intList1.add(400);
        intList1.add(500);
        intList1.add(600); //And so on...
        //We can keep adding until we run out of memory.
        
        
        //To access a member of the list, we use the get() method
        intList1.add(0); //Again, zero-based indexing
        
        //To find out the size of the list we use the size() method
        intList1.size();
        
        //And we can iterate over the list using the same idiom that we used
        // for arrays
        for(int i = 0; i< intList1.size(); i++) {
            System.out.println(intList1.get(i));
        }
        for(int value : intList1) {
            System.out.println(value);
        }
 
    }
}
