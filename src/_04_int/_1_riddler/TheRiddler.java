package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1 = JOptionPane.showInputDialog("Brothers and sisters I have none but this man's father is my father's son.\r\n"
		+ "Who is the man?");
String riddle1answer = "the man is my son.";
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle1.equals(riddle1answer)) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer was " + riddle1answer);
}
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog(" What tastes better than it smells? ");
String riddle2answer = "tongue";
if (riddle2.equals(riddle2answer)) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer was " + riddle2answer);
}
String riddle3 = JOptionPane.showInputDialog("What has an eye but can not see?");
String riddle3answer = "needle";
if (riddle3.equals(riddle3answer)) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer was " + riddle3answer);
}
String riddle4 = JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
String riddle4answer="human";
if (riddle4.equals(riddle4answer)) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer was " + riddle4answer);
}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Total Score:" + score);
	}
}

