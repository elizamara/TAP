package br.edu.ufam.icomp.lab_excecoes;
public class RoverMain{
	public static void main(String arg[]) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
		
		
		Coordenada c1 = new Coordenada(5, 13, 8);
		Coordenada c2 = new Coordenada(9, 8, 7);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}