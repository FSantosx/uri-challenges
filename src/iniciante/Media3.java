package iniciante;

import java.util.Scanner;

public class Media3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, d, media;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		d = scan.nextDouble();
		a *= 0.2;
		b *= 0.3;
		c *= 0.4;
		d *= 0.1;
		media = (a + b + c + d) / 1;
		System.out.printf("Media = %.1f\n", media);
		if(media >= 7.0) {
			System.out.printf("Aluno aprovado");
		} else {
			if(media < 5.0) {
				System.out.printf("Aluno reprovado\n");
			} else {
				if(media >= 5.0 || media <= 6.9) {
					System.out.printf("Aluno em exame\n");
					double notaExame = scan.nextDouble();
					System.out.printf("Nota do exame: %.1f\n", notaExame);
					double resultado = (media + notaExame) / 2;
					if (resultado >= 5.0) {
						System.out.printf("Aluno aprovado\n");
						System.out.printf("Media final: %.1f\n", resultado);
					} else {
						System.out.printf("Aluno reprovado\n");
						System.out.printf("Media final: %.1f\n", resultado);
					}
				}
			}
		}
		scan.close();
	}
}
