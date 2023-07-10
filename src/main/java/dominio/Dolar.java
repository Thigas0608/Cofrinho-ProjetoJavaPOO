package dominio;

public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    public double converter(){
        return valor * 4.88;
    }

}
