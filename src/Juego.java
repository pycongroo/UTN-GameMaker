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
	
	


	public Jugador jugador1() 
	{
		return jugador1;
	}
	
	public Jugador jugador2() 
	{
		return jugador2;
	}
	
	
	@Override
	public String toString()
	{
		return nombre;
	}




	public void mostrarTablero() 
	{
		// TODO Auto-generated method stub		
	}




	public Movimiento crearMovimiento(Jugador jugador, int casillero) 
	{
		// TODO Auto-generated method stub
		return null;
	}




	public boolean esMovimientoValido(Movimiento movimiento) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
