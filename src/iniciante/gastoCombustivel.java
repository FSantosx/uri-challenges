package iniciante;

import java.util.Scanner;

public class gastoCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tempoGasto = scan.nextInt();
		int velocidadeMedia = scan.nextInt();
		double litros = tempoGasto * velocidadeMedia / 12.0;
		System.out.printf("%.3f\n", litros);
		scan.close();
	}
}
