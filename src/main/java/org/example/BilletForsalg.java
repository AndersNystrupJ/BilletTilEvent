package org.example;

public class BilletForsalg implements Billet {
    int billetID;
    double pris;
    int dageIndtilEvent;

    public BilletForsalg(int billetID, double pris, int dageIndtilEvent) {
     this.billetID = billetID;
     this.dageIndtilEvent = dageIndtilEvent;
     pris = 120;
    }

    @Override
    public double pris() {
        if (dageIndtilEvent > 10) {
           return pris = pris / 0.15 * 100;
        } else {
            return 120;
        }
    }

    @Override
    public int getBilletID() {
        return 200;
    }
}
