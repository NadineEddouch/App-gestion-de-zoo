package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

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
        lion.setFamily("Félidé");
        lion.setName("Lion");
        lion.setAge(5);
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.setName("Parc Animalier");
        myZoo.city = "Tunis";
        // myZoo.nbrCages = 20;

        // System.out.println("tn.esprit.gestionzoo.entities.Zoo : " + myZoo.name + " à " + myZoo.city);
        System.out.println("tn.esprit.gestionzoo.entities.Animal : " + lion.getName() + " (" + lion.getFamily() + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        // tn.esprit.gestionzoo.entities.Zoo myZoo1 = new tn.esprit.gestionzoo.entities.Zoo("Parc Animalier", "Tunis", 20);

        System.out.println("tn.esprit.gestionzoo.entities.Animal créé : " + lion1.getName());
        //System.out.println("tn.esprit.gestionzoo.entities.Zoo créé : " + myZoo1.name + " (" + myZoo.city + ")");

        myZoo.displayZoo();
        System.out.println(myZoo);
        //Prosit 3
        Zoo zoo1 = new Zoo("tn.esprit.gestionzoo.entities.Zoo Esprit", "Tunis");
        Zoo zoo2 = new Zoo("tn.esprit.gestionzoo.entities.Zoo Safari", "Sousse");

        Animal tigre = new Animal("Félidé", "Shere Khan", 7, true);
        Animal lion2 = new Animal("Félidé", "Lion", 5, true); // identique à lion
        // Test Ajout
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2); // doit être refusé (doublon)

        // Test Affichage
        zoo1.displayAnimals();

        // Test Recherche
        System.out.println("Indice : " + zoo1.searchAnimal(lion));
        System.out.println("Indice : " + zoo1.searchAnimal(tigre));

        // Test Suppression
        zoo1.removeAnimal(tigre);
        zoo1.displayAnimals();

        // Test tn.esprit.gestionzoo.entities.Zoo plein
        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("TestFamily", "tn.esprit.gestionzoo.entities.Animal" + i, 2, false));
        }
        System.out.println("tn.esprit.gestionzoo.entities.Zoo plein " + zoo1.isZooFull());

        // Test Comparaison
        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo avec le plus d'animaux : " + plusGrand);

        //Prosit 5
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        Aquatic aquatic2 = new Aquatic("Poisson", "Poisson-clown", 2, false, "océan");
        Terrestrial terrestrial2 = new Terrestrial("Canidé", "Chien", 3, true, 4);
        Dolphin dolphin2 = new Dolphin("Cétacé", "Flipper", 6, true, "mer", 25.5f);
        Penguin penguin2 = new Penguin("Sphéniscidé", "Pingou", 4, false, "bassin", 15.8f);

        System.out.println(aquatic2);
        System.out.println(terrestrial2);
        System.out.println(dolphin2);
        System.out.println(penguin2);

        aquatic2.swim();
        dolphin2.swim();
        penguin2.swim();



    }
}
