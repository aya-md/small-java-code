import java.util.ArrayList;

public class Parking {
 private int nplace;

 ArrayList<String> AL = new ArrayList<>() ;

 public Parking (int nplace){
    this.nplace=nplace;  
 }
 public int nbrplaces(){
    return nplace;
 }
 public int place_dispo(){
    return nplace-AL.size();
 }
 public void garer_voiture(String marque){
    voiture v = new voiture(marque);
    AL.add(v.getmarque());  
 }
 public void sortir_voiture(int nombre_ordre){
    if (nombre_ordre<AL.size() && nombre_ordre>0){
        AL.remove(nombre_ordre-1);
    }
 }
 public void list_voiture(){
    int i;
    for(i=0;i<AL.size();i++){
        System.out.println(i+1 + AL.get(i));
    }
 }
}
