import javax.swing.JOptionPane;

public class message {
	public static void main(String[] args) {

		String password = JOptionPane.showInputDialog("what is your password");
		String message = JOptionPane.showInputDialog("what is your message");

		if ( JOptionPane.showInputDialog("what is the password")
				.equals(password))
			
		{
			JOptionPane.showMessageDialog(null, message);

		}
		else

		{
			JOptionPane.showMessageDialog(null, "intruder!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

}