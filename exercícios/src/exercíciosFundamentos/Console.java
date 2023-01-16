package exercíciosFundamentos;

import java.util.Scanner;

public class Console {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
//	
		
			System.out.printf("A pessoa %s tem %d anos e o seu signo é de %s", nome, idade);
			
//			System.out.println("\n---Printando todos na mesma linha-------");
//			
//			System.out.print(nome);
//			System.out.print(idade);
//			
			entrada.close();
		
		
	}

}
