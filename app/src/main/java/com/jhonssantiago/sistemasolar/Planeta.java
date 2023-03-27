package com.jhonssantiago.sistemasolar;

public class Planeta {
    private int imagem;
    private String nome;
    private String c1;
    private String c2;
    private String c3;

    public Planeta(int imagem, String nome, String c1, String c2, String c3) {
        this.imagem = imagem;
        this.nome = nome;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Planeta(int imagem, String nome, String c1) {
        this.imagem = imagem;
        this.nome = nome;
        this.c1 = c1;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    @Override
    public String toString() {
        return  nome ;
    }
}
