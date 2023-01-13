 package exercíciosFundamentos;

public class Inferencia {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		var num1 = 23.5;
		var num2 = 12;
		
		num1 = 12;
		
		//num2 = 23.5; 
		//	um tipo inteiro n pode ser reatribuido como double, 
		//mas um double pode ser reatribuido com inteiro	
		
		//num2 = "texto";
		//num1= "texto";
		//e nenhum destes tipos podem ser reatribuidos e inferidos novamente como texto/string
		
		var string = "inferencia de tipos";
		
		System.out.println(string);
		System.out.println(num1);
		System.out.println(num2);
		
	}
	
	

}
