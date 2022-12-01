public class Podręcznik extends Książka{
    //dziedziczenie
    String tytul;


    public Podręcznik(String tytul, double cena, String autor,int IloscStron  ) {
        super(autor,  IloscStron);
        this.tytul=tytul;
        this.Cena=cena;


    }

    @Override
    public String toString() {
        return "Podręcznik{" +
                "tytul='" + tytul + '\'' +
                ", Cena=" + Cena +
                ", autor='" + autor + '\'' +
                ", IloscStron=" + IloscStron +
                '}';
    }

    public Podręcznik() {
       this.autor=" ";
        this.tytul=" ";
        this.Cena=0;
        this.IloscStron=0;
    }
}
