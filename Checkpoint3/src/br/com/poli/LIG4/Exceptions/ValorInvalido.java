package br.com.poli.LIG4.Exceptions;

public class ValorInvalido extends Exception {
    
    public ValorInvalido(String problem){
        super("Valor invalido pelo seguinte erro: " + problem);
    }
}
