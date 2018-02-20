/* Code Fourni */
	public class TestSimulationAvancee {
		public static void main(String[] args) {
			Monde m = new Monde();
			for (int k = 0; k < 25; k++){
				int ki = (int)(Math.random()*(m.TAILLE-3));
				int kj = (int)(Math.random()*(m.TAILLE-3));
				for (int i = 0; i < 3; i++){
					for (int j = 0; j < 3; j++){
						m.setElement(new Nourriture(new Point(ki+i,kj+j)));
					}
				}
			}
			m.setElement(new Fourmiliere(new Point(30,30), 30));
			m.setElement(new Fourmiliere(new Point(70,70), 30));    
		    
			int size = m.TAILLE;
			SimpleInterface ui = new SimpleInterface("MondeAvancee",500,500);
			ui.createArea(size,size);
			ui.refresh();
			while (true){
			  m.next();
			  SimpleInterface.pause(25);
			  ui.clear();
			  for (int i=0; i<m.TAILLE; i++){
				  for (int j=0; j<m.TAILLE; j++){
					  Lieu lieu = m.getLieu(new Point(i,j));
					  Element e = lieu.getElement();
					  int nbPheromones = lieu.getNbPheromones();
					  ui.setRGB(i, j, new int[]{Math.min(20*nbPheromones,255), Math.min(20*nbPheromones,255), 0});
					  if (e != null){
						  if (e instanceof Nourriture){
							  ui.setRGB(i, j, new int[]{0,Math.min(255,e.getValeur()*20),0});
						  }
						  else if (e instanceof Fourmiliere){
							  ui.setRGB(i, j, new int[]{255, 0, 0});
						  }
					  }
				  }
			  }
			  for (Fourmi f : m.getListeFourmis()){
				  int x = f.getX();
				  int y = f.getY();
				  if (x >= 0 && x < m.TAILLE && y >= 0 && y < m.TAILLE){
					  ui.setRGB(x, y, new int[]{100,50,50});
				  }
			  }
			  ui.refresh();
			}
		}
	}
