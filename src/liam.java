import javax.swing.JOptionPane;


public class liam {

	
	public static void main(String[] args) {
		
		 String x =JOptionPane.showInputDialog("How tall are you");
		int i =Integer.parseInt(x);
		 if(i<4){
			 JOptionPane.showMessageDialog(null, "go away");
		
		}
		 else{
			 JOptionPane.showMessageDialog(null, "go ride the rollarcoaster");
		 }
		 }
	}

