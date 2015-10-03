import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		Juego juego = JuegoFactory.getJuego();
		
		Jugador jugador1 = juego.jugador1();
		Jugador jugador2 = juego.jugador2();
		

		
		System.out.println("Comienza el juego "+juego+"! "+jugador1+" vs "+jugador2+"! \n");
		
		
		boolean esMovimientoValido = false;
		
		while(!esMovimientoValido)
		{
			juego.mostrarTablero();
			
			System.out.println("Es el turno de "+jugador1+", ingrese el numero de casillero donde desea poner la ficha: ");
			
			int casillero = scanner.nextInt();
			
			Movimiento movimiento = juego.crearMovimiento(jugador1, casillero);
			
			esMovimientoValido = juego.esMovimientoValido(movimiento);
		}
	}

}
