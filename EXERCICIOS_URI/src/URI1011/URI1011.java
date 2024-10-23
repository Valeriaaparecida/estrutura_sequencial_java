package URI1011;

import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, volume, R3, pi;
		
		raio = sc.nextDouble();
		R3 = Math.pow(raio, 3);
		pi = 3.14159;
		
		volume = (4.0/3) * pi * R3;
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}

}
