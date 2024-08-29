package com.example;

public class Tetris {
    
    
    public int[][] rotarDerecha (int[][] pieza ){
        int filas = pieza.length;
        int columnas = pieza[0].length;

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
