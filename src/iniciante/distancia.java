package iniciante;

import java.util.Scanner;

public class distancia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int distancia = scan.nextInt();
		int minutos = distancia * 2;
		System.out.printf(minutos + " minutos\n");
		scan.close();
	}
}
