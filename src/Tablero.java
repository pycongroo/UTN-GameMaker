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
		this.filas=filas;
		this.columnas=columnas;
		this.casilleros = new Casillero[filas][columnas];
		this.casilleroManager = new CasilleroManager(casilleros);
		this.setLayout(new GridLayout(filas, columnas));
		this.inicializarTablero();
	}
	
	public void inicializarTablero(){
		System.out.println("inicializando tablero");
		for (int y=0; y<this.columnas; y++){
			for (int x=0; x<this.filas; x++){
				Color color = (( x + y ) % 2 == 0) ? Color.WHITE : Color.ORANGE;
				this.casilleros[x][y] = new Casillero(new Ubicacion(x,y), color);
				this.casilleros[x][y].addActionListener(casilleroManager);
				this.add(casilleros[x][y]);
				System.out.println("("+x+','+y+") Color: "+color.toString());
			}
		}
		//this.setVisible(true);
	}
	public void agregarFicha(Ubicacion ubicacion, Ficha unaFicha){
		casilleros[ubicacion.x][ubicacion.y].setFicha(unaFicha);
	}
	
	public Ficha getFichaAt(Ubicacion unaUbicacion){
		return casilleros[unaUbicacion.x][unaUbicacion.y].getFicha();
	}

}
