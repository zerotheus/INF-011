package Model;

public class Disciplina extends Produto {

    private int cargaHoraria;
    private double porcentagemConcluida;

    public Disciplina(String codigo, String nome) {
        super(codigo, nome);
        super.nome = nome;
        super.codigo = codigo;
        super.preco = 60;
    }

    public double getPorcentagemConcluida() {
        return porcentagemConcluida;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
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

    @Override
    public String toString() {
        return "Disciplina [cargaHoraria=" + cargaHoraria + ", porcentagemConcluida=" + porcentagemConcluida + "]"
                + super.toString();
    }

}
