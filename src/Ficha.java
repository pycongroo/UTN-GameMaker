import java.util.ArrayList;

import javax.swing.ImageIcon;

public abstract class Ficha {
	private ArrayList<Movimiento> movimientos;
	private Ubicacion ubicacion;// = new Ubicacion(0,0);
	private Bando bando;//clase sujeta a cambios
	
	private ImageIcon imagen;
	
	public Ficha(){};
	
	public Ficha(Ubicacion ubicacion, ImageIcon imagen, Bando bando){
		this.ubicacion = ubicacion;
		this.imagen = imagen;
		this.bando = bando;
		this.movimientos = new ArrayList<Movimiento>();
	}
	
	public void setUbicacion(Ubicacion unaUbicacion){
		this.ubicacion = unaUbicacion;
	}
	
	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(ArrayList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Bando getBando() {
		return bando;
	}

	public void setBando(Bando bando) {
		this.bando = bando;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public abstract void mover();
	
	public abstract ArrayList<Ubicacion> posiblesDestinos();
	
}
