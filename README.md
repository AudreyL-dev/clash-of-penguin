# clash-of-penguin
# Projet RPG - Collaboration Agile

## Description
Ce projet est un jeu RPG en Java développé dans le cadre d’un travail collaboratif.  
L’objectif est d’apprendre à travailler en mode agile (Scrum), en respectant un cahier des charges précis et en partageant les rôles au sein de l’équipe.  

Le jeu repose sur une hiérarchie de classes orientée objet et un gameplay simple basé sur l’attaque et la défense.

---

## Objectifs
- Travailler en méthode agile avec une organisation en sprints.
- Créer une structure de classes claire et évolutive.
- Implémenter un premier MVP (Minimum Viable Product) puis enrichir le projet avec des fonctionnalités "Nice to have".
- Apprendre à collaborer efficacement avec Git/GitHub.

---

## Rôles dans l’équipe
- Scrum Master : Tina  
- Product Owner : Sébastien  
- Équipe de développement : Tina, Sébastien, Audrey  

---

## Organisation des classes
- Personnage (classe mère)  
  - Attributs : nom, points de vie,niveau, force, défense ,estVivant 
  - Méthodes : attaquer(), defendre(),perteSubi(), sePresenter
- Guerrier (hérite de Personnage)  
  En Nice to have
  - Attributs : arme
  - Méthodes : UtiliserArme()

- Voleur (hérite de Personnage)  
    En Nice to have
  - Attributs : agilite
  - Méthodes : tirerFleche 


- Magicien (hérite de Personnage)  
    En Nice to have
  - Attributs : mana
  - Méthodes : jeterSort()


- GameMain  
  - Classe principale qui exécute le jeu (combat tour par tour entre personnages)

- Boîte à outils  
  - Fonctions d’aide pour rendre le code plus clair (exemple : générer des nombres aléatoires)

---

## MVP (Minimum Viable Product)
- Création des 3 classes obligatoires : Guerrier, Voleur, Magicien.  
- Méthodes attaquer() et defendre() fonctionnelles.  
- Combat basique dans GameMain (tour par tour).

---

## Nice to Have (Améliorations possibles)
- Ajout de compétences, de barre de point de compétence.    
- Système de coups critiques    

---

## Répartition des tâches
### Tina (Scrum Master & Dev)
- Classe Personnage (attributs et méthodes de base).  
- Classe Magicien.
- Classe GameMain avec la boucle de jeu. 
 

### Sébastien (Product Owner & Dev)
- Classe Personnage (attributs et méthodes de base). 
- Classes Guerrier.  
- Rédaction du backlog (User Stories). 
- Classe GameMain avec la boucle de jeu.  


### Audrey (Dev)
- Classe Voleur
- Mise en place de la boîte à outils (Utils, Dice). 
- Classe GameMain avec la boucle de jeu.  

---

## Organisation par Sprints
  
A REMPLIR
---

## Backlog 

A REMPLIR 
---

## Exécution
Compiler et exécuter le projet avec la commande :  
```bash (à modifier)
javac src/*.java
java src/GameMain
```

---

## Licence
Projet pédagogique – utilisation libre dans un cadre d’apprentissage.
