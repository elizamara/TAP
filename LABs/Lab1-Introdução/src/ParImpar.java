import java.util.Scanner;
public class ParImpar{
	
	public static void main(String argv[]) {
		
		Scanner numero =  new Scanner(System.in);
		
		int n = numero.nextInt();
		
		while( n != -1) {
			if(n%2 == 0)System.out.println("PAR");
			else System.out.println("IMPAR");
			
			n = numero.nextInt();

		}
		
		numero.close();
	}
}