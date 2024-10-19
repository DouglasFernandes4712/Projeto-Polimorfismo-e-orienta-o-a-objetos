package br.com.projetos.meusaudios.principal;

import br.com.projetos.meusaudios.modelos.MeusPreferidos;
import br.com.projetos.meusaudios.modelos.Musica;
import br.com.projetos.meusaudios.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Arials");
        minhaMusica.setCantor("System Of A Down");
        minhaMusica.setAlbum("System Of A Down");

        minhaMusica.pegaCurtidas();
        minhaMusica.pegaReproducao();

        PodCast podcast = new PodCast();
        podcast.setTitulo("Libertadores de 2012");
        podcast.setApresentadores("Douglas Fernandes");

        podcast.pegaCurtidas();
        podcast.pegaReproducao();


        MeusPreferidos preferidos = new MeusPreferidos();
        preferidos.inclui(podcast);
        preferidos.inclui(minhaMusica);
    }
}