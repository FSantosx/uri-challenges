package iniciante;

import java.util.Scanner;

public class salario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, horat;
		double salario, valorh;
		numero = scan.nextInt();
		horat = scan.nextInt();
		valorh = scan.nextDouble();
		salario = horat * valorh;
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numero, salario); // necessário 1 \n a cada apresentação,
																				// um para o numero e outro para o
																				// salario
		scan.close();
	}
}
