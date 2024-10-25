package URI1013;

import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, E, F, MAIORAB, MAIOR;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		D = A - B;
		
		MAIORAB = (A + B + Math.abs(D))/2;
		E = MAIORAB;
		F = E - C;
		MAIOR = (E + C + Math.abs(F))/2;
		
		System.out.println(MAIOR + " eh o maior");
	}

}
