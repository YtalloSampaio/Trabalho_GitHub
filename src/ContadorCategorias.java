import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Filme {
    String nome;
    String categoria;

    public Filme(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
}

public class ContadorCategorias {

    public static void main(String[] args) {
        List<Filme> filmes = List.of(
                new Filme("Filme1", "terror"),
                new Filme("Filme2", "drama"),
                new Filme("Filme3", "comédia"),
                new Filme("Filme4", "drama"),
                new Filme("Filme5", "comédia"),
                new Filme("Filme6", "terror"),
                new Filme("Filme7", "drama"),
                new Filme("Filme8", "comédia"),
                new Filme("Filme9", "terror"),
                new Filme("Filme10", "comédia")
        );

        Map<String, Integer> quantidadeCategoria = contarFilmesPorCategoria(filmes);

        System.out.println("quantidadeCategoria:");
        for (Map.Entry<String, Integer> entry : quantidadeCategoria.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> contarFilmesPorCategoria(List<Filme> filmes) {
        Map<String, Integer> quantidadePorCategoria = new HashMap<>();
g
        for (Filme filme : filmes) {
            String categoria = filme.categoria;
            quantidadePorCategoria.put(categoria, quantidadePorCategoria.getOrDefault(categoria, 0) + 1);
        }

        return quantidadePorCategoria;
    }
}