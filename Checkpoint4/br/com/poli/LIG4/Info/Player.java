package br.com.poli.LIG4.Info;

import br.com.poli.LIG4.Exceptions.InvalidValue;

public class Player {
    
    private String name;
    private int num;
    private int wins;
    private boolean bot;

    public Player(String name, int num) {
        this.name = name;
        this.num = num;
        this.wins = 0;
        if(this.name.equals("Maquina")){
            this.bot = true;
        }else{
            this.bot = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) throws InvalidValue {
        if(num == 1 || num == 2){
            this.num = num;
        }else{
            InvalidValue e = new InvalidValue("Jogador tem que ser 1 ou 2");
            throw e;
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public boolean getBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }
    
    
    
    
}
