
public abstract class Element {
	private Point position;
	private int valeur;
	
	public Element(Point position, int valeur){
		this.position = position;
		this.valeur = valeur;
	}
	
	public Point getPosition(){
		return position;
	}
    
	public int getX(){
		return position.x;
	}

	public int getY(){
		return position.y;
	}
    
	public int getValeur(){
		return valeur;
	}
	
	public void incrementer(){
		valeur++;
	}
	
	public void decrementer(){
		valeur--;
	}
	
	public String toString(){
		return this.valeur + " " + this.position;
	}
	
	public abstract void next(Monde m);
}
