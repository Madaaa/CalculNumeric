package fmi.calculnumeric.tema1;

/**
 * MetodaSecantei.java
 * Created by Madalina.Cozma on 2/23/2015.
 */
public class MetodaSecantei {
    Double[] x;

    public MetodaSecantei(Double a0, Double b0) {
        x = new Double[1000];
        x[0] = a0;
        x[1] = b0;
    }

    double f(double x) {
        return 0.5 + 0.25 * Math.pow(x, 2) - x * Math.sin(x) + (0.5) * Math.cos(2 * x);
    }

    void calculeazaSolutii(int k, double error) {
        do {

            x[k + 1] = (x[k - 1] * f(x[k]) - x[k] * f(x[k - 1])) / (f(x[k]) - f(x[k - 1]));

            k ++;
        }
        while(f(x[k]) >= error && Math.abs(x[k] - x[k - 1]) >= error);

        System.out.println(x[k]);
        System.out.println(-x[k]);
    }
}
