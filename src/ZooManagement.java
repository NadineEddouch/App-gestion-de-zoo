import java.util.Scanner;
public class ZooManagement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le nom du Zoo :");
        String ZooName = input.nextLine();

        System.out.print("Entrez le nombre de cages :");
        int nbrCages = input.nextInt();
        if (nbrCages <= 0 || ZooName.isEmpty()) {
            System.out.println("Erreur! Données invalides");
        } else {
            System.out.println(ZooName + " comporte " + nbrCages + " cages");
        }

        Animal Lion = new Animal("Felidae", "Lion",6,true);
        System.out.println(Lion);
        Animal Elephant = new Animal("Elephantidae", "Elephant",10,true);
        System.out.println(Elephant);
        Animal Crocodile = new Animal("Crocodylidae", "Crocodile",8,false);
        System.out.println(Crocodile);

        Zoo myZoo = new Zoo("Park 205", "Tunis", 32);
        myZoo.displayZoo();

        System.out.println(myZoo);
    }
}

