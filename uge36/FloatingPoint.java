public class FloatingPoint{

    public static void main(String[] args) {
        // Floating-Point Numbers
	double minute = 59.0;
	System.out.print("Fraction of the hour that has passed: ");
	System.out.println(minute / 60.0);

	// Fejl
	// int x = 1.1;  // compiler error
	double y = 1;  // legal, but bad style
	double y1 = 1 / 3;  // common mistake
	double y2 = 1.0 / 3.0;  // correct

	System.out.println(y1);
	System.out.println(y2);
    }
}