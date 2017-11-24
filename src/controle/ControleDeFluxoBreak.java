package controle;

import java.util.Scanner;

public class ControleDeFluxoBreak {
	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa para dado dos números de entrada, irá percorrer essa\n" + "faixa verificando se existem algum número divisível por 19\n");
		
		System.out.print("Digite o número inicial: ");
		x = teclado.nextInt();
		
		System.out.print("Digite o numero final: ");
		y = teclado.nextInt();
		
		for(int i = x; i< y; i++) {
			if(i % 19 == 0) {
				System.out.println("Achei um número divisivel por 19 entre x e y: " + i);
			}
		}
		teclado.close();
	}
}
