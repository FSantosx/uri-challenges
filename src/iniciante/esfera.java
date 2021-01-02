package iniciante;

import java.util.Scanner;

public class esfera {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double pi = 3.14159;
		double raio = scan.nextDouble();
		double volume = (4/3.0) * pi * Math.pow(raio, 3);
		System.out.printf("VOLUME = %.3f\n", volume); 
		scan.close();
	}
}
