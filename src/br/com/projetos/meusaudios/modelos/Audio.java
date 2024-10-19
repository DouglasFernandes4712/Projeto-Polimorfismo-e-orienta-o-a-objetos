package br.com.projetos.meusaudios.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }

    public void pegaReproducao(){
        for (int i = 0; i < 500; i++) {
            reproduz();
        }
    }
    public void pegaCurtidas(){
        for (int i = 0; i < 500; i++) {
            curte();
        }
    }

}