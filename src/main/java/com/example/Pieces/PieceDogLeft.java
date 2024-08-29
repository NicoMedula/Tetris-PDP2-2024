package com.example.Pieces;

import com.example.IRotar;
import com.example.IPiece;


public class PieceDogLeft 
            implements IRotar,IPiece{

    public boolean RotarPieza(){
        return true;
    }

    
    @Override
    public boolean setPieza() {
        int piezas[][] = new int[2][3];
        
        //Primer fila
        piezas[0][0] = 1;
        piezas[0][1] = 1;
        piezas[0][2] = 0;
        //Segunda fila
        piezas[1][0] = 0;
        piezas[1][1] = 1;
        piezas[1][2] = 1;
        
        return true;
    }

}
