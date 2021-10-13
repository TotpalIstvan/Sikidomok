package hu.petrik.sikidomokoop;

public class Haromszog extends Sikidom {
    private double a,b,c;

    public Haromszog() {
        double a = veletlenHossz();
        double b = veletlenHossz();
        double c = veletlenHossz();
        while (!szerkeszthetoE(a, b, c)) {
             a = veletlenHossz();
             b = veletlenHossz();
             c = veletlenHossz();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static boolean szerkeszthetoE(double a, double b, double c) {
        return c > a + b || b > a + c || c > a + b;
    }

    public Haromszog(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    protected double keruletSzamit() {
        return a + b + c;
    }

    @Override
    protected double teruletSzamit() {
        double s = keruletSzamit()/2;
        return Math.sqrt(s * (s - a)* (s - b)* (s - c));
    }

    @Override
    public String toString() {
        return String.format("Háromszög{ a = %f, b = %f, c = %f, %s", a,b,c,super.toString());
    }
}
