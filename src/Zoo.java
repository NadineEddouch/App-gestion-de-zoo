public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages, int animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }
    public String toString() {
        return "zoo{" + "name=" + name + ", city="+ city + ", nbrCages=" + nbrCages + ", animals=" + animals + '}';
    }


}
