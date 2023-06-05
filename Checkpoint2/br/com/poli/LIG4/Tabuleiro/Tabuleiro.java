package br.com.poli.LIG4.Tabuleiro;

public class Tabuleiro {
    
    public Peca[][] tabuleiro;
    public int[][] tabuleiroJogo;
    
    public Tabuleiro(){
        this.tabuleiro = new Peca[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabuleiro[i][j] = new Peca(j,i);
            }
        }
        this.tabuleiroJogo = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabuleiroJogo[i][j] = 0;
            }
        }
    }
    
    public void setTabuleiroJogo(int p, int x, int y) {
        this.tabuleiroJogo[y][x] = p;
    }

    public Peca[][] getTabuleiro() {
        return tabuleiro;
    }
    
    public Peca getPeca(int y, int x) {
        return tabuleiro[y][x];
    }
    
    public void setTabuleiro(Peca[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void setTabuleiro(Peca p, int x, int y) {
        this.tabuleiro[y][x] = p;
    }
    
    
    public void printTable(){
        System.out.println("--------------------");
        for(int i = 0; i < 6;i++){
            for(int j = 0;j < 7;j++){
                System.out.print(this.tabuleiro[i][j].getDisponibilidade() + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    } 

    
    public void printWho(){
        System.out.println("--------------------");
        for(int i = 0; i < 6;i++){
            for(int j = 0;j < 7;j++){
                System.out.print(this.tabuleiroJogo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    
    
}
