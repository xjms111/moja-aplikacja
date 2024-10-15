package com.example;

public class Bryly {

    // Interfejs dla brył o równych wszystkich bokach (np. kula, sześcian)
    public interface Bryla1 {
        double polePowierzchni(double a);  // Oblicza pole powierzchni dla bryły z jednym parametrem
        double objetosc(double a);         // Oblicza objętość dla bryły z jednym parametrem
        void nazwa();                      // Wypisuje nazwę bryły
    }

    // Interfejs dla brył z różnymi krawędziami (np. prostopadłościan)
    public interface Bryla2 {
        double polePowierzchni(double a, double b, double c);  // Oblicza pole powierzchni dla bryły z trzema parametrami
        double objetosc(double a, double b, double c);         // Oblicza objętość dla bryły z trzema parametrami
        void nazwa();                                          // Wypisuje nazwę bryły
    }
}
