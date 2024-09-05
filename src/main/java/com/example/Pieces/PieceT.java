package com.example.Pieces;

import com.example.IPiece;
import com.example.Rotar;

public class PieceT extends Rotar
            implements IPiece {

    @Override
    public boolean getPieza() {

        piezas = new int[2][3];

        //Primer fila
        piezas[0][0] = 0;
        piezas[0][1] = 1;
        piezas[0][2] = 0;

        //Segunda fila
        piezas[1][0] = 1;
        piezas[1][1] = 1;
        piezas[1][2] = 1;

    

        return true;
        
    }
}