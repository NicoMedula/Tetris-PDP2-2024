package com.example.Pieces;

import com.example.IRotar;
import com.example.IPiece;

public class PieceStick
            implements IRotar,IPiece{
    
    @Override
    public boolean setPieza() {
        
        int piezas [][] = new int[4][1];

        piezas[0][0] = 1;
        piezas[1][0] =1;
        piezas[2][0] =1;
        piezas[3][0] =1;

        return true;
        
    }
    public boolean RotarPieza(){
        return true;
    }

    
}
