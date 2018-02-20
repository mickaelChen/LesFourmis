import java.util.ArrayList;

public class Monde {
	public final static int TAILLE = 100;
	private ArrayList<Fourmi> listeFourmis;
	private Lieu[][] environnement;

	public Monde() {
		listeFourmis = new ArrayList<Fourmi>();
		environnement = new Lieu[TAILLE][TAILLE];
		for (int i = 0; i < TAILLE; i++)
			for (int j = 0; j < TAILLE; j++)
				environnement[i][j] = new Lieu();
	}
	
	public ArrayList<Fourmi> getListeFourmis(){
		return listeFourmis;
	}
	
	public void afficherFourmis(){
		for (Fourmi f : listeFourmis){
			System.out.println(f);
		}
	}
	
	public void addFourmi(Fourmi f){
		listeFourmis.add(f);
	}
	
	public void setElement(Element e){
		environnement[e.getPosition().x][e.getPosition().y].setElement(e);
	}
	
	public Lieu getLieu(Point p){
		return environnement[p.x][p.y];
	}
		
	public void next(){
		for (int i = 0; i < environnement.length; i++){
			for (int j = 0; j < environnement[i].length; j++){
				environnement[i][j].next(this);
			}
		}
		for (Fourmi f : this.getListeFourmis()){
			f.next(environnement[f.getX()][f.getY()]);
		}
	}
}
