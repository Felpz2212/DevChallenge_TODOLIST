package br.com.challenge.felipe.main;

import br.com.challenge.felipe.models.Lista;

public class App {
    public static void main(String[] args) {

       Lista Tarefa1 =  Lista.of(8, "Teste", "Alta");
       Lista Tarefa2 = Lista.of(5, "Teste1", "Alta");

        System.out.println(Tarefa1);
        System.out.println(Tarefa2);
    }
}
