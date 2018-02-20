public class Fourmi {
	private Point position;
	private Point direction;
	private final int identifiant;
	private static int compteur = 0;
	private Fourmiliere fourmiliere;
	private boolean possedeNourriture;
	
	public Fourmi(Fourmiliere f){
		fourmiliere = f;
		position = f.getPosition();
		direction = new Point();
		identifiant = ++compteur;
		possedeNourriture = false;
	}
	
	public int getX(){
		return position.x;
	}
	
	public int getY(){
		return position.y;
	}
	
	public String toString(){
		return "Fourmi: " + identifiant + " " + position + direction;
	}
	
	public void next(Lieu lieu){
		if (possedeNourriture) {
			lieu.addPheromone(new Pheromone(position, new Point(-direction.x, -direction.y)));
			direction = fourmiliere.getPosition().soustraction(position).signe();
		}
		else {
			for (Pheromone p : lieu.getPheromones())
				if (Math.random() <= .2){
					direction = p.getDirection();
				}
			if (Math.random() <= .2){
				direction = new Point();
			}
		}
		Element elem = lieu.getElement();
		if ((!possedeNourriture) && (elem instanceof Nourriture)){
			if (elem.getValeur() > 0){
				elem.decrementer();
				possedeNourriture = true;
			}
		}
		if ((possedeNourriture) && (elem instanceof Fourmiliere)){
			elem.incrementer();
			possedeNourriture = false;
		}
		position = Point.addition(position, direction);
		if (position.x < 0 || position.x >= Monde.TAILLE || position.y < 0 || position.y >= Monde.TAILLE ){
			position = fourmiliere.getPosition();
		}
	}
}
