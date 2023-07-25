package dominio;

public class Menu {


    public Menu() {
    }

    // Método estático para imprimir o menu principal da aplicação
    public static void imprimirMenu() {
        System.out.println("\nCOFRINHO:\n" +
                "1-Adicionar Moeda \n" +
                "2-Remover Moeda\n" +
                "3-Lista Moedas\n" +
                "4-Calcular total convertido para Real\n" +
                "0-Encerrar");
    }

    // Método estático para imprimir o menu de escolha do tipo de moeda
    public static void escolherMoeda() {
        System.out.println("ESCOLHER MOEDA\n" +
                "1-Real\n" +
                "2-Dólar\n" +
                "3-Euro");
    }

}

