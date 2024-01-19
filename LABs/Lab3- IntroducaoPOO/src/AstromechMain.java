
public class AstromechMain{
	
	public static void main(String arg[]) {
		
		Mestre m2 = new Mestre("Kanan Jarrus",-33, "Jedi Oder", "Jedi");
		Sensor s = new Sensor("Azul", 512.0, 60);
		Conexao c = new Conexao("Computer probe", 1, 2048);
		Astromech a =  new Astromech("C1-10P", m2, s, c);
		
		System.out.println(a.getDescricao());
	}
	
}