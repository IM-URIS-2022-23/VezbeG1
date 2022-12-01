package vezbanje;

public class Circle {

	private Point center;
	private int radius;
	private boolean selected;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius, boolean selected) {
		super();
		this.center = center;
		this.radius = radius;
		this.selected = selected;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle temp = (Circle)obj;
			if(temp.getCenter().equals(center) && 
					temp.getRadius() == radius) {
				return true;
			}
		}
		return false;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
