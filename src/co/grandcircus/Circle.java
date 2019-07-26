package co.grandcircus;

public class Circle {
	private double rad;
	//private double circ;

	public Circle(double radius) {
		this.rad = radius;

	}
	
	

	public double getRad() {
		return rad;
	}



	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getCircumference() {
		return (Math.PI * 2) * rad;

	}

	public double getArea() {
		Double area = Math.PI * Math.pow(rad, 2);
		return area;
	}

	private String formatNumber(double x) {
		return String.format("%.2f", x);
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}

	public String getFormattedArea() {
		return null;
	}
	
}
