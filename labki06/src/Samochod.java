import java.util.Date;
import java.util.Scanner;

public class Samochod {
    String Marka, Model, Nadwozie, Kolor;
    int rok_produkcji,przebieg ;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rok_produkcji, int przebieg) {
        this.Marka = marka;
        this.Model = model;
        this.Nadwozie = nadwozie;
        this.Kolor = kolor;
        this.rok_produkcji = rok_produkcji;
        if (this.przebieg>=0) {
            this.przebieg = przebieg;
        }
        else this.przebieg=0;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", Nadwozie='" + Nadwozie + '\'' +
                ", Kolor='" + Kolor + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", przebieg=" + przebieg +
                '}';
    }

    public Samochod() {
        System.out.println("podaj dane fury! MARKA,MODEL, NADWOZIE, KOLOR, ROK, PRZEBIEG");
        String marka1=getString();
        String model1=getString();
        String nadwozie1=getString();
        String kolor=getString();
        int rok1=getInt();
        int przebieg=getInt();
        if (przebieg<0){System.out.println("Podałeś ujemny przebieg, ustawiamy wiec twoj przebieg na 100"); przebieg=100;}
        this.Marka = marka1;
        this.Model = model1;
        this.Nadwozie = nadwozie1;
        this.Kolor = kolor;
        this.rok_produkcji = rok1;
        this.przebieg=przebieg;
    }

    public void setMarka(String marka) {
        this.Marka = marka;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void setNadwozie(String nadwozie) {
        this.Nadwozie = nadwozie;
    }

    public void setKolor(String kolor) {
        this.Kolor = kolor;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public String getMarka() {
        return Marka;
    }

    public String getModel() {
        return Model;
    }

    public String getNadwozie() {
        return Nadwozie;
    }

    public String getKolor() {
        return Kolor;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public int getPrzebieg() {
        return przebieg;
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

