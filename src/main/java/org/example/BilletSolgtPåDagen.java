package org.example;

public class BilletSolgtPåDagen implements Billet {
    int billetID;
    double pris;

    public BilletSolgtPåDagen(int billetID) {
        this.billetID = billetID;
        pris = 150;
    }

    @Override
    public double pris() {
        return 0;
    }

    @Override
    public int getBilletID() {
        return 100;
    }
}
