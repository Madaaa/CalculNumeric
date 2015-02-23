package fmi.calculnumeric.tema1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Madalina on 2/22/2015.
 */
public class Main {

    public static void  main(String []args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dati numarul de zecimale ale erorii: ");
        int nrDec = Integer.parseInt(sc.nextLine());
        double error = 1.0/Math.pow(10,nrDec);

        //Metoda bisectiei
        System.out.println("=== Metoda Bisectiei ===");
        MetodaBisectiei metodaBisectiei1 = new MetodaBisectiei(-1.0, 0.0);
        metodaBisectiei1.calculeazaSolutii(1, error);

        MetodaBisectiei metodaBisectiei2 = new MetodaBisectiei(0.0, 1.0);
        metodaBisectiei2.calculeazaSolutii(1, error);

        MetodaBisectiei metodaBisectiei3 = new MetodaBisectiei(-2.4, -1.0);
        metodaBisectiei3.calculeazaSolutii(1, error);

        MetodaBisectiei metodaBisectiei4 = new MetodaBisectiei(1.0, 2.4);
        metodaBisectiei4.calculeazaSolutii(1, error);

        System.out.println();
        System.out.println();

        //Regula falsi
        System.out.println("=== Regula falsi ===");
        RegulaFalsi regulaFalsi1 = new RegulaFalsi(-1.0,0.0);
        regulaFalsi1.calculeazaSolutii(1, error);

        RegulaFalsi regulaFalsi2 = new RegulaFalsi(0.0,1.0);
        regulaFalsi2.calculeazaSolutii(1, error);

        RegulaFalsi regulaFalsi3 = new RegulaFalsi(-2.4,-1.0);
        regulaFalsi3.calculeazaSolutii(1, error);

        RegulaFalsi regulaFalsi4 = new RegulaFalsi(1.0,2.4);
        regulaFalsi4.calculeazaSolutii(1, error);


        System.out.println();
        System.out.println();


        //Metoda coardei
        System.out.println("=== Metoda coardei ===");
        MetodaCoardei metodaCoardei1 = new MetodaCoardei(-1.0,0.0);
        metodaCoardei1.calculeazaSolutii(1, error);

      /*  MetodaCoardei metodaCoardei2 = new MetodaCoardei(0.0,1.0);
        metodaCoardei2.calculeazaSolutii(1, error);
*/
        MetodaCoardei metodaCoardei3 = new MetodaCoardei(-2.4,-1.0);
        metodaCoardei3.calculeazaSolutii(1, error);

       /* MetodaCoardei metodaCoardei4 = new MetodaCoardei(1.0,2.4);
        metodaCoardei4.calculeazaSolutii(1, error);
*/
        System.out.println();
        System.out.println();

        //Metoda secantei
        System.out.println("=== Metoda secantei ===");
        MetodaSecantei metodaSecantei1 = new MetodaSecantei(-0.9,-0.75);
        metodaSecantei1.calculeazaSolutii(1, error);

/*
        MetodaSecantei metodaSecantei2 = new MetodaSecantei(0.0,1.0);
        metodaSecantei2.calculeazaSolutii(1, error);

        MetodaSecantei metodaSecantei3 = new MetodaSecantei(-2.0,0.0);
        metodaSecantei3.calculeazaSolutii(1, error);
*/

        MetodaSecantei metodaSecantei4 = new MetodaSecantei(2.219,2.28);
        metodaSecantei4.calculeazaSolutii(1, error);


        System.out.println();
        System.out.println();

        //Metoda Newton
        System.out.println("=== Metoda Newton ===");
        MetodaNewton metodaNewton1 = new MetodaNewton(-1.0);
        metodaNewton1.calculeazaSolutii(0, error);

        MetodaNewton metodaNewton2 = new MetodaNewton(-2.4);
        metodaNewton2.calculeazaSolutii(0, error);


    }
}
