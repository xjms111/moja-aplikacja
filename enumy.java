package com.example;

public class enumy {

    // Enum dla brył o równych wszystkich krawędziach (kula, sześcian)
    public enum jedno implements Bryly.Bryla1 {
        Kula {
            public double polePowierzchni(double promien) {
                return 4 * Math.PI * promien * promien;
            }
            public double objetosc(double promien) {
                return (4.0 / 3.0) * Math.PI * Math.pow(promien, 3);
            }
            public void nazwa() {
                System.out.println("Kula");
            }
        },
        Szescian {
            public double polePowierzchni(double bok) {
                return 6 * bok * bok;
            }
            public double objetosc(double bok) {
                return bok * bok * bok;
            }
            public void nazwa() {
                System.out.println("Sześcian");
            }
        }
    }

    // Enum dla brył o różnych krawędziach (prostopadłościan)
    public enum dwu implements Bryly.Bryla2 {
        Prostopadloscian {
            public double polePowierzchni(double a, double b, double c) {
                return 2 * (a * b + b * c + a * c);
            }
            public double objetosc(double a, double b, double c) {
                return a * b * c;
            }
            public void nazwa() {
                System.out.println("Prostopadłościan");
            }
        }
    }
}

