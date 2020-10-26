public class MemoryDiagrams{

    public static void main(String[] args) {
	int a = 5;
	System.out.println("a = " + a);
	int b = a;     // a and b are now equal
	System.out.println("b = " + b);
	a = 3;         // a and b are no longer equal
	System.out.println("a = " + a);
    }
}