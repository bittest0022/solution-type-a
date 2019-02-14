package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		int a=0;

			for(int i=1;i<number;i*=10) {
				int tmp=number;
				tmp/=i;
				for(int j=10;j<tmp;j+=10) {
					tmp=tmp%j;
				}
				if(tmp%3==0&&tmp>0) {
					a++;
				}
			}
			
		return a;
	}
}