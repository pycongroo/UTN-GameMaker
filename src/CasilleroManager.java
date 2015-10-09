import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CasilleroManager implements ActionListener {
	
	private static Casillero seleccionado;
	private Casillero casillero;
	private Casillero[][] casilleros;
	private ArrayList<Ubicacion> auxCas;
	
	public CasilleroManager(Casillero[][] casilleros){
		this.casilleros=casilleros;
		this.auxCas = new ArrayList<Ubicacion>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.casillero = (Casillero) e.getSource();
		if (!this.isSelected() && this.casillero.getFicha()!=null){
			this.seleccionar();
			this.mostrarDestinos(this.casillero.getFicha());
		} else if (this.isSelected()) {
			if (this.casillero==this.seleccionado){
				this.desasignar();
			} else if (Juego.getInstance().esValido(this.seleccionado, this.casillero)){
				System.out.println("valido");
				this.iluminarCasillero(casillero);
			}
		}
	}
	
	private void mostrarDestinos(Ficha unaFicha){
		System.out.println("mostrando destinos");
		//ArrayList<Ubicacion> destinos = this.acotarUbicaciones(unaFicha);
		this.auxCas = unaFicha.posiblesDestinos();
		//this.iluminarCasillero(this.ubicarCasilleroEn(new Ubicacion(5, 5)));
		//Casillero cas = ubicarCasilleroEn(new Ubicacion(0, 0));
		//System.out.println(cas.getUbicacion().toString());
		for (Ubicacion unaUbicacion:this.auxCas){
			System.out.println(unaUbicacion.toString());
			this.iluminarCasillero(this.ubicarCasilleroEn(unaUbicacion));
		}
	}
	
	private Casillero ubicarCasilleroEn(Ubicacion unaUbicacion){
		System.out.println("casillero en "+unaUbicacion.toString());
		return casilleros[unaUbicacion.x][unaUbicacion.y];
	}
	
	private void iluminarCasillero(Casillero unCasillero){
		unCasillero.setBackground(new Color(200,200,200));
	}
	
	private ArrayList<Ubicacion> acotarUbicaciones(Ficha unaFicha){
		ArrayList<Ubicacion> auxUbicaciones = new ArrayList<Ubicacion>();
		for (Ubicacion ubicacion:unaFicha.posiblesDestinos()){
			//Juego.getInstance().|;
		}
		return auxUbicaciones;
	}
	
	private boolean isSelected(){
		return !(this.seleccionado==null);
	}
	
	private void seleccionar(){
		this.seleccionado=this.casillero;
		System.out.println("casillero "+this.seleccionado.getUbicacion().toString()+" seleccionado");
		this.seleccionado.setBackground(new Color(150,200,250));
	}
	
	private void deseleccionar(){
		retornarColor(this.seleccionado);
		System.out.println("casillero "+this.seleccionado.getUbicacion().toString()+" deseleccionado");
		for (Ubicacion unaUbicacion:this.auxCas){
			retornarColor(this.ubicarCasilleroEn(unaUbicacion));
		}
		this.seleccionado=null;
	}
	
	private void retornarColor(Casillero unCasillero){
		unCasillero.setBackground(unCasillero.getColor());
	}
	
	private void desasignar(){
		//this.seleccionado.setFicha(null);
		this.deseleccionar();
	}
	
}
