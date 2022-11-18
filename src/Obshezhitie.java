public class Obshezhitie implements Arenda {
    private Person[] family;

    public Obshezhitie(Person[] family) {
        this.family = family;
    }

    @Override
    public void ArendaToloo() {
        System.out.println("Biz arenda toloibuz");

    }

    public void getFamilies() {
        System.out.println("-------Families Who Live In Obshezhitie-------");
        for (Person i : family) {
            i.getName();
        }
    }
}







