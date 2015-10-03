import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
	
	
	
	public Movimiento gestionarMovimiento(Jugador jugador)
	{
		Scanner scanner = new Scanner(System.in);	
		
		Movimiento movimiento = null;
		
		System.out.println("Es el turno de "+jugador+"!\n");
		
		this.mostrarTablero();
		
		System.out.println("Ingrese el número de casillero donde quiera depositar su ficha: ");
		
		boolean esMovimientoValido = false;
		
		while(!esMovimientoValido)
		{			
			int casillero = scanner.nextInt();
			
			movimiento = this.crearMovimiento(jugador, casillero);
			
			esMovimientoValido = this.esMovimientoValido(movimiento);
			
			if(!esMovimientoValido)
				System.out.println("Ese movimiento no es válido! Ingrese el casillero otra vez:");
		}
		
		return movimiento;		
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




	public boolean estaFinalizado(Movimiento movimiento, Jugador jugador) 
	{
		if(movimiento.esMovimientoFinal())
		{
			this.mostrarTablero();
			
			System.out.println("El jugador "+jugador+" es el ganador!!\n");
			
			return true;
		}
		
		return false;
	}	

}
