
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandyMan implements ActionListener {
	public static void main(String[] args) {
		CandyMan man = new CandyMan();
		man.hi();
	
	}
	int clickCount = 0;
	public void hi() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Candyman");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		frame.pack();
		button.addActionListener((ActionListener) this);

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

clickCount++;
if(clickCount>=5){
	
	showPictureFromTheInternet("http://3.bp.blogspot.com/-3COVCT94JFQ/U5oD5oS2VNI/AAAAAAAAI_8/JH0Spiq6VbQ/s1600/Hi-smiley.png");
}
	}

}