package iniciante;

import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor = scan.nextDouble();
		if(valor >= 0 && valor <= 25.0000) {
			System.out.println("Intervalo [0,25]");
		} else {
			if(valor >= 25.00001 && valor <= 50.000000) {
				System.out.println("Intervalo (25,50]");
			} else {
				if(valor >= 50.000000 && valor <= 75.0000000) {
					System.out.println("Intervalo (50,75]");
				} else {
					if(valor >= 75.0000000 && valor <= 100.00000000) {
						System.out.println("Intervalo (75,100]");
					} else {
						System.out.println("Fora de intervalo");
					}
				}
			}
		}
		scan.close();
	}
}
