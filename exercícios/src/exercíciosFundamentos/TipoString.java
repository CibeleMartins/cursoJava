package exercíciosFundamentos;

public class TipoString {

	
	public static void main(String[] args) {
		
		String texto = "Tipo String";
		
		System.out.println(texto.charAt(3));
//		retorna a letra que ocupa o index indicado no parametro
		System.out.println(texto.toLowerCase().startsWith("t"));
//		verifica se a string começa c/ o que foi indicado no parametro
		System.out.println(texto.toLowerCase().endsWith("t"));
//		verifica se a string termina c/ o que foi indicado no parametro
		System.out.println(texto.toLowerCase().endsWith("g"));
//		verifica se a string termina c/ o que foi indicado no parametro
		System.out.println(texto.toLowerCase().length());
//		retorna o tamanho da string
		System.out.println(texto.toLowerCase().equals("Tipo String"));
//		verifica a igualdade da string em relacao a que foi passada no parametro
		System.out.println(texto.toLowerCase().equalsIgnoreCase("Tipo String"));
//		verifica a igualdade da string em relacao a que foi passada no parametro 
//		ignorando letras maiusculas ou minusculas
		System.out.println(texto.toLowerCase().contains("tring"));
//		verifica se na string contem o que foi passado no parametro
		System.out.println(texto.toLowerCase().substring(5, 10));
//      "pega"/acessa a string entre um indice inicial e final
		
		int idade = 10;
		
		int ano = 2018;
		
		String nome = "João";
		
		System.out.printf("O %s tem %d anos e nasceu em %d.", nome, idade, ano);
	}
}
