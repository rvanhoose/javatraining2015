package org.rollarobotics.training2015;

import java.util.HashMap;
import java.util.Map;
import org.rollarobotics.training2015.misc.Student;

/**
 * This program demonstrates the Map interface
 * @author rob
 */
public class Exercise12 {
    public static void main(String[] args) {
        
        //Lists are a very useful concept, but often we need to store
        // items and then later retrieve them in non-sequential order.
        // If we use a List for this function, we have to loop over the list
        // looking for the item we want. Potentially, we would have to
        // examine every item in the List to find the one we want. This is slow.
        
        //The solution to this is the Map< K, V> interface. A map is
        // a container that stores key/value pairs. As an example, let's
        // create some Student objects and then store them such that we can
        // Look them up by the student ID
        
        Student s1 = new Student(1, "Smith", "John");
        Student s2 = new Student(2, "Jones", "Lisa");
        
        
        //This declaration says we will store values that are of type "Student"
        // and we will use keys that are of type "Integer"
        Map<Integer,Student> idLookup = new HashMap<>();
        
        //Use put() to add students to the lookup
        idLookup.put(s1.getId(), s1);
        idLookup.put(s2.getId(), s2);
        
        //Check whether a student is found in the lookup
        boolean studentExists = idLookup.containsKey(3);
        
        //Get the student with key == 2
        Student s2get = idLookup.get(2);
        
        //Remove a student from the lookup table
        idLookup.remove(1);
        
        //If we want to be able to lookup by the last name, we can declare a
        // Map that uses Strings for the keys.
        
        Map<String, Student> nameLookup = new HashMap<>();
        
        nameLookup.put(s1.getFamilyName(), s1);
        nameLookup.put(s2.getFamilyName(), s2);
        
        
        
        
        
        
    }
}
