public class enseignant {
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private depart Departement;
    public void setNom(String nom){
        this.nom=nom;
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
    public String getEmail(){
        return email;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setDepartement(depart departement) {
        Departement = departement;
    }

    public depart getDepartement() {
        return Departement;
    }
}