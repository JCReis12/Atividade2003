package aula2003;

import java.util.Scanner;
public class ExComp {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Informe o número: ");
		n = jc.nextInt();
		
		if (n > 0) {
		System.out.println("O número é positivo");
		}
		else if (n == 0) {
		System.out.println("O número é zero");
		}
		else {
		System.out.println("O número é negativo");
		}
		

	}

}
