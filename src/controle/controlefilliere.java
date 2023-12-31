package controle;
import Main.Project;
import classe.enseignant;
import classe.etudiant;
import classe.filliere;
import service.bdd;
import service.serviceEnseignant;
import service.serviceFilliere;

public class controlefilliere {
    public static void voirmenu() {
        System.out.println("---- Fillieres ----");


        System.out.println("Pour ajouter une classe.filliere taper 1");
        System.out.println("Pour afficher les fillieres taper 2");
        System.out.println("Pour modifier une classe.filliere taper 3");
        System.out.println("Pour supprimer une classe.filliere taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int optio = Project.avoirInt("Veuillez sélectionner une option : ");
        switch (optio) {
            case 1:
                creerFilliere();
                break;
            case 2:
                voirFillieres();
                break;
            case 3:
                modifierFilliere();
                break;
            case 4:
                supprimerFilliere();
                break;
            default:
                Project.voirmenuprincipal();
        }
    }
    public static void  creerFilliere(){
        int id = Project.avoirInt("Entrez l'ID de l'enseignant :");
        String nom = Project.avoirString("Entrez l'intitule' :");
        String responsable = Project.avoirString("Entrez le responsable :");
        String departement = Project.avoirString("Entrez le departement :");

        etudiant et = new etudiant(id, nom, responsable, departement);

        voirFillieres();
        voirmenu();
    }
    public static void  voirFillieres(){
        for (classe.filliere fil : bdd.filieres) {
            System.out.print("Id : " + filliere.getId());
            System.out.print(" | intitule: " + filliere.getIntitule());
            System.out.print(" | responsable : " + filliere.getResponsable());
            System.out.print(" | departement : " + filliere.getDepartement());



        }

    }
    public static void  modifierFilliere(){
        voirFillieres();
        int id = Project.avoirInt("Sélecionnez une filliere par id :");
        String intitule = Project.avoirString("Entrez l' intitule :");
        String responsable = Project.avoirString("Entrez le responsable :");
        String departement = Project.avoirString("Entrez le departement :");
        serviceFilliere.modifierFiliere(id, intitule, serviceFilliere.getFiliereparId(id));

        voirFillieres();
        voirmenu();
    }
    public static void  supprimerFilliere(){
        voirFillieres();
        int id = Project.avoirInt("Sélecionnez une filliere par id :");
        serviceFilliere.supprimerFiliereById(id);
        voirFillieres();
    }
}
