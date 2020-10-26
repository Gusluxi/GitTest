class MathFun {
public static void main(String[] args) {

double x = 43.77;
double y = 10;
//Det højeste tal af alle tal
System.out.println("Maximum number of x and y is: " + Math.max(x, y));

//kvadratroden af 4 = 2*2
System.out.println("Square root of y is: " + Math.sqrt(y));

//et resultat af x ganget med sig selv y gange.
System.out.println("Power of x and y is: " + Math.pow(x, y));

//
System.out.println("Logarithm of x is: " + Math.log(x));
System.out.println("Logarithm of y is: " + Math.log(y));

//
System.out.println("logl0 of x is: " + Math.log10(x));
System.out.println("logl0 of y is: " + Math.log10(y));

//
System.out.println("loglp of x is: " + Math.log1p(x));

//
System.out.println("exp of a is: " + Math.exp(x));

//
System.out.println("expm1 of a is: " + Math.expm1(x));
  }
}
