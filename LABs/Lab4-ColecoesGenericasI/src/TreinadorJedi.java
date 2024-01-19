
public class TreinadorJedi {
	String titulacao; 
	String nome; 
	
	TreinadorJedi(){}
	
	TreinadorJedi( String titulacao, String nome){
		this.titulacao = titulacao;
		this.nome = nome; 
	}
	
	
	public String getDescricao() {
		return(this.titulacao+" "+this.nome );
	}
	
}