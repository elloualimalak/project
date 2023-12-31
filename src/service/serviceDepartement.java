package service;
import classe.*;

import java.sql.Connection;
import java.util.ArrayList;
public class serviceDepartement {
    public static departement ajouterDept(String intitule, enseignant... responsable){
        departement departement = new departement();
        departement.setIntitule(intitule);
        departement.setId(bdd.avoirDepId());
        if (responsable.length > 0){
            departement.setResponsable(responsable[0]);
        }
        bdd.departements.add(departement);

        return  departement;
    }
    public static departement modiffierDept(int id , String intitule, enseignant... chef){
        for (departement departement : bdd.departements) {
            if (departement.getId() == id) {
                departement.setIntitule(intitule);
                if (chef.length > 0){
                    departement.setResponsable(chef[0]);
                }
                return departement;
            }
        }

        return  new departement();
    }
    public static ArrayList<departement>  supprimerDeptById(int id){
        bdd.departements.remove(getDeptparId(id));
        return bdd.departements ;
    }

    public static enseignant getDeptparId(int id){
        for (departement departement : bdd.departements) {
            if (departement.getId() == id) return departement.getResponsable();
        }
        return new departement().getResponsable();
    }

    public static ArrayList<departement> gettoutDept(Connection cx){

        return  bdd.departements;
    }
}
