public class main {

    public static void main(String[] args) {
        Animal lion=new Animal("felin","lioni",11,true);
        Animal cat=new Animal("felin","cat",12,true);
        Zoo myZoo=new Zoo("belvedere","tunis");
        Zoo myZoo1=new Zoo("felin","tunis");

        Zoo.compareZoo(myZoo,myZoo1);

        myZoo.displayZoo();

        System.out.println("Animal créé "+lion.name);
        System.out.println(myZoo);
        myZoo.addAnimal(lion);

        myZoo.addAnimal(cat);

        int indexLion = myZoo.searchAnimal(new Animal("", "Lion",  0, true));
        System.out.println("Index du Lion : " + indexLion);

        int indexCat = myZoo.searchAnimal(new Animal("", "Cat", 0, true));
        System.out.println("Index du Cat : " + indexCat);






    }
}
