package main.java.strategy;

public class FreteSedex implements CalculoFrete {
    @Override
    public double calcular(double pesoEmKg) {
        return pesoEmKg * 12.50; //nesse caso, R$ 12,50 por kg
    }
}
