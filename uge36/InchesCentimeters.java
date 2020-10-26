import java.util.Scanner;

public class InchesCentimeters{

    public static void main(String[] args) {

	// Variables
	int inch;
	double cm;

	// Scanner input
	Scanner in = new Scanner(System.in);
	System.out.print("\nHow many inches? ");
	inch = in.nextInt();

	// Convert - Print
	cm = inch * 2.54;
	System.out.print("\n" + inch + " in = ");
	System.out.println(cm + " cm");

    }
}