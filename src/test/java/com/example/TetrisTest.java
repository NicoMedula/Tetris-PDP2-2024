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
        
        //Dos rotaciones
        PieceT t1 = new PieceT();
        int[][] matrizEsperada = {
            {1, 1, 1},
            {0, 1, 0}
            
        };

        t1.setPieza();
        t1.RotarPiezaDer();
        t1.RotarPiezaDer();
        
        
        assertEquals(matrizEsperada, t1.piezas);

        //una rotacion
        PieceT t2 = new PieceT();
        int[][] matrizEsperada2 = {
            {1, 0},
            {1, 1},
            {1, 0}
        };

        t2.setPieza();
        t2.RotarPiezaDer();
        
        
        
        assertEquals(matrizEsperada2, t2.piezas);

        //3 rotaciones
        
        PieceT t3 = new PieceT();
        int[][] matrizEsperada3 = {
            {0, 1},
            {1, 1},
            {0, 1}
            
        };

        t3.setPieza();
        t3.RotarPiezaDer();
        t3.RotarPiezaDer();
        t3.RotarPiezaDer();
        
        
        assertEquals(matrizEsperada3, t3.piezas);
        
        //4 rotaciones
        PieceT t4 = new PieceT();
        int[][] matrizEsperada4 = {
            {0, 1, 0},
            {1, 1, 1}
            
        };

        t4.setPieza();
        t4.RotarPiezaDer();
        t4.RotarPiezaDer();
        t4.RotarPiezaDer();
        t4.RotarPiezaDer();
        
        
        assertEquals(matrizEsperada4, t4.piezas);
        


    }

    @SuppressWarnings("deprecation")
    @Test
    public  void rotar_pieza_T_a_la_izquierda_Test(){
        //Gira a la izquierda 90 grados
        
        //una rotacion de la izquierda
        PieceT t1 = new PieceT();
        int[][] matrizEsperada = {
            {0, 1},
            {1, 1},
            {0, 1}
        };

        t1.setPieza();
        t1.RotarPiezaIzq();

        assertEquals(matrizEsperada, t1.piezas);

        //dos rotaciones a la izquierda
        PieceT t2 = new PieceT();
        int[][] matrizEsperada2 = {
        {1,1,1},
        {0,1,0},
        };

        t2.setPieza();
        t2.RotarPiezaIzq();
        t2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, t2.piezas);

        //tres rotaciones
        PieceT t3 = new PieceT();
        int[][] matrizEsperada3 = {
            {1, 0},
            {1, 1},
            {1, 0}
        };

        t3.setPieza();
        t3.RotarPiezaIzq();
        t3.RotarPiezaIzq();
        t3.RotarPiezaIzq();

        assertEquals(matrizEsperada3, t3.piezas);

        PieceT t4 = new PieceT();
        int[][] matrizEsperada4 = {
            {0, 1, 0},
            {1, 1, 1},
            
        };

        t4.setPieza();
        t4.RotarPiezaIzq();
        t4.RotarPiezaIzq();
        t4.RotarPiezaIzq();
        t4.RotarPiezaIzq();

        assertEquals(matrizEsperada4, t4.piezas);


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
    public  void rotar_pieza_ele_right_a_la_derecha_Test(){
        
        //Gira a la derecha 90 grados
        //1 rotacion
        PieceEleRight l1 = new PieceEleRight();

        int[][] matrizEsperada = {
            {0, 0, 1},
            {1, 1, 1}
        };
        
        l1.setPieza();
        l1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, l1.piezas);
        
        //2 rotaciones
        PieceEleRight l12 = new PieceEleRight();

        int[][] matrizEsperada12 = {
            {1, 1},
            {0, 1},
            {0, 1}
        };
        
        l12.setPieza();
        l12.RotarPiezaDer();
        l12.RotarPiezaDer();
        
        assertEquals(matrizEsperada12, l12.piezas);

        //3 rotaciones
        PieceEleRight l13 = new PieceEleRight();

        int[][] matrizEsperada13 = {
            {1, 1, 1},
            {1, 0, 0},
            
        };
        
        l13.setPieza();
        l13.RotarPiezaDer();
        l13.RotarPiezaDer();
        l13.RotarPiezaDer();
        
        assertEquals(matrizEsperada13, l13.piezas);

        //4 rotaciones
        PieceEleRight l14 = new PieceEleRight();

        int[][] matrizEsperada14 = {
            {1, 0},
            {1, 0},
            {1, 1}
            
        };
        
        l14.setPieza();
        l14.RotarPiezaDer();
        l14.RotarPiezaDer();
        l14.RotarPiezaDer();
        l14.RotarPiezaDer();
        
        assertEquals(matrizEsperada14, l14.piezas);
    }

        @SuppressWarnings("deprecation")
        @Test
    public  void rotar_pieza_ele_right_a_la_izquierda_4_rotaciones_Test(){
        //Gira a la izquierda 90 grados

        // 1 rotacion
        PieceEleRight l2 = new PieceEleRight();

        int[][] matrizEsperada2 = {
        {1, 1, 1},
        {1, 0, 0}

        };

        l2.setPieza();
        l2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, l2.piezas);
        
        // 2 rotacion
        PieceEleRight l22 = new PieceEleRight();

        int[][] matrizEsperada22 = {
        {1, 1},
        {0, 1},
        {0, 1} 

        };

        l22.setPieza();
        l22.RotarPiezaIzq();
        l22.RotarPiezaIzq();

        assertEquals(matrizEsperada22, l22.piezas);

        // 3 rotacion
        PieceEleRight l23 = new PieceEleRight();

        int[][] matrizEsperada23 = {
        {0, 0, 1},
        {1, 1, 1},


        };

        l23.setPieza();
        l23.RotarPiezaIzq();
        l23.RotarPiezaIzq();
        l23.RotarPiezaIzq();

        assertEquals(matrizEsperada23, l23.piezas);

        // 4 rotacion
        PieceEleRight l24 = new PieceEleRight();

        int[][] matrizEsperada24 = {
            {1, 0},
            {1, 0},
            {1, 1}


        };

        l24.setPieza();
        l24.RotarPiezaIzq();
        l24.RotarPiezaIzq();
        l24.RotarPiezaIzq();
        l24.RotarPiezaIzq();

        assertEquals(matrizEsperada24, l24.piezas);


    }


    @SuppressWarnings("deprecation")
    @Test
    public  void rotar_pieza_ele_left_a_la_izquierda_4_rotaciones_Test(){
        
        //Gira a la derecha 90 grados

        //UNA ROTACION
        PieceEleLeft l1 = new PieceEleLeft();

        int[][] matrizEsperada = {
            {1, 1, 1},
            {0, 0, 1}
        };
        
        l1.setPieza();
        l1.RotarPiezaIzq();
        
        assertEquals(matrizEsperada, l1.piezas);


        //DOS ROTACIONES
        
        PieceEleLeft l2 = new PieceEleLeft();

        int[][] matrizEsperada2 = {
        {1,1},
        {1,0},
        {1,0}
        };

        l2.setPieza();
        l2.RotarPiezaIzq();
        l2.RotarPiezaIzq();
    

        assertEquals(matrizEsperada2, l2.piezas);
        
        //TRES ROTACIONES
        PieceEleLeft l3 = new PieceEleLeft();

        int[][] matrizEsperada3 = {
            {1 ,0 ,0},
            {1 ,1 ,1}
        };

        l3.setPieza();
        l3.RotarPiezaIzq();
        l3.RotarPiezaIzq();
        l3.RotarPiezaIzq();

        assertEquals(matrizEsperada3, l3.piezas);

        //CUATRO ROTACIONES
        PieceEleLeft l4 = new PieceEleLeft();

        int[][] matrizEsperada4 = {
        {0,1},
        {0,1},
        {1,1}
        };

        l4.setPieza();
        l4.RotarPiezaIzq();
        l4.RotarPiezaIzq();
        l4.RotarPiezaIzq();
        l4.RotarPiezaIzq();

        assertEquals(matrizEsperada4, l4.piezas);
        

    }

    @SuppressWarnings("deprecation")
    @Test
    public  void rotar_pieza_ele_left_a_la_derecha_4_rotaciones_Test(){

        //Gira a la derecha 90 grados

        //UNA ROTACION
        PieceEleLeft l1 = new PieceEleLeft();

        int[][] matrizEsperada = {
            {1, 0, 0},
            {1, 1, 1}
        };
        
        l1.setPieza();
        l1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, l1.piezas);

        //DOS ROTACIONES
        PieceEleLeft l2 = new PieceEleLeft();
        
        int[][] matrizEsperada2 = {
            {1,1},
            {1,0},
            {1,0}
        };
        
        l2.setPieza();
        l2.RotarPiezaDer();
        l2.RotarPiezaDer();

        assertEquals(matrizEsperada2, l2.piezas);

        //TRES ROTACIONES
        PieceEleLeft l3 = new PieceEleLeft();

        int[][] matrizEsperada3 = {
            {1 ,1 ,1},
            {0 ,0 ,1}
        };

        l3.setPieza();
        l3.RotarPiezaDer();
        l3.RotarPiezaDer();
        l3.RotarPiezaDer();
        
        assertEquals(matrizEsperada3, l3.piezas);

        //CUATRO ROTACIONES
        PieceEleLeft l4 = new PieceEleLeft();
        int[][] matrizEsperada4 = {
            {0,1},
            {0,1},
            {1,1}
        };

        l4.setPieza();

        l4.RotarPiezaDer();
        l4.RotarPiezaDer();
        l4.RotarPiezaDer();
        l4.RotarPiezaDer();
        
        assertEquals(matrizEsperada4, l4.piezas);

    }

        @SuppressWarnings("deprecation")
        @Test
        public  void rotar_pieza_dog_right_a_la_izquierda_y_a_la_derecha_Test(){
        
        //Gira a la derecha 90 grados
        PieceDogRight d1 = new PieceDogRight();

        int[][] matrizEsperada = {
            {1, 0},
            {1, 1},
            {0, 1}
        };
        
        d1.setPieza();
        d1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, d1.piezas);

        //Gira a la izquierda 90 grados
        
        PieceDogRight d2 = new PieceDogRight();

        int[][] matrizEsperada2 = {
            {1, 0},
            {1, 1},
            {0, 1}
        };

        d2.setPieza();
        d2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, d2.piezas);
    }

        @SuppressWarnings("deprecation")
        @Test
        public  void rotar_pieza_dog_left_a_la_izquierda_y_a_la_derecha_Test(){
        
        //Gira a la derecha 90 grados
        PieceDogLeft d1 = new PieceDogLeft();

        int[][] matrizEsperada = {
            {0, 1},
            {1, 1},
            {1, 0}
        };
        
        d1.setPieza();
        d1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, d1.piezas);

        //Gira a la izquierda 90 grados
        
        PieceDogLeft d2 = new PieceDogLeft();

        int[][] matrizEsperada2 = {
            {0, 1},
            {1, 1},
            {1, 0}
        };

        d2.setPieza();
        d2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, d2.piezas);
    }

    
    
}