package org.example;
public class BilletForsalgStudierabat implements Billet {
    int billetID;
    double pris;
    int dageIndtilEvent;

    public BilletForsalgStudierabat(int billetID, double pris, int dageIndtilEvent) {
        this.billetID = billetID;
        this.dageIndtilEvent = dageIndtilEvent;
        pris = 90;
    }


    @Override
    public double pris() {
        if (dageIndtilEvent > 10) {
            return pris = pris / 0.15 * 100;
        } else {
            return 90;
        }
    }

    @Override
    public int getBilletID() {
        return 300;
    }
}
