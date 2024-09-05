package com.example.Pieces;

import com.example.IPiece;
import com.example.PiecesStats;

public class PieceSquare extends PiecesStats implements IPiece {

    @Override
    public boolean getPieza() {
        int piezas [][] = new int [2][2]; 

        piezas[0][0] =1;
        piezas[0][1] =1;
        piezas[1][0] =1;
        piezas[1][1] =1;
        
        return true;
    }

}
