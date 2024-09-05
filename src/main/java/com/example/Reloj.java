package com.example;


public class Reloj {

    private Board board;
    private int contadortic = 0;

    public Reloj(Board board) {
        this.board = board;
    }

    public boolean ticReloj() {
        if (contadortic % 2  != 0) { //suponiendo que cada tic es 1 segundo, la pieza actual bajaria cada 2 segundos
            return false;
        }else{
            board.bajarPieza();
            return true;
        }
        
    }

    public void setTic(){
        contadortic++; //suponiendo que cada tic es 1 segundo

    }

    public int getTic(){
        return contadortic;
    }

    
}
