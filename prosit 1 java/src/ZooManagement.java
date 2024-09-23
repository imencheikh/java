import java.util.Scanner;

public class ZooManagement {

    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        zoo.getZooDetails();  // Obtenir les détails du zoo de l'utilisateur
        zoo.displayZooInfo(); // Afficher les informations mises à jour
      }

    // Méthode pour récupérer les informations du zoo via le clavier
    public void getZooDetails() {
        Scanner scanner = new Scanner(System.in);

        // S'assurer que l'utilisateur entre un entier pour le nombre de cages
        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide !");
            scanner.next(); // Consommer l'entrée incorrecte
        }
        nbrCages = scanner.nextInt();

        // S'assurer que l'utilisateur entre un nom pour le zoo
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.next();  // Récupérer le nom du zoo

        scanner.close();  // Fermer le scanner
    }

    // Méthode pour afficher les informations du zoo
    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
}