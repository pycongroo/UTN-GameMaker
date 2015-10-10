import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Reina extends Ficha {

	public Reina(Ubicacion unaUbicacion, Bando bando){
		super(unaUbicacion, new ImageIcon("imagenes/"+bando.getNombreBando()+"/reina.png"), bando);
	}
	
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Ubicacion> posiblesDestinos() {
		// TODO Auto-generated method stub
		ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();
		int x=this.getUbicacion().x;
		int y=this.getUbicacion().y;
		if (x>0){
			System.out.println("x>0");
			for (int i=-1;x+i>=0;i--){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x+i,y),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x+i, y));
					}
					break;
				} else {
					ubicaciones.add(new Ubicacion(x+i, y));
				}
			}
		}
		if (x<7){
			System.out.println("x<7");
			for (int i=1;x+i<=7;i++){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x+i,y),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x+i, y));
					}
					break;
				}
				ubicaciones.add(new Ubicacion(x+i, y));
			}
		}
		if (y>0){
			System.out.println("y>0");
			for (int j=-1;y+j>=0;j--){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x,y+j),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x, y+j));
					}
					break;
				}
				ubicaciones.add(new Ubicacion(x, y+j));
			}
		}
		if (y<7){
			System.out.println("y<7");
			for (int j=1;y+j<=7;j++){
				int tipoFicha = Juego.getInstance().hayFicha(new Ubicacion(x,y+j),this.getBando());
				if (tipoFicha != -1){
					if (tipoFicha==0){
						ubicaciones.add(new Ubicacion(x, y+j));
					}
					break;
				}
				ubicaciones.add(new Ubicacion(x, y+j));
			}
		}
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
