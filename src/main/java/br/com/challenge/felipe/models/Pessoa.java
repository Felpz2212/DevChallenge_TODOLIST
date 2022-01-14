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



    public void alterarConcluida(Tarefas tarefa){
        if(!listaTarefas.contains(tarefa)){
            throw new RuntimeException("Tarefa Nao Encontrada para o usuario");
        }else{
            tarefa.setStatus("Concluida");
        }
    }

    int cont = 0;
    public void alterarConcluida(int id){
        for (Tarefas tarefa1 : listaTarefas) {
            if (tarefa1.getId() == id) {
                tarefa1.setStatus("Concluida");
            }else{
                cont += 1;
            }

            if(cont >= listaTarefas.size()){
                throw new RuntimeException("Tarefa com id: " + id + " não encontrada");
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
