package classe;

import classe.departement;
import classe.enseignant;

public class filliere {
    private static int id;
    private static String intitule;
    private static enseignant responsable;
    private static departement Departement;

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public static String getIntitule() {
        return intitule;
    }

    public void setDepartement(departement departement) {
        Departement = departement;
    }

    public static departement getDepartement() {
        return Departement;
    }

    public void setResponsable(enseignant responsable) {
        this.responsable = responsable;
    }

    public static enseignant getResponsable() {
        return responsable;
    }

    public static void setId(int id) {
        filliere.id = id;
    }

    public static int getId() {
        return id;
    }

    public filliere getFilliere() {
        return null;
    }
}
