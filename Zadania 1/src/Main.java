import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        //Wypisz();
        System.out.println( Dane());
        System.out.println("podaj a: ");
        int a=getInt();
        System.out.println("podaj b: ");
        int b=getInt();

        Liczby(a,b);
        System.out.println(Parzysta(b));
        System.out.println(Podzielna(b));
        System.out.println("podaj double a: ");
        double a1=getDouble();
        System.out.println(PotegaLiczb(a1));
        System.out.println(PierwiastekLiczb(a1));
        System.out.println(Trojakt());




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
    public static String Dane(){
        return ("Gabriel 21");
    }
    public static void Liczby(int a, int b){
        int sum=a+b;
        int roz=a-b;
        int ilo=a*b;
        System.out.println("suma: "+sum+", roznica: "+roz+" , iloczyn: "+ilo);
    }
    public static boolean Parzysta(int b){
        if ((b%2)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean Podzielna(int b){
        if(b%3==0 && b%5==0){
            return  true;
        }
        else return false;

    }
    public static double PotegaLiczb(double a){
       double potega=Math.pow(a,3);
        return (potega);
    }
    public static  double PierwiastekLiczb(double a){
        double pierwiastek= Math.sqrt(a);
        return (pierwiastek);
    }
    public static boolean Trojakt(){
        double a, b,c;
        System.out.println("Podaj granice przedzialu");
        a=getDouble();
        b=getDouble();
        if(b>a){

            System.out.println("Zle okresliles przedzial");
            return false;
        }
        else{
            double bok1=GetRandom(a,b);
            double bok2=GetRandom(a,b);
            double bok3=GetRandom(a,b);
            return ((bok2*bok2)+(bok1*bok1))==(bok3*bok3);





        }


    }

    public static double GetRandom(double min, double max){
        Random rand = new Random();
        return  rand.nextDouble(max-min+1)-max;
    }
}