package edu.ricardobraga.interfaces;

import edu.ricardobraga.model.ListaDeMusicas;
import edu.ricardobraga.model.Musica;

public interface ReprodutorMusical {
    public void tocar(Musica musica);
    public void pausar();
    public void selecionarMusica();
}
