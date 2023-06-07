package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class ModeTurboMaluco extends ModeTurbo {
    
    private int probability;
    
    public ModeTurboMaluco(Player p1, Player p2, int p) {
        super(p1, p2);
        this.probability = p;
    }
    
    public boolean getRandomInt(){
        int randNum = (int)(Math.random() * 100 - 1);
        return randNum > this.probability;
    }
    
    public void canPutPiece(int y, int x, Player p){
        if(getRandomInt() == true){
            putDirectPiece(y,x,p);
        }
    }
    
    @Override
    public void putDirectPiece(int y, int x, Player p){
        if ((x >= 0 && x <= 6) && (y >= 0 && y <= 5) && tab.getPeca(y,x).getExiste() == true && tab.getPeca(y,x).getPlayer() != p){
            tab.getPeca(y,x).setPlayer(p);
            tab.getPeca(y,x).setDisponibilidade(true); 
            tab.setTabuleiroJogo(p.getNum(),x,y);
            checkPontos();
            checkScore(y,x, p);
        }
    }
    
    @Override
    
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
                canPutPiece(play_y - 1,play_x - 1, playing);
                canPutPiece(play_y - 1,play_x, playing);
                canPutPiece(play_y - 1,play_x + 1, playing);
                canPutPiece(play_y,play_x - 1, playing);
                canPutPiece(play_y,play_x, playing);
                canPutPiece(play_y,play_x + 1, playing);
                canPutPiece(play_y + 1,play_x - 1, playing);
                canPutPiece(play_y + 1,play_x, playing);
                canPutPiece(play_y + 1,play_x + 1, playing);
                checkScore(play_y,play_x, playing);
                countPoints();
                System.out.println("Player 1: " + pPoints[0] + "\nPlayer 2: " + pPoints[1]);
            }
        }
        return endGame();
    }
    
  /*  public boolean turn(Player player){
        boolean loopTurn = true;
        while(loopTurn == true){
            int play_x = scan.nextInt();
            int play_y = choosePlace(play_x);
            loopTurn = putPiece(play_y,play_x, player);
            if(loopTurn == false){
                canPutPiece(play_y - 1,play_x - 1, player);
                canPutPiece(play_y - 1,play_x, player);
                canPutPiece(play_y - 1,play_x + 1, player);
                canPutPiece(play_y,play_x - 1, player);
                canPutPiece(play_y,play_x, player);
                canPutPiece(play_y,play_x + 1, player);
                canPutPiece(play_y + 1,play_x - 1, player);
                canPutPiece(play_y + 1,play_x, player);
                canPutPiece(play_y + 1,play_x + 1, player);
                checkScore(play_y,play_x, player);
                countPoints();
                System.out.println("Player 1: " + pPoints[0] + "\nPlayer 2: " + pPoints[1]);
            }
        }
        return endGame();
    }
*/
}
