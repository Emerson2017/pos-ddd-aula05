package org.example.domain.entidades;

import java.util.UUID;

public class Vendedor {
    private UUID id;
    private String nome;

    public Oferta criarOferta(float valor) {
        return new Oferta(this, valor);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
