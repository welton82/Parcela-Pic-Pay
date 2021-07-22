package aplication;

import Service.PagamentoPicPay;
import Service.ServicoContrato;
import entities.Contrato;
import entities.Pagamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        operacao(scan);
    }

    public static void operacao(Scanner scan) throws ParseException {

        System.out.println("============= Inserção de Opçoes no menu ===============");
        System.out.println("Inserir Dados do Contrato");
        System.out.print("Numero do Contrato: ");
        Integer numero = scan.nextInt();
        System.out.print("Informe o Valor da Compra: ");
        Double valor = scan.nextDouble();
        System.out.print("Informe a data da Compra: ");
        String data = scan.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dat = sdf.parse(data);
        //Pagamento pg = new Pagamento(dat,valor);

        System.out.print("Informe a Quantidade de Parcelas Deseja pagar: ");
        Integer parcela = scan.nextInt();

        //
        Contrato contrato = new Contrato(dat, valor, numero);

        //servicoContrato.GerarParcela(contrato, parcela);
        ServicoContrato servicoContrato = new ServicoContrato(new PagamentoPicPay());

        servicoContrato.GerarParcela(contrato,parcela);

        //System.out.println("Numero do Contrato " + contrato.getNumero());
        System.out.println("============== Listando Parcelas ==============");
        for(Pagamento p:  contrato.getLista()){
            System.out.println(p);

        }


    }
}






























