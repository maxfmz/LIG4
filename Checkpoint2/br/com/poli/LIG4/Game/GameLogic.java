package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;
import br.com.poli.LIG4.Tabuleiro.Tabuleiro;
import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<Ponto> pontos = new ArrayList();
    protected Player player1;
    protected Player player2;
    protected Tabuleiro tab;
    protected int[] pPoints;
    
    public GameLogic(Player p1, Player p2){
        this.pPoints = new int[2];
        this.pPoints[0] = 0;
        this.pPoints[1] = 0;
        this.player1 = p1;
        this.player1 = p2;
        this.tab = new Tabuleiro();
    }
    
    public int choosePlace(int x){
        int selected = -1;
        for(int y = 5;y >= 0;y--){
            if(tab.getPeca(y,x).getExiste() == false){
                selected++;
            }
        }
        return selected;
    }
    
    public boolean putPiece(int y, int x, Player p){
        if (y != -1){
            tab.getPeca(y,x).setExiste(true);
            tab.getPeca(y,x).setPlayer(p);
            tab.setTabuleiroJogo(p.getNum(),x,y); //TEMPORÁRIO
            return false;
        }else{
            System.out.println("Não é possível realizar a jogada");
            return true;
        }
    }
    //tab.getPeca(y,x).
    public void checkScore(int y, int x, Player p){
        if (y <= 2){
            if(tab.getPeca(y + 1,x).getDisponibilidade() == true && tab.getPeca(y + 2,x).getDisponibilidade() == true
                && tab.getPeca(y + 3,x).getDisponibilidade() == true){
                if(tab.getPeca(y + 1,x).getPlayer() == p && tab.getPeca(y + 2,x).getPlayer() == p
                   && tab.getPeca(y + 3,x).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y + 1,x).setDisponibilidade(false);
                    tab.getPeca(y + 2,x).setDisponibilidade(false);
                    tab.getPeca(y + 3,x).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y + 1,y + 2,y + 3,x,x,x,x,p));
                }
            }
        }
        if (y <= 2){
            if(tab.getPeca(y - 1,x).getDisponibilidade() == true && tab.getPeca(y - 2,x).getDisponibilidade() == true
                && tab.getPeca(y - 3,x).getDisponibilidade() == true){
                if(tab.getPeca(y - 1,x).getPlayer() == p && tab.getPeca(y - 2,x).getPlayer() == p
                   && tab.getPeca(y - 3,x).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y - 1,x).setDisponibilidade(false);
                    tab.getPeca(y - 2,x).setDisponibilidade(false);
                    tab.getPeca(y - 3,x).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y - 1,y - 2,y - 3,x,x,x,x,p));
                }
            }
        }
        if (x >= 3){
            if(tab.getPeca(y,x - 1).getDisponibilidade() == true && tab.getPeca(y,x - 2).getDisponibilidade() == true
                && tab.getPeca(y,x - 3).getDisponibilidade() == true){
                if(tab.getPeca(y,x - 1).getPlayer() == p && tab.getPeca(y,x - 2).getPlayer() == p
                   && tab.getPeca(y,x - 3).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y,x - 1).setDisponibilidade(false);
                    tab.getPeca(y,x - 2).setDisponibilidade(false);
                    tab.getPeca(y,x - 3).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y,y,y,x,x - 1,x - 2,x - 3,p));
                }
            }
        }
        if (x <= 3){
            if(tab.getPeca(y,x + 1).getDisponibilidade() == true && tab.getPeca(y,x + 2).getDisponibilidade() == true
                && tab.getPeca(y,x + 3).getDisponibilidade() == true){
                if(tab.getPeca(y,x + 1).getPlayer() == p && tab.getPeca(y,x + 2).getPlayer() == p
                   && tab.getPeca(y,x + 3).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y,x + 1).setDisponibilidade(false);
                    tab.getPeca(y,x + 2).setDisponibilidade(false);
                    tab.getPeca(y,x + 3).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y,y,y,x,x + 1,x + 2,x + 3,p));
                }
            }
        }
        if (x <= 3 && y<=2){
            if(tab.getPeca(y + 1,x + 1).getDisponibilidade() == true && tab.getPeca(y + 2,x + 2).getDisponibilidade() == true
                && tab.getPeca(y + 3,x + 3).getDisponibilidade() == true){
                if(tab.getPeca(y + 1,x + 1).getPlayer() == p && tab.getPeca(y + 2,x + 2).getPlayer() == p
                   && tab.getPeca(y + 3,x + 3).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y + 1,x + 1).setDisponibilidade(false);
                    tab.getPeca(y + 2,x + 2).setDisponibilidade(false);
                    tab.getPeca(y + 3,x + 3).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y + 1,y + 2,y + 3,x,x + 1,x + 2,x + 3,p));
                }
            }
        }
        if (x >= 3 && y <= 2){
            if(tab.getPeca(y + 1,x - 1).getDisponibilidade() == true && tab.getPeca(y + 2,x - 2).getDisponibilidade() == true
                && tab.getPeca(y + 3,x - 3).getDisponibilidade() == true){
                if(tab.getPeca(y + 1,x - 1).getPlayer() == p && tab.getPeca(y + 2,x - 2).getPlayer() == p
                   && tab.getPeca(y + 3,x - 3).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y + 1,x - 1).setDisponibilidade(false);
                    tab.getPeca(y + 2,x - 2).setDisponibilidade(false);
                    tab.getPeca(y + 3,x - 3).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y + 1,y + 2,y + 3,x,x - 1,x - 2,x - 3,p));
                }
            }
        }
        if (x <= 3 && y >= 3){
            if(tab.getPeca(y - 1,x + 1).getDisponibilidade() == true && tab.getPeca(y - 2,x + 2).getDisponibilidade() == true
                && tab.getPeca(y - 3,x + 3).getDisponibilidade() == true){
                if(tab.getPeca(y - 1,x + 1).getPlayer() == p && tab.getPeca(y - 2,x + 2).getPlayer() == p
                   && tab.getPeca(y - 3,x + 3).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y - 1,x + 1).setDisponibilidade(false);
                    tab.getPeca(y - 2,x + 2).setDisponibilidade(false);
                    tab.getPeca(y - 3,x + 3).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y - 1,y - 2,y - 3,x,x + 1,x + 2,x + 3,p));
                }
            }
        }
        if (x >= 3 && y >= 3){//
            if(tab.getPeca(y - 1,x - 1).getDisponibilidade() == true && tab.getPeca(y - 2,x - 2).getDisponibilidade() == true
                && tab.getPeca(y - 3,x - 3).getDisponibilidade() == true){
                if(tab.getPeca(y - 1,x - 1).getPlayer() == p && tab.getPeca(y - 2,x - 2).getPlayer() == p
                   && tab.getPeca(y - 3,x - 3).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y - 1,x - 1).setDisponibilidade(false);
                    tab.getPeca(y - 2,x - 2).setDisponibilidade(false);
                    tab.getPeca(y - 3,x - 3).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y - 1,y - 2,y - 3,x,x - 1,x - 2,x - 3,p));
                }
            }
        }
        if ((x >= 1 && x <= 4)  && (y >= 1 && y <= 3)){//
            if(tab.getPeca(y - 1,x - 1).getDisponibilidade() == true && tab.getPeca(y + 1,x + 1).getDisponibilidade() == true
                && tab.getPeca(y + 2,x + 2).getDisponibilidade() == true){
                if(tab.getPeca(y - 1,x - 1).getPlayer() == p && tab.getPeca(y + 1,x + 1).getPlayer() == p
                   && tab.getPeca(y + 2,x + 2).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y - 1,x - 1).setDisponibilidade(false);
                    tab.getPeca(y + 1,x + 1).setDisponibilidade(false);
                    tab.getPeca(y + 2,x + 2).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y - 1,y + 1,y + 2,x,x - 1,x + 1,x + 2,p));
                }
            }
        }
        if ((x >= 2 && x <= 5)  && (y >= 2 && y <= 4)){//
            if(tab.getPeca(y - 2,x - 2).getDisponibilidade() == true && tab.getPeca(y - 1,x - 1).getDisponibilidade() == true
                && tab.getPeca(y + 1,x + 1).getDisponibilidade() == true){
                if(tab.getPeca(y - 2,x - 2).getPlayer() == p && tab.getPeca(y - 1,x - 1).getPlayer() == p
                   && tab.getPeca(y + 1,x + 1).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y - 2,x - 2).setDisponibilidade(false);
                    tab.getPeca(y - 1,x - 1).setDisponibilidade(false);
                    tab.getPeca(y + 1,x + 1).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y - 2,y - 1,y + 1,x,x - 2,x - 1,x + 1,p));
                }
            }
        }
        if ((x >= 1 && x <= 4)  && (y >= 2 && y <= 4)){//
            if(tab.getPeca(y + 1,x - 1).getDisponibilidade() == true && tab.getPeca(y - 1,x + 1).getDisponibilidade() == true
                && tab.getPeca(y - 2,x + 2).getDisponibilidade() == true){
                if(tab.getPeca(y + 1,x - 1).getPlayer() == p && tab.getPeca(y - 1,x + 1).getPlayer() == p
                   && tab.getPeca(y - 2,x + 2).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y + 1,x - 1).setDisponibilidade(false);
                    tab.getPeca(y - 1,x + 1).setDisponibilidade(false);
                    tab.getPeca(y - 2,x + 2).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y + 1,y - 1,y - 2,x,x - 1,x + 1,x + 2,p));
                }
            }
        }
        if ((x >= 2 && x <= 5)  && (y >= 1 && y <= 3)){//
            if(tab.getPeca(y + 2,x - 2).getDisponibilidade() == true && tab.getPeca(y + 1,x - 1).getDisponibilidade() == true
                && tab.getPeca(y - 1,x + 1).getDisponibilidade() == true){
                if(tab.getPeca(y + 2,x - 2).getPlayer() == p && tab.getPeca(y + 1,x - 1).getPlayer() == p
                   && tab.getPeca(y - 1,x + 1).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y + 2,x - 2).setDisponibilidade(false);
                    tab.getPeca(y + 1,x - 1).setDisponibilidade(false);
                    tab.getPeca(y - 1,x + 1).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y + 2,y + 1,y - 1,x,x - 2,x - 1,x + 1,p));
                }
            }
        }
        if (y <= 1 && y >= 3){
            if(tab.getPeca(y - 1,x).getDisponibilidade() == true && tab.getPeca(y + 1,x).getDisponibilidade() == true
                && tab.getPeca(y + 2,x).getDisponibilidade() == true){
                if(tab.getPeca(y - 1,x).getPlayer() == p && tab.getPeca(y + 1,x).getPlayer() == p
                   && tab.getPeca(y + 2,x).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y - 1,x).setDisponibilidade(false);
                    tab.getPeca(y + 1,x).setDisponibilidade(false);
                    tab.getPeca(y + 2,x).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y - 1,y + 1,y + 2,x,x,x,x,p));
                }
            }
        }
        if (y <= 2 && y >= 4){
            if(tab.getPeca(y - 2,x).getDisponibilidade() == true && tab.getPeca(y - 1,x).getDisponibilidade() == true
                && tab.getPeca(y + 1,x).getDisponibilidade() == true){
                if(tab.getPeca(y - 2,x).getPlayer() == p && tab.getPeca(y - 1,x).getPlayer() == p
                   && tab.getPeca(y + 1,x).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y - 2,x).setDisponibilidade(false);
                    tab.getPeca(y - 1,x).setDisponibilidade(false);
                    tab.getPeca(y + 1,x).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y - 2,y - 1,y + 1,x,x,x,x,p));
                }
            }
        }
        if (x >= 1 && x <= 4){
            if(tab.getPeca(y,x - 1).getDisponibilidade() == true && tab.getPeca(y,x + 1).getDisponibilidade() == true
                && tab.getPeca(y,x + 2).getDisponibilidade() == true){
                if(tab.getPeca(y,x - 1).getPlayer() == p && tab.getPeca(y,x + 1).getPlayer() == p
                   && tab.getPeca(y,x + 2).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y,x - 1).setDisponibilidade(false);
                    tab.getPeca(y,x + 1).setDisponibilidade(false);
                    tab.getPeca(y,x + 2).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y,y,y,x,x - 1,x + 1,x + 2,p));
                }
            }
        }
        if (x >= 2 && x <= 5){
            if(tab.getPeca(y,x - 2).getDisponibilidade() == true && tab.getPeca(y,x - 1).getDisponibilidade() == true
                && tab.getPeca(y,x + 1).getDisponibilidade() == true){
                if(tab.getPeca(y,x - 2).getPlayer() == p && tab.getPeca(y,x - 1).getPlayer() == p
                   && tab.getPeca(y,x + 1).getPlayer() == p){
                    System.out.println("Ponto para o player: " + p.getNum());
                    tab.getPeca(y,x).setDisponibilidade(false);
                    tab.getPeca(y,x - 2).setDisponibilidade(false);
                    tab.getPeca(y,x - 1).setDisponibilidade(false);
                    tab.getPeca(y,x + 1).setDisponibilidade(false);
                    pontos.add(new Ponto(y,y,y,y,x,x - 2,x - 1,x + 1,p));
                }
            }
        }
    }
    
    public void countPoints(){
        int countp1 = 0;
        int countp2 = 0;
        for(int i = 0; i < pontos.size();i++){
            Player points = pontos.get(i).getPlayer();
            if(points.getNum() == 1){
                countp1++;
            }else if(points.getNum() == 2){
                countp2++;
            }
        }
        this.pPoints[0] = countp1;
        this.pPoints[1] = countp2;
    }
    
    public boolean endGame(){
        Player winner = null;
        int contador = 0;
        for (int i = 0; i <= 6; i++){
            if(tab.tabuleiro[0][i].getExiste() == true){
                contador++;
            }
        }
        if(contador == 7){
            if(pPoints[0] > pPoints[1]){
                winner = player1;
            }else if(pPoints[1] > pPoints[0]){
                winner = player2;
            }
            if (winner != null){
                System.out.println("O vencedor foi: " + winner.getNum());
                winner.setWins(winner.getWins() + 1);
            }else{
                System.out.println("EMPATE!");
            }
            return false;
        }else {
            return true;
        }
    }
}
