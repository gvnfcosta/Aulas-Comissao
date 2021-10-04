package model.services;

import model.entities.Invoice;
import model.entities.Venda;

public class Calculo{

        private Double valorVenda;

        private Taxa taxa;

    public Calculo(Double valorVenda, Taxa taxa) {
        this.valorVenda = valorVenda;
        this.taxa = taxa;
    }

    public void processoComissao(Venda venda) {
        double tax = taxa.tax(valorVenda);
        Invoice invoice = new Invoice(valorVenda, tax);
        venda.setInvoice(invoice);
    }
}
