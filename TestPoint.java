
public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(-10,10);
		Point p2 = new Point();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.addition(p2));
		System.out.println(Point.addition(p1,p2));
		System.out.println(Point.soustraction(p1,p2).signe());

		Point p3 = new Point(1,2);
		Point p4 = new Point(1,2);
		Point p5 = new Point(0,2);
		Point p6 = p3;
		System.out.println(p3.equals(p4));
		System.out.println(p3.equals(p5));
		System.out.println(p3.equals(p6));
	}

}
