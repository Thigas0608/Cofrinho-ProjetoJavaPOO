package dominio;

public class Dolar extends Moeda {

    // Construtor da classe Dolar, que recebe o valor da moeda como parâmetro
    public Dolar(double valor) {
        super(valor);
    }

    // Sobrescrita do método info() da classe Moeda para exibir as informações do Dólar
    @Override
    public void info() {
        System.out.println("Valor do Dólar: " + valor);
    }

    // Sobrescrita do método converter() da classe Moeda para realizar a conversão do Dólar para Real
    @Override
    public double converter() {
        return valor * 4.88; // Valor de conversão utilizado (valor do dólar em reais)
    }
}

