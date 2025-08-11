package main.java.strategy;



/**
 * Estratégia concreta: Frete via Sedex.
 * 
 * Implementa o cálculo específico para esse tipo de frete.
 */
public class FreteSedex implements CalculoFrete {

    @Override
    public double calcular(double pesoEmKg) {
        // Exemplo: R$ 12,50 por kg
        return pesoEmKg * 12.50;
    }
}
