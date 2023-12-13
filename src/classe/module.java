package classe;

import classe.enseignant;

public class module {
    private String intitule;
    private filliere filliere;
    private enseignant professeur;
    public void setIntitule(String intitule){
        this.intitule=intitule;
    }
    public String getIntitule() {
        return intitule;
    }

    public void setFilliere(filliere filliere) {
        this.filliere = filliere;
    }

    public filliere getFilliere() {
        return filliere;
    }

    public void setProfesseur(enseignant professeur) {
        this.professeur = professeur;
    }

    public enseignant getProfesseur() {
        return professeur;
    }
}

