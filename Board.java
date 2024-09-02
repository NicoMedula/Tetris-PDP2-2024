package com.example;


public class Board
{
    // Dimensiones del tablero y el tablero en sí.
    private final int numX;
    private final int numY;
    private int[][] board;

    /**
     * Constructor para objetos de la clase Matriz.
     * @param numX anchura en bloques del tablero.
     * @param numY altura en bloques del tablero.
     */
    public Board(int numX, int numY)
    {
        // initialise instance variables
	this.numX = 10;
	this.numY = 20;
	board = new int[10][20];
    }


    /**
     * Rellena toda la matriz con ceros.
     * 
     */
    public void limpia()
    {
	int i,j;
	for (i=0; i<numX; i++)
	    for (j=0; j<numY; j++)
		{
		    board[i][j] = 0;
		}
    }

    /**
     * Dibuja la matriz.
     * 
     */
    /* public void dibuja()
    {
	int i,j;
	for (i=0; i<numX; i++)
	    for (j=0; j<numY; j++)
		{
		    box.dibujaBloque(i,j,mat[i][j]);
		}}
     */

    /**
     * Añade una pieza a la matriz.
     * 
     * @param  p   Pieza que vamos a añadir al tablero del tetris.
     */
    public void add(Piece p)
    {
	int numBloques = p.getNumBloques();
	int id = p.getId();
	for (int i=0; i<numBloques; i++)
	    {
		int x, y;
		x = p.getBloqueX(i);
		y = p.getBloqueY(i);
		mat[x][y] = id;
	    }
    }


    /**
     * Indica si la pieza que le pasamos como parámetro no cabe en el tablero.
     * 
     * @param  p  pieza que le pasamos.
     * @return verdadero si la pieza no cabe en el tablero. falso en el caso contrario.
     */
    public boolean colision(Piece p)
    {
	int numBloques = p.getNumBloques();

	for (int i=0; i<numBloques; i++)
	    {
		int x, y;
		x = p.getBloqueX(i);
		y = p.getBloqueY(i);
		
		if (x<0 || x>=numX)
		    {
			return true;
		    }
		if (y<0 || y>=numY)
		    {
			return true;
		    }
		if (mat[x][y] != 0)
		    {
			return true;
		    }
	    }
	
	return false;
	
    }


    /**
     * Elimina una línea completa del tablero.
     * 
     * @return    verdadero si ha borrado una línea.
     */
    public boolean eliminaLinea()
    {
	int linea = numY - 1;
	while (linea >= 0)
	    {
		// Busca una linea.
		boolean lineaActual = true;
		for (int i=0; i<numX; i++)
		    {
			if (mat[i][linea] == 0)
			    {
				lineaActual = false;
				break;
			    }
		    }
		if (lineaActual == false)
		    {
			linea -= 1;
		    }
		else
		    { 
			// Borramos la linea que acabamos de encontrar.
			for (int i=linea; i>0; i--)
			    {
				for (int j=0; j<numX; j++)
				    {
					mat[j][i] = mat[j][i-1];
				    }
			    }
			return true;
		    }
	    }

	// No hemos encontrado ninguna línea completa.
	return false;
    }
}