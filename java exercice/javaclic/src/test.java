import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        compteur c1 = new compteur();
        c1.raz();
        c1.clic();
        c1.afficherValeur();
        c1.raz();
        c1.clic();
        c1.clic();
        c1.afficherValeur();
        System.out.println("entrer une valeur");
        n=sc.nextInt();
        c1.clicsMultiples(n);
        System.out.println("la valeur est "+c1.getValeur());


        
    }
}
