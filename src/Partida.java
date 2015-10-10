import java.awt.Color;

import javax.swing.JFrame;

public class Partida {
	private static Tablero tablero;
	private static Bando negro = new Bando();
	private static Bando blanco = new Bando();
	
	public static void definirBandos(){
		blanco.setNombreBando("blanco");
		negro.setNombreBando("negro");
	}
	
	public static void instanciarFichas(){
		for (int i=0;i<8;i++){
			tablero.agregarFicha(new Ubicacion(6,i), new Peon(new Ubicacion(6,i), blanco));
		}
		tablero.agregarFicha(new Ubicacion(0,0), new Torre(new Ubicacion(0,0), negro));
		tablero.agregarFicha(new Ubicacion(0,0), new Torre(new Ubicacion(7,0), negro));
		tablero.agregarFicha(new Ubicacion(0,0), new Torre(new Ubicacion(0,7), blanco));
		tablero.agregarFicha(new Ubicacion(0,0), new Torre(new Ubicacion(7,7), blanco));
	}
	public static void main(String[] args) {
		Juego juego = Juego.getInstance();
		Partida.definirBandos();
		Tablero tablero = new Tablero(8,8);
		//Partida.instanciarFichas();
		for (int i=0;i<8;i++){
			tablero.agregarFicha(new Ubicacion(i,6), new Peon(new Ubicacion(i,6), blanco));
			tablero.agregarFicha(new Ubicacion(i,1), new Peon(new Ubicacion(i,1), negro));
		}
		tablero.agregarFicha(new Ubicacion(0,0), new Torre(new Ubicacion(0,0), negro));
		tablero.agregarFicha(new Ubicacion(7,0), new Torre(new Ubicacion(7,0), negro));
		tablero.agregarFicha(new Ubicacion(0,7), new Torre(new Ubicacion(0,7), blanco));
		tablero.agregarFicha(new Ubicacion(7,7), new Torre(new Ubicacion(7,7), blanco));
		//
		tablero.agregarFicha(new Ubicacion(1,0), new Caballo(new Ubicacion(1,0), negro));
		tablero.agregarFicha(new Ubicacion(6,0), new Caballo(new Ubicacion(6,0), negro));
		tablero.agregarFicha(new Ubicacion(1,7), new Caballo(new Ubicacion(1,7), blanco));
		tablero.agregarFicha(new Ubicacion(6,7), new Caballo(new Ubicacion(6,7), blanco));
		//
		tablero.agregarFicha(new Ubicacion(2,0), new Alfil(new Ubicacion(2,0), negro));
		tablero.agregarFicha(new Ubicacion(5,0), new Alfil(new Ubicacion(5,0), negro));
		tablero.agregarFicha(new Ubicacion(2,7), new Alfil(new Ubicacion(2,7), blanco));
		tablero.agregarFicha(new Ubicacion(5,7), new Alfil(new Ubicacion(5,7), blanco));
		//
		tablero.agregarFicha(new Ubicacion(3,0), new Reina(new Ubicacion(3,0), negro));
		tablero.agregarFicha(new Ubicacion(3,7), new Reina(new Ubicacion(3,7), blanco));
		//
		tablero.agregarFicha(new Ubicacion(4,0), new Rey(new Ubicacion(4,0), negro));
		tablero.agregarFicha(new Ubicacion(4,7), new Rey(new Ubicacion(4,7), blanco));
		//fichas de prueba
		tablero.agregarFicha(new Ubicacion(5,5), new Torre(new Ubicacion(5,5), negro));
		tablero.agregarFicha(new Ubicacion(4,4), new Reina(new Ubicacion(4,4), negro));
		tablero.agregarFicha(new Ubicacion(5,4), new Rey(new Ubicacion(5,4), negro));
		Juego.getInstance().setTablero(tablero);
		JFrame win = new JFrame("prueba");
		win.add(tablero);
		win.setSize(640, 640);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
}
