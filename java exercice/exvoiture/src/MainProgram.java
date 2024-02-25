import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a parking lot with 5 places
        int nbrplace;
        System.out.println("entrer le nombre des places ");
        nbrplace = sc.nextInt();
        Parking p = new Parking(nbrplace);
        sc.close();
        // Display the total number of places and available places
        System.out.println("Total places: " + p.nbrplaces());
        System.out.println("Available places: " + p.place_dispo());

        // Park some cars
        p.garer_voiture("Toyota");
        p.garer_voiture("Honda");
        p.garer_voiture("Ford");

        // Display the available places after parking
        System.out.println("Available places after parking: " + p.place_dispo());

        // Display the list of parked cars
        System.out.println("List of parked cars:");
        p.list_voiture();

        // Remove a car by its order number
        p.sortir_voiture(2);
        
        // Display the list of remaining cars
        System.out.println("List of remaining cars after removing one:");
        p.list_voiture();
    }
}
