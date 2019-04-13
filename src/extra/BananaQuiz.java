//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		// 2. if they say no,

		// tell them they are crazy
		String bc = JOptionPane.showInputDialog("do you like bananas?");
		if (bc.equals("no")) {
			JOptionPane.showMessageDialog(null, "your crazy");
			return;
		}
		
		String bad=JOptionPane.showInputDialog("whats your favorite hobby"); 
if (bc.equals("yes")) {
 	JOptionPane.showMessageDialog(null, bad + "  is much better with bananas!");
 	
 	
}


// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes?? or “no??
		// show a pop up that says “You are bananas!??

	}

}
