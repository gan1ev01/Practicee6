public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Bakas");
        Person person2 = new Person("Bektemir");
        Person person3 = new Person("Alibek");
        Person person4 = new Person("Kanykei");
        Person person5 = new Person("Kairat");
        Person person6 = new Person("Abdulfatok");
        Person person7 = new Person("Nurik");
        Person person8 = new Person("Abu Ali");
        Person person9 = new Person("Baiysh");

        System.out.println("-----------------------------------------------");

        Person[] people1 = {person1, person2, person3, person9};
        Person[] people2 = {person4, person5, person6};
        Person[] people3 = {person7, person8};

        System.out.println("------------------------------------------------");

        Kvartira kvartira1 = new Kvartira(people1);
        Obshezhitie obshezhitie1 = new Obshezhitie(people2);
        Hotel hotel1 = new Hotel(people3);

        System.out.println("-------------------------------------------------");

        kvartira1.getFamilies();
        kvartira1.KomUslugaToloo();
        obshezhitie1.getFamilies();
        obshezhitie1.ArendaToloo();
        hotel1.getFamilies();
        hotel1.ArendaToloo();

        System.out.println("--------------------------------------------------");

    }
}
