package iniciante;

import java.util.Scanner;

public class diferenca {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d, diferenca;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		diferenca = (a * b - c * d);
		System.out.println("DIFERENCA = " + diferenca);
		scan.close();
	}
}
