import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Peon extends Ficha {
	
	private boolean meMovi = false;
	public Peon(Ubicacion ubicacion, Bando bando){
		super(ubicacion, new ImageIcon("imagenes/"+bando.getNombreBando()+"/peon.png"), bando);
		System.out.println("imagenes/"+bando.getNombreBando()+"/peon.png");
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Ubicacion> posiblesDestinos() {
		ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>(); 
		int x = this.getUbicacion().x;
		int y = this.getUbicacion().y;
		int direccion = (this.getBando().getNombreBando()=="blanco") ? -1:1;
		//System.out.println(meMovi);
		if (meMovi) {
			if ((y+direccion) < 8 && (y + direccion) >=0){
				if (x-1 >= 0 && Juego.getInstance().
						hayFicha(new Ubicacion(x-1, y+direccion), this.getBando())!=1){
					ubicaciones.add(new Ubicacion(x-1, y+direccion));
				}
				if (x+1 < 8 && Juego.getInstance().
						hayFicha(new Ubicacion(x+1, y+direccion), this.getBando())!=1){
					ubicaciones.add(new Ubicacion(x+1, y+direccion));
				}
			}
		} else {
			if (Juego.getInstance().hayFicha(new Ubicacion(x, y+direccion), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x, y + direccion));
				if (Juego.getInstance().hayFicha(new Ubicacion(x, y+direccion), this.getBando())==0){
					return ubicaciones;
				} else {
					if (Juego.getInstance().hayFicha(new Ubicacion(x, y+2*direccion), this.getBando())!=1)
					ubicaciones.add(new Ubicacion(x, y + 2*direccion));
				}
			}
		}
		return ubicaciones;
	}
}
