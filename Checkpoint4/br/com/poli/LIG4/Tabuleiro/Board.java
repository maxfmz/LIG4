package br.com.poli.LIG4.Tabuleiro;

import br.com.poli.LIG4.Exceptions.InvalidValue;

public class Board {
    
    public Piece[][] board;
    
    public Board(){
        this.board = new Piece[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = new Piece();
            }
        }
    }
    
    public Piece[][] getBoard() {
        return board;
    }
    
    public Piece getPiece(int y, int x) {
        return board[y][x];
    }
    
    public void setBoard(Piece p, int x, int y) throws Exception {
        if(y < 0 || y > 5 || x < 0 || x > 6){
            this.board[y][x] = p;
        }else{
            InvalidValue e = new InvalidValue("Peca inexistente");
            throw e;
        }
    }
    
    
}
