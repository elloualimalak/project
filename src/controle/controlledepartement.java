package controle;

public class controlledepartement {
    public static void voirmenu(){
        System.out.println("---- Départements ----");


        System.out.println("Pour ajouter un département taper 1");
        System.out.println("Pour afficher les départements taper 2");
        System.out.println("Pour modifier un département taper 3");
        System.out.println("Pour supprimer un département taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int op = project.avoirInt("Veuillez sélectionner une option : ");
        switch (op){
            case 1:
                creerDepartement();
                break;
            case 2:
                afficherDepartements();
                break;
            case 3:
                modifierDepartement();
                break;
            case 4:
                supprimerDepartement();
                break;
            default:
                project.voirmenuprincipal();
        }
    }
    public static void creerDepartement(){

    }
    public static void afficherDepartements(){

    }
    public static void modifierDepartement(){

    }
    public static void supprimerDepartement(){

    }
}
