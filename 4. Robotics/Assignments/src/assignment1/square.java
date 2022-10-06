package assignment1;

//ASSIGNMENT 1 - SQUARE AND CIRCULAR MOTION WITHOUT USING GEAR.

import ch.aplu.robotsim.*;

public class square {
    square(){
        TurtleRobot t = new TurtleRobot();
        t.setTurtleSpeed(100);
        while (true){
            t.forward(200);
            t.left(90);
        }
    }

public static void main (String[] args) {
    square robo = new square();
}
}
