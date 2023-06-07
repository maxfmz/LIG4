package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class GameMain {
    
    private Player p1;
    private Player p2;
    private ModeTurboMaluco game;

    public GameMain(Player p1, Player p2) {
        this.game = new ModeTurboMaluco(p1,p2, 50);
        this.p1 = p1;
        this.p2 = p2;
    }

    public void runGame(){
        boolean loopGame = true;
        while(loopGame == true){
            game.tab.printTable();
            loopGame = game.turn(p1,p2);
            game.tab.printTable();
            loopGame = game.turn(p2,p1);
        }
    }
}
