package br.com.poli.LIG4.Exceptions;

public class InvalidValue extends Exception {
    
    public InvalidValue(String problem){
        super("Valor invalido pelo seguinte erro: " + problem);
    }
}