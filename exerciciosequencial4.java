package exercios_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    int numero;
		double h;
		double valor,salario;
		numero = sc.nextInt();
		h = sc.nextDouble();
		valor = sc.nextDouble();
		
	  salario = h*valor;
	  System.out.println("NUMBER ="+numero);
	  System.out.println();
	  System.out.printf("SALARY = U$ %.2f%n", salario);  
	  
	  
	  sc.close();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
	
}
