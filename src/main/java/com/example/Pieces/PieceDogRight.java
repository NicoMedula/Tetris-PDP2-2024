package com.example.Pieces;


public class PieceDogRight extends PieceDogLeft{
    
    public int piezas[][];
    @Override
    public boolean setPieza() {
        piezas = new int[2][3];
        
        //Primer fila
        piezas[0][0] = 0;
        piezas[0][1] = 1;
        piezas[0][2] = 1;
        //Segunda fila
        piezas[1][0] = 1;
        piezas[1][1] = 1;
        piezas[1][2] = 0;

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
