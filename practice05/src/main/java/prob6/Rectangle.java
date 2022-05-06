package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}

	public void resize(double argument) {
		this.width *= argument;
		this.height *= argument;
	}

}
