import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		for (int i = 1; i < 11; i++) {
		
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this
		// class
		System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
		
		
		
		if (randomNumber == 0) {
			speak("YOU...SHOULD BE THE PRESIDENT OF THE UNITED STATES...BECAUSE YOU ARE SO NICE");
		}
		if (randomNumber == 1) {
			speak("YOU ...HAVE THE MAKINGS OF A MINgDA");
		}
		if (randomNumber == 2) {
			speak("YOU...HAVE THE MOST FOLLOWERS ON instagram");
			// 4. Repeat all the code above 10 times

			// 5. Find someone to test out your program. They will like it :)
		}
		if (randomNumber == 3) {
			speak("YOU...look like a ching_chong");
		}
		if (randomNumber == 4) {
			speak("YOU...look like my mom");

		}
		}
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

	}

