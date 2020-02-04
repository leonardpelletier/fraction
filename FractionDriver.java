public class FractionDriver {

    public static void main (String[] args) {
        System.out.println("Testing constructors.../n");

        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1,2);
        Fraction f3 = new Fraction("3/4");
        Fraction f4 = new Fraction(f2);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println("\nTesting arithmetic methods...\n");

        System.out.println( f3 + " + " + f4 + " = " + Fraction.add(f3, f4) );
        System.out.println( f3 + " - " + f4 + " = " + Fraction.subtract(f3, f4) );
        System.out.println( f3 + " x " + f4 + " = " + Fraction.multiply(f3, f4) );
        System.out.println( f3 + " ÷ " + f4 + " = " + Fraction.divide(f3, f4) );

        System.out.println("\nTesting denominator zero fails...\n");

        Fraction f5 = new Fraction(1,0);
        Fraction f6 = new Fraction("1/0");
        Fraction f7 = new Fraction("0/1");

        System.out.println( f4 + " ÷ " + f7 + " = " + Fraction.divide(f4, f7) );
        
        System.out.println("\nTesting addtional concerns...\n");

        Fraction f8 = new Fraction("-1/-2");
        System.out.println( f4 + " + " + f8 + " = " + Fraction.add(f4, f8) );
        


        
    }
}
