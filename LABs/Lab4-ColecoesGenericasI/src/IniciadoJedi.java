
public class IniciadoJedi {
	String nome, especie;
	int anoNascimento; 
	
	IniciadoJedi(){
		
	}

	IniciadoJedi(String nome, String especie, int anoNascimento){
		this.nome = nome;
		this.especie = especie; 
		this.anoNascimento = anoNascimento;
	}
	
	public String getAnoNascimento() {
		int ano = this.anoNascimento; 
		if(ano < 0) {
			ano = ano * (-1); 
		}
		
		if( this.anoNascimento < 0) {
			return(ano+"ABY");
		}
		else {
			return(ano+"DBY");
		}
		
	}
	
	public String getDescricao() {
		return(this.nome+ "( especie="+ this.especie
				+", nascimento="+getAnoNascimento()+" )");
			
	}	
	
}