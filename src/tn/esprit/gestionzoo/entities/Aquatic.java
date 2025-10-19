package tn.esprit.gestionzoo.entities;

public non-sealed abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {}
    
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat=" + habitat + "]";
    }
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // même référence
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic other = (Aquatic) obj;
        return this.getAge() == other.getAge() && this.getName().equals(other.getName()) && this.habitat.equals(other.habitat);
    }

}
