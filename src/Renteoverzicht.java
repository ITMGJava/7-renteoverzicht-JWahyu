import java.util.Scanner;

public class Renteoverzicht {
    public static void main(String[] args) {

        // Rente spaaroverzichtprogramma.

        System.out.printf("%n―――――――――――――――――――――――――――――――%n");
        System.out.print("$$$ Welkom bij de Totaal-Niet-Corrupte bank! $$$$");
        System.out.printf("%n―――――――――――――――――――――――――――――――%n");
        System.out.printf("%nMinimale inleg bedraagt €100,-! Hieronder tref je onze rentetarieven:%n");

        System.out.printf(
                "€ 100,- t/m € 299,- → 3%% rente%n" +
                "€ 300,- t/m € 599,- → 2%% rente%n" +
                "€ 600,- t/m € 1000,- → 1%% rente%n" +
                "Meer dan € 1000,- → 0,5%% rente%n");

        var input = new Scanner(System.in);

        // Invoer naam.
        System.out.printf("%nAllereerst wil ik weten hoe je heet! Dus wat is je naam?%n");
        var inputName = input.nextLine();

        // Invoer inleg en/of uitvoer overzicht.
        System.out.printf("%nVoor hoeveel jaar wens je te beleggen %s? %n", inputName);
        int yearInput = input.nextInt();
        int year;
        boolean check = true;
        do {
            // Invoer inleg.
            System.out.printf("En hoeveel wil je betalen %s?%n", inputName);
            var investment = input.nextDouble();

            // Incorrecte invoer inleg.
            if (investment < 100) {
                check = false;
                System.out.printf("Slechts € %.2f? Niet zo gierig doen hé %s! Je moet wel minimaal € 100,- dokken!%n", investment, inputName);
            }

            // Inleg tussen 100 < 300.
            else if (investment >= 100 && investment < 300) {
                check = true;
                System.out.printf("%nAardig begin, %s! Voor je bedrag van € %.2f geniet je van 3%% rente. Hoe rijk ben je de komende %d jaar? Zo rijk dus:%n", inputName, investment, yearInput);
                for (year = 1; year <= yearInput; year++) {
                    System.out.format("Jaar %d: € %.2f %n", year, investment*=1.03);
                }
            }

            // Inleg van 300 - 599.
            else if (investment >= 300 && investment < 599) {
                check = true;
                System.out.printf("%nDat is mooi, %s! Voor je bedrag van € %.2f geniet je van 2%% rente. Hoe rijk ben je de komende %d jaar? Zo rijk dus:%n", inputName, investment, yearInput);
                for (year = 1; year <= yearInput; year++) {
                    System.out.format("Jaar %d: € %.2f %n", year, investment*=1.02);
                }
            }

            // Inleg van 600 - 1000.
            else if (investment >= 600 && investment <= 1000) {
                check = true;
                System.out.printf("%nDat is uitstekend, %s! Voor je bedrag van € %.2f geniet je van 1%% rente. Hoe rijk ben je de komende %d jaar? Zo rijk dus:%n", inputName, investment, yearInput);
                for (year = 1; year <= yearInput; year++) {
                    System.out.format("Jaar %d: € %.2f %n", year, investment*=1.01);
                }
            }

            // Inleg groter dan 1000.
            else if (investment > 1000) {
                check = true;
                System.out.printf("%nWow kassa, %s! Voor je bedrag van € %.2f geniet je van 0,5%% rente. Hoe rijk ben je de komende %d jaar? Zo rijk dus:%n", inputName, investment, yearInput);
                for (year = 1; year <= yearInput; year++) {
                    System.out.format("Jaar %d: € %.2f %n", year, investment*=1.005);
                }
            }
        } while (!check);

        // Einde.
        System.out.printf("%nDank je wel voor je geld %s! Maak maar daar geen zorgen om hoor... ;)%n", inputName);
        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
        System.out.print("$$$ Tot de volgende keer bij de Totaal-Niet-Corrupte bank! Jouw sessie is hierbij beëindigd. $$$");
        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
    }
}

