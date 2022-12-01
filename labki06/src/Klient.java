public class Klient {
    String imie, nazwisko;
    int wiek;
    //kompozycja
    Księgarnia nazwaKsiegarni;

    public Klient(String imie, String nazwisko, int wiek, Księgarnia nazwaKsiegarni) {
        //uzycie this
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.nazwaKsiegarni = nazwaKsiegarni;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", nazwaKsiegarni=" + nazwaKsiegarni +
                '}';
    }
}
