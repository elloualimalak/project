import controle.*;
import java.util.Scanner;
import java.util.ArrayList;


public class project {
    public static void voirmenuprincipal() {
        System.out.println("----[ Bienvenue ]----");


        System.out.println("1 : gérer les départements  ");
        System.out.println("2 : gérer les filières  ");
        System.out.println("3 : gérer les enseignants  ");
        System.out.println("4 : gérer les modules  ");
        System.out.println("5 : gérer les étudiants  ");
        System.out.println("0 : sortir  ");
        int option = project.avoirInt("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                controlledepartement.voirmenu();
                break;
            case 2:
                controlefilliere.voirmenu();
                break;
            case 3:
                controlleenseignant.voirmenu();
                break;
            case 4:
                controllemodule.voirmenu();
                break;
            case 5:
                controlleetudiant.voirmenu();
                break;
            default:
                // code block
        }
    }

    public static int avoirInt(String... m) {
        Scanner s = new Scanner(System.in);
        String msg = "taper un entier";
        System.out.println(msg);
        int N = s.nextInt();
        return N;

    }

    public static String avoirString(String... m) {
        Scanner s = new Scanner(System.in);
        String msg = "taper un texte";
        System.out.println(msg);
        String T = s.nextLine();
        return T;

    }
    public static void main(String[] args){

    }
}

