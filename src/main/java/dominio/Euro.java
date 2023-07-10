package dominio;

public class Euro extends Moeda {

    private double valor;

    public Euro(double valor) {
        super(valor);
    }

    public void info(){
    }

    public double converter(){
        return valor * 5.37;
    }

}
