import java.awt.Color;

import javax.swing.JButton;

public class Casillero extends JButton {
	private Color color;
	private Ficha ficha;
	private Ubicacion ubicacion;
	
	public Casillero(Ubicacion ubicacion, Color color){
		this.ubicacion = ubicacion;
		this.ficha = null;
		this.color = color;
		this.setBackground(color);
	}
}
