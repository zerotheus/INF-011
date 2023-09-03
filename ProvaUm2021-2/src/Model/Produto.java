package Model;

public abstract class Produto {

    protected String codigo;
    protected String nome;
    protected double preco;

    public abstract String getCodigo();

    public abstract String getNome();

    public abstract double getPreco();

}
