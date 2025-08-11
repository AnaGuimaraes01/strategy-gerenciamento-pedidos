package main.java.strategy;


/**
 * Estratégia concreta: Frete via PAC.
 */
public class FretePAC implements CalculoFrete {

    @Override
    public double calcular(double pesoEmKg) {
        // Exemplo: R$ 8,00 por kg
        return pesoEmKg * 8.00;
    }
}
