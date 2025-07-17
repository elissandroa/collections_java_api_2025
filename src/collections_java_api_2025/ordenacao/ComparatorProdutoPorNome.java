package collections_java_api_2025.ordenacao;

import java.util.Comparator;

public class ComparatorProdutoPorNome implements Comparator<Produto> {

		public int compare(Produto p1, Produto p2) {
		if (p1 == null || p2 == null) {
			throw new IllegalArgumentException("Produtos não podem ser nulos.");
		}
		
		return p1.getNome().compareToIgnoreCase(p2.getNome());
	}
}
