package com.example.Pieces;




public class PieceEleLeft extends PieceEleRight{

    public int piezas[][];
    
    @Override
    public boolean getPieza() {
        piezas = new int[3][2];
        
        piezas[0][0] =0;
        piezas[0][1] =1;

        piezas[1][0] =0;
        piezas[1][1] =1;

        piezas[2][0] =1;
        piezas[2][1] =1;
        return true;
    }

    

    public boolean RotarPiezaIzq(){
        piezas = rotarIzquierda(piezas);
        return true;
    }
    
    public boolean RotarPiezaDer(){
        piezas = rotarDerecha(piezas);
        return true;
    }
}
