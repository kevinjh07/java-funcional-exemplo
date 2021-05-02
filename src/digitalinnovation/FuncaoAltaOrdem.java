package digitalinnovation;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo subracao = (a, b) -> a - b;
        Calculo divisao = (a, b) -> a / b;
        Calculo multiplicacao = (a, b) -> a * b;
        System.out.println(executarOperacao(soma, 4, 3));
        System.out.println(executarOperacao(subracao, 5, 1));
        System.out.println(executarOperacao(divisao, 10, 5));
        System.out.println(executarOperacao(multiplicacao, 5, 5));
    }

    // Função de alta ordem: recebe uma função como parâmetro ou retorna uma função
    private static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

interface Calculo {
    int calcular(int a, int b);
}
