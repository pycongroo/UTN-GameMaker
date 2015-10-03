import java.util.ArrayList;

public interface Jugador {
	public void intentaMovida(Ficha unaFicha, Ubicacion nuevaUbicacion);
	public void mueveFicha(Ficha unaFicha, Ubicacion nuevaUbicacion);
	public ArrayList<Ubicacion> posiblesDestinosdeFicha(Ficha unaFicha);
}
