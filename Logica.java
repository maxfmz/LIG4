package projeto.lig4;

import java.util.Scanner;

public class Logica {
    
    Scanner scan = new Scanner(System.in);
    Tabuleiro tab = new Tabuleiro();

    public Logica(Tabuleiro t) {
        this.tab = t;
    }
    
    public void play(){
        int num = scan.nextInt();
        int maxNum = num + 35;
        putPiece(num,maxNum);
    }
    
    public void putPiece(int n, int mn){
        boolean result = false;
        int tabY = 0;
        int tabX = 0;
        for(int i = 5;i>=0;i--){
            if (mn == tab.getTabuleiro()[i][n - 1]){
                tabY = i;
                tabX = n - 1;
                result = true;
                i = 0;
            }else{
                mn -= 7;
            }
        }
        if (result == true){
            tab.setTabuleiro(tabX,tabY,100);
        }else{
            System.out.println("Não foi possível fazer essa jogada.");
        }
    }
}

