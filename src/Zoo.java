public class Zoo {

    Animal[] animals=new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    //instruction8: méthode displayZoo
    public String displayZoo() {
        return "le"+" "+name+" est dans "+city+" de "+nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo: " + name + " | Ville: " + city + " | Cages: " + nbrCages;
    }




}
