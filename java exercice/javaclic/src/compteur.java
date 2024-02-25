public class compteur{
private int val;
public void clic(){
    val+=1;
}
public void raz(){
    val=0;
}
public void afficherValeur(){
    System.out.println("la valeur est "+val);
}
public void clicsMultiples(int n){
    val*=n;
}
public int getValeur(){
    return val;
}
}


