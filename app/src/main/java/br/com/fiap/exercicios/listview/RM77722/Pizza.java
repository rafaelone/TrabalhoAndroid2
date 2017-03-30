package br.com.fiap.exercicios.listview.RM77722;

import java.io.Serializable;

/**
 * Created by casa on 30/03/17.
 */

public class Pizza implements Serializable{

    private String descricao;
    private int imagem;
    private String valor;

    public Pizza(String descricao, int imagem, String valor) {
        this.descricao = descricao;
        this.imagem = imagem;
        this.valor = valor;
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
