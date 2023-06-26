package br.com.poli.LIG4.Info;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ranking {

    public ArrayList<Player> players = new ArrayList();
    public File playerInfo;
    
    
        /*
            Construtor que checa a existencia do arquivo com as informações do
            ranking, e toma providencias dependendo da situação.
        */       

    public Ranking(){
        try {
              File PlayerInfo = new File("playerInfo.txt");
              if (PlayerInfo.createNewFile()) {
                System.out.println("Created file: " + PlayerInfo.getName());
              } else {
                System.out.println("The file alredy exists.");
              }
            } catch (IOException e) {
              System.out.println("ERROR!");
              e.printStackTrace();
        } 
    }
    
        /*
            Recebe um player e adiciona na lista de players do ranking.
        */   
    
    public void addPlayer(Player p) throws IOException{
        players.add(p);
    }
    
        /*
            Escreve os arquivos da lista de players no arquivo.
        */   
    
    public void refreshFile() throws IOException{
        FileWriter file = new FileWriter("playerInfo.txt");
        BufferedWriter writer = new BufferedWriter(file);
        for(int i = 0; i < players.size();i++){
            writer.write(players.get(i).getName() + "\n");
            writer.write(players.get(i).getWins() + "\n");
        }
        writer.close();
    }
    
        /*
            Cria a lista de players a partir das informações no arquivo.
        */   
    
    public void startPlayers(String filepath) throws IOException {
	FileReader fReader = new FileReader(filepath);
	BufferedReader bReader = new BufferedReader(fReader);
	String line = bReader.readLine();		
	while (line != null) {
            String nome = line;
            line = bReader.readLine();
            int wins = Integer.parseInt(line);
            Player p = new Player(nome,0);
            p.setWins(wins);
            addPlayer(p);
            line = bReader.readLine();
	}
	bReader.close();
    }
    
        /*
            Certifica que o player com o nome "Maquina" será um bot.
        */   
    
    public void checkBot() throws IOException{
        int contador = 0;
        for(int i = 0; i < players.size();i++){
            if (players.get(i).getName().equals("Maquina")){
                contador++;
            }
        }
        if(contador != 1){
            Player bot = new Player("Maquina",2);
            bot.setBot(true);
            addPlayer(bot);
        }
        refreshFile();
    }
    
        /*
            Checa se o nome passado já é de algum player existente na lista, e retorna
            o player caso ele exista.
        */   
    
    public Player checkPlayers(String nome){
        for(int i = 0;i < players.size();i++){
            if(players.get(i).getName().equals(nome)){
                return players.get(i);
            }
        }
        return null;
    }
    
        /*
            Adiciona uma win para o player passado no parametro, e atualiza a File.
        */   
    
    public void addWins(Player p) throws IOException{
        for(int i = 0;i < players.size();i++){
            if(players.get(i).getName().equals(p.getName())){
                players.get(i).setWins(p.getWins() + 1);
            }
        }
        refreshFile();
    }
    
        /*
            Ordena a lista do ranking, utilizado para constituir a página do ranking.
        */   
    
    public void sortRanking(){
        if(players.size() > 1){
            for(int i = 0;i < players.size();i++){
                for(int j = i; j < players.size(); j++){
                    if(players.get(i).getWins() < players.get(j).getWins()){
                        Collections.swap(players, i, j);
                    }
                }
            }
        }
    }
    
}
