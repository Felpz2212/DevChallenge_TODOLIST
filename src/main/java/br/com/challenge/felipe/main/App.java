package br.com.challenge.felipe.main;

import br.com.challenge.felipe.models.Pessoa;
import br.com.challenge.felipe.models.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Tarefas> lista = new ArrayList<>();

        Pessoa felipe = Pessoa.of("Felipe");
        Tarefas tarefa1 =  Tarefas.of(8, "Teste", "Alta");
        Tarefas tarefa2 = Tarefas.of(5, "Teste1", "Alta");

        felipe.adicionarTarefas(tarefa1).adicionarTarefas(tarefa2);

        System.out.println(felipe);

        felipe.removerTarefa(tarefa2);

        System.out.println(felipe);
    }
}
