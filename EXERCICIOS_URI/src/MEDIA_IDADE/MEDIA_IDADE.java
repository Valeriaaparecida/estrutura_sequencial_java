package MEDIA_IDADE;

import java.util.Locale;
import java.util.Scanner;

public class MEDIA_IDADE {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade1, idade2;
		String nome1, nome2;
		
		nome1 = sc.next();
		idade1 = sc.nextInt();
		nome2 = sc.next();
		idade2 = sc.nextInt();
		
		double media = (double)(idade1 + idade2)/2;
		
		System.out.printf("A idade media de %s e %s é de %.1f anos", nome1, nome2, media);
	}

}
