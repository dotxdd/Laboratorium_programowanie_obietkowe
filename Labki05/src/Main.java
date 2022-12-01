import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
//        Prostokat p1 = new Prostokat(2.4, 4.5);
//        p1.Opis();
//        p1.szer=1.4;
//        p1.wys=4.6;
//        p1.Opis();
       // Budynek b1 = new Budynek("wsiz",3, LocalDate.of(1999,1,1));

      //  System.out.println(b1.toString());
      //  System.out.println("budynek ma" +b1.IleLat()+" rok/lat/lata");
    Gatunek g1 = new Gatunek("Smokus", "Zloty", "gada se", 48, 12);
        System.out.println( g1.toString());
        System.out.println( g1.getNazwa());
        System.out.println(g1.getChromosomx());
        Gatunek clonedg1=(Gatunek) g1.clone();
        System.out.println(clonedg1.toString());
    }


}