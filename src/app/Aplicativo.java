package app;

import entidade.Telefone;
import entidade.Cliente;
import java.util.Scanner;

public class Aplicativo {
	public static  void main(String[] args) {
		
		
		Cliente classe = new Cliente();
		Telefone f = new Telefone();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o ID: ");
		classe.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o nome: ");
		classe.setNome(scan.nextLine());
		System.out.print("Informe a idade: ");
		classe.setIdade(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Informe o ID do Telefone: ");
		f.setId(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Informe o numero Telefone: ");
		f.setNumero(scan.nextLine());
		
		scan.close();
		
		System.out.println(classe.getId());
		System.out.println(classe.getNome());
		System.out.println(classe.getIdade());
		System.out.println(f.getId());
		System.out.println(f.getNumero());
	}
}
