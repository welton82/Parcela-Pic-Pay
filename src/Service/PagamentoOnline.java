package Service;

public interface PagamentoOnline {

    public Double taxaPagamento(Double valor);
    public Double taxaMensal(Double valor, Integer mes);

}
