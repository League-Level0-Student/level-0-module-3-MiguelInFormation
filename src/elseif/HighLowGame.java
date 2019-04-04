//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		System.out.println(random);
			
		
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			
		
			JOptionPane.showInputDialog("You will have 10 tries to guess the code! If you get it, you will be alerted. If you do not get it within 10 tries, you will be eliminated.");
String red=JOptionPane.showInputDialog("choose a number from 1 to 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int anwser=Integer.parseInt(red);
		
			// 5. if the guess is correct
		if (random==anwser) {
			// 6. Win
			JOptionPane.showMessageDialog(null, "WIN!");
			System.exit(0);
		} 
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
		if (anwser>random) {
			JOptionPane.showMessageDialog(null,"Getting hotter." );
	
		}
				// 8. Tell them it's too high
			// 9. if the guess is low
	if (anwser<random) {
			JOptionPane.showMessageDialog(null, "Ice cold.");
		}
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
		
		}
	JOptionPane.showMessageDialog(null, "You lost the chance to crack the code. Sorry.");
	System.exit(0);}

}
