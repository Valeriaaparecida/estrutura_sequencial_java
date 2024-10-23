package URI1010;

import java.util.Locale;
import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quant, codigo2, quant2;
		double valorUnit, valorUnit2, total;
		
		
		codigo = sc.nextInt();
		quant = sc.nextInt();
		valorUnit = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		quant2 = sc.nextInt();
		valorUnit2 = sc.nextDouble();
		
		total = (quant * valorUnit) + (quant2 * valorUnit2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		sc.close();
		
	}

}
