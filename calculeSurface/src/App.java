import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   //objet de lecture des entrées du clavier
   Scanner sc = new Scanner(System.in);
   //Déclaration de variable
       int R;
       double S;
   //Déclaration de la constante
       final double pi=3.14;
   //Ecriture
       System.out.println("Entrez Le Rayon du Cercle?");
   //LECTURE
       R = sc.nextInt();
   //AFFECTATION
       S= R*R*pi;
   //ECRITURE
       System.out.println("La suface du cercle est : "+S+" cm2");
    }
}
