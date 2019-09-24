package _07_skill_practice;
import java.util.Random;

import javax.swing.JOptionPane;

public class skillpractice {
	public static void main(String[] args) {
		
		skillpractice skills = new skillpractice();
		//skills.skill1();
		//skills.skill2();
		skills.skill3();
		//skills.skill4();
		//skills.skill5();
	}
	void skill1() {
		String meme = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(meme);
		JOptionPane.showMessageDialog(null, "You have "+dimes*10);
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int hi = Integer.parseInt(height);
		if(hi<36) {
			JOptionPane.showMessageDialog(null, "Eat your wheaties boi");
		}
		else {
			JOptionPane.showMessageDialog(null, "You good boi");
		}
	}
	void skill2() {
	for(int i = 0; i<30;i++ ) {
		if(i%3==0) {
		System.out.println(i);
		}
	}
	}
	void skill3() {
		int random = new Random().nextInt(21);
		System.out.println(random);
	int hi = new Random().nextInt(11);
	System.out.println(hi);
	JOptionPane.showMessageDialog(null,"The difference between the two numbers is "+(random-hi));
	}
	
}
