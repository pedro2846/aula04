package exemplos;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		/* Declaração de variaveis*/
		int x = 27;
		Scanner scan= new Scanner(System.in);
		
		/* Declarando os vetores */
		
		// Definindo vetor vazio
		int vet_numeros[] = new int[5];
		
		// Definindo vetor com valores
		String vet_palavras[] = {"Java", "Senac", "Rio"};
		boolean[] vet_booleano = {true, true, true, false};
		
		/* Impressão de valores */
		
		// for
		for(int i = 0; i< vet_palavras.length; i++) {
			System.out.println(vet_palavras[i]);
		}
		//foreach
		for(boolean b: vet_booleano ) {
			System.out.println(b);
		}
		
		/*Atribuindo valores*/
		vet_numeros[0] = 30;
		vet_numeros[1] = x;
		vet_numeros[2] = scan.nextInt();
		
		
		for(int n : vet_numeros) {
			System.out.println(n);
		}
		
		int i = 0; 
		while(i< vet_numeros.length) {
			System.out.print("Informe o " + (i+1) + "º: ");
			vet_numeros[i] = scan.nextInt();
			i++;
		}
		
		scan.close();
	}
}
