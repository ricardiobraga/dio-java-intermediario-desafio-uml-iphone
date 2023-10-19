package edu.ricardobraga;

import java.util.Arrays;
import java.util.List;

import edu.ricardobraga.model.Iphone;
import edu.ricardobraga.model.Musica;

public class App {

    public static void main(String[] args) {
        
    
        Iphone iphone = new Iphone();
    
    
        List<Musica> listmusica = Arrays.asList(new Musica("musica1"), new Musica("musica2"), new Musica("musica3"));

        System.out.println("Funções telefone: ");
        iphone.atender();
        iphone.ligar("41 9 9999-9999");
        iphone.iniciarCorreioDeVoz();

        System.out.println();

        System.out.println("Funções Reprodutor Musical: ");
        iphone.selecionarMusica();
        iphone.pausar();

        System.out.println();

        System.out.println("Funções Navegador de Internet: ");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();




        
        


        
    }

}
