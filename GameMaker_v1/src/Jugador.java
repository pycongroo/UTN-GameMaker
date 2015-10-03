import java.util.ArrayList;

public interface Jugador {
	public void intentaMovida(Ficha unaFicha, Ubicacion nuevaUbicacion);
	public void mueveFicha(Ficha unaFicha, Ubicacion nuevaUbicacion);
	public Ubicacion calculaDestino(Ficha unaFicha, Ubicacion nuevaUbicacion);
	public ArrayList<Ubicacion> posiblesDestinos(Ubicacion unaUbicacion, ArrayList<Movimiento> unosMovimientos);
}
