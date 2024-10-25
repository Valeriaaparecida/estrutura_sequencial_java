package URI1015;

import java.util.Locale;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double  X1, X2, Y1, Y2, A, B, distancia;
		
		X1 = sc.nextDouble();
		Y1 = sc.nextDouble();
		X2 = sc.nextDouble();
		Y2 = sc.nextDouble();
		
		A = (X2 - X1);
		B = (Y2 - Y1);
		
		
		distancia = Math.sqrt(((Math.pow(A, 2)) + (Math.pow(B, 2))));
		
		System.out.printf("%.4f%n", distancia);
		
		
		
		sc.close();

	}

}
