import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int capital, reste, b500, b200, b100, b50, b10; 
        
        
        System.out.println("Donnez une somme d'argent");
        capital = sc.nextInt();

    

        b500 = capital / 500 ;
        reste = capital % 500;
        
        b200 = reste / 200 ;
        reste %= 200 ;

        b100 = reste / 100 ;
        reste %= 100 ;

        b50 = reste / 50 ;
        reste %= 50 ;

        b10 = reste / 10 ;
       
        System.out.println(b500+" B500; "+ b200 +" B200; "+ b100+" B100; "+b50+ " B50; "+ b10 + " B10");




    }
}
