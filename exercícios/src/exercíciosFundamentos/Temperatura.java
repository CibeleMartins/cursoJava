package exercíciosFundamentos;

public class Temperatura {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		double farenheit = 86;
		
		
		final int DIFERENCA = 32;
		final double MULTIPLICADOR = 5.0/9;
		
		double celsius = farenheit - DIFERENCA;
		 
		 celsius = celsius * MULTIPLICADOR;
		 
		 System.out.println(celsius + "ºC");
	}

}
