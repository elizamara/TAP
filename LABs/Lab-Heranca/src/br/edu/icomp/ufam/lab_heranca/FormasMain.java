package br.edu.icomp.ufam.lab_heranca;

public class FormasMain{
	public static void main(String argv[]) {
		Circulo f1 = new Circulo(4,5,8);
		Retangulo f = new Retangulo(12,65,2,7);
		Quadrado q = new Quadrado(45,39,6);
		
		System.out.println(f1.toString());
		System.out.println(f.toString());
		System.out.println(q.toString());
	}
}