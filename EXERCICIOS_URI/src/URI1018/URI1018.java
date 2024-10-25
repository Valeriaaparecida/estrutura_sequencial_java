package URI1018;

import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N,cem,cinquenta,vinte,dez,cinco,dois,um,resto,resto1,resto2,resto3,resto4,resto5, resto6;
		
		N = sc.nextInt();
		
		cem = N /100;  
		resto = N % 100;  
		
		cinquenta = resto / 50; 
		resto1 = resto % 50; 
		
		vinte = resto1 /20;
		resto2 = resto1 % 20;
		
		dez = resto2 / 10;
		resto3 = resto2 % 10;
		
		cinco = resto3 / 5;
		resto4 = resto3 % 5;
		
		dois = resto4 / 2;
		resto5 = resto4 % 2;
		
		um = resto5 / 1;
		resto6 = resto5 % 1;
		
		
		System.out.println(N);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");
		
		sc.close();

	}

}
