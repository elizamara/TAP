
public class Astromech{
	String modelo;
	Mestre mestre;
	Sensor sensor;
	Conexao conexao;  
	
	public Astromech(){}
	
	public Astromech( String modelo, Mestre mestre, Sensor sensor, Conexao conexao) {
		this.modelo= modelo;
		this.mestre= mestre;
		this.sensor = sensor;
		this.conexao = conexao;
	}
	
	public String getDescricao() {
		return("Astromech modelo "+Astromech.this.modelo+". "+ Astromech.this.mestre.getDescricao()+" "+Astromech.this.sensor.getDescricao()+" "+Astromech.this.conexao.getDescricao());
	}
	
}