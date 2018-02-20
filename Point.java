
public class Point {
    // Question2: les attributs x et y en public final. 0 sinon
        public final int x; 
	public final int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point(){
	    // Attention a caster au bon endroit ! 
		this((int)(Math.random()*3)-1, (int)(Math.random()*3)-1);
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	public Point addition(Point p2){
		return new Point(x + p2.x, y + p2.y);
	}
	
	public Point soustraction(Point p2){
		return new Point(x - p2.x, y - p2.y);
	}
	
	public Point signe(){
		return new Point(Integer.signum(x), Integer.signum(y));
	}

	public boolean equals(Object o){
		if (this == o){ //optionel
		    return true;
		}
		if (o == null){
		    return false;
		}
		if (getClass() != o.getClass()){ // très peu pénaliser instanceof
		    return false;
		}
		Point p = (Point)o;
		if (x != p.x || y != p.y){
		    return false;
		}
		return true;
	}

	public static Point addition(Point p1, Point p2){
		return new Point(p1.x + p2.x, p1.y + p2.y);
	}

	public static Point soustraction(Point p1, Point p2){
		return new Point(p1.x - p2.x, p1.y - p2.y);
	}
	
	public static Point signe(Point p){
		return new Point(Integer.signum(p.x), Integer.signum(p.y));
	}
}
