package br.com.poli.LIG4.Game;

import br.com.poli.LIG4.Info.Player;
import br.com.poli.LIG4.Tabuleiro.Board;
import java.util.ArrayList;

public abstract class GameLogic {
    
    ArrayList<Point> points = new ArrayList();
    protected Player player1;
    protected Player player2;
    protected Board tab;
    private int[] pPoints;
    private boolean onePoint;
    
    public GameLogic(Player p1, Player p2, boolean b){
        this.pPoints = new int[2];
        this.pPoints[0] = 0;
        this.pPoints[1] = 0;
        this.player1 = p1;
        this.player1 = p2;
        this.onePoint = b;
        this.tab = new Board();
    }
    
        /*
            O getter para os pontos.
        */
    
    public int getPoints(int i){
        return pPoints[i];
    }
    
        /*
            O getter para o bool que indica se o jogo acabará em um ponto, ou não.
        */
    
    public boolean getOnePoint(){
        return onePoint;
    }    

    public Board getTab(){
        return this.tab;
    }
    
        /*
            Recebe um x, e checa a existencia de alguma peça nas
            posições abaixo, para decidir em que casa a peça sera jogada.
        */
    
    public int selectY(int x){
        int selected = -1;
        for(int y = 5;y >= 0;y--){
            if(tab.getPiece(y,x).getExists() == false){
                selected++;
            }
        }
        return selected;
    }
    
        /*
            Recebe um x, e o y da função selectY, caso y seja diferente de -1
            a peça vai ser colocada naquela posição (-1 representa uma jogada invalida)
        */    
    
    public boolean putPiece(int y, int x, Player p){
        if (y != -1){
            tab.getPiece(y,x).setExists(true);
            tab.getPiece(y,x).setPlayer(p);
            return true;
        }else{
            return false;
        }
    }
    
        /*
            Recebe a coordenada da jogada, e o Player que executou ela, e checa
            se as peças ao seu redor podem ou não marcar um ponto.
    
            Nesse caso, ele checa os valores de x e y, por que dependendo do valor,
            é impossível que se faça pontos de algumas formas especificas.
        */
    
    public void checkScore(int y, int x, Player p){
        if (y <= 2){
            if(tab.getPiece(y + 1,x).getCanScore() == true && tab.getPiece(y + 2,x).getCanScore() == true
                && tab.getPiece(y + 3,x).getCanScore() == true){
                if(tab.getPiece(y + 1,x).getPlayer() == p && tab.getPiece(y + 2,x).getPlayer() == p
                   && tab.getPiece(y + 3,x).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y + 1,x).setCanScore(false);
                    tab.getPiece(y + 2,x).setCanScore(false);
                    tab.getPiece(y + 3,x).setCanScore(false);
                    points.add(new Point(y,y + 1,y + 2,y + 3,x,x,x,x,p));
                }
            }
        }
        if (y >= 3){
            if(tab.getPiece(y - 1,x).getCanScore() == true && tab.getPiece(y - 2,x).getCanScore() == true
                && tab.getPiece(y - 3,x).getCanScore() == true){
                if(tab.getPiece(y - 1,x).getPlayer() == p && tab.getPiece(y - 2,x).getPlayer() == p
                   && tab.getPiece(y - 3,x).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y - 1,x).setCanScore(false);
                    tab.getPiece(y - 2,x).setCanScore(false);
                    tab.getPiece(y - 3,x).setCanScore(false);
                    points.add(new Point(y,y - 1,y - 2,y - 3,x,x,x,x,p));
                }
            }
        }
        if (x >= 3){
            if(tab.getPiece(y,x - 1).getCanScore() == true && tab.getPiece(y,x - 2).getCanScore() == true
                && tab.getPiece(y,x - 3).getCanScore() == true){
                if(tab.getPiece(y,x - 1).getPlayer() == p && tab.getPiece(y,x - 2).getPlayer() == p
                   && tab.getPiece(y,x - 3).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y,x - 1).setCanScore(false);
                    tab.getPiece(y,x - 2).setCanScore(false);
                    tab.getPiece(y,x - 3).setCanScore(false);
                    points.add(new Point(y,y,y,y,x,x - 1,x - 2,x - 3,p));
                }
            }
        }
        if (x <= 3){
            if(tab.getPiece(y,x + 1).getCanScore() == true && tab.getPiece(y,x + 2).getCanScore() == true
                && tab.getPiece(y,x + 3).getCanScore() == true){
                if(tab.getPiece(y,x + 1).getPlayer() == p && tab.getPiece(y,x + 2).getPlayer() == p
                   && tab.getPiece(y,x + 3).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y,x + 1).setCanScore(false);
                    tab.getPiece(y,x + 2).setCanScore(false);
                    tab.getPiece(y,x + 3).setCanScore(false);
                    points.add(new Point(y,y,y,y,x,x + 1,x + 2,x + 3,p));
                }
            }
        }
        if (x <= 3 && y<=2){
            if(tab.getPiece(y + 1,x + 1).getCanScore() == true && tab.getPiece(y + 2,x + 2).getCanScore() == true
                && tab.getPiece(y + 3,x + 3).getCanScore() == true){
                if(tab.getPiece(y + 1,x + 1).getPlayer() == p && tab.getPiece(y + 2,x + 2).getPlayer() == p
                   && tab.getPiece(y + 3,x + 3).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y + 1,x + 1).setCanScore(false);
                    tab.getPiece(y + 2,x + 2).setCanScore(false);
                    tab.getPiece(y + 3,x + 3).setCanScore(false);
                    points.add(new Point(y,y + 1,y + 2,y + 3,x,x + 1,x + 2,x + 3,p));
                }
            }
        }
        if (x >= 3 && y <= 2){
            if(tab.getPiece(y + 1,x - 1).getCanScore() == true && tab.getPiece(y + 2,x - 2).getCanScore() == true
                && tab.getPiece(y + 3,x - 3).getCanScore() == true){
                if(tab.getPiece(y + 1,x - 1).getPlayer() == p && tab.getPiece(y + 2,x - 2).getPlayer() == p
                   && tab.getPiece(y + 3,x - 3).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y + 1,x - 1).setCanScore(false);
                    tab.getPiece(y + 2,x - 2).setCanScore(false);
                    tab.getPiece(y + 3,x - 3).setCanScore(false);
                    points.add(new Point(y,y + 1,y + 2,y + 3,x,x - 1,x - 2,x - 3,p));
                }
            }
        }
        if (x <= 3 && y >= 3){
            if(tab.getPiece(y - 1,x + 1).getCanScore() == true && tab.getPiece(y - 2,x + 2).getCanScore() == true
                && tab.getPiece(y - 3,x + 3).getCanScore() == true){
                if(tab.getPiece(y - 1,x + 1).getPlayer() == p && tab.getPiece(y - 2,x + 2).getPlayer() == p
                   && tab.getPiece(y - 3,x + 3).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y - 1,x + 1).setCanScore(false);
                    tab.getPiece(y - 2,x + 2).setCanScore(false);
                    tab.getPiece(y - 3,x + 3).setCanScore(false);
                    points.add(new Point(y,y - 1,y - 2,y - 3,x,x + 1,x + 2,x + 3,p));
                }
            }
        }
        if (x >= 3 && y >= 3){//
            if(tab.getPiece(y - 1,x - 1).getCanScore() == true && tab.getPiece(y - 2,x - 2).getCanScore() == true
                && tab.getPiece(y - 3,x - 3).getCanScore() == true){
                if(tab.getPiece(y - 1,x - 1).getPlayer() == p && tab.getPiece(y - 2,x - 2).getPlayer() == p
                   && tab.getPiece(y - 3,x - 3).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y - 1,x - 1).setCanScore(false);
                    tab.getPiece(y - 2,x - 2).setCanScore(false);
                    tab.getPiece(y - 3,x - 3).setCanScore(false);
                    points.add(new Point(y,y - 1,y - 2,y - 3,x,x - 1,x - 2,x - 3,p));
                }
            }
        }
        if ((x >= 1 && x <= 4)  && (y >= 1 && y <= 3)){//
            if(tab.getPiece(y - 1,x - 1).getCanScore() == true && tab.getPiece(y + 1,x + 1).getCanScore() == true
                && tab.getPiece(y + 2,x + 2).getCanScore() == true){
                if(tab.getPiece(y - 1,x - 1).getPlayer() == p && tab.getPiece(y + 1,x + 1).getPlayer() == p
                   && tab.getPiece(y + 2,x + 2).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y - 1,x - 1).setCanScore(false);
                    tab.getPiece(y + 1,x + 1).setCanScore(false);
                    tab.getPiece(y + 2,x + 2).setCanScore(false);
                    points.add(new Point(y,y - 1,y + 1,y + 2,x,x - 1,x + 1,x + 2,p));
                }
            }
        }
        if ((x >= 2 && x <= 5)  && (y >= 2 && y <= 4)){//
            if(tab.getPiece(y - 2,x - 2).getCanScore() == true && tab.getPiece(y - 1,x - 1).getCanScore() == true
                && tab.getPiece(y + 1,x + 1).getCanScore() == true){
                if(tab.getPiece(y - 2,x - 2).getPlayer() == p && tab.getPiece(y - 1,x - 1).getPlayer() == p
                   && tab.getPiece(y + 1,x + 1).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y - 2,x - 2).setCanScore(false);
                    tab.getPiece(y - 1,x - 1).setCanScore(false);
                    tab.getPiece(y + 1,x + 1).setCanScore(false);
                    points.add(new Point(y,y - 2,y - 1,y + 1,x,x - 2,x - 1,x + 1,p));
                }
            }
        }
        if ((x >= 1 && x <= 4)  && (y >= 2 && y <= 4)){//
            if(tab.getPiece(y + 1,x - 1).getCanScore() == true && tab.getPiece(y - 1,x + 1).getCanScore() == true
                && tab.getPiece(y - 2,x + 2).getCanScore() == true){
                if(tab.getPiece(y + 1,x - 1).getPlayer() == p && tab.getPiece(y - 1,x + 1).getPlayer() == p
                   && tab.getPiece(y - 2,x + 2).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y + 1,x - 1).setCanScore(false);
                    tab.getPiece(y - 1,x + 1).setCanScore(false);
                    tab.getPiece(y - 2,x + 2).setCanScore(false);
                    points.add(new Point(y,y + 1,y - 1,y - 2,x,x - 1,x + 1,x + 2,p));
                }
            }
        }
        if ((x >= 2 && x <= 5)  && (y >= 1 && y <= 3)){//
            if(tab.getPiece(y + 2,x - 2).getCanScore() == true && tab.getPiece(y + 1,x - 1).getCanScore() == true
                && tab.getPiece(y - 1,x + 1).getCanScore() == true){
                if(tab.getPiece(y + 2,x - 2).getPlayer() == p && tab.getPiece(y + 1,x - 1).getPlayer() == p
                   && tab.getPiece(y - 1,x + 1).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y + 2,x - 2).setCanScore(false);
                    tab.getPiece(y + 1,x - 1).setCanScore(false);
                    tab.getPiece(y - 1,x + 1).setCanScore(false);
                    points.add(new Point(y,y + 2,y + 1,y - 1,x,x - 2,x - 1,x + 1,p));
                }
            }
        }
        if (y <= 1 && y >= 3){
            if(tab.getPiece(y - 1,x).getCanScore() == true && tab.getPiece(y + 1,x).getCanScore() == true
                && tab.getPiece(y + 2,x).getCanScore() == true){
                if(tab.getPiece(y - 1,x).getPlayer() == p && tab.getPiece(y + 1,x).getPlayer() == p
                   && tab.getPiece(y + 2,x).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y - 1,x).setCanScore(false);
                    tab.getPiece(y + 1,x).setCanScore(false);
                    tab.getPiece(y + 2,x).setCanScore(false);
                    points.add(new Point(y,y - 1,y + 1,y + 2,x,x,x,x,p));
                }
            }
        }
        if (y <= 2 && y >= 4){
            if(tab.getPiece(y - 2,x).getCanScore() == true && tab.getPiece(y - 1,x).getCanScore() == true
                && tab.getPiece(y + 1,x).getCanScore() == true){
                if(tab.getPiece(y - 2,x).getPlayer() == p && tab.getPiece(y - 1,x).getPlayer() == p
                   && tab.getPiece(y + 1,x).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y - 2,x).setCanScore(false);
                    tab.getPiece(y - 1,x).setCanScore(false);
                    tab.getPiece(y + 1,x).setCanScore(false);
                    points.add(new Point(y,y - 2,y - 1,y + 1,x,x,x,x,p));
                }
            }
        }
        if (x >= 1 && x <= 4){
            if(tab.getPiece(y,x - 1).getCanScore() == true && tab.getPiece(y,x + 1).getCanScore() == true
                && tab.getPiece(y,x + 2).getCanScore() == true){
                if(tab.getPiece(y,x - 1).getPlayer() == p && tab.getPiece(y,x + 1).getPlayer() == p
                   && tab.getPiece(y,x + 2).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y,x - 1).setCanScore(false);
                    tab.getPiece(y,x + 1).setCanScore(false);
                    tab.getPiece(y,x + 2).setCanScore(false);
                    points.add(new Point(y,y,y,y,x,x - 1,x + 1,x + 2,p));
                }
            }
        }
        if (x >= 2 && x <= 5){
            if(tab.getPiece(y,x - 2).getCanScore() == true && tab.getPiece(y,x - 1).getCanScore() == true
                && tab.getPiece(y,x + 1).getCanScore() == true){
                if(tab.getPiece(y,x - 2).getPlayer() == p && tab.getPiece(y,x - 1).getPlayer() == p
                   && tab.getPiece(y,x + 1).getPlayer() == p){
                    tab.getPiece(y,x).setCanScore(false);
                    tab.getPiece(y,x - 2).setCanScore(false);
                    tab.getPiece(y,x - 1).setCanScore(false);
                    tab.getPiece(y,x + 1).setCanScore(false);
                    points.add(new Point(y,y,y,y,x,x - 2,x - 1,x + 1,p));
                }
            }
        }
    }
    
    
        /*
            Checa os pontos que estão no array de pontos, caso o player de alguma
            das peças do ponto tenha mudado, ele retira o ponto.
    
            É útil para a contagem de pontos dos modos Turbo.
        */
    
    public void checkPoints(){
        if(this.pPoints[0] != 0 || this.pPoints[1] != 0){
            for (int i = 0;i < points.size();i++){
                int pointsX[] = points.get(i).getX();
                int pointsY[] = points.get(i).getY();
                Player pointsP = points.get(i).getPlayer();

                int contador = 0;
                for(int j = 0; j < 4; j++){
                    if(tab.board[pointsY[j]][pointsX[j]].getPlayer() != pointsP){
                        contador++;
                    }
                }
                if (contador > 0){
                    for(int j = 0; j < 4; j++){
                        if(tab.board[pointsY[j]][pointsX[j]].getPlayer() == pointsP){
                            tab.board[pointsY[j]][pointsX[j]].setCanScore(true);
                            checkScore(pointsY[j],pointsX[j],pointsP);
                        }
                    }
                    points.remove(i);
                }
            }
        }
    }
    
    
        /*
            Conta os pontos dos players 1 e 2, e adiciona na variavel do jogo.
        */
    
    
    public void countPoints(){
        int countp1 = 0;
        int countp2 = 0;
        for(int i = 0; i < points.size();i++){
            Player player = points.get(i).getPlayer();
            if(player.getNum() == 1){
                countp1++;
            }else if(player.getNum() == 2){
                countp2++;
            }
        }
        this.pPoints[0] = countp1;
        this.pPoints[1] = countp2;
    }
    
    
        /*
            Testa se o jogo acabou, e retorna o resultado no console.
        */
    
    public boolean endGame(boolean umPonto){
        if(umPonto == true){
            if(pPoints[0] >= 1){
                System.out.println("Vitoria do Player 1!");
                return true;
            }else if(pPoints[1] >= 1){
                System.out.println("Vitoria do Player 2!");
                return true;
            }
        }
            int contador = 0;
            for (int i = 0; i <= 6; i++){
                if(tab.board[0][i].getExists() == true){
                    contador++;
                }
            }
            if(contador == 7){
                countPoints();
                if(umPonto == false){
                    if(pPoints[0] > pPoints[1]){
                        System.out.println("Vitoria do Player 1!");
                    }else if(pPoints[1] > pPoints[0]){
                        System.out.println("Vitoria do Player 2!");
                    }
                }else{
                    System.out.println("EMPATE");
                }
                return true;
            }
        return false;
    }
    
        /*
            Randomiza uma jogada inicialmente, e depois checa se há alguma jogada
            que faz ponto, ou evita o ponto do outro player, caso sim, ela será
            a escolhida.
        */    
    
    public int botPlays(Player player,Player bot){

        countPoints();        
        int play = (int)(Math.random() * 7);
        
        play = checkPlay(player,play);        
        play = checkPlay(bot,play);
        
        return play;
        
    }
    
        /*
            Conta os pontos do jogo, e simula todas as jogadas possíveis.
            Caso em alguma jogada simulada o player em questão tenha vantagem
            nos pontos, ela será retornada.
        */
    
    public int checkPlay(Player p, int play){
        
        int currentScore = 0;
        
        if(p.getBot() == true){
            currentScore = pPoints[1] - pPoints[0];
        }else if(p.getBot() == false){
            currentScore = pPoints[0] - pPoints[1];
        }
        
        for (int botX = 0; botX < 7; botX++) {
            boolean approved;
            
            int botY = selectY(botX);
            approved = putPiece(botY,botX,p);
            
            if(approved == true){
                checkScore(botY,botX,p);
                countPoints();

                int score = 0;

                if(p.getBot() == true){
                    score = pPoints[1] - pPoints[0];
                }else if(p.getBot() == false){
                    score = pPoints[0] - pPoints[1];
                }
                
                tab.getPiece(botY,botX).setExists(false);
                tab.getPiece(botY,botX).setPlayer(null);

                checkPoints();

                if(score > currentScore){
                    currentScore = score;
                    play = botX;
                }
            }
        }
        return play;
    }
}