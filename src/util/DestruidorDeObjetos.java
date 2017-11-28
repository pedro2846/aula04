package util;

import entidades.Compra;
import entidades.Produto;
import entidades.Empregada;
import java.util.List;

public class DestruidorDeObjetos {
	
	
	//retirar a referencia do objeto 
	public static void setNull(List<Compra> compras) {
		for (Compra compra: compras) {
			for (Produto produto : compra.getListaDeProdutos()) {
				produto.setId(null);
				produto.setNmProduto(null);
				produto.setPreco(null);
				produto.setQuantidade(null);
				produto = null;
			}
			compra.setId(null);
			compra.setEmpregada(null);
			compra.setListaDeProdutos(null);
			compra = null;
			
		}
		if(lixeiro())
			System.err.println("Objetos destruidos");
	}
	//Sugere  aJVM que execute o Garbage Collector (lixeiro)
	
	private static boolean lixeiro() {
		System.gc();
		return Boolean.TRUE;
	}
}
