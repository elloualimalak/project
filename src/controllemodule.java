public class controllemodule {
    public static void showmenu(){
        System.out.println("---- Modules ----");


        System.out.println("Pour ajouter un module taper 1");
        System.out.println("Pour afficher les modules taper 2");
        System.out.println("Pour modifier un module taper 3");
        System.out.println("Pour supprimer un module taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int optio = project.Main.getIntInput("Veuillez sélectionner une option : ");
        switch (optio) {
            case 1:
                creerModule();
                break;
            case 2:
                afficherModules();
                break;
            case 3:
                modifierModule();
                break;
            case 4:
                supprimerModules();
                break;
        }
    }
    public static void creerModule(){

    }
    public static void modifierModule(){

    }
    public static void afficherModules(){

    }
    public static void supprimerModules(){

    }
}
