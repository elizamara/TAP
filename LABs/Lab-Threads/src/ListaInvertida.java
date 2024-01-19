import java.util.*;

public class ListaInvertida{
	private Hashtable<String, LinkedList<String>> tabela;
	
	public ListaInvertida(Hashtable<String, LinkedList<String>> tabela){
		this.setTabela(tabela);
	}

	public Hashtable<String, LinkedList<String>> getTabela() {
		return tabela;
	}

	public void setTabela(Hashtable<String, LinkedList<String>> tabela) {
		this.tabela = tabela;
	}
	
	
	public int funcaoHash(String palavra) {
		int soma=0;
		
		for(int i; i<= palavra.length(); i++) {
			soma+= palavra.charAt(i);
		}
		return soma% tabela.length();
	}
	
	public boolean insere(String palavra, String documento) {
		LinkedList<String> ListaAux = new  LinkedList<String>();
		
		 ListaAux= tabela.get(palavra);
		 
		 if(ListaAux != null) {
			 if(ListaAux.contains(documento)) {
				 return false;
			 }
			 
		 }
		 
		 return false;}
	
	
	public LinkedList<String> busca(String palavra){
		return tabela.get(palavra);
	}
}