package aula2003;

import java.util.Scanner; 
public class PrimeiroSe {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		int numero;
		
	System.out.println("Digite um valor: ");
	numero = jc.nextInt();
	
	if (numero >= 10) {
	
		System.out.println("O número é maior que 10");
	}

	else {
		System.out.println("O número é menor que 10");
	}
}
}