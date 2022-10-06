
import ch.aplu.robotsim.*;

public class moveOnYellowPath {

	public moveOnYellowPath() {
		LegoRobot robot = new LegoRobot();
		Gear g = new Gear();
		LightSensor ls = new LightSensor(SensorPort.S3);
		
		robot.addPart(g);
		robot.addPart(ls);
		
		g.setSpeed(50);
		g.forward();
		
		while(true) {
			int value = ls.getValue();
			if(value >= 1000)
				g.forward();
			if(value < 1000)
				g.left();
			if(value < 100)
				g.stop();
		}
	}
	
	static {
		RobotContext.setStartPosition(430, 230);
		RobotContext.useBackground("sprites/yellowpath.gif");
	}

	public static void main(String[] args) {
		
		moveOnYellowPath robo = new moveOnYellowPath();

	}

}
