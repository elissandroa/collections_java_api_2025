package collections_java_api_2025.ordenacao;

import java.util.Comparator;

public class ComparatorProdutoPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		if (p1 == null || p2 == null) {
			throw new IllegalArgumentException("Produtos não podem ser nulos.");
		}
		
		return Double.compare(p1.getPreco(), p2.getPreco());
	}

}
