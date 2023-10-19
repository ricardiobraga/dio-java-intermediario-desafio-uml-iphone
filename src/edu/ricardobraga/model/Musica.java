package edu.ricardobraga.model;

public class Musica {
    private String musica;

    public Musica(String musica) {
        this.musica = musica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public String toString() {
        return "Musica selecionada: " + musica;
    }

    


    
}
