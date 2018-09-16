package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String therebirthday=JOptionPane.showInputDialog(null,"when is your birthday?");
	if(therebirthday.equals("09/16")) {
		JOptionPane.showMessageDialog(null,"happy birthday");
}
	else {
		JOptionPane.showMessageDialog(null, "very merry unbirthday");
}
}
}