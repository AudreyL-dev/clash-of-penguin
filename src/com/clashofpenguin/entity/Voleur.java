package com.clashofpenguin.entity;

public abstract class Voleur extends Personnage {
	// =======================================
	// = CONSTRUCTEURS =
	// =======================================
	public Voleur() {
		super();
	}

	public Voleur(String nom, int pointDeVie, int niveau, int force, boolean estVivant, int defense) {
		super(nom, pointDeVie, niveau, force, estVivant, defense);

	}

	// =======================================
	// = METHODES ABSTRAITES =
	// =======================================
	

	

	@Override
	public void defendre() {
		// TODO Auto-generated method stub

	}

	// =======================================
	// = METHODES =
	// =======================================

}
