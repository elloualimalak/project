package service;
import classe.*;

import java.util.ArrayList;

public class serviceEnseignant {
    public static enseignant ajouterEns(String nom, String prenom, String email, String grade, departement dept) {
        enseignant responsable = new enseignant();
        enseignant.setNom(nom);
        enseignant.setId(bdd.avoirEnId());

        return new enseignant();
    }


    public static ArrayList<enseignant> supprimerEnsById(int id) {
        bdd.departements.remove(getEnsparId(id));
        return bdd.enseignants;
    }

    public static enseignant getEnsparId(int id) {
        for (enseignant enseignant : bdd.enseignants) {
            if (enseignant.getId() == id) return enseignant;
        }
        return new enseignant();
    }

    public static ArrayList<enseignant> gettoutEns() {
        return bdd.enseignants;
    }


    public static enseignant modiffierEns(int id, String nom, enseignant ensparId) {
        for (enseignant responsable : bdd.enseignants) {
            if (enseignant.getId() == id)
                enseignant.setId(id);
        }

        return new enseignant();
    }
}
