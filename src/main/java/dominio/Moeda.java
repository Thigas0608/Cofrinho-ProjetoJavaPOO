package dominio;

public abstract class Moeda {
    protected double valor;

    public void info(){
    }

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double converter(){
        return valor;
    }

}
