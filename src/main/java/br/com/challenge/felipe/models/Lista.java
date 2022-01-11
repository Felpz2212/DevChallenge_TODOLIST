package br.com.challenge.felipe.models;

import java.util.List;

public class Lista {


    public List<Lista> lista;
    private int id;
    private String descricao;
    private String status;
    private String prioridade;

    private Lista(int id, String descricao, String prioridade){
        this.id = id;
        this.descricao = descricao;
        this.status = "pendente";
        this.prioridade = prioridade;
    }

    public static Lista of(int id, String descricao, String prioridade){
        return new Lista(id, descricao,prioridade);
    }

    @Override
    public String toString() {
        return "Lista{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", prioridade='" + prioridade + '\'' +
                '}' +
                "\n";
    }
}
