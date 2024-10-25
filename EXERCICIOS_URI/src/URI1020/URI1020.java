package URI1020;

import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, ano, mes, dia, resto;
		
		N = sc.nextInt();
		
		ano = N / 365;
		System.out.println(ano + " ano(s)");
		resto = N % 365;
		
		mes = resto / 30;
		System.out.println(mes + " mes(es)");
		
		
				
		dia = resto % 30;
		System.out.println(dia + " dia(s)");
		
		
		
		sc.close();
		
		
	}

}
