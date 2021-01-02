package iniciante;

import java.util.Scanner;

public class conversaoTempo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horas, minutos, segundos;
		int segundosEntrada = scan.nextInt();
		int segundosSec = segundosEntrada;
		horas = (segundosSec / 3600);
		segundosSec %= 3600;
		minutos = (segundosSec /60);
		segundosSec %= 60; // apos esse passo não é necessário realizar uma nova divisão
		// pois o valor restante ja é os segundos restantes
		segundos = segundosSec;
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		scan.close();
	}
}
