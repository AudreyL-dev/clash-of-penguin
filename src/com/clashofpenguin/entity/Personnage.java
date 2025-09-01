package com.clashofpenguin.entity;

public abstract class Personnage {
	// =======================================
		// = ATTRIBUTS =
		// =======================================

		private String nom;// nom du personnage
		private int pointDeVie;
		private int niveau;
		private int force;
		private boolean estVivant;
		private int defense;

		// =======================================
		// = CONSTRUCTEURS =
		// =======================================

		public Personnage() {

		}

		public Personnage(String nom, int pointDeVie, int niveau, int force, boolean estVivant, int defense) {
		
			this.setNom(nom);
			this.setPointDeVie(pointDeVie);
			this.setNiveau(niveau);
			this.setForce(force);
			this.setEstVivant(estVivant);
			this.setDefense(defense);
		}

		// =======================================
		// = GETTERS ET SETTERS =
		// =======================================

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getPointDeVie() {
			return pointDeVie;
		}

		public void setPointDeVie(int pointDeVie) {
			this.pointDeVie = pointDeVie;
		}

		public int getNiveau() {
			return niveau;
		}

		public void setNiveau(int niveau) {
			this.niveau = niveau;
		}

		public int getForce() {
			return force;
		}

		public void setForce(int force) {
			this.force = force;
		}

		public boolean isEstVivant() {
			return estVivant;
		}

		public void setEstVivant(boolean estVivant) {
			this.estVivant = estVivant;
		}

		public int getDefense() {
			return defense;
		}

		public void setDefense(int defense) {
			this.defense = defense;
		}
		// =======================================
		// = METHODES ABSTRAITES =
		// =======================================

		public abstract void sePresenter();

		public abstract void defendre();

		// =======================================
		// = METHODES =
		// =======================================

		public void subirDegats(int degats) {
			this.pointDeVie -= degats;
			if (this.pointDeVie <= 0) {
				this.pointDeVie = 0;
				this.estVivant = false;
				System.out.println(this.nom + " est vaincu !");
			}
		}

		public void attaquer(Personnage ennemi) {
			// Si le personnage est vivant, il peut attaquer
			if (this.estVivant) {
				int degats = this.force - ennemi.getDefense();
				if (degats < 0) {
					degats = 0; // éviter de soigner l'ennemi
				}
				ennemi.subirDegats(degats);
				System.out.println(
						this.nom + " attaque " + ennemi.getNom() + " et inflige " + degats + " points de dégâts !");
			}
		}

}
