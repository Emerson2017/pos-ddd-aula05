package org.example.domain.entidades;

import org.example.domain.repository.LivroRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Autor {

    private UUID id;
    private String nome;
    private LivroRepository livroRepository;

    public Autor(String nome) {
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Livro publicaLivro(String descricao, String isbn, List<Autor> autores, Estoque estoque) {
        Optional<Autor> autor = autores.stream().filter(a -> a.getId().equals(getId())).findFirst();

        if (autor.isEmpty())
            autores.add(this);

        return new Livro(descricao, isbn, autores, estoque);
    }

    public List<Livro> getLivrosPublicados() {
        return livroRepository.buscarLivrosPorAutor(this);
    }
}
