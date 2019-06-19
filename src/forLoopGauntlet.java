
public class forLoopGauntlet {
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
		for(int a=0;a<100;a++) {
			System.out.println(100-a);
		}
		for(int b = 0;b<100;b++ ) {
			if(b%2==0) {
				System.out.println(b);
			}
		}
	}
}
