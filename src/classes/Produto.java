package classes;

public class Produto {
    protected String nome;
    protected Float preco;
    protected String marca;
    protected Integer taxaDesconto;

    public Produto() {
    }

    public Produto(String nome, Float preco, String marca, Integer taxaDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.taxaDesconto = taxaDesconto;
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

    public Integer getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(Integer taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }
}
