package Factory;

import Model.Livro;
import Model.Produto;

public class FactoryLivro implements Factory {

    @Override
    public Produto criaProduto(String nome, String codigo) {
        return new Livro(codigo, nome);
    }

}
