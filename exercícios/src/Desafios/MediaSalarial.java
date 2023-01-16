package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaSalarial {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o salário do primeiro mes: ");
		String salario1 = entrada.nextLine();
		
		System.out.println("Digite o salário do segundo mes: ");
		String salario2 = entrada.nextLine();
		
		System.out.println("Digite o salário do terceiro mes: ");
		String salario3 = entrada.nextLine();
		
		ArrayList salarios = new ArrayList();
		
		salarios.add(salario1);
		salarios.add(salario2);
		salarios.add(salario3);
		
		
		
		System.out.println(salarios);
		entrada.close();
		
	}
}
