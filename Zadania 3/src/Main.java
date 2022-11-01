import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ZadanieP();
       ZadanieDwa();
        ZadanieTrzy();
        ZadaniePiec();
    }
    public static int getInt(){

        return new Scanner(System.in).nextInt();

    }
    public static String getString(){

        return new Scanner(System.in).nextLine();

    }
    public static void ZadanieP(){
        System.out.println("Ile studentów");
        int stud = getInt();
        int tab[] = new int[stud];
        int i = 0;
        double suma=tab[0];
        System.out.println("Ile punktow: ");
        while(i<stud){
            tab[i] = getInt();
            suma = suma + tab[i];
            i++;
        }
       double avg=suma/stud;
        System.out.println("Średnia wynosi: "+avg);
    }
   public static void ZadanieDwa(){
        int tab[] = new int[10];
        int Ujemne = 0, Dodatnie=0, DodatnieSuma = tab[0], UjemneSuma = tab[0];
        System.out.println("Podaj 10 liczb: ");
        for(int i = 0; i<10; i++){
            tab[i] = getInt();
            if(tab[i]<0){
                Ujemne++;
                UjemneSuma = UjemneSuma + tab[i];
            }
            else{
                Dodatnie++;
                DodatnieSuma = DodatnieSuma +tab[i];
            }
        }
        System.out.println("Suma ujemnych: "+UjemneSuma+" Suma dodatnich"+DodatnieSuma);

   }
    public static void ZadanieTrzy(){
        System.out.println("Ile liczb w tab: ");
        int ile = getInt();
        int tab[] = new int[ile];
        System.out.println("Podaj liczby ");
        int SumaParzystych = 0;
        for(int i = 0; i<ile; i++){
            tab[i] = getInt();
            if(tab[i]%2==0){
                SumaParzystych = SumaParzystych + tab[i];
            }
        }
        System.out.println("Suma parzystych: "+SumaParzystych);
}


    public static void ZadaniePiec(){
        System.out.println("Wprowadz wyraz: ");
        String wyraz = getString();
        int LenWyraz = wyraz.length();
        boolean palindrom = false;
        for(int i = 0; i<LenWyraz/2; i++){
            if(wyraz.charAt(i) != wyraz.charAt(LenWyraz-1-i)){
                palindrom = true;
                break;
            }
        }
        if(palindrom == true){
            System.out.println("To nie palindrom");
        }
        else{
            System.out.println("Palindrom");
        }
    }
}