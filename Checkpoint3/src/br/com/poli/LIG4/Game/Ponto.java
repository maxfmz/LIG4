package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;

public class Ponto {
    
    private int[] x;
    private int[] y;
    private Player player;
    
    public Ponto(int y0, int y1, int y2, int y3, int x0, int x1, int x2, int x3, Player p){
        this.y = new int[4];
        this.x = new int[4];
        this.y[0] = y0;
        this.y[1] = y1;
        this.y[2] = y2;
        this.y[3] = y3;
        this.x[0] = x0;
        this.x[1] = x1;
        this.x[2] = x2;
        this.x[3] = x3;
        this.player = p;
    }

    
    
    public int getX(int i) {
        return x[i];
    }

    public void setX(int x, int i) {
        this.x[i] = x;
    }

    public int getY(int i) {
        return y[i];
    }

    public void setY(int y, int i) {
        this.y[i] = y;
    }
    
    public int[] getX(){
        return this.x;
    }
    
    public int[] getY(){
        return this.y;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
}
