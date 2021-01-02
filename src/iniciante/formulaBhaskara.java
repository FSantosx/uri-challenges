package iniciante;

import java.util.Scanner;

public class formulaBhaskara {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double delta = Math.pow(B, 2) - 4 * A * C;
		if(delta < 0 || A == 0) {
			System.out.println("impossivel calcular");
		} else {
			double resultado1 = ((-B + Math.sqrt(delta)) / (A * 2));
			double resultado2 = ((-B - Math.sqrt(delta)) / (A * 2));
			System.out.printf("R1 = %.5f\n", resultado1);
			System.out.printf("R2 = %.5f\n", resultado2);
		}
		scan.close();
	}
}
