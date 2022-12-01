package vezbanje;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 50;
		p1.setX(50);
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		System.out.println(l1.getStartPoint());

	}

}
