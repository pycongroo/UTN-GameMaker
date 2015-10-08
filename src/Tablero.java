import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Tablero extends JPanel {
	
	//public char[] columnas = {'A','B','C','D','E','F','G','H'} ;
	//public int[] filas =;
	
	private int columnas;
	private int filas;
	
	private CasilleroManager casilleroManager;
	private Casillero[][] casilleros;
	
	public Tablero(int filas, int columnas){
		this.casilleros = new Casillero[filas][columnas];
		this.casilleroManager = new CasilleroManager(casilleros);
		this.setLayout(new GridLayout(filas, columnas));
	}
	
	public void inicializarTablero(){
		for (int x=0; x<this.filas; x++){
			for (int y=0; y<this.columnas; y++){
				Color color = (( x + y ) % 2 == 0) ? Color.WHITE : Color.ORANGE;
				casilleros[x][y] = new Casillero(new Ubicacion(x,y), color);
				casilleros[x][y].addActionListener(casilleroManager);
				add(casilleros[x][y]);
			}
		}
	}

}
