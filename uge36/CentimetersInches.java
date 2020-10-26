import java.util.Scanner;

public class InchesCentimeters3{

    public static void main(String[] args) {

    // Constant
	final double CM_PER_INCH = 2.54;

	// Variables
	int inch;
	double cm;

	// Scanner input
	Scanner in = new Scanner(System.in);
	System.out.print("\nHow many centimeters? ");
	inch = in.nextInt();

	// Convert - Print
	cm = inch * CM_PER_INCH;
	System.out.print("\n" + inch + " in = ");
	System.out.println(cm + " cm");
	System.out.printf("%d in = %.4f cm\n", inch, cm);

    }
}

