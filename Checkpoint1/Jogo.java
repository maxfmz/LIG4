
package projeto.lig4;

import java.util.Scanner;

public class Jogo  {
    
    private Tabuleiro tabgame;
    private boolean loop_game;
    private Logica loggame;
        
    public Jogo(){
        this.tabgame = new Tabuleiro();
        this.loggame = new Logica(tabgame);
        this.loop_game = true;
    }
        
    
    public void run_game(){
        while(loop_game == true){
            this.tabgame.printTable();
            this.loggame.play();
        }
    }
}
