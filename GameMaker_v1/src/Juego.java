import java.util.ArrayList;

public abstract class Juego {
	protected Tablero tablero;
	protected ArrayList<Regla> reglas;
	protected ArrayList<Jugador> jugadores;
	//protected ArrayList<Condicion> condicion;
	//protected Puntaje[] puntajes;
	//verifica movimientos
	public abstract boolean esValido(Movimiento unMovimiento);
	//public abstract boolean hayGanador();
	
	//defino metodos concretos
	public Juego setTablero(Tablero tablero){
		this.tablero = tablero;
		return this;
	}
	public Juego setReglas(ArrayList<Regla> reglas){
		this.reglas = reglas;
		return this;
	}
	public Juego setJugadores(ArrayList<Jugador> jugadores){
		this.jugadores = jugadores;
		return this;
	}
}
