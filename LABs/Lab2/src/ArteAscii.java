import java.util.Scanner;

public class ArteAscii{

public static void main(String argv[]) {
		
		Scanner numero=  new Scanner(System.in);
		
		int n = numero.nextInt();
		
		int a = n ;
		int iterador = n;
		while(iterador > 0 ) {
			while(a >0) {
				System.out.print("*");
				a = a - 1;
			}
			System.out.print('\n');
			iterador = iterador - 1; 
			a = iterador; 
		}
		iterador =1 ;
		while(iterador < n+1) {
			while(iterador != a) {
				System.out.print("*");
				a = a+1;
			}
			System.out.print('\n');
			a = 0;
			iterador = iterador + 1; 
			

		}
		numero.close();

		}
}
