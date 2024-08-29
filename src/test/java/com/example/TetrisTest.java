package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

import com.example.Pieces.PieceDogLeft;
import com.example.Pieces.PieceDogRight;
import com.example.Pieces.PieceSquare;
import com.example.Pieces.PieceStick;
import com.example.Pieces.PieceT;

public class TetrisTest {

    // Test "Probando entorno"

    @Test
    public void validar_la_clase_tetris_Test(){
        Tetris t1 = new Tetris();
        assertNotNull(t1);
    }

    @Test
    public void crear_pieza_T_Test(){
        
        PieceT t1 = new PieceT();

        assertEquals(true, t1.setPieza());

    }

    @Test
    public void crear_pieza_Stick_Test(){
        
        PieceStick t1 = new PieceStick();

        assertEquals(true, t1.setPieza());

    }

    @Test
    public void crear_pieza_Square_Test(){
        
        PieceSquare s1 = new PieceSquare();

        assertEquals(true, s1.setPieza());

    }

    @Test
    public void crear_pieza_dog_derecha_e_izquierda_Test(){
        
        PieceDogLeft d1 = new PieceDogLeft();

        assertEquals(true, d1.setPieza());

        PieceDogRight d2 = new PieceDogRight();

        assertEquals(true, d2.setPieza());


    }
    
}