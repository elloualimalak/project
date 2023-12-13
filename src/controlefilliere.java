public class controlefilliere {
    public static void showmenu() {
        System.out.println("---- Fillieres ----");


        System.out.println("Pour ajouter une filliere taper 1");
        System.out.println("Pour afficher les fillieres taper 2");
        System.out.println("Pour modifier une filliere taper 3");
        System.out.println("Pour supprimer une filliere taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int optio = project.Main.getIntInput("Veuillez sélectionner une option : ");
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
