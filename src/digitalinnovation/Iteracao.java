package digitalinnovation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracao {

    public static void main(String[] args) {
        String[] nomes = {"Marcos", "Marcos", "João", "João", "Daniel", "Daniel"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltradosComJoin(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirDobroCadaItem(numeros);
    }

    private static void imprimirNomesFiltradosComJoin(String... nomes) {
        String nomesParaImprimir = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining());

        System.out.println("Nomes do stream: " + nomesParaImprimir + "\n");
    }

    private static void imprimirTodosOsNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println("Imprimido pelo for: " + nome);
        }
        Stream.of(nomes).forEach(nome -> System.out.println("Imprimido pelo forEach: " + nome));
    }

    private static void imprimirDobroCadaItem(Integer... numeros) {
        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
