package practical_6;

import ch.aplu.robotsim.*;
public class pathFinding {
	pathFinding(){
		 NxtRobot robot=new NxtRobot();
	     Gear gear=new Gear();
	     LightSensor ls1=new LightSensor(SensorPort.S1);
	     LightSensor ls2=new LightSensor(SensorPort.S2);
	     robot.addPart(gear);
	     robot.addPart(ls1);
	     robot.addPart(ls2);
	     gear.forward();
	     gear.setSpeed(100);
	     
	     while(true) {
	    	 int rightValue=ls1.getValue();
	    	 int leftValue=ls2.getValue();
	         if(leftValue < 10) 
	        	 gear.rightArc(0.05);
	         if(rightValue < 10)
	             gear.leftArc(0.05);
	         if(leftValue > 10 && rightValue > 10)
	             gear.forward();
	     }
	   
	}
	
	public static void main(String[] args) {
		pathFinding robot = new pathFinding();
	}
	
	static {
		NxtContext.setStartPosition(267,232);
	    NxtContext.setStartDirection(-90);
        NxtContext.useBackground("sprites/path.gif");
	}

}
