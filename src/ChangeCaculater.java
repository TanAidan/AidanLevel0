// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCaculater {

	public static void main(String[] args) {

	
		String i= JOptionPane.showInputDialog("how many nickels do you have");
		
   int nickelInt=Integer.parseInt(i);
		
   String p= JOptionPane.showInputDialog("how many dimes do you have");
   int dimeInt=Integer.parseInt(p);
		
   String q= JOptionPane.showInputDialog("how many quarters do you have");
   int quarterInt=Integer.parseInt(q);
		// Calculate how much money the user has and save it in a variable called "totalMoney"
int o= nickelInt*5+dimeInt*10+quarterInt*25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, o/100);
	}
}
