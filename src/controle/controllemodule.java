package controle;

public class controllemodule {
    public static void voirmenu(){
        System.out.println("---- Modules ----");


        System.out.println("Pour ajouter un classe.module taper 1");
        System.out.println("Pour afficher les modules taper 2");
        System.out.println("Pour modifier un classe.module taper 3");
        System.out.println("Pour supprimer un classe.module taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int optio = project.avoirInt("Veuillez sélectionner une option : ");
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
            default:
                project.voirmenuprincipal();
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
