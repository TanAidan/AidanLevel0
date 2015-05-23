 
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/**
 * Note: You will need the latest version of the TKP jar:
 * http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar
 **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.move(5);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
		Tortoise.move(-5);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		Tortoise.setAngle(270);
		Tortoise.move(5);
		Tortoise.setAngle(0);
	}

	private void goRight() {
		// 4. make the tortoise move right
		Tortoise.setAngle(90);
		Tortoise.move(5);
		Tortoise.setAngle(0);
	}

	private void checkLocation() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and
		// tortoiseLocationY
		System.out.println(tortoiseLocationX);
		System.out.println(tortoiseLocationY);
		// 6. If tortoise is at same location as the little girl,
		// make a pop-up tell the Tortoise where to go next
		
		if (tortoiseLocationX == 400 && tortoiseLocationY == 365) {
			JOptionPane.showMessageDialog(null, "E");
JOptionPane.showMessageDialog(null,"go to the bright green thing with a tail");
		}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		

		if (tortoiseLocationX == 505 && tortoiseLocationY == 155) {
			JOptionPane.showMessageDialog(null, "S");
JOptionPane.showMessageDialog(null,"go to the guy with the cape dancing on the table");
		}
		

		if (tortoiseLocationX == 125 && tortoiseLocationY == 175) {
			JOptionPane.showMessageDialog(null, "C");
JOptionPane.showMessageDialog(null,"go to the princess with the rainbow hair");
		}
		

		if (tortoiseLocationX == 165 && tortoiseLocationY == 255) {
			JOptionPane.showMessageDialog(null, "A");
JOptionPane.showMessageDialog(null,"go to the small girl with the horns sitting on the table");
		}
		

		if (tortoiseLocationX == 280 && tortoiseLocationY == 360) {
			JOptionPane.showMessageDialog(null, "P");
JOptionPane.showMessageDialog(null,"go to the purple cat on the right side");
		}
		

		if (tortoiseLocationX == 585 && tortoiseLocationY == 305) {
			JOptionPane.showMessageDialog(null, "E");
JOptionPane.showMessageDialog(null, "go to the middle of the door");
		}
		if ( tortoiseLocationY == 45) {
			
			String password = JOptionPane.showInputDialog("type the pasword");
			

		
		if(password.equals("ESCAPE"))
		{
			JOptionPane.showMessageDialog(null, "You saved lives!!!");
			
		}
		}
	}

	private void go() {
		// Tortoise.show();
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(this);
		Paintable backgroundImage = new ImageBackground(
				"file:/Users/aidantan/Pictures/GKND_cafeteria_final_by_whatsthesitch.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "QUICK!!!. Each of the students knows a letter. Find the students by moving around. Then scramble the letters and enter the password in the door before the ship explodes.  ");
		
		JOptionPane.showMessageDialog(null,"READY SET GO");
		JOptionPane.showMessageDialog(null,"go to the orange evvvvva");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			try {
				checkLocation();
			} catch (Exception exception) {
			}
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}
