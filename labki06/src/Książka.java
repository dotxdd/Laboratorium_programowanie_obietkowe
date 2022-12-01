public class Książka {
    double Cena;
    String autor;
    int IloscStron;
    public Książka(){
        this.Cena = 0;
        this.autor = " ";
        this.IloscStron = 0;
    }
    public Książka(double cena, String autor, int iloscStron) {
       this.Cena = cena;
        this.autor = autor;
        this.IloscStron = iloscStron;
    }

    public Książka(String autor) {
        this.autor=autor;
    }

    public Książka(String autor, int iloscStron) {
        this.autor=autor;

        this.IloscStron=IloscStron;

    }

    @Override
    public String toString() {
        return "Książka{" +
                "Cena=" + Cena +
                ", autor='" + autor + '\'' +
                ", IloscStron=" + IloscStron +
                '}';
    }
}
