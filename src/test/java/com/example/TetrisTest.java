package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.Pieces.PieceDogLeft;
import com.example.Pieces.PieceDogRight;
import com.example.Pieces.PieceEleLeft;
import com.example.Pieces.PieceEleRight;
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
        //Gira a la derecha 90 grados
        
        PieceDogLeft d1 = new PieceDogLeft();

        assertEquals(true, d1.setPieza());

        PieceDogRight d2 = new PieceDogRight();

        assertEquals(true, d2.setPieza());

    }

    @Test
    public void crear_pieza_ele_derecha_e_izquierda_Test(){
        //Gira a la izquierda 90 grados
        
        PieceEleRight l1 = new PieceEleRight(); 

        assertEquals(true, l1.setPieza());

        PieceEleLeft l2 = new PieceEleLeft();

        assertEquals(true, l2.setPieza());

    }

    @SuppressWarnings("deprecation")
    @Test
    public  void rotar_pieza_T_a_la_derecha_Test(){
        //Gira a la derecha 90 grados
        
        PieceT t1 = new PieceT();
        int[][] matrizEsperada = {
            {1, 1, 1},
            {0, 1, 0}
            
        };

        t1.setPieza();
        t1.RotarPiezaDer();
        t1.RotarPiezaDer();
        
        
        
        assertEquals(matrizEsperada, t1.piezas);
    }

    @SuppressWarnings("deprecation")
    @Test
    public  void rotar_pieza_T_a_la_izquierda_Test(){
        //Gira a la izquierda 90 grados
        
        PieceT t1 = new PieceT();
        int[][] matrizEsperada = {
            {0, 1},
            {1, 1},
            {0, 1}
        };

        t1.setPieza();
        t1.RotarPiezaIzq();

        
    
        assertEquals(matrizEsperada, t1.piezas);
    }

    @SuppressWarnings("deprecation") // ignora advertencias
    @Test
    public  void rotar_pieza_Stick_a_la_izquierda_y_a_la_derecha_Test(){

        //Gira a la izquierda 90 grados
        PieceStick t1 = new PieceStick();
        int[][] matrizEsperada = {
            {1, 1, 1, 1},
        };

        t1.setPieza();
        t1.RotarPiezaIzq();

        
        //Gira a la derecha 90 grados
        assertEquals(matrizEsperada, t1.piezas);

        PieceStick t2 = new PieceStick();

        t2.setPieza();
        t2.RotarPiezaDer();

        assertEquals(matrizEsperada, t1.piezas);

    }

    @SuppressWarnings("deprecation")
    @Test
    public  void rotar_pieza_ele_right_a_la_izquierda_y_a_la_derecha_Test(){
        
        //Gira a la derecha 90 grados
        PieceEleRight l1 = new PieceEleRight();

        int[][] matrizEsperada = {
            {0, 0, 1},
            {1, 1, 1}
        };
        
        l1.setPieza();
        l1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, l1.piezas);


        //Gira a la izquierda 90 grados
        
        PieceEleRight l2 = new PieceEleRight();

        int[][] matrizEsperada2 = {
        {1, 1, 1},
        {1, 0, 0}

        };

        l2.setPieza();
        l2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, l2.piezas);

    }


        @SuppressWarnings("deprecation")
    @Test
    public  void rotar_pieza_ele_left_a_la_izquierda_y_a_la_derecha_Test(){
        
        //Gira a la derecha 90 grados
        PieceEleLeft l1 = new PieceEleLeft();

        int[][] matrizEsperada = {
            {1, 0, 0},
            {1, 1, 1}
        };
        
        l1.setPieza();
        l1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, l1.piezas);


        //Gira a la izquierda 90 grados
        
        PieceEleRight l2 = new PieceEleRight();

        int[][] matrizEsperada2 = {
        {1, 1, 1},
        {1, 0, 0}

        };

        l2.setPieza();
        l2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, l2.piezas);

    }

    
    
    
    
}