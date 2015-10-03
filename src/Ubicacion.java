
public class Ubicacion {
	private int x,y;
	
	
	public Ubicacion setX(int x){
		this.x = x;
		return this;
	}
	public Ubicacion setY(int y){
		this.y = y;
		return this;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public boolean existe(){
		return (x < 0 || y < 0);
	}
	
	public Ubicacion(int x, int y){
		this.setX(x).setY(y);
	}
}
