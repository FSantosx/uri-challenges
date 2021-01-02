package iniciante;

import java.util.Scanner;

public class areaCirculo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double area;
		final double n = 3.14159;
		double raio = scan.nextDouble();
		area = n * Math.pow(raio, 2);
		System.out.printf("A=%.4f\n", area); // uri aceita apenas com um \n no final
		scan.close();
	}
}
