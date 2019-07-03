import javax.swing.JOptionPane;

public class skillpractice {
	public static void main(String[] args) {
		
		skillpractice skills = new skillpractice();
		skills.skill1();
		//skills.skill2();
		//skills.skill3();
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
}
