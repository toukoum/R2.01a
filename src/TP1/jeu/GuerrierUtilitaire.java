package TP1.jeu;

public class GuerrierUtilitaire {


    public static Guerrier createNainBleu() {
        return new Nain(Couleur.Bleu);
    }

    public static Guerrier createNainRouge() {
        return new Nain(Couleur.Rouge);
    }

    public static Guerrier createChefNainBleu() {
        return new ChefNain(Couleur.Bleu);
    }

    public static Guerrier createChefNainRouge() {
        return new ChefNain(Couleur.Rouge);
    }

    public static Guerrier createElfeBleu() {
        return new Elfe(Couleur.Bleu);
    }

    public static Guerrier createElfeRouge() {
        return new Elfe(Couleur.Rouge);
    }

    public static Guerrier createChefElfeBleu() {
        return new ChefElfe(Couleur.Bleu);
    }

    public static Guerrier createChefElfeRouge() {
        return new ChefElfe(Couleur.Rouge);
    }


    public static void afficherGuerrier(Guerrier guerrier) {
        System.out.println(guerrier.getClass().getSimpleName() + "_" + guerrier.getCouleur() + " => [PV" + guerrier.getPointsDeVie() + "], cout : " + guerrier.getRessourceEntrainement());
    }

    public static void afficherGuerrierLite(Guerrier guerrier) {
        System.out.print(guerrier.getClass().getSimpleName() + "_" + guerrier.getCouleur() + "[PV" + guerrier.getPointsDeVie() + "] ");

    }

    public static void afficherGuerrierLiteLite(Guerrier guerrier, String couleur) {
        String name = guerrier.getClass().getSimpleName();
        int couleurInt;
        if (couleur.compareTo("bleu") == 0) {
            couleurInt = 34;
        }else {
            couleurInt = 31;
        }
        System.out.println("\u001b[" + couleurInt + "m" + name + "\u001b[0m" + "_" + guerrier.getCouleur() + "[" + "\u001b[33mPV" + guerrier.getPointsDeVie() + "\u001b[0m]");
    }

}

