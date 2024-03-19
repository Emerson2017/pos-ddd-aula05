package org.example.domain.entidades;

import java.util.UUID;

public class Cliente {

    public Cliente(String nome) {
        this.nome = nome;
    }
    private UUID Id;
    private String nome;

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public Avaliacao criaAvaliacao(Integer pontuacao) {
        return new Avaliacao(this, pontuacao);
    }
}
