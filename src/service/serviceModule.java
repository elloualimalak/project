package service;
import classe.*;
import java.util.ArrayList;

import static classe.filliere.getResponsable;


public class serviceModule {
    private static Object enseignant;

    public static Object ajouterFiliere(int id, String intitule, String chef, String filiere) {
        {
            module.setId(id);
            module.setId(bdd.avoirEnId());

            return new module();
        }

        public static module modiffierMod(int id, String intitule, filiere filliere, enseignant getResponsable()) {
            for (module module : bdd.modules) {
                if (module.getId() == id)
                    classe.module.setId(id);
            }

            return new enseignant();
        }
        public static ArrayList<module> supprimerModuleById(){
            bdd.modules.remove(getModuleparId(id));
            return bdd.modules;
        }

        public static ArrayList<module> gettoutMod() {
            return bdd.modules;
        }

    }

    public static Object getModuleparId(int id) {
        for (module module : bdd.modules) {
            if (module.getId() == id) return module.getProfesseur();
        }
        return new module().getProfesseur();
    }
}
