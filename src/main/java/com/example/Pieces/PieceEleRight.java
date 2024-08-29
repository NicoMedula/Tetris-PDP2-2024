package com.example.Pieces;

import com.example.IRotar;
import com.example.IPiece;

public class PieceEleRight 
            implements IRotar,IPiece {

    @Override
    public boolean setPieza() {
        
        return true;
    }
    public boolean RotarPieza(){
        return true;
    }

    
}