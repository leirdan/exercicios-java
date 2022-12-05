package br.edu.ifrn.collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    public static void main(String[] args) {
        TreeMap<String, String> states = new TreeMap<>();

        // adicionando
        states.put("Rio Grande do Norte", "RN");
        states.put("Rio Grande do Sul", "RS");
        states.put("Piauí", "PI");
        states.put("Paraíba", "PB");
        states.put("Ceará", "CE");
        states.put("Sergipe", "SE");
        states.put("Alagoas", "AL");
        states.put("Acre", "AC");
        states.put("Amazonas", "AM");
        states.put("Amapá", "AP");
        states.put("Bahia", "BA");
        states.put("Espírito Santo", "ES");
        states.put("Goiás", "GO");
        states.put("Mato Grosso", "MT");
        states.put("Maranhão", "MA");
        states.put("Mato Grosso do Sul", "MS");
        states.put("Minas Gerais", "MG");
        states.put("Pará", "PA");
        states.put("Pernambuco", "PE");
        states.put("Paraná", "PR");
        states.put("Rio de Janeiro", "RJ");
        states.put("Rondônia", "RO");
        states.put("Roraima", "RR");
        states.put("Santa Catarina", "SC");
        states.put("São Paulo", "SP");
        states.put("Tocantins", "TO");

        // removendo
        states.remove("Minas Gerais");

        // adicionando DF
        states.put("Distrito Federal", "DF");

        // verificando tamanho
        System.out.println(states.size());

        // removendo por nome
        states.remove("Mato Grosso do Sul");

        // exibindo todos os estados
        for (Map.Entry<String, String> entry : states.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }

        // verificar se existe pela sigla
        System.out.println(states.containsValue("SC"));

        // verificar se existe pelo nome
        System.out.println(states.containsKey("Maranhão"));

    }
}
