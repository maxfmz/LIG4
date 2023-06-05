package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class ModeNormal extends GameLogic {

    public ModeNormal(Player p1, Player p2) {
        super(p1, p2);
    }
    
    
    public boolean turn(Player player){
        boolean loopTurn = true;
        while(loopTurn == true){
            int play_x = scan.nextInt();
            int play_y = choosePlace(play_x);
            loopTurn = putPiece(play_y,play_x, player);
            if(loopTurn == false){
                checkScore(play_y,play_x, player);
                countPoints();
                System.out.println("Player 1: " + pPoints[0] + "\nPlayer 2: " + pPoints[1]);
            }
        }
        return endGame();
    }
}
