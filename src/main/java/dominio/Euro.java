package dominio;

public class Euro extends Moeda {

    // Construtor da classe Euro, que recebe o valor da moeda como parâmetro
    public Euro(double valor) {
        super(valor);
    }

    // Sobrescrita do método info() da classe Moeda para exibir as informações do Euro
    @Override
    public void info() {
        System.out.println("Valor do Euro: " + valor);
    }

    // Sobrescrita do método converter() da classe Moeda para realizar a conversão do Euro para Real
    @Override
    public double converter() {
        return valor * 5.37; // Valor de conversão utilizado (valor do euro em reais)
    }
}

