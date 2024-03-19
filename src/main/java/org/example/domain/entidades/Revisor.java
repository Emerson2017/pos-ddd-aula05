package org.example.domain.entidades;

import java.util.UUID;

public class Revisor {

    public Revisor(String nome) {
        this.nome = nome;
    }
    private UUID id;

    private String nome;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Revisao criaRevisao(String descricao) {
        return new Revisao(this, descricao);
    }
}
