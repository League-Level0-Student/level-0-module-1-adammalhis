package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarable {
public static void main(String[] args) {

	String mike = "you are awsome";
	String Bob = "Hello Idiot";
	String Christaphor = "you are good";
	String Brandon = "you are bossy";
	String TheirName=JOptionPane.showInputDialog(null,"what is your name");
	
	if (TheirName.equals("Bob")){
		JOptionPane.showMessageDialog(null, Bob);
	}	
	if (TheirName.equals("mike")){
		JOptionPane.showMessageDialog(null, mike);
	}
	if (TheirName.equals("Christaphor")){
		JOptionPane.showMessageDialog(null, Christaphor);
	}
		if (TheirName.equals("Brandon")){
			JOptionPane.showMessageDialog(null, Brandon);
		}
	
}
}
	
