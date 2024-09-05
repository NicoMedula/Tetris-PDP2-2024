package com.example.Pieces;

import com.example.IPiece;
import com.example.PiecesStats;

public class PieceEleRight extends PiecesStats
            implements IPiece {

    @Override
    public boolean getPieza() {
        piezas = new int[3][2];
        
        piezas[0][0] =1;
        piezas[0][1] =0;

        piezas[1][0] =1;
        piezas[1][1] =0;

        piezas[2][0] =1;
        piezas[2][1] =1;
        
        return true;
    }
    public int[][] getForma(){
        return piezas;
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