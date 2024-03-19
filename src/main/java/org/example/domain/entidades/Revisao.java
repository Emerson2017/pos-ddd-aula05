package org.example.domain.entidades;

import java.util.UUID;

public class Revisao {

    public Revisao(Revisor revisor, String descricao) {
        this.revisor = revisor;
        this.descricao = descricao;
    }

    private UUID id;
    private String descricao;

    private Revisor revisor;

    public UUID getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Revisor getRevisor() {
        return revisor;
    }
}
