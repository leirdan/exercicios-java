package br.edu.ifrn.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExercises {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // adicionando
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        // navegando
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        // substituindo
        names.set(2, "Roberto");

        // retornando elemento por posição
        System.out.println(names.get(1));

        // removendo por posição
        names.remove(4);

        // removendo por nome
        names.remove("João");

        // retornando quantidade de elementos total
        System.out.println(names.size());

        // verificando
        Boolean containsJuliano = names.contains("Juliano");
        if (containsJuliano)
            System.out.println("Juliano existe.");
        else
            System.out.println("Juliano não existe");

        // nova lista
        List<String> newNames = new ArrayList<>();
        newNames.add("Ismael");
        newNames.add("Rodrigo");

        // adicionando a nova lista à antiga
        names.addAll(newNames);
        System.out.println(names);

        // ordenando
        Collections.sort(names);

        // olhando se está vazia
        Boolean isEmpty = names.isEmpty();
        if (isEmpty)
            System.out.println("A lista está vazia!");
        else
            System.out.println("A lista tem elementos!");

    }
}
