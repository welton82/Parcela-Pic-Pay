package Service;

public class PagamentoPicPay implements PagamentoOnline{


    @Override
    public Double taxaPagamento(Double valor) {
        return valor * 0.02 + valor;
    }

    @Override
    public Double taxaMensal(Double valor, Integer mes) {
        return valor * 0.01 * mes + valor;
    }
}
