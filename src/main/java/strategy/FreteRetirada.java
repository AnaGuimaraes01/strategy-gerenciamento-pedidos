package main.java.strategy;



/**
 * Estratégia concreta: Retirada na loja.
 */
public class FreteRetirada implements CalculoFrete {

    @Override
    public double calcular(double pesoEmKg) {
        // Retirada é grátis
        return 0.0;
    }
}
