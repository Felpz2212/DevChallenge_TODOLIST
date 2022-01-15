package br.com.challenge.felipe.models;

import br.com.challenge.felipe.enums.Prioridade;

import java.util.List;

public class Tarefas {
    public List<Tarefas> tarefas;
    private int id;
    private String descricao;
    private String status;
    private Prioridade prioridade;

    private Tarefas(int id, String descricao, Prioridade prioridade){
        this.id = id;
        this.descricao = descricao;
        this.status = "pendente";
        this.prioridade = prioridade;
    }

    public static Tarefas of(int id, String descricao, Prioridade prioridade){
        return new Tarefas(id, descricao,prioridade);
    }


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Tarefas adicionarTarefa(Tarefas tarefa){
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
                '}' + "\n";
    }
}
