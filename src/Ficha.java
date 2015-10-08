import java.util.List;

import javax.swing.ImageIcon;

public abstract class Ficha {
	private List<Movimiento> movimientos;
	private Ubicacion ubicacion;
	private Bando bando;//clase sujeta a cambios
	
	private ImageIcon imagen;
	
	public void cambiaUbicacion(Ubicacion unaUbicacion){
		this.ubicacion = unaUbicacion;
	}
	
}
