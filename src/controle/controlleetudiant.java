package controle;

public class controlleetudiant {
    public static void showmenu(){
        System.out.println("---- Etudiants ----");


        System.out.println("Pour ajouter un classe.etudiant taper 1");
        System.out.println("Pour afficher les etudiants taper 2");
        System.out.println("Pour modifier un classe.etudiant taper 3");
        System.out.println("Pour supprimer un classe.etudiant taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int opti = project.Main.getIntInput("Veuillez sélectionner une option : ");
        switch (opti) {
            case 1:
                creerEtudiant();
                break;
            case 2:
                afficherEtudiants();
                break;
            case 3:
                modifierEtudiant();
                break;
            case 4:
                supprimerEtudiant();
                break;
        }
    }
    public static void creerEtudiant(){

    }
    public static void afficherEtudiants(){

    }
    public static void modifierEtudiant(){

    }
    public static void supprimerEtudiant(){

    }
    }

