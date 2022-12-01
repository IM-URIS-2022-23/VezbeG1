package zadaci;

import vezbanje.Circle;
import vezbanje.Line;
import vezbanje.Point;
import vezbanje.Rectangle;

public class Test {

	public static void main(String[] args) {
		
		Point p1 = new Point(5,5);
		Point p2 = new Point(5,5);
		Line l2 = new Line(p1,p2);
		Rectangle r1 = new Rectangle(p2,50,50,false);
		Circle c1 = new Circle(p1,50,true);
		
		System.out.println(p1 == p2); //true
		System.out.println(15 == 15); //true
		System.out.println(p1.equals(p2));//true - null
		System.out.println(p1.equals(c1));//false
		System.out.println(l2.equals(p1));//false

	}

}
