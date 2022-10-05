import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExOrdenacaoMap
{
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
    for(Map.Entry<String, Livro> livro: meusLivros.entrySet()){
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

    }



    }



class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (!Objects.equals(nome, livro.nome)) return false;
        return Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (paginas != null ? paginas.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}