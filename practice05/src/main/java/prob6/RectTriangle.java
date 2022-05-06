package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return this.width * this.height * 0.5;
	}

	@Override
	public double getPerimeter() {
		return this.width + this.height + Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}

}
