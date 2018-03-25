package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot ring1 = new Robot(); //olympicsarepointless
		Robot ring2 = new Robot();
		Robot ring3 = new Robot();
		Robot ring4 = new Robot();
		Robot ring5 = new Robot();
		
		ring1.setSpeed(10);
		ring1.setPenColor(Color.PINK);
		ring1.penDown();
		
		ring2.turn(90);
		ring2.move(50);
		ring2.setSpeed(10);
		ring2.setPenColor(Color.GREEN);
		ring2.penDown();
		
		
		for (int i = 0; i < 360; i++) {
			ring1.turn(1);
			ring1.move(1);
		}
		for (int i = 0; i < 360; i++) {
			ring2.turn(1);
			ring2.move(1);
		}
		
		//new Thread(()->{ring1.turn(0);)
	}
	
}

