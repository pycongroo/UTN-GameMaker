import java.awt.Color;

import javax.swing.JButton;

public class Casillero extends JButton {
	private Color color;
	private Ficha ficha;
	private Ubicacion ubicacion;
	
	public Casillero(Ubicacion ubicacion, Color color){
		//super("HOLA");
		super("["+ubicacion.x+","+ubicacion.y+"]");
		this.ubicacion = ubicacion;
		this.ficha = null;
		this.color = color;
		this.setBackground(color);
		//this.setVisible(true);
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
		this.setIcon(this.ficha.getImagen());
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public Color getColor() {
		return color;
	}
	
}
