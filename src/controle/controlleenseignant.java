package controle;
import Main.Project;
import classe.enseignant;
import service.bdd;
import service.serviceEnseignant;

public class controlleenseignant {
    public static void voirmenu() {
        System.out.println("---- Enseignants ----");


        System.out.println("Pour ajouter un classe.enseignant taper 1");
        System.out.println("Pour afficher les enseignants taper 2");
        System.out.println("Pour modifier un classe.enseignant taper 3");
        System.out.println("Pour supprimer un classe.enseignant taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int opt = Project.avoirInt("Veuillez sélectionner une option : ");
        switch (opt) {
            case 1:
                creerEnseignant();
                break;
            case 2:
                voirEnseignant();
                break;
            case 3:
                modifierEnseignant();
                break;
            case 4:
                supprimerEnseignant();
                break;
            default:
                Project.voirmenuprincipal();
        }
    }
    public static void creerEnseignant(){
        int id = Project.avoirInt("Entrez l'ID de l'enseignant :");
        String nom = Project.avoirString("Entrez le nom de l'enseignant :");
        String prenom = Project.avoirString("Entrez le prénom de l'enseignant :");
        String grade = Project.avoirString("Entrez le grade de l'enseignant :");
        String email = Project.avoirString("Entrez l'email de l'enseignant :");
        enseignant enseignant = new enseignant(id, nom, prenom, grade);

        voirEnseignant();
        voirmenu();

        }
    public static void modifierEnseignant(){
        voirEnseignant();
        int id = Project.avoirInt("Sélecionnez un enseignant par id :");
        String nom = Project.avoirString("Entrez le nom :");
        String prenom = Project.avoirString("Entrez le prenom :");
        String email = Project.avoirString("Entrez le email :");
        String grade = Project.avoirString("Entrez le grade :");
        serviceEnseignant.modiffierEns(id, nom, serviceEnseignant.getEnsparId(id));

        voirEnseignant();
        voirmenu();
    }
    public static void voirEnseignant(){
        for (classe.enseignant enseignant : bdd.enseignants) {
            System.out.print("Id : " + enseignant.getId());
            System.out.print(" | nom : " + enseignant.getNom());
            System.out.print(" | prenom : " + enseignant.getPrenom());
            System.out.print(" | email : " + enseignant.getEmail());
            System.out.print(" | grade : " + enseignant.getGrade());


        }
    }
    public static void supprimerEnseignant(){
        voirEnseignant();
        int id = Project.avoirInt("Sélecionnez un enseignant par id :");
        serviceEnseignant.supprimerEnsById(id);
        voirEnseignant();

    }

    }
