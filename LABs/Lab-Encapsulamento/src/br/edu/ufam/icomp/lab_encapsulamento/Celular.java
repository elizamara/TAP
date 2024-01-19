package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.Random;
public class Celular implements Localizavel{
	private int codPais, codArea, numero ;
	
	public Celular(int codPais, int codArea, int numero) {
		setCodPais(codPais);
		setCodArea(codArea);
		setNumero(numero);
	}
	
	public final void setCodPais(int codPais) {
		if( codPais >= 1 && codPais <= 1999 ) {
			this.codPais = codPais; 
		}
		else {
			this.codPais = -1; 
		}
	}
	
	public int getCodPais() {
		return codPais; 
	}
	
	
	public final void setCodArea(int codArea) {
		if( codArea >= 10 && codArea <= 99 ) {
			this.codArea = codArea; 
		}
		else {
			this.codArea = -1; 
		}
	}
	
	public int getCodArea() {
		return codArea; 
	}
	
	public final void setNumero(int numero) {
		if( numero >= 10000000 && numero <= 999999999) {
			this.numero = numero; 
		}
		else {
			this.numero= -1; 
		}
	}
	
	public int getNumero() {
		return numero; 
	}
	
	public Posicao getPosicao(){
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
		return 50.0;
	}
}