package GizikoCoding;

import javax.swing.*;
public class guessinggame {

	public static void main(String[] args) {
		
		int computerguess = (int)(Math.random()*100+1);
		int playernum = 0;
		int count = 1;
		
		while(playernum != computerguess) {
			String response = JOptionPane.showInputDialog(null, "Enter a guess between 1-100:", "Guessing Game", 3);
			playernum = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, ""+ determineGuess(playernum, computerguess, count));
			count++;
			
			if(count > 3) {
				JOptionPane.showMessageDialog(null, "You have guess the number incorrectly three times.");
				JOptionPane.showMessageDialog(null, "The Correct answer is: " +computerguess);
				break;
			}
		}
	}
	
	public static String determineGuess(int playernum, int computerguess, int count) {
		if(playernum <=0 || playernum >100) {
			return "Your guess is invalid " + count;
		}
		else if(playernum == computerguess) {
			return "Your guess is correct! " + count;
		}
		else if(playernum > computerguess) {
			return "Your guess is above the computer's guess. " + count;
		}
		else if(playernum < computerguess) {
			return "You have guess a number lower than the computer's guess. " + count;
		}
		else {
			return "Invalid number " + count;
		}
	}

}
