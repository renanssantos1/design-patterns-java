package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItems extends Desconto {

    public DescontoParaOrcamentoComMaisDeCincoItems(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItems() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.01"));
        }

        return proximo.calcular(orcamento);
    }

}
