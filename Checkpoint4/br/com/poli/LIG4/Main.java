package br.com.poli.LIG4;

import br.com.poli.LIG4.Graficos.Homescreen;
import br.com.poli.LIG4.Info.Ranking;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        /*
            Inicializa o ranking, e configura o bot para que
            ele funcione normalmente. Logo após inicializa
            a tela Home.
        */
        
        Ranking ranking = new Ranking();
        ranking.startPlayers("playerInfo.txt");
        ranking.checkBot();
        Homescreen home = new Homescreen(ranking);
        
    }
}
