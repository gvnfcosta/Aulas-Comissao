package model.services;

public class Comissao implements Taxa{
    public double tax(double valorVenda) {
        if (valorVenda > 1000.00) {
            return valorVenda * 0.25;
        } else {
            return valorVenda * 0.15;
        }
    }
}
