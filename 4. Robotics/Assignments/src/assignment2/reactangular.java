package assignment2;

// ASSIGNMENT 2 - CREATE A ROBOT TO PERFORM RECTANGULAR AND CIRCULAR MOTION USING GEARS.

import ch.aplu.robotsim.*;

public class reactangular {
    reactangular(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        while (true){
            g.forward(800);
            g.left(280);
            g.forward(1500);
            g.left(280);
        }
        
    }
    
    public static void main (String[] args) {
        reactangular robo = new reactangular();
    }
}
