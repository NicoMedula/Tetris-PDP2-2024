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

    public boolean getTerminoelJuego(){
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
            return board;
        
    }


    public boolean agregarPiezaEspecifica(IPiece pieza) {
    
    piezaActual = pieza;
    piezaActual.getPieza();
    
    if (piezaActual.getForma() == null) {
        return false; // Si no hay forma, no puede agregarse la pieza
    }
    
    if (PosicionarPiezaTablero(pieza)) {
        return true; // Si se posiciona correctamente, retorna true
    } else {
        JuegoTerminado = true; // Termina el juego si no se puede agregar la pieza
        return false;
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
        
        if (PosicionarPiezaTablero(pieza)) {
            return true;
        }else{
            JuegoTerminado=true;
            return false;
        }
        
        
        

    }

    public boolean PosicionarPiezaTablero(IPiece pieza) {

        if (piezaActual==null || piezaActual.getForma()==null)  {
            agregarPiezaRandom();
        }
        
        // Obtener forma de la pieza
        pieza.getPieza();
        
        int [][]forma = pieza.getForma();
        
        // Ancho disponible en el tablero para colocar la pieza
        int maxColumnaInicio = board[0].length - forma[0].length; // la pieza completa entre en el tablero
        int columna = random.nextInt(maxColumnaInicio + 1);  // Coloca la pieza aleatoriamente en una columna válida
        
        // Verificar si la pieza puede ser colocada en la fila 0 y columna calculada
        if (sePuedeColocarPieza(forma, 0, columna)) {
            for (int i = 0; i < forma.length; i++) {
                for (int j = 0; j < forma[i].length; j++) {
                    if (forma[i][j] != 0) {
                        board[i][columna + j] = forma[i][j];
                    }
                }
            }
            return true;
        
        } else {
            return false; // El juego termina si no puede colocar la pieza
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
            agregarPiezaRandom(); // Si no hay una pieza actual, agrega una pieza aleatoria.
            piezaActual.getPieza(); 
            if (piezaActual == null || piezaActual.getForma() == null) {
                // Si después de intentar agregar una pieza, sigue siendo nula o su forma es nula, salimos.
                return;
            }
            posicionColumna = random.nextInt(board[0].length - piezaActual.getForma()[0].length); 
        }
    
        piezaActual.getPieza(); 
    
        if (sePuedeColocarPieza(piezaActual.getForma(), posicionFila + 1, posicionColumna)) {
            BorrarPiezaActual(piezaActual.getForma(), posicionFila, posicionColumna); 
            posicionFila++;
            ColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna);
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
        if (piezaActual == null || piezaActual.getForma() == null) {
            return false; 
        }

        if (posicionColumna > 0 && sePuedeColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna - 1)) {
            BorrarPiezaActual(piezaActual.getForma(), posicionFila, posicionColumna);
            posicionColumna--;
            ColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna);
            return true;
        }

        return false;
    }


    public boolean moverPiezaaLaDerecha() {

        if (posicionColumna + piezaActual.getForma()[0].length < board[0].length 
            && sePuedeColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna + 1)) {
            BorrarPiezaActual(piezaActual.getForma(), posicionFila, posicionColumna);
            posicionColumna++;
            ColocarPieza(piezaActual.getForma(), posicionFila, posicionColumna);
            return true;
        }
        return false;
    }

    public boolean detenerPieza(int filas, int columnas,IPiece pieza){

        int[][] formaPieza = piezaActual.getForma();
        for (int i = 0; i < formaPieza.length; i++) {
            for (int j = 0; j < formaPieza[i].length; j++) {

                if (formaPieza[i][j] != 0) {
                    
                    if (posicionFila + i + 1 >= board.length|| board[posicionFila + i + 1][posicionColumna + j] != 0) {
                        return true; // La pieza ya no puede descender
                    }
                }
            }
        }
        return false; // La pieza puede descender
    }


    public boolean agregarPiezaAlCentro(IPiece pieza) {
        piezaActual = pieza; 
        piezaActual.getPieza(); 
    
        int[][] forma = piezaActual.getForma();
        
        
        int columnaCentro = (board[0].length / 2) - (forma[0].length / 2);//columna central para la pieza
            
        if (sePuedeColocarPieza(forma, 0, columnaCentro)) {  // Verifica si la pieza puede ser colocada en la fila 0 y columna calculada
            posicionFila = 0; 
            posicionColumna = columnaCentro; // Posiciona la columna en el centro
            ColocarPieza(forma, posicionFila, posicionColumna); // Coloca la pieza en el tablero
            return true;
        } else {
            return false; // Si no se puede colocar
        }
    }


}






