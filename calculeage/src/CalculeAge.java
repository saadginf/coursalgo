import java.util.Scanner;

public class CalculeAge {
    public static void main(String[] args) throws Exception {
    //objet de lecture des entrées du clavier
        Scanner sc = new Scanner(System.in);
    //Déclaration de variable
        int age;
        int anneeNaissance;
    //Déclaration de la constante
        final int annerActuelle=2021;
    //Ecriture
        System.out.println("Votre année de naissance ?");
    //LECTURE
        anneeNaissance = sc.nextInt();
    //AFFECTATION
        age= annerActuelle-anneeNaissance;
    //ECRITURE
        System.out.println("Votre age est : "+age+" ans");

    }
}
