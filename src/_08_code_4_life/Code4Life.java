package _08_code_4_life;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
	
		public static void main(String[] args) {
	// 1. Ask the user how many hours they spent coding this week.
String code = JOptionPane.showInputDialog("How many hours did you spend coding this week? (it better be 100)");
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
int hours = Integer.parseInt(code);
if(hours<=2){
	JOptionPane.showMessageDialog(null, "Stop watching Youtube and code it instead pls");
}

	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja 
//int blank = rand.nextint(blank)
if(hours>=3) {
	if(hours<=5) {
		//to add two strings put "blank" "+(a+b));
		JOptionPane.showMessageDialog(null, "Are you genji and or naruto, because you are a code ninja");
	}
	
}


	

	// 4. If it is more than 5, call the method below to play the Batman theme song.
if(hours>5) {
	playBatmanTheme();
}
	}

	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}