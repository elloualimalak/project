public class filliere {
    private String intitule;
    private enseignant responsable;
    private depart Departement;

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setDepartement(depart departement) {
        Departement = departement;
    }

    public depart getDepartement() {
        return Departement;
    }

    public void setResponsable(enseignant responsable) {
        this.responsable = responsable;
    }

    public enseignant getResponsable() {
        return responsable;
    }
}
