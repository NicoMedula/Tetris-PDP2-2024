package com.example.Pieces;

import com.example.IRotar;
import com.example.IPiece;

public class PieceStick
            implements IRotar,IPiece{
    
    @Override
    public boolean setPieza() {
        
        return true;
        
    }
    public boolean RotarPieza(){
        return true;
    }

    
}
