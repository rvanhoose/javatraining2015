package org.rollarobotics.training2015;

import java.util.ArrayList;
import java.util.List;
import org.rollarobotics.training2015.interfaces.IRobot;
import org.rollarobotics.training2015.interfaces.Part;
import org.rollarobotics.training2015.interfaces.RollaRobot;
import org.rollarobotics.training2015.interfaces.WeldingRobot;

/**
 * This program demonstrates the concept of interfaces
 * @author rob
 */
public class Exercise13 {
    public static void main(String[] args) {
        
        //Create a RollaRobot
        RollaRobot rRobot = new RollaRobot("5893");
        
        //Create a welding robot
        WeldingRobot wRobot = new WeldingRobot();

        powerUpRobot(rRobot);
        powerUpRobot(wRobot);
        
        wRobot.weld(new Part("chassis"), new Part("wheel mount"));
        
        
        //A convenient feature of interfaces is that we can
        // store objects of dissimilar types in a common list if they share
        // an interface.
        
        //Make a list of IRobot objects
        List<IRobot> robotList = new ArrayList<>();
        
        robotList.add(rRobot);
        robotList.add(wRobot);
        
        robotList.get(1).powerDown();
        
    }
    
    private static void powerUpRobot(IRobot robot) {
        //The robot argument here is of type "IRobot", so we only "see"
        // the methods that are part of that interface.
        
        robot.powerUp();
    }
}
