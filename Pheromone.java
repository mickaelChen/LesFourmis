
public class Pheromone extends Element {
	private Point direction;
	
	public Pheromone(Point position, Point direction){
		super(position, 200);
		this.direction = direction;
	}
	
	public Point getDirection(){
		return direction;
	}
	
	public void next(Monde m){
		decrementer();
	}
}
