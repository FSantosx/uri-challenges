package iniciante;

import java.util.Scanner;

public class idadeEmDias {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano, mes, dia;
		int entrada = scan.nextInt();
		int valor = entrada;
		ano = (int)(valor / 365);
		valor %= 365;
		mes = (int)(valor / 30);
		valor %= 30;
		dia = valor;
		System.out.printf(ano + " ano(s)\n");
		System.out.printf(mes + " mes(es)\n");		
		System.out.printf(dia + " dia(s)\n");		
		scan.close();
	}
}
