package main.java.strategy;

public class FretePAC implements CalculoFrete {
    @Override
    public double calcular(double pesoEmKg) {
        return pesoEmKg * 8.00; //nesse caso, 8 reais por kg
    }
}
