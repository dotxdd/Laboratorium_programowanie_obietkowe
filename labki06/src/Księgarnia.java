public class Księgarnia {
    String nazwaKsiegarni, ulica;

    public Księgarnia(String nazwaKsiegarni, String ulica) {
        this.nazwaKsiegarni = nazwaKsiegarni;
        this.ulica = ulica;
    }

    @Override
    public String toString() {
        return "Księgarnia{" +
                "nazwaKsiegarni='" + nazwaKsiegarni + '\'' +
                ", ulica='" + ulica + '\'' +
                '}';
    }

}
