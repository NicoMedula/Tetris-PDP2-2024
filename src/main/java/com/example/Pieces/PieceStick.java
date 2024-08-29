package com.example.Pieces;

import com.example.IRotar;
import com.example.IPiece;
import com.example.Tetris;

public class PieceStick extends Tetris
            implements IRotar,IPiece{

    public int[][] piezas;
    
    @Override
    public boolean setPieza() {
        
        piezas = new int[4][1];

        piezas[0][0] =1;
        piezas[1][0] =1;
        piezas[2][0] =1;
        piezas[3][0] =1;

        return true;
        
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
