import javax.swing.JOptionPane;


public class ss {

	
	

		public static void main(String[] args) {

				// 1. Save the superpower for each person in a variable
			String mingda = "awesomeness";
			String Ryan = "soldering";
	        String liam ="shortness";
				// 2. Ask the user to enter a name. Store their answer in a variable.
String X = JOptionPane.showInputDialog("type in a name");
				// 3. Show the superpower in a pop-up, depending on the name entered. 
if (X.equals ("mingda")) {
	JOptionPane.showMessageDialog(null, mingda);
}
else if(X.equals("ryan"))
{
	
	 JOptionPane.showMessageDialog(null, Ryan);
	
}
else if(X.equals("liam"))
{
	
	 JOptionPane.showMessageDialog(null, liam);
	
}


			}
		}


	

