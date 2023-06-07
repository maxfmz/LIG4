/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.poli.LIG4;

import br.com.poli.LIG4.Game.GameMain;
import br.com.poli.LIG4.Graficos.Menu;
import br.com.poli.LIG4.Info.Player;

public class Main {
    
    public static void main(String[] args){
        
   /*    Player p1 = new Player("Max",1);
        Player p2 = new Player("Murilo", 2);
        p2.setBot(true);
        
        GameMain game = new GameMain(p1, p2);
        
        game.runGame(); */
   
        Menu menu = new Menu();
	menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        
    }
}
