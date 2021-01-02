package iniciante;

import java.util.Scanner;

public class salarioMaisBonus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		String nome = scan.nextLine();
		double salarioFixo = scan.nextDouble();
		double totalVendas = scan.nextDouble();
		double comissao = totalVendas * 0.15;
		salarioFixo += comissao;
		System.out.printf("TOTAL = R$ %.2f\n", salarioFixo);
		scan.close();
	}
}
