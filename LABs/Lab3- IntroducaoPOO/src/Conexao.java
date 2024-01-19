public class Conexao{
	String tipoPorta;
	int idProtocolo, taxaTransmissao;
	
	public Conexao(){}
	
	public Conexao(String tipoPorta,int idProtocolo, int taxaTransmissao) {
		this.idProtocolo= idProtocolo;
		this.taxaTransmissao= taxaTransmissao;
		this.tipoPorta= tipoPorta;
	}
	
	public String getProtocoloString() {
		int id = this.idProtocolo;
		
		if(id == 1) return("Rotoscope");
		if(id == 1) return("Acustico");
		if(id == 3) return("Radio");
		else return("Outros");
	}
	
	public double getTaxaMBps() {
		return(this.taxaTransmissao/1024);
	}
	
	public String getDescricao() {
		return("Conexao: tipoPorta="+Conexao.this.tipoPorta+", protocolo="+getProtocoloString()+", taxaTransmissao="+getTaxaMBps()+"MBps.");
	}
}