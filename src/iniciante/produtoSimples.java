package iniciante;

import java.util.Scanner;

public class produtoSimples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, PROD;
		A = scan.nextInt();
		B = scan.nextInt();
		PROD = A * B;
		System.out.printf("PROD = " + PROD + "\n"); // para uri aceitar um \n no final foi necessário
		scan.close();
	}
}
