package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String args[]) {
	String birthdate = JOptionPane.showInputDialog("When is your birthday?");
	if (birthdate.equals("April 24")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
	}
}
}
