public class ArithmeticOperators{

    public static void main(String[] args) {
        // generate some simple output
	int hour = 11;
	int minute = 59;
	System.out.print("Number of minutes since midnight: ");
	System.out.println(hour * 60 + minute);

	// Fraction
	System.out.print("Fraction of the hour that has passed: ");
	System.out.println(minute / 60);

	// Percent
	System.out.print("Percent of the hour that has passed: ");
	System.out.println(minute * 100 / 60);
    }
}