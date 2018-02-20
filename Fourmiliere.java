
public class Fourmiliere extends Element{
	private int nbFourmiMax;
	private int nbFourmicreee;
	
	public Fourmiliere(Point position, int nbFourmiMax){
		super(position, 1);
		this.nbFourmiMax = nbFourmiMax;
		this.nbFourmicreee = 0;
	}
	
	public String toString(){
		return "Fourmiliere :" + super.toString();
	}
	
	public void next(Monde m){
		if (nbFourmicreee < nbFourmiMax){ 
			m.addFourmi(new Fourmi(this));
			nbFourmicreee++;
		}
	}
}
