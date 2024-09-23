public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Leo", 5, true);
        Zoo myZoo = new Zoo("Jungle Park", "Paris", 25);

        myZoo.displayZoo();
        System.out.println(myZoo); // Affiche le résultat de myZoo.toString()
        System.out.println(lion);
    }
}