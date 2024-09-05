package com.example;

public class Rotar extends Tetris {
    private int filas;
    private int columnas;
    public int piezas [][];

    public int[][] getForma(){
        return piezas;
    }

    public boolean RotarPiezaIzq(){
        piezas = rotarIzquierda(piezas);
        return true;
    }
    public boolean RotarPiezaDer(){
        piezas = rotarDerecha(piezas);
        return true;
    }

    public int[][] rotarDerecha (int[][] pieza ){
        filas = pieza.length;
        columnas = pieza[0].length;

        int[][] rotada = new int[columnas][filas];
        
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                rotada[i][j] = pieza[filas - 1 - j][i];
            }
        }
        return rotada;


    }

    public int[][] rotarIzquierda (int[][] pieza ){
        int filas = pieza.length;
        int columnas = pieza[0].length;

        int[][] rotada = new int[columnas][filas];
        
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                rotada[i][j] = pieza[j][columnas - 1 - i];
            }
        }
        return rotada;


    }
    
    
}
