package URI1005;

import java.util.Locale;
import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A, B;
		double MEDIA;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		
		MEDIA = ((A * 3.5) + (B * 7.5))/11;
		
		System.out.printf("MEDIA = %.5f%n" , MEDIA);
		
		sc.close();
		
	}

}
