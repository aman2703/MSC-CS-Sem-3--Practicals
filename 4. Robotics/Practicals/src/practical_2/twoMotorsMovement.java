package practical_2;

import ch.aplu.robotsim.*;

public class twoMotorsMovement {
    twoMotorsMovement(){
        NxtRobot r = new NxtRobot();
        Motor m1 = new Motor(MotorPort.A);
        Motor m2 = new Motor(MotorPort.B);
        r.addPart(m1);
        r.addPart(m2);
        
        m1.forward();
        Tools.delay(1090);
        m2.forward();

        Tools.delay(1090);
        m1.stop();

        m2.forward();
        Tools.delay(1090);
        m1.forward();
        
        m1.stop();
        m2.stop();
    }
    
    public static void main(String args[]){
        new twoMotorsMovement();
    }
}
