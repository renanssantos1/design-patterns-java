package br.com.loja.orcamento;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
