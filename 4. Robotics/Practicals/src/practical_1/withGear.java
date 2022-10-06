package practical_1;

import ch.aplu.robotsim.*;

public class withGear {
    withGear(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.setSpeed(100);
        g.forward(800);
        g.left(270);
        g.forward(800);
        g.right(270);
        g.forward(500);  
    }
    
    public static void main (String[] args) {
        withGear robo = new withGear();
    }
}
