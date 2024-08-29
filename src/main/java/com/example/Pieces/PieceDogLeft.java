package com.example.Pieces;

import com.example.IRotar;
import com.example.Piece;


public class PieceDogLeft extends Piece
            implements IRotar{

    public boolean RotarPieza(){
        return true;
    }

    
    @Override
    public void setPieza() {
        int pieza [][] = new int[2][3];
        //Primer fila
        pieza[0][0] = 1;
        pieza[0][1] = 1;
        pieza[0][2] = 0;

        super.setPieza();
    }

}
