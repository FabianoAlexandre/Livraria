package OOP;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;

    private Author autor;
    
    public Livro(Author autor) {
	this.autor = autor;
    }
    
   
void detalhesLivro() {
       System.out.println("\n Monstrando dados do livro \n");
       System.out.println("\tNome: "+ nome);
       System.out.println("\tDescrião: "+ descricao);
       System.out.println("\tValor: "+ valor);
    
      // autor.detalhesAuthor();
       
       if(this.temAutor()) {
	   autor.detalhesAuthor();
       }
   
    }
   public boolean AplicaDescontoDe(double porcentagem) {
       if(porcentagem > 0.3) {
	   return false;
       }
       this.valor -= this.valor * porcentagem;
       return true;
   }
   boolean temAutor() {
    return this.autor != null;
   
   }
   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public String getDescricao() {
       return descricao;
   }
   public void setDescricao(String descricao) {
       this.descricao = descricao;
   }
   public double getValor() {
       return valor;
   }
   public void setValor(double valor) {
       this.valor = valor;
   }
  
   public Author getAutor() {
    return autor;
   }
   public void setAutor(Author autor) {
    this.autor = autor;
   }
}
