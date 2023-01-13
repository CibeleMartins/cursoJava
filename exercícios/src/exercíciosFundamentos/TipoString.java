package exercíciosFundamentos;

public class TipoString {

	
	public static void main(String[] args) {
		
		String texto = "Tipo String";
		
		System.out.println(texto.charAt(3));
		System.out.println(texto.toLowerCase().startsWith("t"));
		System.out.println(texto.toLowerCase().endsWith("t"));
		System.out.println(texto.toLowerCase().endsWith("g"));
		System.out.println(texto.toLowerCase().length());
		System.out.println(texto.toLowerCase().equals("Tipo String"));
		System.out.println(texto.toLowerCase().equalsIgnoreCase("Tipo String"));
		System.out.println(texto.toLowerCase().contains("tring"));
		System.out.println(texto.toLowerCase().substring(5, 10));
		
		int idade = 10;
		
		int ano = 2018;
		
		String nome = "João";
		
		System.out.printf("O %s tem %d anos e nasceu em %d.", nome, idade, ano);
	}
}
