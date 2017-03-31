package br.com.fiap.exercicios.listview.RM77722;

import java.io.Serializable;

/**
 * Created by casa on 30/03/17.
 */

public class Pizza implements Serializable{

    private String descricao;
    private int imagem;
    private String valor;
    private String nome;
    private String ingredientes;
    private String alergicos;
    private int rank;

    public Pizza(String descricao, int imagem, String valor, String nome, String ingredientes, String alergicos, int rank) {
        this.descricao = descricao;
        this.imagem = imagem;
        this.valor = valor;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.alergicos = alergicos;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getAlergicos() {
        return alergicos;
    }

    public void setAlergicos(String alergicos) {
        this.alergicos = alergicos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
