package br.com.challenge.felipe.models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    List<Tarefas> listaTarefas = new ArrayList<>();

    private Pessoa(String nome){
        this.nome = nome;
    }

    public static Pessoa of(String nome){
        return new Pessoa(nome);
    }

    public Pessoa adicionarTarefas(Tarefas tarefa){
        this.listaTarefas.add(tarefa);

        return this;
    }

    public List<Tarefas> getListaTarefas() {
        return listaTarefas;
    }



    public void verificarPendentes(){
        for(Tarefas tarefa1 : listaTarefas){
            if(tarefa1.getStatus().equals("pendente")){
                System.out.println(tarefa1);
            }
        }
    }



    public void removerTarefa(Tarefas tarefa){
        this.listaTarefas.remove(tarefa);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", listaTarefas=" + listaTarefas +
                '}';
    }
}
