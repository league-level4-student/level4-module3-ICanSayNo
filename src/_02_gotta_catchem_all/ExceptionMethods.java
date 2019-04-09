package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide(double a, double b) {
		if (b == 0.0) {
			throw new IllegalArgumentException("No dividing by the numerical value known as zero which you have attempted to use as the denominator when prompted for the second number. While any other number is ok, dividing by zero simply isn't a possible mathematical concept and is thus going to throw an illegal argument exception.");
		}
		double c = a/b;
		return c;
	}
	
	public String reverseString(String a) {
		if (a==null || a.isEmpty()) {
			throw new IllegalStateException("No empty Strings because you can't reverse an empty string");
		}
		StringBuilder sb = new StringBuilder(a);
		return sb.reverse().toString();
	}
	
}
