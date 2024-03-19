package org.example.domain.entidades;

import java.util.UUID;

public class Avaliacao {

    public Avaliacao(Cliente cliente, Integer pontuacao) {
        this.avaliador = cliente;
        this.pontuacao = pontuacao;
    }
    private UUID id;
    private Cliente avaliador;
    private  Integer pontuacao;

    public UUID getId() {
        return id;
    }

    public Cliente getAvaliador() {
        return avaliador;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

}
