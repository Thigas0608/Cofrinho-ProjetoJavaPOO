package dominio;

import java.util.List;

public class Cofrinho {

    private List<Moeda> listaMoeda;

    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        listaMoeda.add(moeda);
    }

    // Método para remover uma moeda do cofrinho
    public void remover(Moeda moeda) {
        listaMoeda.remove(moeda);
    }

    // Método para listar todas as moedas presentes no cofrinho e exibir suas informações
    public void listagemMoedas() {
        for (Moeda moeda : listaMoeda) {
            moeda.info();
        }
    }

    // Método para calcular o total convertido de todas as moedas no cofrinho e exibir o resultado em Real
    public void totalConvertido() {
        double soma = 0;
        for (Moeda moeda : listaMoeda) {
            soma += moeda.converter();
        }
        System.out.printf("O total convertido para Real: %.2f\n", soma);
    }

    // Construtor da classe, que recebe uma lista de moedas como parâmetro e inicializa o cofrinho
    public Cofrinho(List<Moeda> listaMoeda) {
        this.listaMoeda = listaMoeda;
    }

    // Getter para obter a lista de moedas do cofrinho
    public List<Moeda> getListaMoeda() {
        return listaMoeda;
    }

    // Setter para definir a lista de moedas do cofrinho
    public void setListaMoeda(List<Moeda> listaMoeda) {
        this.listaMoeda = listaMoeda;
    }
}

