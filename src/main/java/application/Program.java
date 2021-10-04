package application;

import model.entities.Cliente;
import model.entities.Venda;
import model.entities.Vendedor;
import model.services.Calculo;
import model.services.Comissao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("COMISSÕES");
        Date dataVenda = sdf.parse("13/09/2021");
        System.out.println("Data da Venda: " + dataVenda);

        String nomeVendedor = "Ney";
        System.out.print("Vendedor: " + nomeVendedor);

        System.out.println();
        String nomeCliente = "Bia Cosméticos";
        System.out.println("Cliente: " + nomeCliente);

        System.out.println();
        Double valorVenda = 500.00;
        System.out.println("Valor da venda: " + valorVenda);

        Venda vd = new Venda(dataVenda, valorVenda, new Vendedor(nomeVendedor), new Cliente(nomeCliente));

        System.out.println(vd);

        Calculo calculo = new Calculo(valorVenda, new Comissao());
        calculo.processoComissao(vd);

        Double vl = vd.getInvoice().getComissao();
        System.out.println("Valor da Venda: " + valorVenda);
        System.out.println("Valor da Comissão: " + vl);
        System.out.println("Lucro : " + (valorVenda - vl));

        sc.close();
    }
}
