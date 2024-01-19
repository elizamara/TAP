package br.edu.ufam.icomp.lab_excecoes;

public class  DigitoInvalidoException extends RoverCoordenadaException{
	private static final long serialVersionUID = 1L;
	
	public DigitoInvalidoException(String s) {
		super(s);
	}
	
	public DigitoInvalidoException() {
		this("Digito da coordenada inválido");
	}
	
}