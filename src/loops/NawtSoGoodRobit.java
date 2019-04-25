package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class NawtSoGoodRobit {
	static Robot rob = new Robot();

	public static void main(String[] args) {
		for (int i = 0; i < 50000; i++) {
			rob.setRandomPenColor();
			rob.setRandomPenColor();
			rob.setRandomPenColor();
			rob.setRandomPenColor();
			rob.setRandomPenColor();
			rob.setSpeed(50000000);
			rob.setPenWidth(5);

			rob.sparkle();
			rob.penDown();
			rob.setPenWidth(5);
			rob.move(300);
			rob.turn(500);
			rob.setPenColor(Color.pink);

		}

		 
		
		rob.setPenColor(Color.pink);

	} 
}
