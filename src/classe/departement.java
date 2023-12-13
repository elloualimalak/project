package classe;

public class departement {
    private String intitule;
    private enseignant responsable;
    public void setIntitule(String intitule){
        this.intitule=intitule;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setResponsable(enseignant responsable){
        this.responsable=responsable;
    }
    public enseignant getResponsable(){
        return responsable;
    }
}