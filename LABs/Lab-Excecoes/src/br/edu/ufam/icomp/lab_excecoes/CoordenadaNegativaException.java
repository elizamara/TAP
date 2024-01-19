package br.edu.ufam.icomp.lab_excecoes;

public class  CoordenadaNegativaException extends RoverCoordenadaException{
	private static final long serialVersionUID = 1L;
	
	public CoordenadaNegativaException(String s) {
		super(s);
	}
	
	public CoordenadaNegativaException() {
		this("Coordenada com valor negativo");
	}
	
}