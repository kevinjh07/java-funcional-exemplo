package digitalinnovation;

import java.util.function.Supplier;

public class Suplidor {

    public static void main(String[] args) {
        Supplier<Pessoa> pessoaSupplier = Pessoa::new;
        System.out.println(pessoaSupplier.get());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = "Paula";
        this.idade = 30;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}