package exercícios;

public class PrimeiroPrograma {
	
		
		@SuppressWarnings("unused")
		public static void main(String[] args) {
			
			System.out.println("------Primeiro programa----------");
				
			int raio = 6;
			int altura = 12;
			double pi = 3.14;
			
			double areaLateral = raio * altura;
			
			areaLateral = (2*pi) * areaLateral;
			
			System.out.println(areaLateral + " cm2");
					
			
		}
}
