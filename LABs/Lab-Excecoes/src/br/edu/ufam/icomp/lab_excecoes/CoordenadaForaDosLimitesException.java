package br.edu.ufam.icomp.lab_excecoes;

public class  CoordenadaForaDosLimitesException extends RoverCoordenadaException{
	private static final long serialVersionUID = 1L;
	
	public CoordenadaForaDosLimitesException(String s) {
		super(s);
	}
	
	public CoordenadaForaDosLimitesException() {
		this("Coordenada com valores fora dos limites");
	}
	
}