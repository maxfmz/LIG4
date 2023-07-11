package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class ModeTurboMaluco extends GameLogic {
    
    private int probability;
    
    public ModeTurboMaluco(Player p1, Player p2, int p, boolean b) {
        super(p1, p2,b);
        this.probability = p;
    }
    
        /*
            Caso o número esteja de acordo com a probabilidade, true será
            retornado.
        */  
    
    public boolean probabilityTest(){
        int randNum = (int)(Math.random() * 100 - 1);
        return randNum < this.probability;
    }
    
        /*
            Caso o teste de probabilidade seja true, a peça em questão será
            pintada.
        */  
    
    public void putDirectPiece(int y, int x, Player p){
        if(probabilityTest() == true){
            if ((x >= 0 && x <= 6) && (y >= 0 && y <= 5) && tab.getPiece(y,x).getExists() == true && tab.getPiece(y,x).getPlayer() != p){
                tab.getPiece(y,x).setPlayer(p);
                tab.getPiece(y,x).setCanScore(true); 
                checkPoints();
                checkScore(y,x, p);
            }
        }
    }
    
        /*
            Caso seja a vez do bot, o x será decidido por seus métodos.
            Caso o contrário, o x será checado em selectY, validado em
            putPiece, e serão realizadas as checagens de ponto, e se
            as peças ao redor serão pintadas ou não.
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
                    putDirectPiece(y - 1,x - 1, playing);
                    putDirectPiece(y - 1,x, playing);
                    putDirectPiece(y - 1,x + 1, playing);
                    putDirectPiece(y,x - 1, playing);
                    putDirectPiece(y,x + 1, playing);
                    putDirectPiece(y + 1,x - 1, playing);
                    putDirectPiece(y + 1,x, playing);
                    putDirectPiece(y + 1,x + 1, playing);
                    checkScore(y,x,playing);
                    countPoints();
                }
            }
        return validPlay;
    }
    
    
}
