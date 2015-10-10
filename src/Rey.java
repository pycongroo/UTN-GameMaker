import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Rey extends Ficha {
	
	public Rey(Ubicacion unaUbicacion, Bando bando){
		super(unaUbicacion, new ImageIcon("imagenes/"+bando.getNombreBando()+"/rey.png"), bando);
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Ubicacion> posiblesDestinos() {
		// TODO Auto-generated method stub
		ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
		int x = this.getUbicacion().x;
		int y = this.getUbicacion().y;
		if (x<7 && y<7){
			if (Juego.getInstance().hayFicha(new Ubicacion(x+1,y+1), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x+1, y+1));
			}
		}
		if (x>0 && y<7){
			if (Juego.getInstance().hayFicha(new Ubicacion(x-1,y+1), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x-1, y+1));
			}
		}
		if (x>0 && y>0){
			if (Juego.getInstance().hayFicha(new Ubicacion(x-1,y-1), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x-1, y-1));
			}
		}
		if (x<7 && y>0){
			if (Juego.getInstance().hayFicha(new Ubicacion(x+1,y-1), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x+1, y-1));
			}
		}
		if (x>0){
			if (Juego.getInstance().hayFicha(new Ubicacion(x-1,y), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x-1, y));
			}
		}
		if (x<7){
			if (Juego.getInstance().hayFicha(new Ubicacion(x+1,y), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x+1, y));
			}
		}
		if (y>0){
			if (Juego.getInstance().hayFicha(new Ubicacion(x,y-1), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x, y-1));
			}
		}
		if (y<7){
			if (Juego.getInstance().hayFicha(new Ubicacion(x,y+1), this.getBando())!=1){
				ubicaciones.add(new Ubicacion(x, y+1));
			}
		}
		return ubicaciones;
	}

}
