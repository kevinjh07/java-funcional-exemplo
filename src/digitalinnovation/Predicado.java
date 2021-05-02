package digitalinnovation;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Predicate<String> isEmpty = String::isEmpty;

        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Teste"));
    }
}
