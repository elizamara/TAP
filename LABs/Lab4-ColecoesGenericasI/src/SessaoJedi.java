import java.util.*;

public class SessaoJedi {
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados;
	
	SessaoJedi(String nome, TreinadorJedi treinador){
		this.nome = nome;
		this.treinador = treinador; 
		this.iniciados = new ArrayList<IniciadoJedi>();
	}
		
	IniciadoJedi getIniciado(String nome) {	
		for(IniciadoJedi iniciadoAtual:iniciados) {
			if(iniciadoAtual.nome.equals(nome)) {
				return iniciadoAtual ;
			}
		}
		return null; 
	}
	
	void addIniciado(IniciadoJedi iniciado) {
		if(getIniciado(iniciado.nome)== null ) {
			iniciados.add(iniciado);	
		} 
	}
	
double getMediaAnoNascimento() {
		int tamanho = iniciados.size();
		double ano=0; 
		double soma = 0; 
		for(int i=0; i<tamanho; i++) {
			ano = iniciados.get(i).anoNascimento;
			//System.out.println(ano);
			soma =soma + ano;
			//System.out.println(soma);
		}
		ano = soma/tamanho;
		return ano;
		}
	
	public String getDescricao() {
		int tamanho = iniciados.size();
		StringBuilder sb =new StringBuilder("--> SESSÃO ");
		sb.append(this.nome).append(" (Treinador: ");
		sb.append(this.treinador.getDescricao()).append(") \n");
		for(int i=0; i<tamanho; i++) {
			sb.append("- Iniciado ").append(i+1).append(": ").append(iniciados.get(i).getDescricao()).append("\n");
		}
		return sb.toString();
	}
	
}
