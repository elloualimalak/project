package classe;

public class etudiant {

    private static String nom;
    private static int id;
    private static String prenom;
    private static String email;
    private static int apogee;
    private static filliere Filliere;

    public etudiant() {
    }

    public etudiant(int id, String nom, String responsable, String departement) {
    }


    public static void setFilliere(filliere filliere) {
        Filliere = filliere;
    }

    public static filliere getFilliere() {
        return Filliere;
    }

    public static void setEmail(String email) {
        etudiant.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static void setApogee(int apogee) {
        etudiant.apogee = apogee;
    }

    public static int getApogee() {
        return apogee;
    }

    public static void setPrenom(String prenom) {
        etudiant.prenom = prenom;
    }

    public static String getPrenom() {
        return prenom;
    }

    public static void setNom(String nom) {
        etudiant.nom = nom;
    }

    public static String getNom() {
        return nom;
    }

    public static void setId(int id) {
        etudiant.id = id;
    }

    public static int getId() {
        return id;
    }
}

