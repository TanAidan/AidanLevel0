// Copyright Wintriss Technical Schools 2013

import java.awt.Color;
import java.awt.Container;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise implements KeyEventDispatcher
{

	private void feedTheTortoise()
	{
		// 1. use the addFood() method to add food for the tortoise
		addFood(30, 50);
	}

private void goUp()
	{
		// 2. Print “going up”. Test it out by running your code and pressing the up key
		// 3. Make the tortoise move up the screen
	}

	private void goDown()
	{
		// 4. make the tortoise move down the screen
	}
	
	private void goLeft()
	{
		// 5. make the tortoise move left
	}

	private void goRight()
	{
		// 6. make the tortoise move right
	}

	private void checkIfFoodFound() throws Exception
	{
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();
		
		// 7. Print out the variables for tortoiseLocationX and tortoiseLocationY

		// 8. if tortoise is at same location as food
			// print "chomp"
			// say “chomp” with Runtime.getRuntime().exec(“say chomp”);
			// call the eatFood() method
		
	}

private void eatFood() {
		component.setText("");
	}

	private void addFood(int x, int y)
	{
		window.setBackground(Color.blue);
		JPanel panel = new JPanel();
		panel.add(component);
		window.add(panel);
		//window.getParent().add(new Label())
//		component.setVisible(true);
//		window.add(component);
//		component.setLocation(x, y);
//		window.setVisible(true);
//		component.locate(x, y);
	}

	Container window = Tortoise.getBackgroundWindow();
JLabel component = new JLabel("*");

	public static void main(String[] args)
	{
		FeedTheTortoise feeder = new FeedTheTortoise();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise() 
{
KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				 goDown();
			try {
			checkIfFoodFound();
			} catch (Exception exception) {}
		}
		return false;
	}

}


