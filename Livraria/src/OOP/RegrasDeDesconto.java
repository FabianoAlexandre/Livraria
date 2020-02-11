package OOP;

public class RegrasDeDesconto {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Author autor = new Author();
	autor.setNome ("Fabiano Alexandre");
	autor.setEmail ("fabiano.alexandred@gmail.com");
	autor.setCpf("301,959.458-83");
	
	LivroFisico livro = new LivroFisico(autor);
	livro.setNome ("Java 8 Pratico");
	livro.setDescricao ("Novos recursos da linguagem");
	livro.setValor (59.90);
	//livro.setIsbn ();
	
	livro.setAutor (autor);
	
	livro.detalhesLivro();
	
	LivroFisico outroLivro = new LivroFisico(autor);
	
	outroLivro.setNome ("Linguagem de Programação");
	outroLivro.setDescricao ("Programando com eficacia");
	outroLivro.setValor ( 59.90);
	//outroLivro.setIsbn ("");
	
	Author outroAutor = new Author();
	
	outroAutor.setNome ("Ruan Alexandre");
	outroAutor.setEmail ("ruanaviciolileandre@gmail.com");
	outroAutor.setCpf ("647.987.908-98");
	
	
	outroLivro.setAutor ( outroAutor);
	
	outroLivro.detalhesLivro();
	
	if(!livro.AplicaDescontoDe(0.3)) {
	    System.out.println("Desconto no livro não pode ser maior que 30%");
	}else {
	    System.out.println("Valor do livro com desconto: " +livro.getValor() );
	}
	Ebook ebook = new Ebook(autor);
	ebook.setNome ("Java 8 Pratico");
	ebook.setDescricao ("Novos recursos da linguagem");
	ebook.setValor(29.90);
	
	ebook.setAutor(autor);
	
	ebook.mostrarDetalhesE();
	
	if(!ebook.AplicaDescontoDe(0.15)) {
	    System.out.println("\n Desconto no Ebook não pode ser maior que 15%");
	}else {
	    System.out.println("\n Valor do ebook com desconto: " + ebook.getValor());
	}
    }
}
