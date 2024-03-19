package org.example.domain.entidades;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Livro {

    private UUID id;
    private String descricao;
    private String isbn;
    private List<Autor> autores;
    private List<Livro> livrosRelacionados;
    private List<Revisao> revisoes;
    private List<Avaliacao> avaliacoes;
    private Estoque estoque;
    private List<Oferta> ofertas;

    public Livro(String descricao, String isbn, List<Autor> autores, Estoque estoque) {
        this.descricao = descricao;
        this.isbn = isbn;
        this.autores = autores;
        this.estoque = estoque;
    }

    public Livro(String descricao, String isbn, List<Autor> autores, List<Livro> livrosRelacionados, Estoque estoque) {
        this.descricao = descricao;
        this.isbn = isbn;
        this.autores = autores;
        this.livrosRelacionados = livrosRelacionados;
        this.estoque = estoque;
    }

    public UUID getId() {
        return id;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Livro> getLivrosRelacionados() {
        return livrosRelacionados;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public List<Revisao> getRevisoes() {
        return revisoes;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public Oferta adicionaOferta(Vendedor vendedor, float valor) {
        Optional<Oferta> ofertaBusca = ofertas.stream().filter(o -> o.getVendedor().getId().equals(vendedor.getId())).findFirst();

        if (ofertaBusca.isPresent()) {
            throw new RuntimeException("Já existe uma oferta do vendedor " + vendedor.getNome());
        } else {
            Oferta oferta = vendedor.criarOferta(valor);
            ofertas.add(oferta);
            return oferta;
        }
    }

    public Avaliacao adicionaAvaliacao(Cliente cliente, Integer pontuacao) {
        Optional<Avaliacao> avaliacaoBusca = avaliacoes.stream().filter(a -> a.getAvaliador().getId().equals(cliente.getId())).findFirst();

        if (avaliacaoBusca.isPresent()) {
            throw new RuntimeException("Já existe uma avaliação para o cliente " + cliente.getNome());
        } else {
            Avaliacao avaliacao = cliente.criaAvaliacao(pontuacao);
            avaliacoes.add(avaliacao);
            return avaliacao;
        }
    }

    public Revisao adicionaRevisao(Revisor revisor, String descricao) {
        Optional<Revisao> revisaoBusca = revisoes.stream().filter(r -> r.getRevisor().getId().equals(revisor.getId())).findFirst();

        if (revisaoBusca.isPresent()) {
            throw new RuntimeException("Já existe uma revisão do revisor " + revisor.getNome());
        } else {
            Revisao revisao = revisor.criaRevisao(descricao);
            revisoes.add(revisao);
            return revisao;
        }
    }

    public Estoque alteraQuantidadeEstoque(Integer quantidade) {
        this.estoque = estoque.alteraQuantidade(quantidade);
        return estoque;
    }

}
