
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
		for(int c = 0;c<100;c++) {
			if(c%2==0) {
				
			}
			else {
				System.out.println(c);
			}
		}
		for(int d = 0; d<500; d++) {
			if(d%2==0) {
				System.out.println(+d+" is even");
			}
			else {
				System.out.println(+d+" is odd");
			}
		}
		for(int e = 0; e<112; e++) {
			System.out.println(7*e);
		}
		for(int f = 0; f<15; f++) {
			System.out.println("In" +( 2005+f)+" I was " +f);
		}
		
	}
}
