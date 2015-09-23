import java.util.ArrayList;
import java.util.List;


public abstract class Juego 
{
	private String nombre;	
	private List<Ficha> fichas;
	private Tablero tablero;
	
	Jugador jugador1;
	Jugador jugador2;
	
	
	public Juego(String nombre, Tablero tablero, List<Ficha> fichas)
	{
		this.nombre = nombre;
		this.tablero = tablero;
		this.fichas = fichas;
	}

}
