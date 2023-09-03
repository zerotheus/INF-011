package Enum;

import Factory.Factory;
import Factory.FactoryDisciplina;
import Factory.FactoryLivro;

public enum ProdutosEnum {

    Livro {
        @Override
        public Factory criadorDeProduto() {
            return new FactoryLivro();
        }
    },
    Disciplina {
        @Override
        public Factory criadorDeProduto() {
            return new FactoryDisciplina();
        }
    };

    public abstract Factory criadorDeProduto();
}
