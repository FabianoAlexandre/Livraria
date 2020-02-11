package OOP;

public class LivroFisico extends Livro{
     
    private String isbn;
   
    
    public String getIsbn() {
	       return isbn;
	   }
    public void setIsbn(String isbn) {
	       this.isbn = isbn;
	   }
    public LivroFisico(Author autor) {
	super(autor);
	
	this.isbn = "000-00-00000-00-0";
    }
    @Override
    public void detalhesLivro() {
	super.detalhesLivro();
	   System.out.println("\tISBN: "+ isbn);
    }

}
