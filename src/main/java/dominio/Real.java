package dominio;

public class Real extends Moeda {


    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info(){
        System.out.println("Valor do Real: " + valor);
    }

    @Override
    public double converter(){
        return valor;
    }
}
