package TP1.jeu;

import java.io.Serializable;

public class Nain extends Guerrier implements Serializable {

    private int ressourceEntrainement3 = 1;

    private final String defenseString4 = "b";

    public Nain() {}


    public Nain(Couleur couleur) {
        super(couleur);
        setCouleur(couleur);
    }


    @Override
    protected void subirDegat(int degat) {
        super.subirDegat(degat/2);
    }


    @Override
    public int getRessourceEntrainement() {
        return ressourceEntrainement3;
    }

    @Override
    public String getDefenseString() {
        return this.defenseString4;
    }

}
