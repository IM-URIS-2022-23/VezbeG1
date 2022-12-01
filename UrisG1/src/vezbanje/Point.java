package vezbanje;

public class Point {

	public int x;
	private int y;
	private boolean selected;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double distance(int x, int y) {
		int dX = this.x - x;
		int dY = this.y - y;
		return Math.sqrt(dX * dX + dY * dY);
	}

	public void setX(int x) {
		this.x = x;
		// p1.x = x;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point temp = (Point) obj;
			if (temp.getX() == x && temp.getY() == y) {
				return true;
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean isSelected() {
		return selected;
	}

}
