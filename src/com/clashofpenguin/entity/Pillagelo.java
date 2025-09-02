package com.clashofpenguin.entity;

public class Pillagelo extends Voleur {

    public Pillagelo(String nom, int pointDeVie, int niveau, int force, boolean estVivant, int defense) {
        super(nom, pointDeVie, niveau, force, estVivant, defense);
    }

    // --- Répliques (méchant) ---
    @Override
    public void sePresenter() {
        String[] L = {
            "On m’appelle Pillagelo. Tes sardines, ta bourse, ta vie. Dans cet ordre. 🐟💰💀",
            "L’ombre du froid, c’est moi. La tienne disparaît d’abord. 🌑🥶",
            "Je dépouille les vivants, je pille les morts. Rien ne m’échappe. 🖤🧤",
            "Ta dernière pièce ? Je l’entends trembler. 🔊💰",
            "Je surgis, je saisis, je disparais. Tu trembles après. 👤💨",
            "Tes secrets gèlent mieux dans mes poches. 🧥❄️"
        };
        System.out.println(getNom() + " ricane : \"" + L[(int)(Math.random() * L.length)] + "\"");
    }

    @Override
    public void perteSubi() {
        String[] L = {
            "Tch… du bruit. Pas de douleur. Continue. 😐❄️",
            "Tu viens d’abîmer une poche… remplie de tes regrets. 🧥💢",
            "Mauvais choix. Je taxe des intérêts… en PV. 📉💀",
            "Tu m’as touché ? Alors je t’efface. ✂️🌑",
            "Méfie-toi. Mes couteaux aiment le froid… et les dettes. 🔪❄️",
            "Bien. Tu mérites de savoir ce qu’est la peur polaire. 🥶👁️"
        };
        System.out.print(" — " + L[(int)(Math.random() * L.length)]);
    }

    // NOTE : on hérite la defendreAnimation() du voleur pour l’instant (tu pourras la personnaliser plus tard)
    // NOTE : on garde le même calcul de critique que Voleur
}