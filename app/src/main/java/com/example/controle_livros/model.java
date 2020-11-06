package com.example.controle_livros;

public class model {

    private String ID;
    private String nome;
    private String titulo;
    private String autor;
    private Integer Quantidade;
    private Integer Pagina_atual;
    private String Status;


    public model() {

    }

    public model(String ID, String nome, String titulo, String autor, Integer quantidade, Integer pagina_atual, String status) {
        this.ID = ID;
        this.nome = nome;
        this.titulo = titulo;
        this.autor = autor;
        Quantidade = quantidade;
        Pagina_atual = pagina_atual;
        Status = status;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}