package classes;

public class Produto {
    protected String nome;
    protected Float preco;
    protected String marca;
    public Produto() {
    }

    public Produto(String nome, Float preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    public Float calcularDesconto(Integer taxa) {
        return preco - preco * (taxa/100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
