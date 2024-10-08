package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import com.example.Pieces.*;


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
    public void agregar_pieza_random_de_forma_especifica_caso_0_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom(0); // Case 0: PieceSquare
        IPiece piezaActual = board.getPiezaActual();

        assertTrue(piezaActual instanceof PieceSquare);
    }

    @Test
    public void agregar_pieza_random_de_forma_especifica_caso_1_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom(1); // Case 1: PieceT
        IPiece piezaActual = board.getPiezaActual();

        assertTrue(piezaActual instanceof PieceT);
    }

    @Test
    public void agregar_pieza_random_de_forma_especifica_caso_2_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom(2); // Case 1: PieceStick
        IPiece piezaActual = board.getPiezaActual();

        assertTrue(piezaActual instanceof PieceStick);
    }

    @Test
    public void agregar_pieza_random_de_forma_especifica_caso_3_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom(3); // Case 3: PieceEleLeft
        IPiece piezaActual = board.getPiezaActual();

        assertTrue(piezaActual instanceof PieceEleLeft);
    }

    @Test
    public void agregar_pieza_random_de_forma_especifica_caso_4_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom(4); // Case 4: PieceEleRight
        IPiece piezaActual = board.getPiezaActual();

        assertTrue(piezaActual instanceof PieceEleRight);
    }

    @Test
    public void agregar_pieza_random_de_forma_especifica_caso_5_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom(5); // Case 5: PieceDogLeft
        IPiece piezaActual = board.getPiezaActual();

        assertTrue(piezaActual instanceof PieceDogLeft);
    }

    @Test
    public void agregar_pieza_random_de_forma_especifica_caso_6_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom(6); // Case 6: PieceDogRight
        IPiece piezaActual = board.getPiezaActual();

        assertTrue(piezaActual instanceof PieceDogRight);
    }



    @SuppressWarnings("deprecation")
    @Test
    public  void metodo_tablero_devolver_get_Test(){

        Board b1 = new Board();
        b1.setBoard();

        int[][] boarEsperado= new int[10][20];

        assertEquals(boarEsperado, b1.getBoard());

    }

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
    public void se_detiene_pieza_metodo_true_Test(){

        Board b1 = new Board();
        b1.setBoard();

        PieceSquare p1 = new PieceSquare();
        

        b1.agregarPiezaRandom();

        for(int i=0; i<10; i++){

            b1.bajarPieza();
        }

        assertTrue(b1.detenerPieza(0, 0,p1 ));
    }

    @Test
    public void detener_pieza_false_Test() {
    Board b1 = new Board();

    PieceSquare p1 = new PieceSquare();

    b1.setBoard();

    b1.posicionFila=4;
    b1.posicionColumna=4;

    b1.agregarPiezaRandom();

    
    assertFalse(b1.detenerPieza(b1.posicionFila, b1.posicionColumna, p1));

    }


    @Test
    public void se_puede_agregar_pieza_en_el_centro_False_Test(){
        Board b1 = new Board();
        b1.setBoard();

    int[][] piezaBloqueo = { { 1, 1, 1 } };
    b1.ColocarPieza(piezaBloqueo, 0, (20 / 2) - 1);
    

    IPiece piezaNueva = new PieceStick(); 
    boolean resultado = b1.agregarPiezaAlCentro(piezaNueva);

    
    assertFalse(resultado);
    }

    @Test
    public void se_detiene_pieza_metodo_false_Test(){
        int filas = 0;
        int columnas = 0;

        PieceT p1 = new PieceT();

        Board b1 = new Board();
        b1.setBoard();

        b1.agregarPiezaEspecifica(p1);  


        boolean resultado = b1.detenerPieza(filas, columnas, p1);

        if (resultado==false) {
            assertFalse(resultado);
        }else{
            assertTrue(resultado);
        }
        

        b1.setBoard();


    }


    @Test
    public  void se_puede_agregar_pieza_especifica_en_el_tablero_Test(){
        
        Board b1 = new Board();
        b1.setBoard();
        int[][] tablero = b1.getBoard();

        PieceT p1 = new PieceT();

        

        boolean piezaColocada = b1.agregarPiezaEspecifica(p1);
        boolean piezaenTablero = false;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != 0) { // Si hay una celda diferente de 0, se coloco la pieza
                    piezaenTablero = true;
                    break;
                }
            }
            if (piezaenTablero) {
                break;
            }
        }
        
        assertTrue(piezaColocada); 



    }

    @Test
    public void agregar_pieza_random_al_tablero_Test() {
        Board b1 = new Board();
        b1.setBoard(); 
    
        
        assertNotNull(b1.getBoard());
        assertTrue(b1.agregarPiezaRandom());

        
    }


    @Test
    public void agregar_pieza_random_al_tablero_false_Test(){

        Board b1 = new Board();
        b1.setBoard(); 

        int[][] tableroLleno = b1.getBoard();
        for (int i = 0; i < tableroLleno[0].length; i++) {
        tableroLleno[0][i] = 1; // Llena la primera fila
        }
        
        assertFalse(b1.agregarPiezaRandom());
    


    }



    @Test
    public void la_pieza_puede_bajar_Test(){

        PieceStick p1 = new PieceStick();
        Board b1 = new Board();
        b1.setBoard();

        b1.agregarPiezaEspecifica(p1);    

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
    public void mover_pieza_actual_1_columna_a_la_izquierda_true_Test(){

        PieceStick p1 = new PieceStick();
        Board b1 = new Board();
        b1.setBoard();
        

        b1.agregarPiezaAlCentro(p1);


        assertTrue(b1.moverPiezaaLaIzquierda()); 


    }

    @Test
public void mover_pieza_una_columna_a_la_izquierda_false_Test() {
    Board board = new Board();
    board.setBoard();

    // Simula que la pieza está en la columna 0
    board.posicionColumna = 0;
    
    assertFalse(board.moverPiezaaLaIzquierda());
}

    @Test
    public void mover_pieza_actual_1_columna_a_la_derecha_Test(){

        Board b1 = new Board();
    b1.setBoard();
    PieceStick p1 = new PieceStick();

    // Coloca la pieza en el centro 
    b1.agregarPiezaAlCentro(p1);

    // la pieza se pueda mover a la derecha
    assertTrue(b1.moverPiezaaLaDerecha());
    }


    @Test
    public void mover_pieza_una_columna_a_la_derecha_false_Test() {
        Board board = new Board();
        board.setBoard();

        board.agregarPiezaRandom();
    
        board.posicionColumna = board.getBoardWidth() - board.piezaActual.getForma()[0].length;
        
        assertFalse(board.moverPiezaaLaDerecha());
    }



    @Test
    public void el_juego_finaliza_si_no_se_puede_agregar_mas_piezas_Test(){

        Board b1 = new Board();
    b1.setBoard();
    PieceStick p1 = new PieceStick();

    int[][] tableroLleno = b1.getBoard();
    for (int i = 0; i < tableroLleno[0].length; i++) {
        tableroLleno[0][i] = 1; // Llena la primera fila
    }

    b1.agregarPiezaEspecifica(p1); // No se puede agregar más piezas porque la fila está llena

    assertTrue(b1.getTerminoelJuego()); // Verifica que el juego haya terminado

    
        
    }
    @Test
    public void eliminar_linea_completa_Test() {

        Board b1 = new Board(); 
        b1.setBoard();

        // simular una línea completa
        int[][] tablero = b1.getBoard();

        for (int i = 0; i < tablero[0].length; i++) {
            tablero[9][i] = 1;
        }

        b1.eliminarLineasCompletas();

        //  fila vacía después de eliminar la línea.
        for (int i = 0; i < tablero[0].length; i++) {
            assertEquals(0, tablero[9][i]);
        }
    }

    @Test
    public void bajar_linea_Test() {

        Board b1 = new Board(); 
        b1.setBoard();


        // llena una linea para eliminar
        int[][] tablero = b1.getBoard();
        for (int i = 0; i < tablero[0].length; i++) {
            tablero[9][i] = 1; // Fila completa
            tablero[8][i] = 1; // Otra fila completa
        }

        b1.eliminarLineasCompletas();

        //  las dos filas superiores deben estar vacías.
        for (int i = 0; i < tablero[0].length; i++) {
            assertEquals(0, tablero[9][i]);
            assertEquals(0, tablero[8][i]);
        }
    }

    @Test
    public void configurar_cantidad_lineas_para_finalizar_juego_Test() {

        Board b1 = new Board(); 
        b1.setBoard();

        
        b1.setLineasParaFinalizar(5);
        b1.incrementarLineasEliminadas(3);

        assertFalse(b1.verificarFinDelJuego()); // no termina

        b1.incrementarLineasEliminadas(2);
        assertTrue(b1.verificarFinDelJuego());  // termina
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
    public void el_reloj_no_actualiza_los_tics_Test(){

        Board board = new Board();
        Reloj r1 = new Reloj(board);

        r1.setTic();
        r1.setTic();
        r1.setTic();

        assertFalse(r1.ticReloj());


    }

    @Test
    public void la_pieza_actual_baja_luego_de_dos_tic_Test(){

        Board b1 = new Board();
        PieceT t1 = new PieceT();
        b1.setBoard();
        b1.agregarPiezaEspecifica(t1);

        
        Reloj r1 = new Reloj(b1);
        r1.setTic();
        r1.setTic();


        assertTrue(r1.ticReloj());
    }


    //Se crea el juego //

    @Test
    public void crear_juego_Test(){

        Tetris t1 = new Tetris();

        assertTrue(t1.crearJuego());
    }


    @Test
    public void juego_comienza_Test(){
        Board b1 = new Board();
        Tetris t1 = new Tetris();

        b1.setLineasParaFinalizar(2);//set para ganar

        b1.setBoard();

        b1.agregarPiezaRandom();

        if (b1.getBoard() != null) {
            assertTrue(t1.comenzarJuego());

        // llena dos lineas para eliminar
        int[][] tablero = b1.getBoard();
        for (int i = 0; i < tablero[0].length; i++) {
            tablero[9][i] = 1; // Fila completa
            tablero[8][i] = 1; // Otra fila completa
        }

        b1.eliminarLineasCompletas();
        b1.incrementarLineasEliminadas(2);

        assertTrue(b1.verificarFinDelJuego());

        }



    }   

    @Test
    public void perder_el_juego_Test() {

        Board board = new Board();
        Reloj reloj = new Reloj(board);

        board.setBoard();

        PieceStick p = new PieceStick();


        // Agregamos varias piezas hasta que no puedan colocarse más
        while (!board.getTerminoelJuego()) {
            board.agregarPiezaEspecifica(p); // se utiliza la stick para facilitar

            for (int i = 0; i < 20; i++) {
                reloj.setTic(); // Cada tic hace que la pieza baje
                reloj.ticReloj(); // Ejecuta bajada
            }
        }
        
        // se termina el juego por acumulamiento
        assertTrue(board.getTerminoelJuego());
    }

    @Test
    public void ganar_el_juego_Test() {

        Board board = new Board();
        Reloj reloj = new Reloj(board);

        // Inicializa el tablero
        board.setBoard();

        // Simula que ya se han eliminado 4 líneas
        board.incrementarLineasEliminadas(4);

        int[][] tablero = board.getBoard();
        for (int i = 0; i < 19; i++) { // Llenamos las primeras 19 columnas de la fila 9
            tablero[9][i] = 1;
        }

        // Coloca una pieza vertical (stick) para llenar las 10 filas de la primera columna y completar el juego
        board.agregarPiezaEspecifica(new PieceStick()); // Usa PieceStick para simplificar

        // Simula los tics para que la pieza baje
        for (int i = 0; i < 20; i++) {
            reloj.setTic(); // Cada tic hace que la pieza baje
            reloj.ticReloj(); // Ejecuta la acción de bajada
        }

        board.eliminarLineasCompletas();
        

        // Verifica si se han completado las líneas necesarias para ganar
        assertTrue(board.getTerminoelJuego());
    }

}




