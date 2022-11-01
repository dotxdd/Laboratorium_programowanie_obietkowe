import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        //Wypisz();
        RownanieKwadratowe();
        DeszczuAutobus();
        Znizka();
        Kalkulator();
// intelij zwraca mi blad w ustawieniach defaultowych programu jesli chce to zrobic na switchach java: patterns in switch statements are a preview feature and are disabled by default.
//  (use --enable-preview to enable patterns in switch statements)








    }
    public static void Wypisz(){

        int a=-2;
        int b=23;
        Scanner input = new Scanner(System.in);

        System.out.println("a = "+a+", "+b);
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static double getDouble(){
        return new Scanner(System.in).nextDouble();
    }



    public static void RownanieKwadratowe(){
        System.out.println("podaj a w rownaniu kwadratowym: ");
        double a=getDouble();
        System.out.println("podaj b w rownaniu kwadratowym: ");
        double b=getDouble();
        System.out.println("podaj c w rownaniu kwadratowym: ");
        double c=getDouble();
        double delta= Math.pow(b,2)-(4*a*c);
        if (delta<0){
            System.out.println("Brak rozwiązań");
        } else if (delta==0) {
            double x=-b/(2*a);
            System.out.println("Rownanie ma 1 rozwiazanie: "+ x);


        }
        else {
            double x1= (-b-(Math.sqrt(delta)))/(2*a);
            double x2= (-b+(Math.sqrt(delta)))/(2*a);
            System.out.println("Rownanie ma 2 rozwiazania: "+ x1+", "+x2);



        }

    }
    public static void DeszczuAutobus(){
        System.out.println("Pada deszcz-1, Nie pada- każda inna liczba: ");
        double deszcz=getDouble();
        System.out.println("Jest autobus-1, Nie ma- każda inna liczba: ");
        double autobus=getDouble();
        if(deszcz==1 && autobus==1){
           System.out.println("Dostaniesz sie na uczelnie"); 
           System.out.println("Weź parasol"); 
        } else if (deszcz==1 && autobus!=1) {

            System.out.println("Nie dostaniesz sie na uczelnie");
        } else if (deszcz!=1 && autobus==1) {
            System.out.println("Dostaniesz się na uczelnie");
            System.out.println("Miłego dnia i pięknej pogody");
        }
        else System.out.println("Jest jeszcze jeden przypadek nieokreślony w zadaniu");


    }
    public static void Znizka(){
        System.out.println("Jest znizka-1, Nie ma znizki- każda inna liczba: ");
        double znizka=getDouble();
        System.out.println("Jest premia-1, Nie ma- każda inna liczba: ");
        double premia=getDouble();
        if(znizka!=1 || premia==1){
            System.out.println("Możesz kupić samochód");
            System.out.println("Zniżki na samochód nie ma");
        } if (znizka==1 || premia==1) {
            System.out.println("Możesz kupić samochód");

        }  if (znizka!=1 || premia!=1) {
            System.out.println("Zakup samochodu trzeba odłożyć na później");
            System.out.println("Zniżki nie ma");
        }



    }
    public static void Kalkulator(){
        System.out.println("1.Dodawanie 2.Odejmowanie 3.Dzielenie 4.Mnożenie 5.Reszta z dzielenia");
        double kalk=getDouble();
        double a,b, wynik;

            if(kalk==1) {
                System.out.println("Podaj a i b");
                a = getDouble();
                b = getDouble();
                wynik = a + b;
                System.out.println(wynik);
            } else if (kalk==2) {

                System.out.println("Podaj a i b");
                a=getDouble();
                b=getDouble();
                wynik=a-b;
                System.out.println(wynik);
            }
            else if (kalk==3) {
                System.out.println("Podaj a i b");
                a = getDouble();
                b = getDouble();
                if (b == 0) {
                    System.out.println("Nie dziel przez 0");

                }
                else {
                    wynik = a / b;
                    System.out.println(wynik);
                }
            }
            else if (kalk==4) {
                System.out.println("Podaj a i b");
                a = getDouble();
                b = getDouble();
                wynik = a * b;
                System.out.println(wynik);
            }
            else if (kalk==5) {
                int a1, b1, wynik1;
                System.out.println("Podaj a i b");
                a1 = getInt();
                b1 = getInt();
                wynik1 = a1 % b1;
                System.out.println(wynik1);
            }



    }

}