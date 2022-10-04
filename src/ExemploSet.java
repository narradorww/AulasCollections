import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas d eum aluno, [ 7, 8.5 , 9.3 , 5d, 7d, 8d, 3.6], faça

        System.out.println("Crie um conjunto e adicione as sete notas: ");
        Set<Double> notas = new HashSet<>() {{
            add(7d);
            add(8.5);
            add(9.3);
            add(5d);
            add(7d);
            add(0d);
            add(3.6);
        }};
        System.out.println(notas);

        System.out.println("Crie um conjunto e adicione as sete notas: ");
        Set<Double> notas2 = new HashSet<>(Arrays.asList(7d, 8.5 , 9.3 , 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Double soma = 0d;
        for (Double d : notas) {
            soma += d;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + soma / notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba o conjunto: ");
        notas.removeIf(nota -> nota < 7);
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas3 = new LinkedHashSet<>(Arrays.asList(7d, 8.5 , 9.3 , 5d, 7d, 0d, 3.6));
        System.out.println(notas3);

        System.out.println("Exiba as notas em ordem crescente: ");
        Set<Double> notas4 = new TreeSet<>(notas);
        System.out.println(notas4);



    }
}
