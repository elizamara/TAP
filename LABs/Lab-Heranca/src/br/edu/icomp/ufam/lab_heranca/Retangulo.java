package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
	public double largura, altura; 
	
	public Retangulo(int posX, int posY, double largura, double altura) {
		super(posX, posY);
		this.largura= largura;
		this.altura= altura; 
	}
	
	public double getArea() {
		return largura*altura;
	}
	
	public double getPerimetro() {
		return 2*(largura+altura); 
	}
	
	public String toString() {
		String posicao = super.getPosString();
		return("Retângulo na "+ posicao+" com largura de "+this.largura+
				"cm e altura de "+this.altura+"cm (área="+getArea()+"cm2, "
				+"perímetro="+getPerimetro()+"cm)");
	}
}