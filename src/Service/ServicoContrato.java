package Service;

import entities.Contrato;
import entities.Pagamento;

import java.util.Calendar;
import java.util.Date;

public class ServicoContrato {
    PagamentoOnline pagamentoOnline;

    public ServicoContrato(PagamentoOnline pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
    }

    public void GerarParcela(Contrato contrato, Integer mes){

        Double base = contrato.getValorTotal() / mes;
        int i = 1;
        while(i <= mes){
            Date data = geraData(i, contrato.getDate()) ;

            Double parcial = pagamentoOnline.taxaMensal(base,i);
            Double total = pagamentoOnline.taxaPagamento(parcial);
            contrato.adicionarLista(new Pagamento(data, total));
            i++;
        }

    }
    public Date geraData(Integer mes, Date data){
        //1° - OBTER INSTANCIA
        Calendar cal = Calendar.getInstance();
        //2° - envio da data
        cal.setTime(data);
        //3° - adiciona lista calendar.Month, mes
        cal.add(Calendar.MONTH, mes);
        //retorna get time
        return cal.getTime();
    }


}
