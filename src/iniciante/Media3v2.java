package iniciante;

import java.util.Scanner;

public class Media3v2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double N1 = (scan.nextDouble() * 2) / 10;
		double N2 = (scan.nextDouble() * 3) / 10;
		double N3 = (scan.nextDouble() * 4) / 10;
		double N4 = (scan.nextDouble() * 1) / 10;
		double N5;
		double media = N1 + N2 + N3 + N4;
		if (media * 10 - Math.floor(media * 10) > 0.5001) {
			media = Math.ceil(media * 10) / 10;
		}
		else {
			media = Math.floor(media * 10) / 10;
		}
		System.out.printf("Media: %.1f\n", media);
		if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		if (media >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (media >= 5.0) {
			System.out.printf("Aluno em exame.\n");
			N5 = scan.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", N5);
			media = (media + N5) / 2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", media);
		}
		scan.close();
	}
}
