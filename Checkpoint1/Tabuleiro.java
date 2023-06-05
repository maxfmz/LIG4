package projeto.lig4;

public class Tabuleiro {
    
    private int[][] tabuleiro;
    private int max_x;
    private int max_y;
    
    
    public Tabuleiro(){
        this.max_x = 7;
        this.max_y = 6;
        this.tabuleiro = new int[max_y][max_x];
        int value = 1;
        for (int i = 0; i < max_y; i++) {
            for (int j = 0; j < max_x; j++) {
                tabuleiro[i][j] = value;
                value++;
            }
        }
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public int getTabuleiro(int x, int y) {
        return this.tabuleiro[y][x];
    }
    
    public void setTabuleiro(int x, int y, int num) {
        this.tabuleiro[y][x] = num;
    }
    
    public void printTable(){
        System.out.println("-------------------------");
        for(int i = 0; i < max_y;i++){
            for(int j = 0;j < max_x;j++){
                System.out.print(this.tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    } 
}
