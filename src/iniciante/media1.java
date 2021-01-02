package iniciante;

import java.util.Scanner;

public class media1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, media;
		a = scan.nextDouble();
		b = scan.nextDouble();
		a *= 0.35;
		b *= 0.75;
		media = (a + b) / 1.1;
		System.out.printf("MEDIA = %.5f\n", media);
		scan.close();
	}
}
