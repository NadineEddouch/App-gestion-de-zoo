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

        Animal Lion = new Animal("L", "Lions",26,true);
        System.out.println(Lion);

        Zoo myZoo = new Zoo("parc2","tunis",750,36);
        System.out.println(myZoo);
    }
}

