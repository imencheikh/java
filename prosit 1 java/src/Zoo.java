public class Zoo
        {
Animal[] animals;
String name;
String city;
int nbrCages;

public Zoo(String name, String city, int nbrCages) {
    this.animals = new Animal[nbrCages];
    this.name = name;
    this.city = city;

    this.nbrCages = nbrCages;
}

public void displayZoo() {
    System.out.println("Zoo{"
            +
            "name='" + name + '\'' +
            ", city='" + city + '\'' +
            ", nbrCages=" + nbrCages +
            '}');
}

@Override
public String toString() {
    // On pourrait ici afficher tous les animaux du zoo, mais pour simplifier, on affiche juste les informations du zoo
    return "Zoo{" +
            "name='" + name + '\'' +
            ", city='" + city + '\'' +
            ", nbrCages=" + nbrCages +
            '}';
}
}