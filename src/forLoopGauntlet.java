
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
			System.out.println("In " +( 2005+f)+" I was " +f);
		}
		//nested for loop- for loop inside of a for loop
		for (int y= 0; y<5; y++) {
			for(int z=0; z<5; z++) {
				System.out.print(y+z + " ");
			}
		}
		for(int j=0; j<7; j+=3) {
		for(int g = 1; g<4; g++) {
			System.out.print(g+j);
		}
		System.out.println();
		}
		for(int l=0; l<99; l+=10) {
		for(int h = 1; h<11; h++) {
			System.out.print(h+l+ " " );
		}
		System.out.println();
		}
		for(int n=0;n<7;n++) {
		for(int m= 0;m<n;m++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
	}
}
