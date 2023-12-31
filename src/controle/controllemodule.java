package controle;
import Main.Project;
import classe.module;
import service.*;
import service.serviceEnseignant;
import service.serviceFilliere;


public class controllemodule {
    public static void voirmenu(){
        System.out.println("---- Modules ----");


        System.out.println("Pour ajouter un classe.module taper 1");
        System.out.println("Pour afficher les modules taper 2");
        System.out.println("Pour modifier un classe.module taper 3");
        System.out.println("Pour supprimer un classe.module taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int optio = Project.avoirInt("Veuillez sélectionner une option : ");
        switch (optio) {
            case 1:
                creerModule();
                break;
            case 2:
                voirModule();
                break;
            case 3:
                modifierModule();
                break;
            case 4:
                supprimerModule();
                break;
            default:
                Project.voirmenuprincipal();
        }
    }

    private static void supprimerModule() {
        voirModule();
        int id = Project.avoirInt("Sélecionnez un enseignant par id :");
        serviceEnseignant.supprimerEnsById(id);
        voirModule();
    }

    public static void creerModule(){
        int id = Project.avoirInt("Entrez l'ID du module :");
        String intitule = Project.avoirString("Entrez l'intitule du module' :");
        String filliere = Project.avoirString("Entrez la filliere du module :");
        String professeur = Project.avoirString("Entrez le professeur :");
        module module = new module();

        voirModule();
        voirmenu();
    }
    public static void modifierModule(){
        voirModule();
        int id = Project.avoirInt("Sélecionnez un module par id :");
        String intitule = Project.avoirString("Entrez l'intitule' :");
        String professeur = Project.avoirString("Entrez le professeur :");
        String filliere = Project.avoirString("Entrez la filliere :");
        serviceModule.ajouterFiliere(id, intitule,professeur ,filliere);

        voirModule();
        voirmenu();
    }
    public static void voirModule(){
        for (classe.module module : bdd.modules) {
            System.out.print("Id : " + classe.module.getId());
            System.out.print(" | professeur : " + classe.module.getProfesseur());
            System.out.print(" | intitule : " + classe.module.getIntitule());
            System.out.print(" | filliere : " + classe.module.getFilliere());
        }

    }}
