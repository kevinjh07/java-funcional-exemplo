package digitalinnovation;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        Function<String, String> reverseString = texto -> new StringBuilder(texto).reverse().toString();
        String applied = reverseString.apply("SAIRAM O TIO E OITO MARIAS");
        System.out.println(applied);
    }
}
