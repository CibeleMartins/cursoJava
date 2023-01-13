package exercíciosFundamentos;

public class TiposPrimitivos {
		
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//tipos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 3_134_845_222L; 
		//L define um literal long
		
		//tipos numéricos reais
		//float salario = 0.00;
		float salario = 0.00F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeferias = false; //true
		
		//	tipo caractere
		
		String status = "Ativo";
		char statusFunc = 'A'; 
		
//		Dias de empresa
		
		System.out.println("O funcionário de id: " + id + " tem " + anosDeEmpresa * 365 + " anos de empresa.");
		
//		Números viagem
		
		System.out.println("E já realizou " + numeroDeVoos / 2 + " voos.");

		
	}
}
