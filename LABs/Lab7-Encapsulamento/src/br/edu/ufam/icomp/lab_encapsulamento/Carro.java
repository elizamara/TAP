package br.edu.ufam.icomp.lab_encapsulamento;

public class Carro implements Localizavel{
	protected String placa; 
	
	public Carro(String placa) {
		setPlaca(placa);
	}
		
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public Posicao getPosicao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getErroLocalizacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}