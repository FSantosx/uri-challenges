package iniciante;

import java.util.Scanner;
// não aceito pela URI porem, correto
public class notasEMoedas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int notasCem, notasCinquenta, notasVinte, notasDez, notasCinco, notasDois;
		double valorentrada = scan.nextDouble();
		double valor = valorentrada;
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
		int moeda1, moeda050, moeda025, moeda010, moeda005, moeda001;
		moeda1 = (int) (valor / 1.0);
		valor %= 1.0;
		moeda050 = (int) (valor / 0.50);
		valor %= 0.50;
		moeda025 = (int) (valor / 0.25);
		valor %= 0.25;
		moeda010 = (int) (valor / 0.10);
		valor %= 0.10;
		moeda005 = (int) (valor / 0.05);
		valor %= 0.05;
		moeda001 = (int) (valor / 0.01);
		valor %= 0.01;
		System.out.printf("NOTAS:\n");
		System.out.printf("%d nota(s) de R$ 100,00\n", notasCem);
		System.out.printf("%d nota(s) de R$ 50,00\n", notasCinquenta);
		System.out.printf("%d nota(s) de R$ 20,00\n", notasVinte);
		System.out.printf("%d nota(s) de R$ 10,00\n", notasDez);
		System.out.printf("%d nota(s) de R$ 5,00\n", notasCinco);
		System.out.printf("%d nota(s) de R$ 2,00\n", notasDois);
		System.out.printf("MOEDAS:\n");
		System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
		System.out.printf("%d moeda(s) de R$ 0.50\n", moeda050);
		System.out.printf("%d moeda(s) de R$ 0.25\n", moeda025);
		System.out.printf("%d moeda(s) de R$ 0.10\n", moeda010);
		System.out.printf("%d moeda(s) de R$ 0.05\n", moeda005);
		System.out.printf("%d moeda(s) de R$ 0.01\n", moeda001);
		scan.close();
	}
}
