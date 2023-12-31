package service;
import classe.*;
import java.util.ArrayList;


public class serviceEtudiant {
    public static etudiant ajouterEtd(String nom, String prenom, String email, int apogee, filliere filiere){
        etudiant et = new etudiant();
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);
        etudiant.setApogee(apogee);
        etudiant.setFilliere(filiere);
        etudiant.setId(bdd.avoirEnId());

        return new etudiant();
    }

    public static etudiant modiffierEtd(int id,String nom, String prenom, String email, int apogee, filliere filiere){
        for (etudiant et : bdd.etudiants) {
            if (etudiant.getId() == id)
                etudiant.setId(id);
        }

        return new etudiant();
    }

    public static ArrayList<etudiant> supprimerEtdById(int id){
        bdd.etudiants.remove(getEtdparId(id));
        return bdd.etudiants;
    }

    public static etudiant getEtdparId(int id){
        for (etudiant et : bdd.etudiants) {
            if (etudiant.getId() == id) return  et;
        }
        return  new etudiant();
    }

    public static ArrayList<etudiant> gettoutEtd(){
        return  bdd.etudiants;
    }
}
