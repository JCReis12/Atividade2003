package aula2003;

import java.util.Scanner;
public class media {

	public static void main (String[] args) {
	
		Scanner jc = new Scanner(System.in);
		double n1,n2,n3,n4,m;
		
		System.out.print("Informe sua primeira nota: ");
		n1 = jc.nextDouble();
		
		System.out.print("Informe sua primeira nota: ");
		n2 = jc.nextDouble();
		
		System.out.print("Informe sua primeira nota: ");
		n3 = jc.nextDouble();
		
		System.out.print("Informe sua primeira nota: ");
		n4 = jc.nextDouble();
		
		m = (n1+n2+n3+n4)/4;
		
		System.out.print("Sua média de notas é: "+m);
		
		
		
		if (m >= 7) {
			System.out.println(", você está aprovado!");
		}
		
		else { 
			System.out.println(", você está reprovado");
		}
  }
}