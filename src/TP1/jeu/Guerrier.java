package TP1.jeu;

import java.io.Serializable;
/**
 * @Class Guerrier
 * <p>
 *     Classe abstraite représentant un guerrier
 *     Contient les attributs et méthodes communes aux guerriers
 *     Contient la méthode attaquer() qui permet d'attaquer un guerrier adverse
 */
public abstract class Guerrier implements Serializable {

    private int force;
    private int pointsDeVie;
    private final int FORCE_BASE = 10;
    private final int RESSOURCE_BASE = 1;
    private final int PV_MAX_BASE = 100;

    private Couleur couleur;

    private int degatReel;
    private String defenseString1;
    public Guerrier() {}

    public Guerrier(Couleur couleur) {
        setForce(FORCE_BASE);
        setPointsDeVie(PV_MAX_BASE);
        setCouleur(couleur);
    }

    public int getForce() {
        return force;
    }


    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public boolean estVivant() {
        // Vrai si le guerrier a encore des pointsDeVie (> 0)
        return (this.pointsDeVie > 0);
    }


    public void attaquer(Guerrier guerrier, int degat) {
        guerrier.subirDegat(degat);
    }

    protected void subirDegat(int degat) {
        degatReel = degat;
        this.pointsDeVie -= degat;
    }


    public void setCouleur(Couleur couleur){this.couleur = couleur;}

    public Couleur getCouleur() {
        return couleur;
    }


    public int getRessourceEntrainement() {
        return RESSOURCE_BASE;
    }

    public int getDegatReel() {
        return degatReel;
    }

    /**
    * Méthode qui retourne le rang de défense du guerrier (voir la classe Carreau comparable)
     */
    public String getDefenseString() {
        return this.defenseString1;
    }
}