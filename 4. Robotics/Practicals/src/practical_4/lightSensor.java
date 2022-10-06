package practical_4;

import ch.aplu.robotsim.*;

public class lightSensor {
	static { 
        RobotContext.setStartPosition(32,495);
        RobotContext.useBackground("sprites/road.gif");
     }
	
	lightSensor(){
		LegoRobot robot = new LegoRobot();
		Gear g = new Gear();
		LightSensor ls = new LightSensor(SensorPort.S3);
		robot.addPart(g);
		robot.addPart(ls);
		g.forward();
		g.setSpeed(50);
		
		while(true){
            int v =ls.getValue();
            if(v < 100)
                g.forward();
            if(v > 350 && v<750)
                g.leftArc(0.005);
            if(v > 700)
                g.rightArc(0.005);

        }
	}
	public static void main(String[] args) {
		lightSensor robo = new lightSensor();
	}

}
