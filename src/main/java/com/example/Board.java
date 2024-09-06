package com.example;

import java.util.Random;

import com.example.Pieces.PieceDogLeft;
import com.example.Pieces.PieceDogRight;
import com.example.Pieces.PieceEleLeft;
import com.example.Pieces.PieceEleRight;
import com.example.Pieces.PieceSquare;
import com.example.Pieces.PieceStick;
import com.example.Pieces.PieceT;

public class Board{

    private int board[][];
    private IPiece piezaActual;
    private Random random = new Random();
    private int posicionFila =0;
    private int posicionColumna;
    private boolean JuegoTerminado=false;

    public boolean getEstadoJuego(){
        return JuegoTerminado;
    }

    public void setBoard() {
        board = new int[10][20]; // Filas x Columnas

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                board[i][j] = 0;
            }
        }
    }
    public int[][] getBoard() {
        if (board != null) {
            return board;
        }else{
            return board;
        }
    }

    public boolean agregarPiezaRandom(){
        
        int randomPieza = random.nextInt(7);

        IPiece pieza = null;

        switch(randomPieza){
            case 0: pieza = new PieceSquare(); break;

            case 1: pieza = new PieceT(); break;

            case 2: pieza = new PieceStick(); break;

            case 3: pieza = new PieceEleLeft(); break;

            case 4: pieza = new PieceEleRight(); break;

            case 5: pieza = new PieceDogLeft(); break;
            
            case 6: pieza = new PieceDogRight(); break;
        }

        piezaActual=pieza;
        piezaActual.getPieza();

        if (piezaActual.getForma()==null) {
            return false;
        }
        
        PosicionarPiezaTablero(pieza);
        
        return true;

    }

    public boolean PosicionarPiezaTablero(IPiece pieza) {
        pieza.getPieza();
        
        int [][]forma = pieza.getForma();

        
        int AnchoColumna = board[0].length - forma[0].length; // siempre debe entrar en el tablero
        int columna = random.nextInt(AnchoColumna + 1);

        if (sePuedeColocarPieza(forma, 0, columna)) {
            for (int i = 0; i < forma.length; i++) {
                for (int j = 0; j < forma[i].length; j++) {

                    if (forma[i][j] != 0) {
                        board[i][columna + j] = forma[i][j];
                        
                    }
                
                }
            }
        return true;

        }else{
            return false;
        }
    }   

    public boolean sePuedeColocarPieza(int [][]forma,int fila, int columna) {
        
        if (fila + forma.length > board.length || columna + forma[0].length > board[0].length) {
            return false;
        } // se agrego esto para que siempre entre en los limites del tablero
            
        for(int i = 0; i < forma.length; i++) {
            for(int j = 0; j < forma[i].length; j++) {
                if (forma[i][j] != 0 && (columna + j >= board[0].length || board[fila + i][columna + j] != 0)) {
                    return false;
                }
            }

        }
        return true;
    }

    

    public void bajarPieza() {

        if (piezaActual == null) {
            agregarPiezaRandom(); 
            piezaActual.getPieza();
            posicionColumna = random.nextInt(board[0].length - piezaActual.getForma()[0].length); 
        } 

        piezaActual.getPieza();

        if (sePuedeColocarPieza(piezaActual.getForma(), posicionFila + 1, posicionColumna)) {

            BorrarPiezaActual(piezaActual.getForma(), posicionFila, posicionColumna); 

            posicionFila++;

            ColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna);

        }else{

            if (posicionFila==0) {
                JuegoTerminado=true;
            }
            
            piezaActual = null;
            
            posicionFila = 0;
        }
        
    }


    private void ColocarPieza(int[][] forma, int fila, int columna) {
        for (int i = 0; i < forma.length; i++) {
            for (int j = 0; j < forma[i].length; j++) {
                if (forma[i][j] != 0) {
                    board[fila + i][columna + j] = forma[i][j];
                }
            }
        }
    }


    private void BorrarPiezaActual(int[][] forma, int fila, int columna) {
        for (int i = 0; i < forma.length; i++) {
            for (int j = 0; j < forma[i].length; j++) {
                if (forma[i][j] != 0) {

                    board[fila + i][columna + j] = 0;
                }
            }
        }
    }
    public boolean moverPiezaaLaIzquierda() {
        if (piezaActual == null) {
            return false; // Si no hay pieza para mover
        }

        if (posicionColumna + piezaActual.getForma()[0].length < board[0].length //pregunyta si podemos mover a la izq
        && sePuedeColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna + 1)) {
            
            BorrarPiezaActual(piezaActual.getForma(), posicionFila, posicionColumna);

            posicionColumna--;

            ColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna);
            
            
        }
        return true;
    }
    public boolean moverPiezaaLaDerecha() {
        
        if (piezaActual == null) {
            return false; // Si no hay pieza para mover
        }

        if (posicionColumna + piezaActual.getForma()[0].length < board[0].length //pregunta si se puede mover a la derecha
        && sePuedeColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna + 1)) {
            
            BorrarPiezaActual(piezaActual.getForma(), posicionFila, posicionColumna);

            posicionColumna++;
            
            ColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna);
        }
        return true;
    }

    public boolean detenerPieza(int filas, int columnas,IPiece pieza){
        int[][] formaPieza= pieza.getForma();
        for(int i = 0; i < formaPieza.length; i++){
            for(int j = 0; j < formaPieza[i].length; j++){
                if(formaPieza[i][j] != 0){
                    if (i + 1 > board.length || board[i+1][j] != 0) {
                        return true;//la pieza ya no puede descender
                    }
                }
            }
        }
        return false;// la pieza puede seguir moviendose, no hay bloqueo
    }


}






