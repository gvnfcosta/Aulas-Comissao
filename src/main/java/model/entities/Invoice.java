package model.entities;

public class Invoice {

    private Double vendaBasica;
    private Double comissao;

    public Invoice() {
    }

    public Invoice(Double vendaBasica, Double comissao) {
        this.vendaBasica = vendaBasica;
        this.comissao = comissao;
    }

    public Double getVendaBasica() {
        return vendaBasica;
    }

    public void setVendaBasica(Double vendaBasica) {
        this.vendaBasica = vendaBasica;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double pgtoComissao() {
        return getVendaBasica(); //* (getComissao() / 100);
    }
}
