package main.java.strategy;

public class FreteRetirada implements CalculoFrete {
    @Override
    public double calcular(double pesoEmKg) {
        return 0.0; //retirada é grátis
    }
}
