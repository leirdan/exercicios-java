package br.edu.ifrn.syntax;

// Imprima todos os múltiplos de 3, entre 1 e 100.
public class quest03 {
    public static void main(String[] args) {
        multiple();
    }

    public static void multiple() {
        System.out.println("Os múltiplos de 3 entre 1 e 100 são: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}
