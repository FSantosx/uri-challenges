package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class consumo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double y = scan.nextDouble();
		double consumo = x / y;
		DecimalFormat df = new DecimalFormat("0.###"); //jeito diferente de formatar casas decimais
		String s = df.format(consumo); //formatando conforme definido na linha acima
		System.out.printf(s + " km/l%n"); //apresentando o valor em formato de string
		// %n ainda ta nebuloso
		// segundo a documentação do java é questão de portabilidade usar o %n do que o \n
		scan.close();
	}
}
