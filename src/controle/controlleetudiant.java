package controle;
import Main.Project;
import classe.etudiant;
import service.bdd;
import service.serviceEnseignant;
import service.serviceEtudiant;

public class controlleetudiant {
    public static void voirmenu(){
        System.out.println("---- Etudiants ----");


        System.out.println("Pour ajouter un classe.etudiant taper 1");
        System.out.println("Pour afficher les etudiants taper 2");
        System.out.println("Pour modifier un classe.etudiant taper 3");
        System.out.println("Pour supprimer un classe.etudiant taper 4");
        System.out.println("Pour retourner au menu principal taper 0");
        int opti = Project.avoirInt("Veuillez sélectionner une option : ");
        switch (opti) {
            case 1:
                creerEtudiant();
                break;
            case 2:
                voirEtudiant();
                break;
            case 3:
                modifierEtudiant();
                break;
            case 4:
                supprimerEtudiant();
                break;
            default:
                Project.voirmenuprincipal();
        }
    }
    public static void creerEtudiant(){
        int id = Project.avoirInt("Entrez l'ID de l'etudiant :");
        String nom = Project.avoirString("Entrez le nom de l'etudiant :");
        String prenom = Project.avoirString("Entrez le prénom de l'etudiant :");
        int apogee = Project.avoirInt("Entrez l'apoge de l'etudiant' :");
        String filliere = Project.avoirString("Entrez l'email de l'enseignant :");
        etudiant et = new etudiant();

        voirEtudiant();
        voirmenu();

    }
    public static void voirEtudiant(){
        for (classe.enseignant enseignant : bdd.enseignants) {
            System.out.print("Id : " + etudiant.getId());
            System.out.print(" | nom : " + etudiant.getNom());
            System.out.print(" | prenom : " + etudiant.getPrenom());
            System.out.print(" | apogee : " + etudiant.getApogee());
            System.out.print(" | filliere : " + etudiant.getFilliere());


        }

    }
    public static void modifierEtudiant(){
        voirEtudiant();
        int id = Project.avoirInt("Sélecionnez un etudiant par id :");
        String nom = Project.avoirString("Entrez le nom :");
        String prenom = Project.avoirString("Entrez le prenom :");
        String email = Project.avoirString("Entrez l'apogee :");
        String grade = Project.avoirString("Entrez la filliere :");
        serviceEnseignant.modiffierEns(id, nom, serviceEnseignant.getEnsparId(id));

        voirEtudiant();
        voirmenu();
    }
    public static void supprimerEtudiant(){
        voirEtudiant();
        int id = Project.avoirInt("Sélecionnez un etudiant par id :");
        serviceEtudiant.supprimerEtdById(id);
        voirEtudiant();
    }
    }

