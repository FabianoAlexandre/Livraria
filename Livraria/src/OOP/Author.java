package OOP;

public class Author {
    
    String nome;
    String email;
    String cpf;
    
    void detalhesAuthor() {
	System.out.println("\n Monstrando dados do Autor \n");
	System.out.println("\tNome do Author: "+nome);
	System.out.println("\tEmail: "+email);
	System.out.println("\tCPF: "+cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
