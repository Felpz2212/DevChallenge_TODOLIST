package br.com.challenge.felipe.enums;

public enum Prioridade {
    ALTA("A"), MEDIA("M"), BAIXA("B");

    private String descricao;

    Prioridade(String descricao){
        this.descricao = descricao;
    }
}
