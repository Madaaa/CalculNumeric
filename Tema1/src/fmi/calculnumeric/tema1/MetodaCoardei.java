package fmi.calculnumeric.tema1;

/**
 * Created by Madalina on 2/22/2015.
 */
public class MetodaCoardei {

    Double [] x;

    public MetodaCoardei(Double a0, Double b0) {
        x = new Double[1000];
        x[0] = a0;
        x[1] = b0;
    }

    double f(double x) {
        return 0.5 + 0.25 * Math.pow(x,2) - x * Math.sin(x) + (0.5) * Math.cos(2 * x);
    }


    void calculeazaSolutii(int k, double error) {

        do {
            x[k + 1] = (x[0] * f(x[k]) - x[k] * f(x[0]))/(f(x[k]) - f(x[0]));
            k ++;
        }
        while(Math.abs(f(x[k])) >= error);

        System.out.println(x[k]);
        System.out.println(-x[k]);

    }

    void afiseazaSolutii() {

        for (int i = 0; x[i] != null; i ++) {
            System.out.print(x[i] + " ");
        }

      }



}
