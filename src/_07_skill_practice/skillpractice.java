package _07_skill_practice;
import java.util.Random;

import javax.swing.JOptionPane;

public class skillpractice {
	public static void main(String[] args) {
		
		skillpractice skills = new skillpractice();
		//skills.skill1();
		//skills.skill2();
		//skills.skill3();
		//skills.skill4();
		skills.skill5();
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
	void skill4() {
		String city = JOptionPane.showInputDialog("What city do you live in?");
		if(city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "Congrats for living in America's finest city according to a famous person");
			}
		else {
			JOptionPane.showMessageDialog(null, "Now I know where your life went wrong, go fix it pls");
		}
		//String meme = JOptionPane.showInputDialog("how many cars does your family have?");
		
		//int cars = Integer.parseInt(meme);
		int cars = 2;
		if(cars==0) {
			JOptionPane.showMessageDialog(null, "Do you use public transportation?");
		}
		else if(cars>1) {
			JOptionPane.showMessageDialog(null, "My family's cars have 8 wheels between them");
		}
		else {
			JOptionPane.showMessageDialog(null, "the model is a ford expedition");
		}
		
	}
	void skill5() {
		String school = JOptionPane.showInputDialog("What is the name of your school");
		JOptionPane.showMessageDialog(null, school+" is an amazing school!");
	}
	
}
