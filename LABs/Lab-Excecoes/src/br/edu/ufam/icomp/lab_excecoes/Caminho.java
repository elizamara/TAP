package br.edu.ufam.icomp.lab_excecoes;

public class Caminho{
	private  Coordenada[] caminho;
	private int tamanho; 
	
	public Caminho( int maxTam) {
		caminho = new Coordenada[maxTam];
		tamanho = 0; 
	}

	public int tamanho() {
		return tamanho;
	}

	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
		if(tamanho == caminho.length) throw new TamanhoMaximoExcedidoException();
		if(tamanho>0 && coordenada.distancia(caminho[tamanho-1]) > 15) throw new DistanciaEntrePontosExcedidaException();
		
		caminho[tamanho] = coordenada; 
		tamanho++; 
	}
	
	public void reset() {
		for(int i=0; i<tamanho; i++) {
			caminho[i] = null; 
		}
	}
	
	public String toString() {
		StringBuilder ts = new StringBuilder();
		ts.append("Dados do caminho:\n");
		ts.append("- Quantidade de pontos: ").append(tamanho).append("\n");
		ts.append("- Pontos:\n");
		for(int i=0; i<tamanho; i++) {
			if(caminho[i]!= null) {
				ts.append("->").append(caminho[i].toString());
			}
		}	
		return ts.toString();
	}
}