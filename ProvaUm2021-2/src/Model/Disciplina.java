package Model;

public class Disciplina extends Produto {

    

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

}
