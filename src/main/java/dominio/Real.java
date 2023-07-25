package dominio;

public class Real extends Moeda {

    // Construtor da classe Real, que recebe o valor da moeda como parâmetro
    public Real(double valor) {
        super(valor);
    }

    // Sobrescrita do método info() da classe Moeda para exibir as informações do Real
    @Override
    public void info() {
        System.out.println("Valor do Real: " + valor);
    }

    // Sobrescrita do método converter() da classe Moeda para retornar o próprio valor em Real
    @Override
    public double converter() {
        return valor;
    }
}

