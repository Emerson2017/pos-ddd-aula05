package org.example.domain.entidades;

import java.util.UUID;

public class Estoque {

    private UUID id;
    private Integer quantidade;

    public Estoque(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public UUID getId() {
        return id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Estoque alteraQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
