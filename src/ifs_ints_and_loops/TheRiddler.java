package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;
		String answer="Cool";
		String correctanswer="Yes";
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String hi=JOptionPane.showInputDialog(null,"Bob is What?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if(hi.equals(answer)) {
				JOptionPane.showMessageDialog(null,"correct");
			score=score+1;
		// 5. Otherwise, say "wrong" and tell them the answer
			else 
				JOptionPane.showMessageDialog(null,"Wrong");
			score=score-1;
		// 6. Add some more riddles
			String Me=JOptionPane.showInputDialog(null,"Am I cool?");
			if(No.equals(correct answer)) {
				JOptionPane.showMessageDialog(null,"correct");
			score=score+1;
			else 
				JOptionPane.showMessageDialog(null,"Wrong");
			score=score-1;
			
			String hi=JOptionPane.showInputDialog(null,"You are what?");
			
			
		// 2. Make a pop up to show the score.
		
	}
}
