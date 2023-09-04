package Model;

import java.util.Random;

public class Livro extends Produto {

    private String isbn;

    public Livro(String codigo, String nome) {
        super(codigo, nome);
        super.nome = nome;
        super.codigo = codigo;
        Random random = new Random();
        isbn = Integer.toString(random.nextInt(10000));
        super.preco = 30;
    }

    @Override
    public String getCodigo() {
        return super.codigo;
    }

    @Override
    public String getNome() {
        return super.nome;
    }

    @Override
    public double getPreco() {
        return super.preco;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Livro [isbn=" + isbn + "]" + super.toString();
    }

}
