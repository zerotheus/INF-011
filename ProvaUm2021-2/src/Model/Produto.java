package Model;

public abstract class Produto {

    protected String codigo;
    protected String nome;
    protected double preco;

    Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public abstract String getCodigo();

    public abstract String getNome();

    public abstract double getPreco();

}
