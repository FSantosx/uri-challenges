package iniciante;

import java.util.Scanner;

public class calculoSimples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigoPeca1, codigoPeca2, qtdePeca1, qtdePeca2;
		double valorPeca1, valorPeca2;
		codigoPeca1 = scan.nextInt();
		qtdePeca1 = scan.nextInt();
		valorPeca1 = scan.nextDouble();
		codigoPeca2 = scan.nextInt();
		qtdePeca2 = scan.nextInt();
		valorPeca2 = scan.nextDouble();
		double valor1 = qtdePeca1 * valorPeca1;
		double valor2 = qtdePeca2 * valorPeca2;
		double valorTotal = valor1 + valor2;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
		scan.close();
	}

}
