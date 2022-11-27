package br.edu.ifrn.syntax;

// Imprima a soma de 1 até 1000.
public class quest02 {
    public static void main(String[] args) {
        System.out.println("A soma de todos os números de 1 até 1000 (não incluso) é: " + sum());
    }

    public static int sum() {
        var sum = 0;

        for (int i = 1; i < 1000; i++) {
            sum += i;
        }
        return sum;
    }
}
