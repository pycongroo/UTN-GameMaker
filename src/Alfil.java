import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Alfil extends Ficha{

	public Alfil(Ubicacion unaUbicacion, Bando bando){
		super(unaUbicacion, new ImageIcon("imagenes/"+bando.getNombreBando()+"/alfil.png"), bando);
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
		boolean pisaEnemigo = false;
		if (x>0 && y>0){
			System.out.println("x>0 && y>0");
			int i=1;
			while (x-i>=0 && y-i>=0){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x-i,y-i),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x-i, y-i));
					}
					break;
				}
				ubicaciones.add(new Ubicacion(x-i, y-i));
				i++;
			}
		}
		if (x>0 && y<7){
			System.out.println("x>0 && y<7");
			int i=1;
			while (x-i>=0 && y+i<=7){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x-i,y+i),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x-i, y+i));
					}
					break;
				}
				ubicaciones.add(new Ubicacion(x-i, y+i));
				i++;
			}
		}
		if (x<7 && y>0){
			System.out.println("x<7 && y>0");
			int i=1;
			while (x+i<=7 && y-i>=0){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x+i,y-i),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x+i, y-i));
					}
					break;
				}
				ubicaciones.add(new Ubicacion(x+i, y-i));
				i++;
			}
		}
		if (x<7 && y<7){
			System.out.println("x<7 && y<7");
			int i=1;
			while (x+i<=7 && y+i<=7){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x+i,y+i),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x+i, y+i));
					}
					break;
				}
				ubicaciones.add(new Ubicacion(x+i, y+i));
				i++;
			}
		}
		return ubicaciones;
	}

}
