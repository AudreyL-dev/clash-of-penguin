package com.clashofpenguin.entity;

public abstract class Personnage {

    private String nom;
    private int pointDeVie;
    private int niveau;
    private int force;
    private boolean estVivant;
    private int defense;

    // --- CTORS ---
    public Personnage() {}

    public Personnage(String nom, int pointDeVie, int niveau, int force, boolean estVivant, int defense) {
        this.setNom(nom);
        this.setPointDeVie(pointDeVie);
        this.setNiveau(niveau);
        this.setForce(force);
        this.setEstVivant(estVivant);
        this.setDefense(defense);
    }

    // --- API OOP : attaquer / subir / calculer ---
    /** Appel côté attaquant (non static, pas de instanceof). */
    public void attaquer(Personnage cible) {
        if (!estVivant) {
            System.out.println(nom + " ne peut pas attaquer (K.O).");
            return;
        }
        int degats = calculerDegatsContre(cible);
        cible.subirDegats(degats, this);
    }

    /** Calcul de dégâts : peut être surchargé par les sous-classes. */
    protected int calculerDegatsContre(Personnage cible) {
        // Modèle simple : dégâts bruts - défense, minimum 0.
        int bruts = degatsBruts();
        int nets  = Math.max(0, bruts - cible.getDefense());
        return nets;
    }

    /** Dégâts bruts (base commune) : force + petit bonus de niveau. */
    protected int degatsBruts() {
        return getForce() + Math.max(0, getNiveau() / 2);
    }

    /** Côté défenseur. Peut être surchargé pour réactions spéciales. */
    protected void subirDegats(int quantite, Personnage source) {
        setPointDeVie(Math.max(0, getPointDeVie() - quantite));
        if (getPointDeVie() == 0) {
            setEstVivant(false);
        }
        System.out.println(
            source.getNom() + " inflige " + quantite + " PV à " + getNom() +
            " (PV restants: " + getPointDeVie() + (isEstVivant() ? ")" : ", K.O.)")
        );
    }

    // --- Hooks narratifs / spécifiques ---
    public abstract void sePresenter();
    public abstract void perteSubi();  // si tu veux déclencher une réplique
    public abstract void defendre();   // si tu veux une action de défense active

    // --- Getters/Setters ---
    public String getNom() {
    	return nom; }
    public void setNom(String nom) { 
    	this.nom = nom; }
    public int getPointDeVie() { 
    	return pointDeVie; }
    public void setPointDeVie(int pointDeVie) { 
    	this.pointDeVie = pointDeVie; }
    public int getNiveau() {
    	return niveau; }
    public void setNiveau(int niveau) {
    	this.niveau = niveau; }
    public int getForce() {
    	return force; }
    public void setForce(int force) {
    	this.force = force; }
    public boolean isEstVivant() {
    	return estVivant; }
    public void setEstVivant(boolean estVivant) {
    	this.estVivant = estVivant; }
    public int getDefense() { 
    	return defense; }
    public void setDefense(int defense) {
    	this.defense = defense; }
}
