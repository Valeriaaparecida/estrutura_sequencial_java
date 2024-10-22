package URI1008;

import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NUMBER, HORASTRAB;
		double VALORHORA, SALARY;
		
		NUMBER = sc.nextInt();
		HORASTRAB = sc.nextInt();
		VALORHORA = sc.nextDouble();
		
		SALARY = HORASTRAB * VALORHORA;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);		
				
				
		sc.close();
		

	}

}
