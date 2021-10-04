package model.entities;

import java.util.Date;

public class Venda {
    private Date dataVenda;
    private Double valorVenda;

    private Vendedor vendedor;
    private Invoice invoice;
    private Cliente cliente;

    public Venda() {

    }

    public Venda(Date dataVenda, Double valorVenda, Vendedor vendedor, Cliente cliente) {
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "dataVenda=" + dataVenda +
                ", valorVenda=" + valorVenda +
                ", vendedor=" + vendedor +
                ", invoice=" + invoice +
                ", cliente=" + cliente +
                '}';
    }
}
