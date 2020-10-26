import java.util.Scanner;

public class InchesCentimeters2{

    public static void main(String[] args) {

    // Constant
	final double CM_PER_INCH = 2.54;

	// Variables
	int inch;
	double cm;

	// Scanner input
	Scanner in = new Scanner(System.in);
	System.out.print("\nHow many inches? ");
	inch = in.nextInt();

	// Convert - Print
	final double CM_PER_INCH = 2.54;
	cm = inch * CM_PER_INCH;
	System.out.print("\n" + inch + " in = ");
	System.out.println(cm + " cm");

    }
}

