import java.util.Scanner;
public class AngryBirds{
	
	public static void main(String argv[]) {
		
		Scanner cedula =  new Scanner(System.in);
		
		float v0 = cedula.nextFloat();
		double alfa = cedula.nextDouble();
		float distancia = cedula.nextFloat();
		
		alfa = Math.toRadians(alfa);
		
		v0 = v0*v0;
		alfa = 2*alfa; 
		
		double R = v0* (Math.sin(alfa))/ 9.8 ;
		
		double diferenca = R-distancia;
		
		if(diferenca <= 0.1 && diferenca >0) System.out.print(1);
		else System.out.print(0);
		 
		cedula.close();


		}
}
