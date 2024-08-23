package br.com.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private int quantidadeItems;

    private SituacaoOrcamento situacaoOrcamento;

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItems() {
        return quantidadeItems;
    }

    public Orcamento(BigDecimal valor, int quantidadeItems) {
        this.valor = valor;
        this.quantidadeItems = quantidadeItems;
        this.situacaoOrcamento = new EmAnalise();
    }

    public SituacaoOrcamento getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacaoOrcamento.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacaoOrcamento.aprovar(this);
    }

    public void finalizar(){
        this.situacaoOrcamento.finalizar(this);
    }

    public void reprovar(){
        this.situacaoOrcamento.reprovar(this);
    }
}
