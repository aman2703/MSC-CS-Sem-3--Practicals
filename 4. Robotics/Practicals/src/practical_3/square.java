package practical_3;

import ch.aplu.robotsim.*;

public class square{
	square(){
		NxtRobot robot = new NxtRobot();
		Gear g = new Gear();
		robot.addPart(g);
		g.setSpeed(100);
		while(true) {
			g.forward(1000);
			g.left(270);
		}
	}
	public static void main(String[] args) {
		square robo = new square();
	}
}
