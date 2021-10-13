package hu.petrik.sikidomokoop;

import java.util.Random;

public class Kor extends Sikidom {
    private double r;

    public Kor() {
        this.r = veletlenHossz();
    }

    public Kor(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }



    @Override
    protected double keruletSzamit() {
        return 2*r*Math.PI;
    }

    @Override
    protected double teruletSzamit() {
        return r*r*Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Kör { r = %f, %s}", r, super.toString());
    }
}
