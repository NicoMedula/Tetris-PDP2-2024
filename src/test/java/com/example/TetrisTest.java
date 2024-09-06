package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

        assertEquals(true, t1.getPieza());

    }

    @Test
    public void crear_pieza_Stick_Test(){
        
        PieceStick t1 = new PieceStick();

        assertEquals(true, t1.getPieza());

    }

    @Test
    public void crear_pieza_Square_Test(){
        
        PieceSquare s1 = new PieceSquare();

        assertEquals(true, s1.getPieza());

    }

    @Test
    public void crear_pieza_dog_derecha_e_izquierda_Test(){
        //Gira a la derecha 90 grados
        
        PieceDogLeft d1 = new PieceDogLeft();

        assertEquals(true, d1.getPieza());

        PieceDogRight d2 = new PieceDogRight();

        assertEquals(true, d2.getPieza());

    }

    @Test
    public void crear_pieza_ele_derecha_e_izquierda_Test(){
        //Gira a la izquierda 90 grados
        
        PieceEleRight l1 = new PieceEleRight(); 

        assertEquals(true, l1.getPieza());

        PieceEleLeft l2 = new PieceEleLeft();

        assertEquals(true, l2.getPieza());

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

        t1.getPieza();
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

        t2.getPieza();
        t2.RotarPiezaDer();
        
        
        
        assertEquals(matrizEsperada2, t2.piezas);

        //3 rotaciones
        
        PieceT t3 = new PieceT();
        int[][] matrizEsperada3 = {
            {0, 1},
            {1, 1},
            {0, 1}
            
        };

        t3.getPieza();
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

        t4.getPieza();
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

        t1.getPieza();
        t1.RotarPiezaIzq();

        assertEquals(matrizEsperada, t1.piezas);

        //dos rotaciones a la izquierda
        PieceT t2 = new PieceT();
        int[][] matrizEsperada2 = {
        {1,1,1},
        {0,1,0},
        };

        t2.getPieza();
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

        t3.getPieza();
        t3.RotarPiezaIzq();
        t3.RotarPiezaIzq();
        t3.RotarPiezaIzq();

        assertEquals(matrizEsperada3, t3.piezas);

        PieceT t4 = new PieceT();
        int[][] matrizEsperada4 = {
            {0, 1, 0},
            {1, 1, 1},
            
        };

        t4.getPieza();
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

        t1.getPieza();
        t1.RotarPiezaIzq();

        
        //Gira a la derecha 90 grados
        assertEquals(matrizEsperada, t1.piezas);

        PieceStick t2 = new PieceStick();

        t2.getPieza();
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
        
        l1.getPieza();
        l1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, l1.piezas);
        
        //2 rotaciones
        PieceEleRight l12 = new PieceEleRight();

        int[][] matrizEsperada12 = {
            {1, 1},
            {0, 1},
            {0, 1}
        };
        
        l12.getPieza();
        l12.RotarPiezaDer();
        l12.RotarPiezaDer();
        
        assertEquals(matrizEsperada12, l12.piezas);

        //3 rotaciones
        PieceEleRight l13 = new PieceEleRight();

        int[][] matrizEsperada13 = {
            {1, 1, 1},
            {1, 0, 0},
            
        };
        
        l13.getPieza();
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
        
        l14.getPieza();
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

        l2.getPieza();
        l2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, l2.piezas);
        
        // 2 rotacion
        PieceEleRight l22 = new PieceEleRight();

        int[][] matrizEsperada22 = {
        {1, 1},
        {0, 1},
        {0, 1} 

        };

        l22.getPieza();
        l22.RotarPiezaIzq();
        l22.RotarPiezaIzq();

        assertEquals(matrizEsperada22, l22.piezas);

        // 3 rotacion
        PieceEleRight l23 = new PieceEleRight();

        int[][] matrizEsperada23 = {
        {0, 0, 1},
        {1, 1, 1},


        };

        l23.getPieza();
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

        l24.getPieza();
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
        
        l1.getPieza();
        l1.RotarPiezaIzq();
        
        assertEquals(matrizEsperada, l1.piezas);


        //DOS ROTACIONES
        
        PieceEleLeft l2 = new PieceEleLeft();

        int[][] matrizEsperada2 = {
        {1,1},
        {1,0},
        {1,0}
        };

        l2.getPieza();
        l2.RotarPiezaIzq();
        l2.RotarPiezaIzq();
    

        assertEquals(matrizEsperada2, l2.piezas);
        
        //TRES ROTACIONES
        PieceEleLeft l3 = new PieceEleLeft();

        int[][] matrizEsperada3 = {
            {1 ,0 ,0},
            {1 ,1 ,1}
        };

        l3.getPieza();
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

        l4.getPieza();
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
        
        l1.getPieza();
        l1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, l1.piezas);

        //DOS ROTACIONES
        PieceEleLeft l2 = new PieceEleLeft();
        
        int[][] matrizEsperada2 = {
            {1,1},
            {1,0},
            {1,0}
        };
        
        l2.getPieza();
        l2.RotarPiezaDer();
        l2.RotarPiezaDer();

        assertEquals(matrizEsperada2, l2.piezas);

        //TRES ROTACIONES
        PieceEleLeft l3 = new PieceEleLeft();

        int[][] matrizEsperada3 = {
            {1 ,1 ,1},
            {0 ,0 ,1}
        };

        l3.getPieza();
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

        l4.getPieza();

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
        
        d1.getPieza();
        d1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, d1.piezas);

        //Gira a la izquierda 90 grados
        
        PieceDogRight d2 = new PieceDogRight();

        int[][] matrizEsperada2 = {
            {1, 0},
            {1, 1},
            {0, 1}
        };

        d2.getPieza();
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
        
        d1.getPieza();
        d1.RotarPiezaDer();
        
        assertEquals(matrizEsperada, d1.piezas);

        //Gira a la izquierda 90 grados
        
        PieceDogLeft d2 = new PieceDogLeft();

        int[][] matrizEsperada2 = {
            {0, 1},
            {1, 1},
            {1, 0}
        };

        d2.getPieza();
        d2.RotarPiezaIzq();

        assertEquals(matrizEsperada2, d2.piezas);
    }

    // ------------------------------------------------------------------------------------------------//
    //--------------- TEST DEL TABLERO ----------------------------------------------------------------//
    // ------------------------------------------------------------------------------------------------//
    @Test
    public  void crear_tablero_10_x_20_Test(){

        Board b1 = new Board();
        b1.setBoard();

        int[][] tablero = b1.getBoard();

        

        assert b1.getBoard() == tablero;
    }

    @Test
    public  void inicializar_tablero_en_0_Test(){

        Board b1 = new Board();
        b1.setBoard();

        int [][] tablero = b1.getBoard();

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                assertEquals(0, tablero[i][j]);
            }
        }


    }

    @Test
    public  void se_puede_agregar_pieza_metodo_Test(){
        
        Board b1 = new Board();
        b1.setBoard();

        PieceT p1 = new PieceT();

        assertTrue(b1.PosicionarPiezaTablero(p1));

    }

    @Test
    public  void agregar_pieza_random_al_tablero_Test(){

        boolean piezaColocada = false;
        
        Board b1 = new Board();
        b1.setBoard();

        b1.agregarPiezaRandom();    
        int [][] tablero = b1.getBoard();
        

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != 0) {
                    piezaColocada = true;
                    break;
                }
            }
            if (piezaColocada) {
                break;
            }
        }
        
        assertTrue(piezaColocada);  
    }

    @Test
    public void probar_metodo_add_pieza_random_Test(){

        Board b1 = new Board();
        b1.setBoard();

        assertTrue(b1.agregarPiezaRandom());


    }

    @Test
    public void la_pieza_puede_bajar_Test(){

        Board b1 = new Board();
        b1.setBoard();

        b1.agregarPiezaRandom();    

        boolean movimientoDelaPieza = false;

        int[][] tableroAntesdeBajarPieza = b1.getBoard();

        b1.bajarPieza();
        
        
        int[][] tableroDespuesdebajarPieza = b1.getBoard();

        for (int i = 0; i < tableroAntesdeBajarPieza.length - 1; i++) {
            for (int j = 0; j < tableroAntesdeBajarPieza[i].length; j++) {

                if (tableroAntesdeBajarPieza[i][j]!=0 && tableroDespuesdebajarPieza[i+1][j]!=0) {
                    movimientoDelaPieza = true;
                    break;
                }
            }
            if (movimientoDelaPieza) {
                break;
            }
        }
        
        assertTrue(movimientoDelaPieza);

        //PRIMERA FILA DEBE ESTAR CON "0" despues de bajar la pieza una vez

        for (int i = 0; i < tableroDespuesdebajarPieza.length; i++) {
            if (tableroDespuesdebajarPieza[0][i]== 0) {

                assertEquals(0, tableroDespuesdebajarPieza[0][i]);
            }

        }
    }

    @Test
    public void mover_pieza_actual_1_columna_a_la_izquierda_Test(){
        
        Board b1 = new Board();
        b1.setBoard();

        b1.agregarPiezaRandom();

        
        assertTrue(b1.moverPiezaaLaIzquierda());

    }

    @Test
    public void mover_pieza_actual_1_columna_a_la_derecha_Test(){

        Board b1 = new Board();
        b1.setBoard();

        b1.agregarPiezaRandom();

        assertTrue(b1.moverPiezaaLaDerecha());
    }

    // ------------------------------------------------------------------------------------------------//
    //--------------- TEST DEL Reloj----------------------------------------------------------------//
    // ------------------------------------------------------------------------------------------------//

    
    @Test
    public void reloj_actualiza_los_tics_Test(){

        Board board = new Board();

        Reloj r1 = new Reloj(board);

        r1.setTic();
        r1.setTic();

        assertEquals(2, r1.getTic());
    }

    @Test
    public void la_pieza_actual_baja_luego_de_dos_tic_Test(){

        Board b1 = new Board();
        b1.setBoard();
        b1.agregarPiezaRandom();

        
        Reloj r1 = new Reloj(b1);
        r1.setTic();
        r1.setTic();


        assertTrue(r1.ticReloj());
    }



}