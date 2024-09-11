package classes;

import interfaces.Metodos;

public class ProdutoEletronico extends Produto implements Metodos{
    protected String especificacao;

    public ProdutoEletronico() {
    }

    public ProdutoEletronico(String nome, Float preco, String marca, String especificacao) {
        super(nome, preco, marca);
        this.especificacao = especificacao;
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
