import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public  class Apprenant extends Personne
{
   ArrayList<Double> listenote;
   private Classe classe;
   ArrayList<Apprenant> listeApprenants;

    Scanner scanner = new Scanner(System.in);

    public Apprenant(int ID, String name, String prenom, String email) {
        super(ID, name, prenom, email);
    }
    // Apprenant appr = new Apprenant("", "", "");
    // app.ajoutApprenant()
    static void ajoutApprenant ()
    {

        

        System.out.println("Ajouter un nom");
        String name =  scanner.next();
        System.out.println("Ajouter un prenom");
        String lastname = scanner.next();
        System.out.println("Ajouter un email");
        String mail = scanner.next();
        System.out.println("-------------------------------");
        System.out.println("Apprenant ajouté avec succès !");



    }

    static void ModifierApprenant ()
    {
        Scanner scanner = new Scanner(System.in);







    }

}
