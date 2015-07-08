package org.rollarobotics.training2015;

/**
 * This class demonstrates the use of the looping constructs in Java.
 * for, while, do
 * @author rob
 */
public class Exercise06 {
    public static void main(String[] args) {
        
        //Loops allow us to execute a block of code repeatedly
        // "for" is used when we want to execute a fixed number of times
        // The structure of a for statement looks like this:
        // for ([initialize]: [condition]: [update]) { [block] }
        
        // As an example, if we want to print a statement 5 times, we could
        // write the following:
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop print.");
        }
        //The loop control variable "i" is initialized to a value of 0. On each
        // pass through the loop Java checks to see if i is less than 5. If so,
        // the code block is executed. If not, the loop is ended. Finally the
        // update statement is executed. In this case, i is increased by one.
        // Then the process repeats until the loop exits.
        
        // The update statement can do something other than increment by 1.
        // Let's suppose we want to count to 10 by even numbers.
        
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("i = " + i);
        }
        
        // Or count down by 3's
        for (int i = 10; i >=0; i-=3) {
            System.out.println("i = " + i);
        }
        
        
        //Sometimes we want to loop for an indeterminate number of times, until
        // some condition becomes true.
        
        int aVar = 0;
        
        while (aVar < 100) {
            System.out.println("aVar = " + aVar);
            aVar += 13;
        }
        //Use "break" to get out of a loop
        int bVar = 0;
        
        //Normally this would be an infinite loop ("true" is always true)
        while (true) {
            bVar += 5;
            
            if (bVar == 100) {
                break;
            }            
        }
        
        // "do" is a slight variation of while. If we use the do statement,
        // the associated code block is executed before the while condition is
        // checked. This guarantees we will do the block at least one time.
        int cVar = 10;
        do {
            System.out.println("cVar = "+ cVar);
            cVar +=10;
        }
        while (cVar < 10);
        
    }
}
