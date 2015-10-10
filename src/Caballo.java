import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Caballo extends Ficha {
	
	public Caballo(Ubicacion unaUbicacion, Bando bando){
		super(unaUbicacion, new ImageIcon("imagenes/"+bando.getNombreBando()+"/caballo.png"), bando);
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
		if (x<7 && y<6){
			System.out.println("x<7 && y<6");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x+1,y+2))){
				ubicaciones.add(new Ubicacion(x+1,y+2));
			}
		}
		if (x<6 && y<7){
			System.out.println("x<6 && y<7");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x+2,y+1))){
				ubicaciones.add(new Ubicacion(x+2,y+1));
			}
			//ubicaciones.add(new Ubicacion(x+2,y+1));
		}
		if (x<6 && y>0){
			System.out.println("x<6 && y>0");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x+2,y-1))){
				ubicaciones.add(new Ubicacion(x+2,y-1));
			}
			//ubicaciones.add(new Ubicacion(x+2,y-1));
		}
		if (x<7 && y>1){
			System.out.println("x<7 && y>1");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x+1,y-2))){
				ubicaciones.add(new Ubicacion(x+1,y-2));
			}
		}
		//
		if (x>0 && y>1){
			System.out.println("x>0 && y>1");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x-1,y-2))){
				ubicaciones.add(new Ubicacion(x-1,y-2));
			}
		}
		if (x>1 && y>0){
			System.out.println("x>1 && y>0");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x-2,y-1))){
				ubicaciones.add(new Ubicacion(x-2,y-1));
			}
		}
		if (x>1 && y<7){
			System.out.println("x>1 && y<7");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x-2,y+1))){
				ubicaciones.add(new Ubicacion(x-2,y+1));
			}
		}
		if (x>0 && y<6){
			System.out.println("x>0 && y<6");
			if (!Juego.getInstance().hayOtraFichaEn(new Ubicacion(x-1,y+2))){
				ubicaciones.add(new Ubicacion(x-1,y+2));
			}
		}
		return ubicaciones;
	}

}
