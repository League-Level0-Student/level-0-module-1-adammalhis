package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Seceretmessagebox {
public static void main(String[] args) {
	
	
	
	String password="randomnumbers";
	String TheMessage=JOptionPane.showInputDialog(null,"type in a seceret message");
	String hi = JOptionPane.showInputDialog(null,"you can see the seceret message if you guess the password");
	if(hi.equals(password)) {
	JOptionPane.showMessageDialog(null,TheMessage);}
	else
	JOptionPane.showMessageDialog(null,"INTRUTER!!!!!!!!!!!");

}
}

