package iniciante;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double pi = 3.14159;
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();;
		double triangulo = A * C / 2; // base * altura divido por 2
		double circulo = pi * Math.pow(C, 2);
		double trapezio = (A + B) / 2 * C;
		double quadrado = Math.pow(B, 2); // lado ao quadrado
		double retangulo = A * B;
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		scan.close();
	}
}
