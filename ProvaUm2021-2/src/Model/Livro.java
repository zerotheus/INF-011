package Model;

public class Livro extends Produto {

    private String isbn;

    public Livro() {
        isbn = super.codigo;
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

}
