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
    public IPiece piezaActual;
    private Random random = new Random();
    public int posicionFila =0;
    public int posicionColumna;
    private boolean JuegoTerminado=false;
    private int lineasEliminadas = 0;
    private int lineasParaFinalizar = 5;

    public int getBoardWidth() {
        return board[0].length; // Retorna el número de columnas del tablero
    }
    

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

    
    if (PosicionarPiezaTablero(piezaActual)) {
        return true; // Si se posiciona correctamente, retorna true
    } else {
        JuegoTerminado = true; // Termina el juego si no se puede agregar la pieza
        return false;
    }
    }

    public IPiece getPiezaActual() {
        return piezaActual;
    }

    public void rotarPiezaAleatoriamente() {
        Tetris tetris = new Tetris();
        
        
        int rotacion = random.nextInt(2); // 0 para rotar a la izquierda, 1 para rotar a la derecha
        
        // Obtener la forma actual de la pieza
        int[][] formaActual = piezaActual.getForma();
        
        // Aplicar la rotación
        if (rotacion == 0) {
            // Rotar a la izquierda
            piezaActual.setForma(tetris.rotarIzquierda(formaActual));
        } else {
            // Rotar a la derecha
            piezaActual.setForma(tetris.rotarDerecha(formaActual));
        }
    }

    public void agregarPiezaRandom(int numero){
        switch(numero){
            case 0: piezaActual = new PieceSquare(); break;

            case 1: piezaActual = new PieceT(); break;

            case 2: piezaActual = new PieceStick(); break;

            case 3: piezaActual = new PieceEleLeft(); break;

            case 4: piezaActual = new PieceEleRight(); break;

            case 5: piezaActual = new PieceDogLeft(); break;
            
            case 6: piezaActual = new PieceDogRight(); break;
        }
        
    }

    public boolean agregarPiezaRandom(){
        
        int randomPieza = random.nextInt(7);

        agregarPiezaRandom(randomPieza);

        piezaActual.getPieza();

        if ( piezaActual.getForma() == null ) {
            agregarPiezaRandom();
        }

        if (agregarPiezaEspecifica(piezaActual) && piezaActual!=null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PosicionarPiezaTablero(IPiece pieza) {
        
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
        
        int[][] formaPieza = piezaActual.getForma();
    
        
        if (sePuedeColocarPieza(formaPieza, posicionFila + 1, posicionColumna)) {
            BorrarPiezaActual(formaPieza, posicionFila, posicionColumna);
            posicionFila++;
            ColocarPieza(formaPieza, posicionFila, posicionColumna);
        } 

    }
    


    public void ColocarPieza(int[][] forma, int fila, int columna) {
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

    public void eliminarLineasCompletas() {
        int filasEliminadas = 0;
    
        for (int i = 0; i < board.length; i++) {
            boolean lineaCompleta = true;
    
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    lineaCompleta = false;
                    break;
                }
            }
    
            if (lineaCompleta) {
                filasEliminadas++;
                bajarLineas(i);
            }
        }
    
    }

    private void bajarLineas(int fila) {
        for (int i = fila; i > 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = board[i - 1][j];
            }
        }
    
        // La primera fila siempre debe quedar vacía
        for (int j = 0; j < board[0].length; j++) {
            board[0][j] = 0;
        }
    }

    public boolean verificarFinDelJuego() {
        return lineasEliminadas >= lineasParaFinalizar;
    }
    
    public void incrementarLineasEliminadas(int cantidad) {
        lineasEliminadas += cantidad;
        if (verificarFinDelJuego()) {
            JuegoTerminado = true;
        }
    }
    
    public void setLineasParaFinalizar(int lineas) {
        this.lineasParaFinalizar = lineas;
    }

}






