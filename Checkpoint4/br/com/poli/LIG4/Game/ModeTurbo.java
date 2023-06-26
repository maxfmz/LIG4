package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class ModeTurbo extends GameLogic {

    public boolean onePoint;
    
    public ModeTurbo(Player p1, Player p2, boolean b) {
        super(p1,p2);
        this.onePoint = b;
    }
    
        /*
            Caso alguma peça nas diagonais possa ser pintada, ela será, e uma
            checagem será realizada para retirar os pontos que aquela peça
            poderia estar formando.
        */
    
    public void putDirectPiece(int y, int x, Player p){
        if ((x >= 0 && x <= 6) && tab.getPiece(y,x).getExists() == true && tab.getPiece(y,x).getPlayer() != p){
            tab.getPiece(y,x).setPlayer(p);
            tab.getPiece(y,x).setCanScore(true); 
            checkPoints();
            checkScore(y,x, p);
        }
    }
    

        /*
            Caso seja a vez do bot, o x será decidido por seus métodos.
            Caso o contrário, o x será checado em selectY, validado em
            putPiece, e serão realizadas as checagens de ponto, e se
            as peças nas horizontais serão pintadas ou não.
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
                    putDirectPiece(y,x + 1, playing);
                    putDirectPiece(y,x - 1, playing);
                    checkScore(y,x,playing);
                    countPoints();
                }
            }
        return validPlay;
    }    
    

}



