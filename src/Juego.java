import java.util.List;

//clase implementada como singleton
public class Juego {
	private static Juego instance = new Juego();
	private Tablero tablero;
	private List<Ficha> fichas;
	private List<Estado> estados;
	
	//
	public Juego(){}
	
	public static Juego getInstance(){
		return instance;
	}
	
	public void cargarPropiedades(){
		
	}
	
	public void inicializarComponentes(){}
	
	public void cambiarTurno(){
		
	}
}
