import java.util.ArrayList;

public class Lieu {

	private Element element;
	private ArrayList<Pheromone> pheromones; 
	
	public Lieu(){
		element = null;
		this.pheromones = new ArrayList<Pheromone>();
	}
	
	public Element getElement(){
		return element;
	}
	
	public void setElement(Element element){
		this.element = element;
	}
	
	public boolean isEmpty(){
		return (element == null);
	}
	
	public void next(Monde m){
		if (element != null){
			element.next(m);
			if (element.getValeur() <= 0)
				element = null;
		}
		for (Pheromone p : pheromones){
			p.next(m);
		}
		while ((pheromones.size() > 0) && (pheromones.get(0).getValeur() <= 0)){
			pheromones.remove(0);
		}
	}
	
	public ArrayList<Pheromone> getPheromones(){
		return pheromones;
	}
	
	public int getNbPheromones(){
		return pheromones.size();
	}
	
	public void addPheromone(Pheromone p){
		pheromones.add(p);
	}
	
}
