package main.java;

import main.java.model.Pedido;
import main.java.strategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE PEDIDOS");
        
        System.out.print("Descrição do pedido: ");
        String descricao = sc.nextLine();

        System.out.print("Peso do pedido (kg): ");
        double peso = sc.nextDouble();

        System.out.println("Escolha o tipo de frete:");
        System.out.println("1 - Sedex");
        System.out.println("2 - PAC");
        System.out.println("3 - Retirada na Loja");
        System.out.print("Digite uma opção: ");
        int opcao = sc.nextInt();

        CalculoFrete estrategia;

        switch (opcao) {
            case 1: estrategia = new FreteSedex(); break;
            case 2: estrategia = new FretePAC(); break;
            case 3: estrategia = new FreteRetirada(); break;
            default:
                System.out.println("Opção inválida! Usando PAC por padrão.");
                estrategia = new FretePAC();
        }

        // Cria o pedido já com a estratégia escolhida
        Pedido pedido = new Pedido(descricao, peso, estrategia);

        // Exibe resultado
        System.out.println("\n" + pedido);
        System.out.println("Valor do frete: R$ " + pedido.calcularFrete());
        
        sc.close();
    }
}
