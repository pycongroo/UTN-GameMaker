import java.awt.Point;

public class Ubicacion extends Point {
	public Ubicacion(int x ,int y){
		super(x,y);
	}
	
	public String toString(){
		return "["+this.x+","+this.y+"]";
	}
}
