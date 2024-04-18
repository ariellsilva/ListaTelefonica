public class Contato {

    public static void main(String[] args) {
	}
		    private String nome;
		    private String email;
		    private String telefone;

		    // Construtor
		    public Contato(String nome, String email, String telefone) {
		        this.nome = nome;
		        this.email = email;
		        this.telefone = telefone;
		    }

		    // Métodos getters
		    public String getNome() {
		        return nome;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public String getTelefone() {
		        return telefone;

	}
		    public String toString() {
		    	return nome+ ":" + email+ ":" + telefone;
		    }
}

