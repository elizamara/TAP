package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada{
	private int posX, posY, digito; 
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{
		int divisao = (posX+posY)%10; 
		if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();
		if( posX > 30000 || posY > 30000) throw new CoordenadaForaDosLimitesException();
		if(divisao != digito ) throw new DigitoInvalidoException();
		
		setPosX(posX);
		setPosY(posY);
		this.digito = digito;	
	}
	
	public int getPosX() {
		return posX; 
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public void setPosX(int posX) {
			this.posX = posX;
	}
	
	
	public double distancia(Coordenada coordenada) {
		double distancia, a, b;
		a = posX-coordenada.posX;
		b= posY-coordenada.posY;
		distancia = Math.pow(a, 2) + Math.pow(b, 2);
		distancia = Math.sqrt(distancia);
		return distancia;
		
	}
	
	public String toString() {
		return(getPosX()+", "+ getPosY()); 
	}
	
}