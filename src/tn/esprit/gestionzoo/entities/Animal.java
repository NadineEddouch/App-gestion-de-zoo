package tn.esprit.gestionzoo.entities;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(){}
    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("L'age de l'animal doit être positif.");
        }
        else {
            this.age = age;
        }
    }
    public boolean isIsMammal() {
        return isMammal;
    }
    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [Famille=" + family + ", Nom=" + name + ", Âge=" + age + ", Mammifère=" + isMammal + "]";
    }

}