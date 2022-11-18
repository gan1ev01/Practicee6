public class Kvartira implements KomUsluga{
    private Person[] family;


    public Kvartira(Person[] family){
        this.family = family;
    }

    @Override
    public void KomUslugaToloo(){
        System.out.println("Biz komUsluga toloibuz");

    }

    public void getFamilies() {
        System.out.println("-------Families Who Live In Apartments-------");
        for (Person i: family) {
            i.getName();
        }
    }
}
