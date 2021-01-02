package iniciante;

import java.util.Scanner;

public class maior {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int resultado = (a + b + Math.abs(a - b)) / 2;
		resultado = (resultado + c + Math.abs(resultado - c)) / 2;
		System.out.printf("%d eh o maior\n", resultado);
		scan.close();
	}
}
