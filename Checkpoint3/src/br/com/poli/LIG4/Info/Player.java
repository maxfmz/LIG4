/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poli.LIG4.Info;

import br.com.poli.LIG4.Exceptions.ValorInvalido;


public class Player {
    
    private String name;
    private int num;
    private int wins;
    private boolean bot;

    public Player(String name, int num) {
        this.name = name;
        this.num = num;
        this.wins = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) throws ValorInvalido {
        if(num == 1 || num == 2){
            this.num = num;
        }else{
            ValorInvalido e = new ValorInvalido("Jogador tem que ser 1 ou 2");
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
