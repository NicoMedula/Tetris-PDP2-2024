package com.example;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TetrisTest {

    // Test "Probando entorno"

    @Test
    public void validar_la_clase_tetris_Test(){
        Tetris t1 = new Tetris();
        assertNotNull(t1);
    }

    @Test
    public void validar_la_clase_piece_Tetris(){
        Piece p1 = new Piece();
        assertNotNull(p1);
    }
}