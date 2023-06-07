package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class ModeNormal extends GameLogic {

    public ModeNormal(Player p1, Player p2) {
        super(p1,p2);
        this.player1 = p1;
        this.player2 = p2;
    }
    
    
    public boolean turn(Player playing, Player standby){
        boolean loopTurn = true;
        while(loopTurn == true){
            int play_x = 0;
            if(playing.getBot() == false){
                play_x = scan.nextInt();
            }else if(playing.getBot() == true){
                play_x = botPlays(standby, playing);
            }
            int play_y = choosePlace(play_x);
            loopTurn = putPiece(play_y,play_x, playing);
            if(loopTurn == false){
                checkScore(play_y,play_x, playing);
                countPoints();
            }
        }
        return endGame();
    }
}
