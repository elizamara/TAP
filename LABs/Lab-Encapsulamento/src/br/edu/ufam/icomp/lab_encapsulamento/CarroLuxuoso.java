package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel{
	
	public CarroLuxuoso(String placa) {
		super(placa);}
	
	
	public Posicao getPosicao() {
		Random v_aleatoria = new Random();
		double latitude, longitude, altitude;
		
		latitude = -2.960000 - (-3.160000);
		longitude=  -59.820000- (-60.120000);
		
		latitude = -3.160000 +  latitude*v_aleatoria.nextDouble();
		longitude = -60.120000+ longitude*v_aleatoria.nextDouble();
		altitude = 15.0+ ( 100.0- 15.0)*v_aleatoria.nextDouble();
		
		Posicao posicao = new Posicao(latitude, longitude, altitude); 
		return posicao;
	}

	
	public double getErroLocalizacao() {
		return 15.0;
	}
	
}