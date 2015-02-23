package fmi.calculnumeric.tema1;

/**
 * MetodaNewton.java
 * Created by Madalina on 2/23/2015.
 */
public class MetodaNewton {
    Double[] x;

    public MetodaNewton(Double a0) {
        x = new Double[1000];
        x[0] = a0;

    }

    double f(double x) {
        return 0.5 + 0.25 * Math.pow(x, 2) - x * Math.sin(x) + (0.5) * Math.cos(2 * x);
    }

    double df(double x) {
        return 0.5 * x - Math.sin(x) - x * Math.cos(x) - 2 * Math.sin(x) * Math.cos(x);
    }

    void calculeazaSolutii(int k, double error) {
        do {
            x[k + 1] = x[k] - f(x[k]) / df(x[k]);
            k++;
        } while(f(x[k]) >= error && Math.abs(x[k] - x[k - 1]) >= error);

        System.out.println(x[k]);
        System.out.println(-x[k]);
    }
}
