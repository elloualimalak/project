package controle;

public class controlefilliere {
    public static void voirmenu() {
        System.out.println("---- Fillieres ----");


        System.out.println("Pour ajouter une classe.filliere taper 1");
        System.out.println("Pour afficher les fillieres taper 2");
        System.out.println("Pour modifier une classe.filliere taper 3");
        System.out.println("Pour supprimer une classe.filliere taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int optio = project.avoirInt("Veuillez sélectionner une option : ");
        switch (optio) {
            case 1:
                creerFilliere();
                break;
            case 2:
                afficherFillieres();
                break;
            case 3:
                modifierFilliere();
                break;
            case 4:
                supprimerFilliere();
                break;
            default:
                project.voirmenuprincipal();
        }
    }
    public static void  creerFilliere(){

    }
    public static void  afficherFillieres(){

    }
    public static void  modifierFilliere(){

    }
    public static void  supprimerFilliere(){

    }
}
