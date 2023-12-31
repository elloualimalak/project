package classe;

public class enseignant {
    private static int id;
    private static String nom;
    private String prenom;
    private String email;
    private String grade;
    private departement Departement;

    public enseignant(int id, String nom, String prenom, String grade) {
    }

    public enseignant() {

    }

    public static void setNom(String nom) {
        enseignant.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setDepartement(departement departement) {
        Departement = departement;
    }

    public departement getDepartement() {
        return Departement;
    }

    public static void setId(int id) {
        enseignant.id = id;
    }

    public static int getId() {
        return id;
    }
}


