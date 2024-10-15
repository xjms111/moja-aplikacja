package com.example;

public class App 
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Podaj typ bryły i jej wymiary.");
            return;
        }

        String brylaTyp = args[0];
        double bok;

        switch (brylaTyp.toLowerCase()) {
            case "kula":
                if (args.length < 2) {
                    System.out.println("Podaj promień kuli.");
                    return;
                }
                bok = Double.parseDouble(args[1]);
                enumy.jedno.Kula.nazwa();  // Poprawne odwołanie do klasy enum jedno
                System.out.println("Pole powierzchni: " + enumy.jedno.Kula.polePowierzchni(bok));
                System.out.println("Objętość: " + enumy.jedno.Kula.objetosc(bok));
                break;

            case "szescian":
                if (args.length < 2) {
                    System.out.println("Podaj długość boku sześcianu.");
                    return;
                }
                bok = Double.parseDouble(args[1]);
                enumy.jedno.Szescian.nazwa();  // Poprawne odwołanie do klasy enum jedno
                System.out.println("Pole powierzchni: " + enumy.jedno.Szescian.polePowierzchni(bok));
                System.out.println("Objętość: " + enumy.jedno.Szescian.objetosc(bok));
                break;

            case "prostopadloscian":
                if (args.length < 4) {
                    System.out.println("Podaj długości trzech krawędzi prostopadłościanu.");
                    return;
                }
                double bok1 = Double.parseDouble(args[1]);
                double bok2 = Double.parseDouble(args[2]);
                double bok3 = Double.parseDouble(args[3]);
                enumy.dwu.Prostopadloscian.nazwa();  // Poprawne odwołanie do klasy enum dwu
                System.out.println("Pole powierzchni: " + enumy.dwu.Prostopadloscian.polePowierzchni(bok1, bok2, bok3));
                System.out.println("Objętość: " + enumy.dwu.Prostopadloscian.objetosc(bok1, bok2, bok3));
                break;

            default:
                System.out.println("Nieznany typ bryły. Dostępne typy: kula, szescian, prostopadloscian.");
                break;
        }
    }
}
