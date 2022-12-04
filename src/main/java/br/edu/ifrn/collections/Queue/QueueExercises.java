package br.edu.ifrn.collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercises {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        // adicionando
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        // iterando a fila
        for (String name : names) {
            System.out.println(name);
        }

        // retornando o elemento sem removê-lo
        String firstPerson = names.element();
        System.out.println(firstPerson);

        // retornando o elemento e removendo
        String byeByePerson = names.poll();
        System.out.println(byeByePerson);
        System.out.println(names);

        // adicionando e verificando posição
        names.add("Daniel");
        int positionName = names.size() - 1;
        System.out.println("Daniel está na posição " + positionName + " da fila, contando de 0 a 4");

        // retornando tamanho
        System.out.println(names.size());

        // verificando se está vazia
        if (names.isEmpty())
            System.out.println("Vazia");
        else
            System.out.println("Não está vazia");

        // verificando se contém algum nome
        if (names.contains("Daniel"))
            System.out.println("Daniel está presente");
        else
            System.out.println("Daniel não está presente");
    }
}
