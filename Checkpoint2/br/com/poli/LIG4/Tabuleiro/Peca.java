package br.com.poli.LIG4.Tabuleiro;

import br.com.poli.LIG4.Info.Player;

public class Peca {
    
    private int x;
    private int y;
    private boolean existe;
    private boolean disponibilidade;
    private Player p;

    
    public Peca(int x, int y){
        this.disponibilidade = false;
        this.existe = false;
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
        if (this.existe == false){
            this.setDisponibilidade(false);
        }else if(this.existe == true){
            this.setDisponibilidade(true);
        }
    }

    public Player getPlayer() {
        return p;
    }

    public void setPlayer(Player p) {
        this.p = p;
    }
    
    
    
    
}
