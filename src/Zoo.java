public class Zoo {


    Animal[] animals;
    String name;
    String city;
    int animalCount ;
    final int nbrCages = 25;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
    }

    //instruction8: méthode displayZoo
    public String displayZoo() {
        return "le"+" "+name+" est dans "+city+" de "+nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo: " + name + " | Ville: " + city + " | Cages: " + nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        int a = searchAnimal(animal);
        if (animalCount<animals.length && a==-1){
            animals[animalCount]=animal;
            animalCount++;
            return true;
        }
        return false;
    }

    public void afficherAnimal() {
        for (int i=0;i<animalCount;i++){
            System.out.println(animals[i]);
        }
    }

    void afficherAnimal2() {
        for (Animal animal:animals){
            System.out.println(animal);
        }
    }


    public int searchAnimal(Animal animal) {
        if (animal == null) return -1;
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null && animal.equals(animals[i])) return i;//.equals() compare le contenu (les valeurs des attributs de l'objet)
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int a = searchAnimal(animal);
        if (a==-1) {
            for (int i=a;i<animalCount;i++) {
                animals[i]=animals[i+1];

            }
            animals[animalCount-1]=null;
            animalCount--;
        };
        return true;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if(z1.animalCount>z2.animalCount){
            return z1;
        }
        if(z2.animalCount>z1.animalCount){
            return z2;
        }
        else{
            return null;
        }
    }




}
