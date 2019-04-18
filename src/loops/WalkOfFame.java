//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
       
       ---
        for (int bj = 0; bj <5; bj++) {
			
        	 rob.setX(bj*200);
        for (int i = 0; i <5; i++) {
	rob.move(100);
	rob.turn(144);

}             
}
        rob.setPenWidth(30);

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}

