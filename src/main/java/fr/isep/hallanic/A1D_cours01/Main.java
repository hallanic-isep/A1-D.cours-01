package fr.isep.hallanic.A1D_cours01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenue dans mon super jeu !");

        System.out.print("Votre essai : ");
        Scanner input = new Scanner(System.in);
        int essai = input.nextInt();

        // Valeur à trouver
        int cible = (int) (Math.random() * 10);
        System.out.println("...triche:" + cible);

        String res = "";
        if (essai < cible) {
            res = "inf";
        }
        if (essai > cible) {
            res = "sup";
        }
        if (essai == cible) {
            res = "egal";
        }

        switch (res) {
            case "inf":
                System.out.println("Trop petit...");
            case "sup":
                System.out.println("Trop grand...");
            default:
                System.out.println("BRAVO !!!");
        }
    }
}