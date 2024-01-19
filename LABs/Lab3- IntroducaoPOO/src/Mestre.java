
public class Mestre{
	String nome, afiliacao, posto;
	int anoNascimento; 
	
	public Mestre(){}
	
	public Mestre( String nome, int anoNascimento, String afiliacao, String posto) {
		this.nome = nome;
		this.afiliacao = afiliacao;
		this.posto = posto;
		this.anoNascimento = anoNascimento;
	}
	
	public int getIdade(int anoReferencia) {
		return(anoReferencia - this.anoNascimento);
	}
	
	public boolean possuiForca() {
		if(posto == "Jedi" || posto == "Stif") return(true);
		else return(false); 
	}
	
	public String getAnoNascimentoString() {
		int ano = this.anoNascimento;
		if(ano < 0) ano = ano*(-1); 
		if(this.anoNascimento <0) return(ano+"ABY");
		else return(ano+"DBY");
	}
	
	public String getDescricao() {
		return("Mestre: nome="+Mestre.this.nome+", anoNascimento="+getAnoNascimentoString()+", afiliacao=" +Mestre.this.afiliacao+", posto="+Mestre.this.posto+", possuiForca="+possuiForca()+".");
	}
	
}