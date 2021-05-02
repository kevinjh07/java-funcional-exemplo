package digitalinnovation;

import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<String> imprimirFrase = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello Consumer");
    }
}
