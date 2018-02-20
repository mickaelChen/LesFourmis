
public class TestMiseEnPlace {
	public static void main(String[] args) {
		Monde m = new Monde();
		for (int k = 0; k < 1; k++){
			int ki = (int)(Math.random()*(m.TAILLE-3));
			int kj = (int)(Math.random()*(m.TAILLE-3));
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					m.setElement(new Nourriture(new Point(ki+i,kj+j)));
				}
			}
		}
		m.setElement(new Fourmiliere(new Point(25,25), 30));
		m.setElement(new Fourmiliere(new Point(75,75), 30));   
		m.afficherFourmis();
		m.next();
		m.afficherFourmis();
		/* Code Fourni */
		m.next();
		// Test Fourmis
		for (Fourmi f : m.getListeFourmis()){
			  int x = f.getX();
			  int y = f.getY();
			  System.out.println("(" + x + "," + y + ")" + f);
		 }
		// Test Elements
	    for (int i=0; i<Monde.TAILLE; i++){
	    	for (int j=0; j<Monde.TAILLE; j++){
	    		Element e = m.getLieu(new Point(i,j)).getElement();
	    		if (e != null){
	    			if (e instanceof Nourriture){
	    				System.out.println(e);
	    			}
	    			else if (e instanceof Fourmiliere){
	    				System.out.println(e);
	    			}
	    		}
	    	}
	    }		    
	}
}
		
		

