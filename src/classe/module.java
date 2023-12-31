package classe;

public class module {
    private static int id;
    private static String intitule;
    private static filliere filliere;
    private static enseignant professeur;

    public module() {
    }



    public void setIntitule(String intitule){
        this.intitule=intitule;
    }
    public static String getIntitule() {
        return intitule;
    }

    public void setFilliere(filliere filliere) {
        this.filliere = filliere;
    }

    public static filliere getFilliere() {
        return filliere;
    }

    public void setProfesseur(enseignant professeur) {
        this.professeur = professeur;
    }

    public static enseignant getProfesseur() {
        return professeur;
    }

    public static void setId(int id) {
        module.id = id;
    }

    public static int getId() {
        return id;
    }
}

