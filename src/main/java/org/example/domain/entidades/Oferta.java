package org.example.domain.entidades;

import java.util.UUID;

public class Oferta {

    private UUID id;
    private Vendedor vendedor;
    private float valor;

    public Oferta(Vendedor vendedor, float valor) {
        this.vendedor = vendedor;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public float getValor() {
        return valor;
    }
}
