public class Rectangle{
    public double longeur;
    public double largeur;
    public Rectangle(double longeur, double largeur){
        this.largeur=largeur;
        this.longeur=longeur;
    }
    public double surface(){
     return longeur*largeur; 
      

    }
    public double perimetre(){
        return 2*(longeur+largeur);
    }
    public void afficher(){
        System.out.println("la surfece est " + surface());
        System.out.println("le perimetre est "+perimetre());
    }
}