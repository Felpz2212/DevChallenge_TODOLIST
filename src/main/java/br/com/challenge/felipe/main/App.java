package br.com.challenge.felipe.main;

import br.com.challenge.felipe.models.Pessoa;
import br.com.challenge.felipe.models.Tarefas;

public class App {
    public static void main(String[] args) {

       Tarefas tarefa1 =  Tarefas.of(8, "Teste", "Alta");
       Tarefas tarefa2 = Tarefas.of(5, "Teste1", "Alta");

        Pessoa felipe = Pessoa.of("Felipe");

        felipe.adicionarTarefas(tarefa1);
        felipe.adicionarTarefas(tarefa2);

        //System.out.println(felipe);


        felipe.verificarPendentes();
    }
}
