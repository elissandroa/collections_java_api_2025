package collections_java_api_2025.list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livros;
	
	public CatalogoLivros() {
		this.livros = new ArrayList<>();
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void addLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public void pesquisarPorAutor(String autor) {
		List<Livro> livrosEncontrados = new ArrayList<>();
		
		for(Livro livro : livros) {
			if(livro.getAutor().equalsIgnoreCase(autor)) {
				livrosEncontrados.add(livro);
			}
		}
		
		if (livrosEncontrados.isEmpty()) {
			System.out.println("Nenhum livro encontrado do autor: " + autor);
		} else {
			System.out.println("Livros encontrados do autor " + autor + ":");
			for (Livro livro : livrosEncontrados) {
				System.out.println(livro.getTitulo() + " (" + livro.getAnoPublicacao() + ")");
			}
		}
	}
	
	public void pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
		List<Livro> livrosEncontrados = new ArrayList<>();
		
		for(Livro livro : livros) {
			if(livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
				livrosEncontrados.add(livro);
			}
		}
		
		if (livrosEncontrados.isEmpty()) {
			System.out.println("Nenhum livro encontrado no intervalo de anos: " + anoInicio + " a " + anoFim);
		} else {
			System.out.println("Livros encontrados no intervalo de anos " + anoInicio + " a " + anoFim + ":");
			for (Livro livro : livrosEncontrados) {
				System.out.println(livro.getTitulo() + " (" + livro.getAutor() + ")");
			}
		}
	}
	
	public void pesquisarPorTitulo(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("Livro encontrado: " + livro.getTitulo() + " de " + livro.getAutor() + " (" + livro.getAnoPublicacao() + ")");
				return;
			}
		}
		System.out.println("Livro não encontrado com o título: " + titulo);
	}
	
	public void imprimirCatalogo() {
		if (livros.isEmpty()) {
			System.out.println("O catálogo de livros está vazio.");
		} else {
			System.out.println("Catálogo de Livros:");
			for (Livro livro : livros) {
				System.out.println(livro.getTitulo() + " de " + livro.getAutor() + " (" + livro.getAnoPublicacao() + ")");
			}
		}
	}
}
