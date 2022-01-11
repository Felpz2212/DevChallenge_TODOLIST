package br.com.challenge.felipe.models;

import java.util.List;

public class Tarefas {
    public List<Tarefas> tarefas;
    private int id;
    private String descricao;
    private String status;
    private String prioridade;

    private Tarefas(int id, String descricao, String prioridade){
        this.id = id;
        this.descricao = descricao;
        this.status = "pendente";
        this.prioridade = prioridade;
    }

    public static Tarefas of(int id, String descricao, String prioridade){
        return new Tarefas(id, descricao,prioridade);
    }

    public Tarefas adicionarCategoria(Tarefas tarefa){
        this.tarefas.add(tarefa);

        return this;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", prioridade='" + prioridade + '\'' +
                '}';
    }
}