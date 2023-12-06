public class etudiant {
    private String nom;
    private String prenom;
    private String email;
    private int apogee;
    private filliere Filliere;

    public void setFilliere(filliere filliere) {
        Filliere = filliere;
    }

    public filliere getFilliere() {
        return Filliere;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public int getApogee() {
        return apogee;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}

