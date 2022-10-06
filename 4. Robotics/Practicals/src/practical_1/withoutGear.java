package practical_1;

import ch.aplu.robotsim.*;

public class withoutGear {
    withoutGear(){
        TurtleRobot robot = new TurtleRobot();
        robot.forward(200);
        robot.left(90);
        robot.forward(200);
        robot.left(90);
        robot.forward(200);
        
    }
    
    public static void main (String[] args) {
        withoutGear robo = new withoutGear();
    }
}
