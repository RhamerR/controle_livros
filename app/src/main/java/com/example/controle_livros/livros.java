package com.example.controle_livros;

public class livros {

    private String ID;
    private String nome;
    private String titulo;
    private String autor;
    private Integer Quantidade;
    private Integer Pagina_atual;
    private boolean iniciado;
    private boolean finalizado;


    public livros() {

    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Quantidade = quantidade;
    }

    public Integer getPagina_atual() {
        return Pagina_atual;
    }

    public void setPagina_atual(Integer pagina_atual) {
        Pagina_atual = pagina_atual;
    }

    public boolean isIniciado() {
        return iniciado;
    }

    public void setIniciado(boolean iniciado) {
        this.iniciado = iniciado;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}