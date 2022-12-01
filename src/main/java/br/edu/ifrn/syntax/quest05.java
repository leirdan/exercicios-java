package br.edu.ifrn.syntax;

public class quest05 {
    public static void main(String[] args) {
        fatorial();
    }

    public static void fatorial() {
        long fatorial = 1;
        for (int i = 1; i <= 30; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " é: " + fatorial);
        }
    }
}