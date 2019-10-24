package co.grandcircus;

public class Circle {

	// Need this circleString string to save a value to return using the overrod
	// toString method
	private String circleString;

	public Circle(double r) {
		getCircleString(r);
	}

	public Circle() {
	}

	public double getCircumference(double r) {
		return (2 * Math.PI * r);
	}

	public double getArea(double r) {
		return (Math.PI * (r * r));
	}

	private static String formatNumber(double n) {
		return String.format("%.2f", n);
	}

	public String getFormattedCircumference(double r) {
		return String.format("Circumference: %s", formatNumber(getCircumference(r)));
	}

	public String getFormattedArea(double r) {
		return String.format("Area: %s", formatNumber(getArea(r)));
	}

	// This method saves the formatted area and circumference into a string to be
	// returned by the new toString method.
	public String getCircleString(double r) {
		circleString = getFormattedArea(r) + "\n" + getFormattedCircumference(r);
		return circleString;
	}

	@Override
	public String toString() {
		return circleString;
	}

}
