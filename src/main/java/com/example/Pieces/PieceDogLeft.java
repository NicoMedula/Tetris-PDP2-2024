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
        
        return true;
    }

}
