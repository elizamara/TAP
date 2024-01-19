package br.edu.ufam.icomp.lab_encapsulamento;


public class GISMain{
	@SuppressWarnings("null")
	public static void main(String arg[]) {
		Localizavel vetorLocalizaveis[] = new Localizavel[2];
		
		
		Posicao p1 = new Posicao(40.653924, -112.564994, 1463.0);
		Celular c1 = new Celular(55, 92, 930154926);
		Carro c2 = new Carro("delta");
		CarroLuxuoso c3 = new CarroLuxuoso("celta");
		
 
		vetorLocalizaveis[0] = c2; 
		vetorLocalizaveis[1] = c3; 
		

		
		for(int i = 0; i< vetorLocalizaveis.length; i ++) {
			 System.out.println(vetorLocalizaveis[i].getPosicao());
		}
		
//		System.out.println(c1.getCodArea());
//		System.out.println(c1.getCodPais());
//		System.out.println(c1.getNumero());
	}
}