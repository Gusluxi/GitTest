


import java.util.Scanner;

public class TriangleWithValidation {

    public static void main(String[] args) {
        System.out.println(isTriangle());
    }

    public static boolean isTriangle() {
        int side1 = sidelængde(1);
        int side2 = sidelængde(2);
        int side3 = sidelængde(3);
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;

    }

 /*   //Simons løsning med et do-while loop
    public static int sidelængde(int nummerSide) {
        Scanner in = new Scanner(System.in);
        int side;


        do {
            System.out.println("Skriv længden på den " + nummerSide + ". side her. Tallet skal være et positivt heltal større end nul: ");
            while (!in.hasNextInt()) {
                System.out.println("Længden skal være formuleret som et heltal. Prøv igen!");
                in.nextLine();
            }
            side = in.nextInt();
            in.nextLine();


        }
        while (side <= 0);


        return side;
    }
*/
  //Version kun med while-loops
    public static int sidelængde(int nummerSide) {

        Scanner in = new Scanner(System.in);
        int side;

        //Prompt brugeren
        System.out.println("Skriv længden på den "+nummerSide+". side her. Tallet skal være et positivt heltal større end nul: ");
        //Validering for om brugeren taster et tal
        while (!in.hasNextInt()) {
            System.out.println("Længden skal være formuleret som et heltal. Prøv igen!");
            in.next();
        }
        side = in.nextInt();
        //Validering af om tallet er positivt og over nul
        while (side <= 0) {
            System.out.println("Længden skal være et positivt heltal større end nul. Prøv igen!");
            //
            while (!in.hasNextInt()) {
                System.out.println("Længden skal være formuleret som et heltal. Prøv igen!");
                in.next();
            }
            side = in.nextInt();
        }

        return side;
        
    }
    
}