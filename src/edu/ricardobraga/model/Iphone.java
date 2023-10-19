package edu.ricardobraga.model;

import java.util.Arrays;
import java.util.List;

import edu.ricardobraga.interfaces.AparelhoTelefonico;
import edu.ricardobraga.interfaces.NavegadorDeInternet;
import edu.ricardobraga.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet {

    

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba em branco");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar(Musica musica) {        
        System.out.println("Tocando música selecionada" + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica() {
        List<Musica> listmusica = Arrays.asList(new Musica("musica1"), new Musica("musica2"), new Musica("musica3"));        
        Musica musicaSelecionada = listmusica.get(1);
        tocar(musicaSelecionada);
        
    }

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para: " + numeroTelefone);

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
