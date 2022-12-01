public class Powieść extends Książka {
    //dziedziczenie
    String Tytul;

    public Powieść(double cena, String autor, int iloscStron, String tytul) {
        //uzycie super
        super(cena, autor, iloscStron);
        Tytul = tytul;
    }
}
