package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItems {

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItems() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }

}
