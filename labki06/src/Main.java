import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //ZADANIE 1
//        Punkt p1 = new Punkt(12, 32);
//        p1.opis();
//        p1.przesun(3,2);
//        p1.setX(22);
//        p1.setY(1);
//        p1.opis();

//        Figura f1= new Figura();
//        Trojkat t1=new Trojkat(2,6);
//        Prostokat p1=new Prostokat(3,4);
//        System.out.println(f1.opis());
//        System.out.println(p1.getPowierzchnia());
///ZADANIE3
//        Książka k1 = new Książka(49.99,"SAPKOWSKI",392);
//        System.out.println(k1.toString());
//        Podręcznik pod1=new Podręcznik("IT dla nowych",79.90,"Kamil Zduń", 789);
//        System.out.println(pod1.toString());
//        Klient marek = new Klient("Marek","Jaruzel",49,(new Księgarnia("StaraKsiegarnia","Prusa 33")));
//        System.out.println(marek.toString());
//        //rzutowanie
//      Podręcznik podr2=new Podręcznik();
//      Książka k2 = (Podręcznik) podr2;
//      System.out.println(k2.toString());
//
//    }
        ///ZADANIE2
//        Samochod s1 = new Samochod("Audi", "A6", "duze", "żółty", 2002, 160000);
//        System.out.println(s1.toString());
//        Samochod s2=new Samochod();
//       s2.setMarka("test");
//       System.out.println(s2.getMarka());
//       System.out.println("podaj dane fury! MARKA,MODEL, NADWOZIE, KOLOR, ROK, PRZEBIEG");
//        String marka1=getString();
//       String model1=getString();
//       String nadwozie1=getString();
//       String kolor=getString();
//       int rok1=getInt();
//       int przebieg=getInt();
//       Samochod s3=new Samochod(marka1, model1, nadwozie1, kolor, rok1, przebieg);
//       System.out.println(s3.toString());
//        System.out.println("Wprowadz kolejne dane! WAGA, POJEMNOSC SILNIKA I ILOSC OSOB");
//        double waga=getDouble();
//        double poj=getDouble();
//        int ilosc=getInt();
//        samochodOsobowy ss1= new samochodOsobowy(marka1, model1, nadwozie1, kolor, rok1, przebieg,waga, poj, ilosc);
//        System.out.println(ss1.toString());
        Samochod s1=new Samochod();
        System.out.println(s1.toString());
        samochodOsobowy ss1=new samochodOsobowy();
        System.out.println(ss1.toString());
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