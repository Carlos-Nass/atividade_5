import java.util.ArrayList;
import java.util.List;

public class atividade4 {
    private List<String> livros;

    public atividade4() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo) {
        livros.add(titulo);
    }

    public void removerLivro(String titulo) {
        livros.remove(titulo);
    }

    public List<String> listarLivros() {
        return livros;
    }

    public void testAdicionarLivro() {

        adicionarLivro("Fundação");
        adicionarLivro("Duna");

        if (2 == listarLivros().size()){
            System.out.println("Adicionar livro está funcionando corretamente");
        }else{
            System.out.println("Adicionar livro não está funcionando corretamente");
        }
    }

    public void testRemoverLivro() {

        adicionarLivro("2001: Uma Odisseia no Espaço");
        adicionarLivro("Neuromancer");
        removerLivro("2001: Uma Odisseia no Espaço");

        if (3 == listarLivros().size()){
            System.out.println("Remover livro está funcionando corretamente");
        }else{
            System.out.println("Remover livro não está funcionando corretamente");
        }
    }

    public void testListarLivros() {

        adicionarLivro("Solaris");
        adicionarLivro("Blade Runner");
        adicionarLivro("Neuromancer");

        if (6 == listarLivros().size()){
            System.out.println("Listar livro está funcionando corretamente");
        }else{
            System.out.println("Listar livro não está funcionando corretamente");
        }
    }

    public static void main(String[] args) {
        atividade4 biblioteca = new atividade4();

        biblioteca.testAdicionarLivro();
        biblioteca.testRemoverLivro();
        biblioteca.testListarLivros();

        System.out.println("\nLista de Livros:\n");
        for (String livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }
    }
}
