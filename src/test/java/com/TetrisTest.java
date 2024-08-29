package com;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.Tetris;



public class TetrisTest {
    @Test
    public void validar_la_clase_Test(){

        Tetris t1 = new Tetris();

        assertNotNull(t1);
    }
}
