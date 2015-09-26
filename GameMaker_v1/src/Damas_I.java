import java.util.ArrayList;

public class Damas_I extends Juego {
	class TableroDamas extends Tablero{
		public TableroDamas(){
			this.setFilas(8).setColumnas(8);
		}
	}
	class FichaSimple extends Ficha{
		//private boolean limitada = true;
		public FichaSimple(){
			this.addMovimiento(new Movimiento(1, 1));
			this.addMovimiento(new Movimiento(-1, 1));
		}
		protected Ubicacion nuevoDestino(Ubicacion ub_actual, Movimiento unMovimiento){
			int n_x=ub_actual.getX()+unMovimiento.mov_x;
			int n_y=ub_actual.getY()+unMovimiento.mov_y;
			return new Ubicacion(n_x, n_y);
		}
	}
	class FichaDoble extends Ficha{
		//private boolean limitada = false;
		public FichaDoble(){
			this.addMovimiento(new Movimiento(1, 1));
			this.addMovimiento(new Movimiento(-1, 1));
		}
		protected Ubicacion nuevoDestino(Ubicacion ub_actual, Movimiento unMovimiento){
			
		}
	}
	class JugadorDamas_I implements Jugador{
		
	}
}
