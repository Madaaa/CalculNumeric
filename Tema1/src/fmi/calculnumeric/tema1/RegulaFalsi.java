package fmi.calculnumeric.tema1;

/**
 * Created by Madalina on 2/22/2015.
 */
public class RegulaFalsi {
    Double [] a;
    Double [] b;
    Double [] c;
    Double  z;
    int sizeOfZ;


    public RegulaFalsi(Double a0, Double b0) {
        a = new Double[1000];
        b = new Double[1000];
        c = new Double[1000];

        a[0] = a0;
        b[0] = b0;
        c[0] = (a[0] * f(b[0]) - b[0] * f(a[0]))/(f(b[0]) - f(a[0]));

    }


    double f(double x) {
        return 0.5 + 0.25 * Math.pow(x,2) - x * Math.sin(x) + (0.5) * Math.cos(2 * x);
    }


    void calculeazaSolutii(int k, double error) {

        while(true) {
            if (f(c[k - 1]) == 0.0) {
                break;
            } else if (f(a[k - 1]) * f(c[k - 1]) < 0.0) {
                a[k] = a[k - 1];
                b[k] = c[k - 1];
                c[k] = (a[k] * f(b[k]) - b[k] * f(a[k])) / (f(b[k]) - f(a[k]));
            } else if (f(a[k - 1]) * f(c[k - 1]) > 0.0) {
                a[k] = c[k - 1];
                b[k] = b[k - 1];
                c[k] = (a[k] * f(b[k]) - b[k] * f(a[k])) / (f(b[k]) - f(a[k]));
            }

            if (Math.abs(f(c[k])) < error && Math.abs(c[k] - c[k - 1]) < error)
                break;

            k ++;
        }

        System.out.println(c[k]);

    }


  }




