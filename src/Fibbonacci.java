
public class Fibbonacci {
	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21,34,55,89
		int first = 5;
		int second = 8;
		int third = 0;
		for(int i = 0; i < 5; i++) {
		third = first + second;
		first = second;
		second = third;
		System.out.println(second);
		}
	}
}
