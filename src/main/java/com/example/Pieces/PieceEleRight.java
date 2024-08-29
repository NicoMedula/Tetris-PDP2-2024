package com.example.Pieces;

import com.example.IPiece;
import com.example.IRotar;
import com.example.Tetris;

public class PieceEleRight extends Tetris
            implements IRotar,IPiece {
    
    public int piezas[][];

    @Override
    public boolean setPieza() {
        piezas = new int[3][2];
        
        piezas[0][0] =1;
        piezas[0][1] =0;

        piezas[1][0] =1;
        piezas[1][1] =0;

        piezas[2][0] =1;
        piezas[2][1] =1;
        
        return true;
    }
    public boolean RotarPiezaIzq(){
        piezas = rotarDerecha(piezas);
        return true;
    }
    public boolean RotarPiezaDer(){
        piezas = rotarIzquierda(piezas);
        return true;
    }

    
}