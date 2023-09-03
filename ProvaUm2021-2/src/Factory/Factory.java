package Factory;

import Model.Produto;

public interface Factory {

    public Produto criaProduto(String nome, String codigo);

}
