import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica {

    public static void main(String[] args) {
        
    
        // Criando uma lista para armazenar os contatos
        List<Contato> telefones = new ArrayList<>();

        // Criando instâncias de Contato
        Contato contato1 = new Contato("João", "contato@santos.br", "13558748545");
        Contato contato2 = new Contato("Ana", "contato@saovicente.br", "13476346431");
        Contato contato3 = new Contato("Pedro", "contato@praia.br", "136647516");
        Contato contato4 = new Contato("Maria", "contato@vasco.br", "139992715");

        // Adicionando os contatos à lista
        telefones.add(contato1);
        telefones.add(contato2);
        telefones.add(contato3);
        telefones.add(contato4);

        // Exibindo os nomes dos contatos
        for (Contato c : telefones) {
            System.out.println(c);
        }
    }
}