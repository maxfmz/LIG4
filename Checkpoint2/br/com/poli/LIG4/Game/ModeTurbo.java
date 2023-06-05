package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;



public class ModeTurbo extends GameLogic {

    public ModeTurbo(Player p1, Player p2) {
        super(p1, p2);
    }
    
    public void putDirectPiece(int y, int x, Player p){
        if (x >= 0 && x <= 6 && tab.tabuleiro[y][x].getExiste() == true){
            tab.tabuleiro[y][x].setPlayer(p);
            tab.setTabuleiroJogo(p.getNum(),x,y);
            checkScore(y,x,p);
        }
    }
    
    public void checkPontos(){
        if(this.pPoints[0] != 0 || this.pPoints[1] != 0){
            for (int i = 0;i < pontos.size();i++){
                int pointsX[] = pontos.get(i).getX();
                int pointsY[] = pontos.get(i).getY();
                Player pointsP = pontos.get(i).getPlayer();

                int contador = 0;
                for(int j = 0; j < 4; j++){
                    if(tab.tabuleiro[pointsY[j]][pointsX[j]].getPlayer() != pointsP){
                        contador++;
                        System.out.println(" X: " + pointsX[j] + " Y: " + pointsY[j] + " Player: " + pointsP.getNum() + " Player: " + tab.tabuleiro[pointsY[j]][pointsX[j]].getPlayer().getNum());
                    }
                }
                if (contador > 0){
                    for(int j = 0; j < 4; j++){
                        if(tab.tabuleiro[pointsY[j]][pointsX[j]].getPlayer() == pointsP){
                            tab.tabuleiro[pointsY[j]][pointsX[j]].setDisponibilidade(true);                   
                        }
                    }
                    pontos.remove(i);
                }
            }
        }
    }
    
    public boolean turn(Player player){
        boolean loopTurn = true;
        while(loopTurn == true){
            int play_x = scan.nextInt();
            int play_y = choosePlace(play_x);
            loopTurn = putPiece(play_y,play_x, player);
            if(loopTurn == false){
                checkScore(play_y,play_x, player);
                putDirectPiece(play_y,play_x + 1, player);
                putDirectPiece(play_y,play_x - 1, player);
                checkPontos();
                countPoints();
                System.out.println("Player 1: " + pPoints[0] + "\nPlayer 2: " + pPoints[1]);
            }
        }
        return endGame();
    }
    
    
}
