package iniciante;

import java.util.Scanner;

public class media2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a, b, c, media;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		a *= 0.2;
		b *= 0.3;
		c *= 0.5;
		media = (a + b + c) / 1;
		System.out.printf("MEDIA = %.1f\n", media);
		scan.close();
	}
}
