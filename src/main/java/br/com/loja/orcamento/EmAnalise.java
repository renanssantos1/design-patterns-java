package br.com.loja.orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Aprovado());
    }

    public void reprovado(Orcamento orcamento){
        orcamento.setSituacaoOrcamento(new Reprovado());
    }
}
