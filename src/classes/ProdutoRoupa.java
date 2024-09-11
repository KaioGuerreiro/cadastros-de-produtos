package classes;

public class ProdutoRoupa extends Produto{
    protected String tamanho;

    public ProdutoRoupa() {
    }

    public ProdutoRoupa(String nome, Float preco, String marca, String tamanho) {
        super(nome, preco, marca);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
