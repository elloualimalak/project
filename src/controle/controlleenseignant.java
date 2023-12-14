package controle;

public class controlleenseignant {
    public static void voirmenu() {
        System.out.println("---- Enseignants ----");


        System.out.println("Pour ajouter un classe.enseignant taper 1");
        System.out.println("Pour afficher les enseignants taper 2");
        System.out.println("Pour modifier un classe.enseignant taper 3");
        System.out.println("Pour supprimer un classe.enseignant taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int opt = project.Main.avoirInt("Veuillez sélectionner une option : ");
        switch (opt) {
            case 1:
                creerEnseignant();
                break;
            case 2:
                afficherEnseignants();
                break;
            case 3:
                modifierEnseignant();
                break;
            case 4:
                supprimerEnseignant();
                break;
            default:
                project.voirmenuprincipal();
        }
    }
    public static void creerEnseignant(){

        }
    public static void modifierEnseignant(){

    }
    public static void supprimerEnseignant(){

    }
    public static void afficherEnseignants(){

    }
    }
