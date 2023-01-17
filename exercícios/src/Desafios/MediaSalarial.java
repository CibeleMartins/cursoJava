package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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
		
		
		List<Double> salarios = Arrays.asList(Double.parseDouble(salario1.replace(",", ".")), Double.parseDouble(salario2.replace(",", ".")), Double.parseDouble(salario3.replace(",", ".")));
		
	
		System.out.println(salarios);
		
		Double somaSalarios = salarios.stream().reduce((double) 0, (subtotal, element) -> subtotal + element);
		
		Double mediaSalarial = somaSalarios / salarios.size();
		
		System.out.printf("A média salarial é: R$ %.2f ", mediaSalarial);
		
		entrada.close();
		
	}
}
