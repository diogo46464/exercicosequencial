package exercios_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double area = 4;
		double R = sc.nextDouble();
		double A = pi * R * R;
		
		System.out.printf("A =%.4f%n", A);
		
		sc.close();
		
		
		
		
		
		

	}

}
