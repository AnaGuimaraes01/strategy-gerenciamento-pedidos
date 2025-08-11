package main.java.model;



import main.java.strategy.CalculoFrete;

/**
 * Classe que representa um Pedido.
 * 
 * O padrão Strategy aparece aqui: 
 * usamos a interface CalculoFrete como atributo.
 * Assim, podemos mudar a forma de cálculo 
 * sem alterar o código da classe.
 */
public class Pedido {
    private String descricao;
    private double peso;
    private CalculoFrete calculoFrete; // Estratégia usada no momento

    public Pedido(String descricao, double peso, CalculoFrete calculoFrete) {
        this.descricao = descricao;
        this.peso = peso;
        this.calculoFrete = calculoFrete;
    }

    // Permite trocar a estratégia em tempo de execução
    public void setCalculoFrete(CalculoFrete calculoFrete) {
        this.calculoFrete = calculoFrete;
    }

    // Aplica a estratégia para calcular o frete
    public double calcularFrete() {
        return calculoFrete.calcular(peso);
    }

    @Override
    public String toString() {
        return "Pedido: " + descricao + " | Peso: " + peso + " kg";
    }
}
