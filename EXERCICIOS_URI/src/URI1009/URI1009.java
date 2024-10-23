package URI1009;

import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, vendas, TOTAL;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		TOTAL = salario + (vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f", TOTAL);
		
		
		
		sc.close();
	}

}
