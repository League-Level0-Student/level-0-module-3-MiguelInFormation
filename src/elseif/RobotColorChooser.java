//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot(); 
		bob.penDown();
		//3. Ask the user what color they would like the robot to draw
		String name= JOptionPane.showInputDialog("what color do you want the triangle to be?");
		//5. Use an if/else statement to set the pen color that the user requested
if (name.equals("yellow")) {
bob.setPenColor(Color.YELLOW);	
}

else if (name.equals("blue")) {
bob.setPenColor(Color.BLUE);



}



else {
	bob.setRandomPenColor();
	bob.setRandomPenColor();
	bob.setRandomPenColor();
	bob.setRandomPenColor();
	bob.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color
        
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(50);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
        for (int i = 0; i < 49; i++) {
			bob.move(100);
        bob.turn(360/3);	
        	
        	
        	
		}

	}
}
