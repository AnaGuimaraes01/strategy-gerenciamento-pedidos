package main.java.strategy;

/**
 * Interface que define o contrato para o cálculo de frete.
 * 
 * O padrão Strategy começa aqui: 
 * toda estratégia concreta (Sedex, PAC, Retirada) 
 * vai implementar esse método.
 */
public interface CalculoFrete {
    double calcular(double pesoEmKg);
}
