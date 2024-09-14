package classes;

import interfaces.Metodos;

public class ProdutoRoupa extends Produto implements Metodos {
    protected String tamanho;

    public ProdutoRoupa() {
        super();
    }

    public ProdutoRoupa(String nome, Float preco, String marca, Integer taxaDesconto, String tamanho) {
        super();
        this.tamanho = tamanho;
    }

    @Override
    public Float calcularDesconto() {
        return (preco - (preco * (taxaDesconto/100f)));
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
