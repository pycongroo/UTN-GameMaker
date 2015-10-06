import java.util.List;

public class Ficha {
	private List<Movimiento> movimientos;
	private Ubicacion ubicacion;
	private String bando;//clase sujeta a cambios
	
	public void cambiaUbicacion(Ubicacion unaUbicacion){
		this.ubicacion = unaUbicacion;
	}
	
}
