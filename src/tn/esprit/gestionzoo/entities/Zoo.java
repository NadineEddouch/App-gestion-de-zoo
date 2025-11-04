package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals = new Animal[25]; // max 25 animaux
    private String name;
    private String city;
    private static final int NBR_CAGES = 3;
    private int nbrAnimals = 0;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAquatics = 0;

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

    public void addAnimal(Animal animal) throws InvalidAgeException, ZooFullException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }
        if (nbrAnimals >= NBR_CAGES) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal.");
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Impossible ! L'animal <" + animal.getName() + "> est déjà présent dans le zoo.");
            return;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("L'animal <" + animal.getName() + "> a été ajouté avec succès au zoo.");
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
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquatics < aquaticAnimals.length) {
            aquaticAnimals[nbrAquatics] = aquatic;
            nbrAquatics++;
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter un nouvel animal aquatique !");
        }
    }
    public void makeAquaticsSwim() {
        System.out.println("Liste des animaux aquatiques en train de nager :");
        for (int i = 0; i < nbrAquatics; i++) {
            aquaticAnimals[i].swim();
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbPenguins = 0;
        int nbDolphins = 0;

        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin) nbPenguins++;
            if (aquaticAnimals[i] instanceof Dolphin) nbDolphins++;
        }

        System.out.println("Nombre de pingouins : " + nbPenguins);
        System.out.println("Nombre de dauphins : " + nbDolphins);
    }



}