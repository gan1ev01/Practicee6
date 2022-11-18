public class Hotel implements Arenda{
    private Person[] family;

    public Hotel(Person[] family){
        this.family = family;
    }

    @Override
    public void ArendaToloo() {
        System.out.println("Biz arenda toloibuz");

    }

    public void getFamilies(){
        System.out.println("-------Families Who Live In Hotel-------");
        for (Person i: family){
            i.getName();
        }
    }
}
