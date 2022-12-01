package br.edu.ifrn.syntax;

// Imprima os fatoriais de 1 a 10.
public class quest04 {
    public static void main(String[] args) {
        fatorial();
    }

    public static void fatorial() {
        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " é: " + fatorial);
        }
    }
}
