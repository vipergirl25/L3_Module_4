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

	
		new Thread(()->{
			ring1.hide();
			ring1.setSpeed(10);
			ring1.setPenColor(Color.PINK);
			ring1.penDown();
			for (int i = 0; i < 360; i++) {
				ring1.turn(1);
				ring1.move(1);
			}
		}).start();
		new Thread(()->{
			ring2.setSpeed(100);
			ring2.hide();
			ring2.turn(90);
			ring2.move(150);
			ring2.turn(90*3);
			ring2.setSpeed(10);
			ring2.setPenColor(Color.GREEN);
			ring2.penDown();
			for (int i = 0; i < 360; i++) {
				ring2.turn(1);
				ring2.move(1);
			}
		}).start();
		new Thread(()->{
			ring3.setSpeed(100);
			ring3.hide();
			ring3.turn(90);
			ring3.move(300);
			ring3.turn(90*3);
			ring3.setSpeed(10);
			ring3.setPenColor(Color.BLUE);
			ring3.penDown();

			for (int i = 0; i <360; i++) {
				ring3.turn(1);
				ring3.move(1);
			}
		}).start();
		new Thread(()->{
			ring4.hide();
			ring4.setSpeed(100);
			ring4.turn(90);
			ring4.move(125);
			ring4.penDown();
			ring4.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				ring4.turn(1);
				ring4.move(1);
			}
		}).start();
		new Thread(()->{
			ring5.penUp();
			ring5.hide();
			ring5.setSpeed(100);
			ring5.turn(90);
			ring5.move(275);
			ring5.penDown();
			ring5.setPenColor(Color.ORANGE);
			ring5.setSpeed(10);
			for (int i = 0; i < 360; i++) {
				ring5.turn(1);
				ring5.move(1);
			}
		}).start();
	
	
		
		
		
	
		

	
	
		

		
		
	

		
		
	
}
}

