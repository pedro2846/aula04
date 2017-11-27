package exemplos;


import java.util.ArrayList;
import java.util.List;
import entidades.Produto;

public class Listas {
	public static void main(String[] args) {
		
		//Primeiro contato com Collections
		
		/* Declara��o do objeto */
		Produto pr1 = new Produto();
		Produto pr2 = new Produto();
		Produto pr3 = new Produto();
		
		
		
		/* Declarando uma lista */
		List<Produto> listaCompras = new ArrayList<Produto>();
		
		pr1.setId(10L);
		pr1.setNmProduto("Arroz");
		pr1.setPreco(10.5);
		pr1.setQuantidade(5.);
		
		pr2.setId(20L);
		pr2.setNmProduto("Feij�o");
		pr2.setPreco(7.8);
		pr2.setQuantidade(2.5);
		
		pr3.setId(30L);
		pr3.setNmProduto("A�ucar");
		pr3.setPreco(30.);
		pr3.setQuantidade(1.);
		
		 /* Atribuindo a lista*/
		listaCompras.add(pr1);
		listaCompras.add(pr2);
		listaCompras.add(pr3);
		
		/*sa�da da lista*/
		for (Produto produto : listaCompras) {
			System.out.println(produto);
		}
	}
}
