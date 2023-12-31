package classe;

public class departement {
    private static int id;
    private String intitule;
    private enseignant responsable;

    public departement(String intitule, int id, int responsable) {
    }

    public departement() {

    }

    public void setIntitule(String intitule){
        this.intitule=intitule;
    }
    public  String getIntitule() {
        return intitule;
    }
    public  void setResponsable(enseignant responsable){
        this.responsable=responsable;
    }
    public enseignant getResponsable(){
        return responsable;
    }

    public static void setId(int id) {
        departement.id = id;
    }

    public  int getId() {
        return id;
    }
}