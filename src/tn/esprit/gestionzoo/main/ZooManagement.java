package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;


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
        lion.setFamily("Félidé");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName("Parc Animalier");
        myZoo.setCity("Tunis");

        System.out.println("Zoo : " + myZoo.getName() + " à " + myZoo.getCity());
        System.out.println("Animal : " + lion.getName() + " (" + lion.getFamily() + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        Zoo myZoo1 = new Zoo("Parc Animalier", "Tunis");

        System.out.println("Animal créé : " + lion1.getName());
        System.out.println("Zoo créé : " + myZoo1.getName() + " (" + myZoo.getCity() + ")");

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
        System.out.println("Le zoo avec le plus d'animaux est  : " + zooPlusAnim.getName());

    }
}