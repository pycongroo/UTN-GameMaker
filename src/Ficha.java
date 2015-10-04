import java.util.ArrayList;

public abstract class Ficha {
	private Ubicacion ubicacionActual;
	private ArrayList<Movimiento> movimientos;
	
	public Ficha addMovimiento(Movimiento unMovimiento){
		this.movimientos.add(unMovimiento);
		return this;
	}
	public ArrayList<Movimiento> getMovimientos(){
		return this.movimientos;
	}
	
	protected abstract void usaMovimiento(Movimiento unMovimiento);
	
	protected abstract Ubicacion posibleDestino(Ubicacion ubicacion, Movimiento unMovimiento);
	public ArrayList<Ubicacion> posiblesDestinos(Ubicacion ub_actual){
		ArrayList<Ubicacion> n_ubs = new ArrayList<Ubicacion>();
		this.getMovimientos().stream().forEach(aMov -> n_ubs.add(posibleDestino(ub_actual, aMov)));
		return n_ubs;
	}
}
