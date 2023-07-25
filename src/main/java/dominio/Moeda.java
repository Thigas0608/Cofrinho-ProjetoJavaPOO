package dominio;

public abstract class Moeda {
    protected double valor;

    // Método info() é declarado como abstrato para que seja obrigatório sua implementação nas subclasses.
    public abstract void info();

    // Getter para obter o valor da moeda.
    public double getValor() {
        return valor;
    }

    // Setter para definir o valor da moeda.
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Construtor da classe Moeda, que recebe o valor da moeda como parâmetro.
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método converter() retorna o próprio valor da moeda por padrão (a implementação é opcional e pode ser sobrescrita nas subclasses).
    public double converter() {
        return valor;
    }
}

