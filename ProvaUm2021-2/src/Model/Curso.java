package Model;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Produto {

    public List<Livro> livros = new ArrayList<Livro>();
    public List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso() {

    }

    public Curso(List<Livro> livros, List<Disciplina> disciplinas) {
        this.livros = livros;
        this.disciplinas = disciplinas;
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

    public int getCargaHorariaTotal() {
        return 0;
    }

    public double getPorcentagemConcluida() {
        return 0;
    }

}
