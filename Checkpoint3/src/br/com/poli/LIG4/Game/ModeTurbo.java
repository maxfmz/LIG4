package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;



public class ModeTurbo extends GameLogic {

    public ModeTurbo(Player p1, Player p2) {
        super(p1, p2);
    }
    
    public void putDirectPiece(int y, int x, Player p){
        if ((x >= 0 && x <= 6) && tab.getPeca(y,x).getExiste() == true && tab.getPeca(y,x).getPlayer() != p){
            tab.getPeca(y,x).setPlayer(p);
            tab.getPeca(y,x).setDisponibilidade(true); 
            tab.setTabuleiroJogo(p.getNum(),x,y);
            checkPontos();
            checkScore(y,x, p);
        }
    }
        
    
    public boolean turn(Player playing,Player standby){
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
                putDirectPiece(play_y,play_x + 1, playing);
                putDirectPiece(play_y,play_x - 1, playing);
                checkScore(play_y,play_x, playing);
                countPoints();
                System.out.println("Player 1: " + pPoints[0] + "\nPlayer 2: " + pPoints[1]);
            }
        }
        return endGame();
    }
    
}



