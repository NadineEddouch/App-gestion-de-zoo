public class Zoo {
    Animal[] animals = new Animal[25]; // max 25 animaux
    String name;
    String city;
    private static final int NBR_CAGES = 25;
    public Zoo(String name, int age, String city, int nbrCages) {}
    int nbrAnimals = 0;

    public Zoo() {
    }

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + "]";
    }

    public boolean addAnimal(Animal animal) {
        if (nbrAnimals > animals.length) {
            System.out.println("Impossible d'ajouter l'animal ! Le zoo est complet.");
            return false;
        }
        if (searchAnimal(animal) !=-1) {
            System.out.println("Impossible ! l'animal <" + animal.name + "> est déjà présent dans le zoo.");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("L'animal <" + animal.name + "> a été ajouté avec succées au zoo.");
        return true;
    }

    public void showAnimals() {
        System.out.println("* Liste des animals dans le zoo" + name+ ": ");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("Animal " + (i + 1) + " : " + animals[i]);
        }
    }
    // instruction 11 du prosit 3
    public int searchAnimal(Animal animal){
        for (int i = 0; i < nbrAnimals; i++) {
            if(animals[i].name.equals(animal.name)){
                System.out.println("L'animal <" + animal.name + "> a été trouvé à l'indice " + i + ".");
                return i ;
            }
        }
        System.out.println("L'animal <" + animal.name + "> n'a pas été trouvé dans le zoo.");
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if(animals[i].name.equals(animal.name)){
                animals[i] = null;
                System.out.println("L'animal <"+ animal.name + "> a été supprimé du zoo. ");
                return true;
            }
        }
        System.out.println("Suppression impossible, l'animal <" + animal.name + "> est introuvable.");
        return false;
    }

    public boolean isZooFull() {
            if (nbrAnimals == NBR_CAGES) {
                System.out.println("Le zoo est plein.");
                return true;
            }
            System.out.println("Il reste de la place dans le zoo.");
            return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }
        else {
            return z2;
       }
    }
}