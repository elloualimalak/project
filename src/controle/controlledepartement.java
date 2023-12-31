package controle;
import service.bdd;
import service.serviceDepartement;
import service.serviceEnseignant;
import Main.Project;
import classe.*;
public class controlledepartement {
    public static void voirmenu(){
        System.out.println("---- Départements ----");


        System.out.println("Pour ajouter un département taper 1");
        System.out.println("Pour afficher les départements taper 2");
        System.out.println("Pour modifier un département taper 3");
        System.out.println("Pour supprimer un département taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int op = Project.avoirInt("Veuillez sélectionner une option : ");
        switch (op){
            case 1:
                creerDepartement();
                break;
            case 2:
                voirDepartement();
                break;
            case 3:
                modifierDepartement();
                break;
            case 4:
                supprimerDepartement();
                break;
            default:
                Project.voirmenuprincipal();
        }
    }
    public static void creerDepartement(){
        String intitule = Project.avoirString("Entrez l'intitulé :");
        controlledepartement.voirDepartement();
        int id = Project.avoirInt("Sélecionnez un enseignant par id :");
        serviceDepartement.ajouterDept(intitule, serviceDepartement.getDeptparId(id));

        voirDepartement();
        voirmenu();

    }

    private static void voirDepartement() {
        for (departement departement : bdd.departements) {
            System.out.print("Id : " + departement.getId());
            System.out.print(" | Intitulé : " + departement.getIntitule());
            if (! Project.isNull(departement.getResponsable())) {
                System.out.print(" | responsable : " + departement.getResponsable().getNom() + " " + departement.getResponsable().getPrenom());
            }
            System.out.println("");
        }

    }

    public static void modifierDepartement(){
        voirDepartement();
        int id = Project.avoirInt("Sélecionnez un departement par id :");
        String intitule = Project.avoirString("Entrez l'intitulé :");
        controlleenseignant.voirEnseignant();
        int idEns = Project.avoirInt("Sélecionnez un enseignant par id :");

        serviceDepartement.modiffierDept(id, intitule, serviceEnseignant.getEnsparId(idEns));

        voirDepartement();
        voirmenu();

    }
    public static void supprimerDepartement(){
        voirDepartement();
        int id = Project.avoirInt("Sélecionnez un departement par id :");
        serviceDepartement.supprimerDeptById(id);
        voirDepartement();

    }

    }

