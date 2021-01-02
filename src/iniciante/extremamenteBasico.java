package iniciante;

import java.util.Scanner;

public class extremamenteBasico {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, X;
		A = scan.nextInt();
		B = scan.nextInt();
		X = A + B;
		System.out.println("X = " + X); // uri não aceita printf("X = %d", X);
		scan.close();

	}
}
