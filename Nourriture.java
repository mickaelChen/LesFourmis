public class Nourriture extends Element{

	public Nourriture(Point position){
		super(position, (int)(Math.random() * 12) + 1);
	}
		
	public String toString(){
		return "Nourriture :" + super.toString();
	}

	public void next(Monde m){
		
	}
}
