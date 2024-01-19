package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
	public double raio; 
	
	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio; 	
	}
	
	public double getArea() {
		double pi = Math.PI;
		return pi*raio*raio;
	}
	
	public double getPerimetro() {
		double pi = Math.PI;
		return 2*raio*pi;
	}
	
	public String toString() {
		String posicao= super.getPosString();
		return("Círculo na "+ posicao +" com raio de "+this.raio+"cm "+
	"(área="+ getArea()+"cm2, perímetro="+ getPerimetro()+"cm)");
	}
	
}