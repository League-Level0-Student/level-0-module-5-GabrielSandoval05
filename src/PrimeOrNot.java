import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("What number do you want to know about? " );
		int value = Integer.parseInt(number);
		for(int i=2; i < value ; i++) {
			//modulo gives you the remainder from division of two numbers
		if(value % i == 0 ) {
			System.out.println("This isn't a prime number :(");
			System.exit(0);
		}
		System.out.println("Prime!");
		
	}

}
}
