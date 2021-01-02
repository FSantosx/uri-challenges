package iniciante;

import java.util.Scanner;

public class Lanche {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo = scan.nextInt();
		int qtde = scan.nextInt();
		double valor = 0;
		double resultado = 0;
		if (codigo == 1) {
			valor = 4.00;
			resultado = valor * qtde;
		} else {
			if (codigo == 2) {
				valor = 4.50;
				resultado = valor * qtde;
			} else {
				if (codigo == 3) {
					valor = 5.00;
					resultado = valor * qtde;
				} else {
					if (codigo == 4) {
						valor = 2.00;
						resultado = valor * qtde;
					} else {
						if (codigo == 5) {
							valor = 1.50;
							resultado = valor * qtde;
						}
					}
				}
			}
		}
		System.out.printf("Total: R$ %.2f\n", resultado);
		scan.close();
	}
}
