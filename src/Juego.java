import java.util.ArrayList;
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
	
	public boolean esValido(Casillero cInicial, Casillero cFinal){
		Ficha auxFicha = cInicial.getFicha();
		for (Ubicacion unaUbicacion:cInicial.getFicha().posiblesDestinos()){
			System.out.println(cFinal.getUbicacion().toString()+"=="+unaUbicacion.toString());
			if (cFinal.getUbicacion().equals(unaUbicacion)){
				return true;
			}
		}
		return false;
	}
	
	public boolean hayOtraFichaEn(Ubicacion unaUbicacion){
		System.out.println("ficha en: "+unaUbicacion.toString());
		Ficha unaFicha=tablero.getFichaAt(unaUbicacion);
		System.out.println(unaFicha==null);
		return unaFicha!=null;
	}
	
	public int hayFicha(Ubicacion unaUbicacion, Bando bando){
		Ficha unaFicha=tablero.getFichaAt(unaUbicacion);
		if (unaFicha!=null){
			if (unaFicha.getBando().equals(bando)){
				//si hay ficha amiga
				return 1;
			} else {
				//si hay ficha enemiga
				return 0;
			}
		} else {
			//no hay ficha
			return -1;
		}
	}
	/*public boolean hayFichaAmiga(Ubicacion unaUbicacion, Bando bando){
		Ficha unaFicha=tablero.getFichaAt(unaUbicacion);
		if (unaFicha!=null){
			return unaFicha.getBando().equals(bando);
		} else {
			return false;
		}
	}*/
	
	public void setTablero(Tablero tablero){
		this.tablero=tablero;
	}
}
