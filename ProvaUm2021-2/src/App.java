import Enum.ProdutosEnum;
import Factory.Factory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Factory fabrica = ProdutosEnum.Livro.criadorDeProduto();
        System.out.println(fabrica.criaProduto("Livro", "Codigo em tese unico"));
        fabrica = ProdutosEnum.Disciplina.criadorDeProduto();
        System.out.println("Fazendo polimorfismo");
        System.out.println(fabrica.criaProduto("Disciplina", "Codigo nao unico"));
    }
}
