package com.example;

public class PiecesStats extends Tetris {

    public int piezas [][];

    public int[][] getForma(){
        return piezas;
    }

    public boolean RotarPiezaIzq(){
        piezas = rotarIzquierda(piezas);
        return true;
    }
    public boolean RotarPiezaDer(){
        piezas = rotarDerecha(piezas);
        return true;
    }

    

    
}
