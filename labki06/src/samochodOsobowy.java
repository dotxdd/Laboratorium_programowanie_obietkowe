import java.util.Scanner;

public class samochodOsobowy extends Samochod  {
double waga, pojemnoscSilnika;
int IloscOsob;

    public samochodOsobowy(){
         System.out.println("podaj dane fury! MARKA,MODEL, NADWOZIE, KOLOR, ROK, PRZEBIEG, WAGA, POJEMNOSC, LICZBA OSOB");
    String marka1=getString();
    String model1=getString();
    String nadwozie1=getString();
    String kolor=getString();
    int rok1=getInt();
    int przebieg=getInt();
        if (przebieg<0){System.out.println("Podałeś ujemny przebieg, ustawiamy wiec twoj przebieg na 100"); przebieg=100;}
        double waga=getDouble();
        double poj=getDouble();
        int ilosc=getInt();
        this.Marka = marka1;
        this.Model = model1;
        this.Nadwozie = nadwozie1;
        this.Kolor = kolor;
        this.rok_produkcji = rok1;
        this.przebieg=przebieg;
        this.waga=waga;
        this.pojemnoscSilnika=poj;
        this.IloscOsob=ilosc;
    }

    public samochodOsobowy(double waga, double pojemnoscSilnika, int iloscOsob) {
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        IloscOsob = iloscOsob;
    }

    @Override
    public String toString() {
        return "samochodOsobowy{" +
                "waga=" + waga +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", IloscOsob=" + IloscOsob +
                ", Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", Nadwozie='" + Nadwozie + '\'' +
                ", Kolor='" + Kolor + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", przebieg=" + przebieg +
                '}';
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }
    public static double getDouble(){
        return new Scanner(System.in).nextDouble();
    }
}

