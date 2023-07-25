package main;
import dominio.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // <<< Inicialização de variáveis e objetos >>>
        Scanner sc = new Scanner(System.in);
        List<Moeda> listaMoeda = new ArrayList<>();
        Cofrinho cofrinho = new Cofrinho(listaMoeda);

        double valor;
        try {
            while (true) {
                System.out.print("===========================================");
                Menu.imprimirMenu();
                int escolhaMenu = sc.nextInt();

                // Opção 0: Encerrar o programa
                if (escolhaMenu == 0) {
                    System.out.println("Final do programa");
                    break;
                }

                // Opção 1: Adicionar moedas ao cofrinho
                switch (escolhaMenu) {
                    case 1:
                        Menu.escolherMoeda();
                        int escolhaMoeda = sc.nextInt();
                        if (escolhaMoeda == 1) {
                            System.out.print("Digite o valor: ");
                            valor = sc.nextDouble();
                            Real real = new Real(valor);
                            cofrinho.adicionar(real);
                        } else if (escolhaMoeda == 2) {
                            System.out.print("Digite o valor: ");
                            valor = sc.nextDouble();
                            Dolar dolar = new Dolar(valor);
                            cofrinho.adicionar(dolar);
                        } else if (escolhaMoeda == 3) {
                            System.out.print("Digite o valor: ");
                            valor = sc.nextDouble();
                            Euro euro = new Euro(valor);
                            cofrinho.adicionar(euro);
                        }
                        break;

                    // Opção 2: Remover moedas do cofrinho
                    case 2:
                        Menu.escolherMoeda();
                        int escolhaMoeda2 = sc.nextInt();
                        if (escolhaMoeda2 == 1) {
                            System.out.print("Digite o valor: ");
                            valor = sc.nextDouble();

                            for (Moeda moeda : listaMoeda) {
                                if (moeda.getValor() == valor && moeda.getClass() == Real.class) {
                                    cofrinho.remover(moeda);
                                    break;
                                }
                            }
                        } else if (escolhaMoeda2 == 2) {
                            System.out.print("Digite o valor: ");
                            valor = sc.nextDouble();

                            for (Moeda moeda : listaMoeda) {
                                if (moeda.getValor() == valor && moeda.getClass() == Dolar.class) {
                                    cofrinho.remover(moeda);
                                    break;
                                }
                            }
                            System.out.println("Moeda não encontrada");
                        } else if (escolhaMoeda2 == 3) {
                            System.out.print("Digite o valor: ");
                            valor = sc.nextDouble();

                            for (Moeda moeda : listaMoeda) {
                                if (moeda.getValor() == valor && moeda.getClass() == Euro.class) {
                                    cofrinho.remover(moeda);
                                    break;
                                }
                            }
                            System.out.println("Moeda não encontrada");
                        }
                        break;

                    // Opção 3: Listar as moedas presentes no cofrinho
                    case 3:
                        cofrinho.listagemMoedas();
                        break;

                    // Opção 4: Exibir o total convertido das moedas no cofrinho
                    case 4:
                        cofrinho.totalConvertido();
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Por gentileza insira um número.");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

