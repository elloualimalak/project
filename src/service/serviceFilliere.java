package service;
import classe.*;
import java.util.ArrayList;



public class serviceFilliere {
    public static filliere modifierFiliere(int id, String intitule, enseignant responsable) {
        for (filliere fil : bdd.filieres) {
            if (filliere.getId() == id)
                filliere.setId(id);
        }

        return new filliere();
    }


    public static filliere ajouterFiliere(int id , String intitule, enseignant responsable, departement dept)
    {filliere.setId(id);
        filliere.setId(bdd.avoirEnId());

        return new filliere();
    }
    public static ArrayList<filliere> supprimerFiliereById(int id){
        bdd.departements.remove(getFiliereparId(id));
        return  bdd.filieres;
    }

    public static enseignant getFiliereparId(int id){
        for (departement departement : bdd.departements) {
            if (departement.getId() == id) return filliere.getResponsable();
        }
        return new filliere().getResponsable();
    }

    public static ArrayList<filliere> gettoutFiliere(){
        return  bdd.filieres;
    }

}
