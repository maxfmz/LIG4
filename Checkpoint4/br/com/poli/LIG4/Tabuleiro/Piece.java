package br.com.poli.LIG4.Tabuleiro;

import br.com.poli.LIG4.Info.Player;

public class Piece {
    
    private boolean exists;
    private boolean canScore;
    private Player p;

    
    public Piece(){
        this.canScore = false;
        this.exists = false;
    }
    
    public boolean getCanScore() {
        return canScore;
    }
    
    public void setCanScore(boolean canScore) {
        this.canScore = canScore;
    }

    public boolean getExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
        if (this.exists == false){
            this.setCanScore(false);
        }else if(this.exists == true){
            this.setCanScore(true);
        }
    }

    public Player getPlayer() {
        return p;
    }

    public void setPlayer(Player p) {
        this.p = p;
    }
    
}
