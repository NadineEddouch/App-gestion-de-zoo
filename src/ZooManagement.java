import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /* Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
         */
        //Instruction 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");
        //Prosit 2
        Animal lion = new Animal();
        lion.family = "Félidé";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Parc Animalier";
        myZoo.city = "Tunis";

        System.out.println("Zoo : " + myZoo.name + " à " + myZoo.city);
        System.out.println("Animal : " + lion.name + " (" + lion.family + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        Zoo myZoo1 = new Zoo("Parc Animalier", "Tunis");

        System.out.println("Animal créé : " + lion1.name);
        System.out.println("Zoo créé : " + myZoo1.name + " (" + myZoo.city + ")");

        myZoo.displayZoo();
        System.out.println(myZoo);

        // Prosit 3
        Animal tiger = new Animal("Félidé" , "Tigre" ,4 , true);
        Animal Crocodile = new Animal("Crocodylidae" , "Crocodile", 8, false);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(Crocodile);

        myZoo.showAnimals();

        myZoo.searchAnimal(tiger);
        myZoo.searchAnimal(lion);
        myZoo.searchAnimal(Crocodile);

        Animal Giraffe = new Animal("Giraffidae", "Giraffe",10,true);
        myZoo.searchAnimal(Giraffe);

        Animal lion2 = new Animal("Félidé", "Lion", 5, true);
        myZoo.searchAnimal(lion2);

        myZoo.addAnimal(tiger);
        myZoo.addAnimal(Giraffe);

        myZoo.removeAnimal(tiger);
        myZoo.showAnimals();

        myZoo.isZooFull();

        Zoo zoo2 = new Zoo("Safari Paradis", "Sousse" );
        zoo2.addAnimal(tiger);
        zoo2.addAnimal(Giraffe);

        Zoo zoo3 = new Zoo("Zoo Aventure", "Tunis");
        zoo3.addAnimal(tiger);
        zoo3.addAnimal(Crocodile);
        zoo3.addAnimal(Giraffe);

        Zoo zooPlusAnim = Zoo.comparerZoo(zoo2,zoo3);
        System.out.println("Le zoo avec le plus d'animaux est  : " + zooPlusAnim.name);

    }
}