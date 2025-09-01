package com.clashofpenguin.test;

import com.clashofpenguin.entity.Guerrier;
import com.clashofpenguin.entity.Personnage;
import com.clashofpenguin.utils.InputUtils;
import com.clashofpenguin.utils.EcranTitre;

import java.util.Scanner;

public class PresentationTest {

    public static void main(String[] args) {
        // Affichage titre
        EcranTitre.showTitle();

        // Guerriers disponibles
        Guerrier g1 = new Guerrier("Glaciator", 100, 1, 12, true, 5);
        Guerrier g2 = new Guerrier("Obscuriator", 100, 1, 10, true, 6);
        Guerrier g3 = new Guerrier("Frigorius", 100, 1, 8, true, 4);

        Scanner sc = InputUtils.getScanner();

        // Menu de sélection
        System.out.println("Choisissez votre attaquant :");
        System.out.println("1. " + g1.getNom() + " (PV: " + g1.getPointDeVie() + ", Force: " + g1.getForce() + ")");
        System.out.println("2. " + g2.getNom() + " (PV: " + g2.getPointDeVie() + ", Force: " + g2.getForce() + ")");
        System.out.println("3. " + g3.getNom() + " (PV: " + g3.getPointDeVie() + ", Force: " + g3.getForce() + ")");
        System.out.print("Votre choix (1-3) : ");

        int choix = sc.nextInt();
        Personnage attaquant;

        switch (choix) {
            case 1 -> attaquant = g1;
            case 2 -> attaquant = g2;
            case 3 -> attaquant = g3;
            default -> {
                System.out.println("Choix invalide, on prend Glaciator par défaut !");
                attaquant = g1;
            }
        }

        // Pour tester : attaquer un autre guerrier
        Personnage cible = new Guerrier("Dummy le Manchot", 80, 1, 5, true, 3);

        System.out.println("\n== Combat ==");
        attaquant.attaquer(cible);
        System.out.println(attaquant.getForce());
    }
}