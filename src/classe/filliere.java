package classe;

import classe.departement;
import classe.enseignant;

public class filliere {
    private String intitule;
    private enseignant responsable;
    private departement Departement;

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setDepartement(departement departement) {
        Departement = departement;
    }

    public departement getDepartement() {
        return Departement;
    }

    public void setResponsable(enseignant responsable) {
        this.responsable = responsable;
    }

    public enseignant getResponsable() {
        return responsable;
    }
}
