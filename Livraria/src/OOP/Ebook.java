package OOP;

public class Ebook extends Livro {
    private String waterMark;
    
    public Ebook(Author autor) {
	super(autor);
	this.waterMark = "000..000.000";
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    @Override
    public boolean AplicaDescontoDe(double porcentagem) {
	if(porcentagem > 0.15) {
	    return false;
	}
	return super.AplicaDescontoDe(porcentagem);
    }
    
    void mostrarDetalhesE() {
	super.detalhesLivro();
	System.out.println("Marca D'agua : " + waterMark);
    }
}
