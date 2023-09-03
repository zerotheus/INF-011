package Factory;

import Model.Disciplina;
import Model.Produto;

public class FactoryDisciplina implements Factory {

    @Override
    public Produto criaProduto(String nome, String codigo) {
        return new Disciplina(codigo, nome);
    }

}
