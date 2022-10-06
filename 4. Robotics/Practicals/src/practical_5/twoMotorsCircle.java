package practical_5;

import ch.aplu.robotsim.*;

public class twoMotorsCircle {
	twoMotorsCircle(){
		NxtRobot robot = new NxtRobot();
		Motor A = new Motor(MotorPort.A);
		Motor B = new Motor(MotorPort.B);
		robot.addPart(A);
		robot.addPart(B);
		
		A.setSpeed(100);
		B.setSpeed(100);
		A.forward();
		B.forward();
		
		while(true) {
			Tools.delay(500);
			A.stop();
			Tools.delay(500);
			A.forward();
		}
		
	}
	public static void main(String[] args) {
		twoMotorsCircle robo = new twoMotorsCircle();
	}
}
