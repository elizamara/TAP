public class Sensor{
	String cor;
	double resolucao;
	int framesPorSegundo;
	
	public Sensor(){}
	
	public Sensor(String cor, double resolucao, int framesPorSegundo) {
		this.cor= cor;
		this.framesPorSegundo = framesPorSegundo;
		this.resolucao = resolucao;
	}
	
	public double getMPixelsPorSegundo() {
		return(this.framesPorSegundo* this.resolucao);
	}
	
	public String getDescricao() {
		return("Sensor: cor="+Sensor.this.cor+", resolucao="+Sensor.this.resolucao+"Mp, framesPorSegundo="+Sensor.this.framesPorSegundo+"fps, mPixelsPorSegundo="+getMPixelsPorSegundo()+"Mpps.");
	}
}