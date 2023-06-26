package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class ModeNormal extends GameLogic {
    
    public boolean onePoint;
    
    public ModeNormal(Player p1, Player p2, boolean b) {
        super(p1,p2);
        this.onePoint = b;
    }
    
        /*
            Caso seja a vez do bot, o x será decidido por seus métodos.
            Caso o contrário, o x será checado em selectY, validado em
            putPiece, e serão realizadas as checagens de ponto.
        */      
    
    public boolean turn(Player playing,Player standby,int x){
        boolean validPlay = true;
            if(playing.getBot() == true){
                    x = botPlays(standby, playing);
            }
            if(x != -1){
                int y = selectY(x);
                validPlay = putPiece(y,x,playing);
                if(validPlay == true){
                    checkScore(y,x,playing);
                    countPoints();
                }
            }
        return validPlay;
    }
}
