package com.example.Pieces;

import com.example.IRotar;
import com.example.IPiece;

public class PieceEleRight 
            implements IRotar,IPiece {

    @Override
    public boolean setPieza() {
        int piezas[][] = new int[3][2];
        
        piezas[0][0] =1;
        piezas[0][1] =0;

        piezas[1][0] =1;
        piezas[1][1] =0;

        piezas[2][0] =1;
        piezas[2][1] =1;
        
        return true;
    }
    public boolean RotarPiezaIzq(){
        return true;
    }
    public boolean RotarPiezaDer(){
        return true;
    }

    
}