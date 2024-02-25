public class compte{
     double solde;
     public compte(float solde){
        this.solde=solde;
     }
     public void deposer(float depot){
        solde=solde+depot;

     }
     public void retirer(float montant){
        if(montant<solde){
            solde-=montant;
        }
        else{System.out.println("impossible");}
     }
     public void afficher(){
        System.out.println("votre solde est"+solde);
        
     }

}