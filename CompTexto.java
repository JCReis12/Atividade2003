package aula2003;

import java.util.Scanner;
public class CompTexto {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		String p1, p2;
		
		System.out.println("Informe a primeira palavra: ");
		p1 = jc.nextLine();
		
		System.out.println("Informe a segunda palavra: ");
		p2 = jc.nextLine();
		
		if (p1.equals(p2)) {
			System.out.println("As palavras são iguais");
		}
		else {
			System.out.println("As palavras são diferentes");
		}
	}

}
