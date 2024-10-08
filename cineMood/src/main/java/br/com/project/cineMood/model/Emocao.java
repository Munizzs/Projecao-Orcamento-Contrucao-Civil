package br.com.project.cineMood.model;

public class Emocao {
    private int id_emocao;
    private String nome;
    private String descricao;

    public Emocao(int id_emocao, String nome, String descricao) {
        this.id_emocao = id_emocao;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId_emocao() {return id_emocao;}

    public void setId_emocao(int id_emocao) {this.id_emocao = id_emocao;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}


    @Override
    public String toString() {
        return "Emocao{" +
                "id_emocao=" + id_emocao +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }


}
