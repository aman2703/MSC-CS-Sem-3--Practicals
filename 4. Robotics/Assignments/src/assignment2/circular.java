package assignment2;

//ASSIGNMENT 2 - CREATE A ROBOT TO PERFORM RECTANGULAR AND CIRCULAR MOTION USING GEARS.

import ch.aplu.robotsim.*;

public class circular {
    circular(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(400);
        while (true){
            g.leftArc(0.4);
        }
        
    }
    
    public static void main (String[] args) {
        circular robo = new circular();
    }
}
