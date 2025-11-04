package tn.esprit.gestionzoo.main;

import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;


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
        Animal crocodile = new Animal("Crocodylidae" , "Crocodile", 8, false);
/*
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(Crocodile);
*/
        myZoo.showAnimals();

        myZoo.searchAnimal(tiger);
        myZoo.searchAnimal(lion);
        myZoo.searchAnimal(crocodile);

        Animal giraffe = new Animal("Giraffidae", "Giraffe",10,true);
        myZoo.searchAnimal(giraffe);

        Animal lion2 = new Animal("Félidé", "Lion", 5, true);
        myZoo.searchAnimal(lion2);
/*
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(Giraffe);
*/
        myZoo.removeAnimal(tiger);
        myZoo.showAnimals();

        myZoo.isZooFull();

        Zoo zoo2 = new Zoo("Safari Paradis", "Sousse" );
        /*
        zoo2.addAnimal(tiger);
        zoo2.addAnimal(Giraffe);
        */
        Zoo zoo3 = new Zoo("Zoo Aventure", "Tunis");
        /*
        zoo3.addAnimal(tiger);
        zoo3.addAnimal(crocodile);
        zoo3.addAnimal(giraffe);
        */
        Zoo zooPlusAnim = Zoo.comparerZoo(zoo2,zoo3);
        System.out.println("Le zoo avec le plus d'animaux est  : " + zooPlusAnim.getName());

        //Prosit 5
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        Terrestrial terrestrial2 = new Terrestrial("Canidé", "Chien", 3, true, 4);
        Dolphin dolphin2 = new Dolphin("Cétacé", "Flipper", 6, true, "mer", 25.5f);
        Penguin penguin2 = new Penguin("Sphéniscidé", "Pingou", 4, false, "bassin", 15.8f);

        System.out.println(terrestrial2);
        System.out.println(dolphin2);
        System.out.println(penguin2);

        dolphin2.swim();
        penguin2.swim();

        //Prosit 6
        myZoo1.addAquaticAnimal(dolphin2);
        myZoo1.addAquaticAnimal(penguin2);
        Dolphin d1 = new Dolphin("Félidé Aquatique", "Dolly", 4, true, "Océan", 12.5f);
        Penguin p3 = new Penguin("Spheniscidae", "Pingu", 3, true, "Bassin", 15.0f);
        Penguin p4 = new Penguin("Spheniscidae", "Pingu2", 2, true, "Mer", 8.0f);
        myZoo1.addAquaticAnimal(d1);
        myZoo1.addAquaticAnimal(p3);
        myZoo1.addAquaticAnimal(p4);

        System.out.println("Les animaux aquatiques ont été ajoutés avec succès dans le zoo <"+ myZoo1.getName() +">.");

        myZoo1.makeAquaticsSwim();

        System.out.println("Profondeur maximale des pingouins : " + myZoo1.maxPenguinSwimmingDepth() + " m");

        myZoo1.displayNumberOfAquaticsByType();

        System.out.println(p3.equals(p4));

        // Prosit 7
 /*
        try {
            myZoo.addAnimal(new Animal("Canidé", "Chien", 3, true));
            myZoo.addAnimal(new Animal("Oiseau", "Perroquet", 2, false));
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());
*/
        try {
            myZoo.addAnimal(lion);
        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Zoo plein : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());


        try {
            Animal chat = new Animal("Félidé", "Chat", -2, true);
            myZoo.addAnimal(chat);
        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Zoo plein : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());

        try {
            myZoo.addAnimal(lion);
            myZoo.addAnimal(tiger);
            myZoo.addAnimal(giraffe);
            myZoo.addAnimal(crocodile);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println("Nombre total d’animaux : " + myZoo.getNbrAnimals());

    }


}
