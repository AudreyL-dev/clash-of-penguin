package com.clashofpenguin.entity;

public class Guerrier extends Personnage {

    public Guerrier() { }

    public Guerrier(String nom, int pointDeVie, int niveau, int force, boolean estVivant, int defense) {
        super(nom, pointDeVie, niveau, force, estVivant, defense);
    }

    @Override
    public void sePresenter() {
        System.out.println(getNom() + " (Guerrier) : « Par la nageoire sacrée ! »");
    }

    @Override
    public void perteSubi() {
        // Hook optionnel quand il perd des PV (non utilisé dans cet exemple)
    }

    @Override
    public void defendre() {
        // Ex : lever le bouclier -> augmenter temporairement la défense
    }

    /** Le Guerrier tape plus fort : surcharge du calcul. */
    @Override
    protected int calculerDegatsContre(Personnage cible) {
        int base = super.calculerDegatsContre(cible);
        // petit bonus de “rage polaire”
        int bonus = Math.max(1, getNiveau() / 3);
        return base + bonus;
    }
}
