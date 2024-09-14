package classes;

import interfaces.Metodos;

public class ProdutoEletronico extends Produto implements Metodos{
    protected String especificacao;

    public ProdutoEletronico() {
        super();
    }

    public ProdutoEletronico(String nome, Float preco, String marca, Integer taxaDesconto, String especificacao) {
        super();
        this.especificacao = especificacao;
    }

    @Override
    public Float calcularDesconto() {
        return (getPreco() - (getPreco() * (getTaxaDesconto()/100f)));
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String descricaoProduto() {
        return getNome();
    }
}
