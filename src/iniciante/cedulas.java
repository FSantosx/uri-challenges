package iniciante;

import java.util.Scanner;

public class cedulas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int notasCem, notasCinquenta, notasVinte, notasDez, notasCinco, notasDois, notasUm;
		int valorentrada = (int) scan.nextFloat();
		float valor = valorentrada;
		notasCem = (int) (valor / 100);
		valor %= 100;
		notasCinquenta = (int) (valor / 50);
		valor %= 50;
		notasVinte = (int) (valor / 20);
		valor %= 20;
		notasDez = (int) (valor / 10);
		valor %= 10;
		notasCinco = (int) (valor / 5);
		valor %= 5;
		notasDois = (int) (valor / 2);
		valor %= 2;
		notasUm = (int) (valor / 1);
		valor %= 1;
		System.out.println(valorentrada);
		System.out.printf("%d nota(s) de R$ 100,00\n", notasCem);
		System.out.printf("%d nota(s) de R$ 50,00\n", notasCinquenta);
		System.out.printf("%d nota(s) de R$ 20,00\n", notasVinte);
		System.out.printf("%d nota(s) de R$ 10,00\n", notasDez);
		System.out.printf("%d nota(s) de R$ 5,00\n", notasCinco);
		System.out.printf("%d nota(s) de R$ 2,00\n", notasDois);
		System.out.printf("%d nota(s) de R$ 1,00\n", notasUm);
		scan.close();
	}
}
