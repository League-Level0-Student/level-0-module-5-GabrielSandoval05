package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot meme = new Robot();

		//2. Set the speed to 100
meme.setSpeed(100);
meme.move(-200);
meme.penDown();
		int colorChoice=JOptionPane.showOptionDialog(null, "choose a color!", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Teal","Magenta", "mystery :0", "Blue", "red", "black"}, 0);
		//System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
			meme.setPenColor(52, 235, 189);
		}
		if(colorChoice==1) {
			meme.setPenColor(235, 52, 213);
		}
		if(colorChoice==2) {
			meme.setRandomPenColor();
		}
		if(colorChoice==3) {
			meme.setPenColor(79, 52, 235);
		}
		if(colorChoice==4) {
			meme.setPenColor(235, 25, 5);
		}
		if(colorChoice==5) {
			meme.setPenColor(0, 0, 0);
		}
		//4. Ask the user how many polygons they want to be drawn.
		String polygons = JOptionPane.showInputDialog("How many polygons would you like?");
		int joke = Integer.parseInt(polygons);
		//5. Use the robot to draw the number of polygons the user requested.
	for(int i = 0; i<joke; i++) {
		for(int b = 0; b<4; b++) {
			meme.move(80);
			meme.turn(90);
		}
		meme.penUp();
		meme.move(90);
		meme.penDown();
		
	}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

