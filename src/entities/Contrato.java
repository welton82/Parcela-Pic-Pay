package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private java.util.Date Date;
    private Double valorTotal;
    private Integer numero;

    private Pagamento pagamento;
    private List<Pagamento> lista = new ArrayList<Pagamento>();

    public Contrato() {
    }

    public Contrato(Date date, Double valorTotal, Integer numero) {
        Date = date;
        this.valorTotal = valorTotal;
        this.numero = numero;

    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<Pagamento> getLista() {
        return lista;
    }

    public void adicionarLista(Pagamento pg){
        lista.add(pg);
    }
}
