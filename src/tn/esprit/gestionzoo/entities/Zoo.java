package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25]; // max 25 animaux
    private String name;
    private String city;
    private static final int NBR_CAGES = 25;
    private int nbrAnimals = 0;

    public Zoo() {
    }

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if ( name == null ) {
            System.out.println("Erreur! Le nom du zoo ne peut pas être vide.");
        }
        else {
            this.name = name;
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + "]";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Impossible d'ajouter l'animal ! Le zoo est complet.");
            return false;
        }
        if (searchAnimal(animal) !=-1) {
            System.out.println("Impossible ! l'animal <" + animal.getName() + "> est déjà présent dans le zoo.");
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("L'animal <" + animal.getName() + "> a été ajouté avec succées au zoo.");
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
            if(animals[i].getName().equals(animal.getName())){
                System.out.println("L'animal <" + animal.getName() + "> a été trouvé à l'indice " + i + ".");
                return i ;
            }
        }
        System.out.println("L'animal <" + animal.getName() + "> n'a pas été trouvé dans le zoo.");
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if(animals[i].getName().equals(animal.getName())){
                animals[i] = null;
                System.out.println("L'animal <"+ animal.getName() + "> a été supprimé du zoo. ");
                return true;
            }
        }
        System.out.println("Suppression impossible, l'animal <" + animal.getName() + "> est introuvable.");
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