package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pagamento {
    private Date data;
    private Double valor;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pagamento() {
    }

    public Pagamento(Date data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Data: " + sdf.format(data) + " Parcela: " + String.format(" %.2f", valor));
        return s.toString();
    }
}
