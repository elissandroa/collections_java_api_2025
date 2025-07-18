package collections_java_api_2025.map;

import java.util.HashMap;
import java.util.Map;

import collections_java_api_2025.ordenacao.Produto;

public class EstoqueProdutos {

	private Map<Double, Produto> produtos;

	public EstoqueProdutos() {
		this.produtos = new HashMap<>();
	}

	public Map<Double, Produto> getProdutos() {
		return produtos;
	}

	public void adicionarProduto(Produto produto) {
		if (produtos.containsKey(produto.getCodigo())) {
			System.out.println("Produto já existe com o mesmo codigo: " + produto);
			return;
		}
		produtos.put(produto.getCodigo(), produto);
		System.out.println("Produto adicionado: " + produto);
	}

	public void exibirProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("O estoque está vazio.");
		} else {
			System.out.println("Produtos no estoque:");
			for (Produto produto : produtos.values()) {
				System.out.println(produto);
			}
		}
	}

	public void calcularValorTotalEstoque() {
		double valorTotal = 0.0;
		for (Produto produto : produtos.values()) {
			valorTotal += produto.getPreco() * produto.getQuantidade();
		}
		System.out.println("Valor total do estoque: " + String.format("%.2f", valorTotal));
	}

	public void obterProdutoMaisCaro() {
		if (produtos.isEmpty()) {
			System.out.println("O estoque está vazio.");
			return;
		}
		double precoMaximo = Double.MIN_VALUE;
		Produto produtoMaisCaro = null;
		for (Produto produto : produtos.values()) {
			if (produto.getPreco() > precoMaximo) {
				precoMaximo = produto.getPreco();
				produtoMaisCaro = produto;
			}
		}
		System.out.println("Produto mais caro: " + produtoMaisCaro);
	}

	public void obterProdutoMaisBarato() {
		if (produtos.isEmpty()) {
			System.out.println("O estoque está vazio.");
			return;
		}
		double precoMinimo = Double.MAX_VALUE;
		Produto produtoMaisBarato = null;
		for (Produto produto : produtos.values()) {
			if (produto.getPreco() < precoMinimo) {
				precoMinimo = produto.getPreco();
				produtoMaisBarato = produto;
			}
		}
		System.out.println("Produto mais barato: " + produtoMaisBarato);
	}

	public void obterProdutoMaiorQuantidadeXValorTotalNoEstoque() {
		if (produtos.isEmpty()) {
			System.out.println("O estoque está vazio.");
			return;
		}
		double maiorQuantidadeXValorTotal = Double.MIN_VALUE;
		Produto produtoMaiorQuantidadeXValorTotal = null;
		for (Produto produto : produtos.values()) {
			double quantidadeXValorTotal = produto.getQuantidade() * produto.getPreco();
			if (quantidadeXValorTotal > maiorQuantidadeXValorTotal) {
				maiorQuantidadeXValorTotal = quantidadeXValorTotal;
				produtoMaiorQuantidadeXValorTotal = produto;
			}
		}
		System.out.println("Produto com maior quantidade x valor total no estoque: " + produtoMaiorQuantidadeXValorTotal);
	}
	
	public void atualizandoProduto(Produto produto) {
		if (produtos.containsKey(produto.getCodigo())) {
			produtos.put(produto.getCodigo(), produto);
			System.out.println("Produto atualizado: " + produto);
		} else {
			System.out.println("Produto não encontrado no estoque: " + produto);
		}
	}
	
	public void removerProduto(double codigo) {
		if (produtos.containsKey(codigo)) {
			Produto produtoRemovido = produtos.remove(codigo);
			System.out.println("Produto removido: " + produtoRemovido);
		} else {
			System.out.println("Produto não encontrado no estoque com o código: " + codigo);
		}
	}
}
