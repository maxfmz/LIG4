package br.com.poli.LIG4.Graficos;

import java.io.IOException;

public interface GameConnection {
    
    public void makeMove() throws IOException;
    
    public void botMove() throws IOException;
    
    public void switchPlayers(boolean condition);
    
    public void endTest() throws IOException;
    
}
