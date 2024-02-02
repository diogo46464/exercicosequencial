package exercios_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, codigo2, numero, numero2;
		double valor1, valor2, pagar;
		
		 
		
		codigo = sc.nextInt();numero = sc.nextInt();valor1 = sc.nextDouble(); 
		
		codigo2 = sc.nextInt();numero2 = sc.nextInt();valor2 = sc.nextDouble();
		
		
		pagar = numero*valor1 + numero2 * valor2;
		
	    System.out.printf("VALOR A PAGAR:%.2f%n", pagar);
		
		
		
		
		 
		
		
		
		
		
		
		
      sc.close();
	}

}