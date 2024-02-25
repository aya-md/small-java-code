import java.util.Scanner;
public class testcompte{
    public static void main(String[] args) {
        float depot,montant;
        compte monCompte = new compte(20000);
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le montant a deposer\n");
        depot=sc.nextFloat();
        System.out.println("entrer le montant a retirer\n");
        montant=sc.nextFloat();
        sc.close();
        monCompte.deposer(depot);
        monCompte.retirer(montant);
        monCompte.afficher();
       
        
       



     
    }
}