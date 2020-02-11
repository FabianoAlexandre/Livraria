package OOP;

public class CadLivro {

    public static void main(String[] args) {
	
	Author autor = new Author();
	autor.setNome ("Fabiano Alexandre");
	autor.setEmail ("fabiano.alexandred@gmail.com");
	autor.setCpf("301,959.458-83");
	
	LivroFisico livro = new LivroFisico(autor);
	
	livro.setNome ("Java 8 Pratico");
	livro.setDescricao ("Novos recursos da linguagem");
	livro.setValor (59.90);
	livro.setIsbn ("345.986.78.79.67-54");
	
	livro.setAutor (autor);
	
	livro.detalhesLivro();
	
	LivroFisico outroLivro = new LivroFisico(autor);
	
	outroLivro.setNome ("Linguagem de Programação");
	outroLivro.setDescricao ("Programando com eficacia");
	outroLivro.setValor ( 49.90);
	outroLivro.setIsbn ("876.090.879-98");
	
	Author outroAutor = new Author();
	
	outroAutor.setNome ("Ruan Alexandre");
	outroAutor.setEmail ("ruanaviciolileandre@gmail.com");
	outroAutor.setCpf ("647.987.908-98");
	
	
	outroLivro.setAutor ( outroAutor);
	
	outroLivro.detalhesLivro();
	
	Ebook ebook = new Ebook(autor);
	ebook.setNome("Java 8 pratico");
	
	
    }

}
