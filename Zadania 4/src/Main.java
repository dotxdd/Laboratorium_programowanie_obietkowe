import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] arr= new int[RandomInt(12,102)];
        //for(int i=0; i<arr.length ; i++){
        //  arr[i]=RandomInt(-10,67);
        //}
        //int sum= Suma(arr);
        //int avg= Srednia(arr);
        //System.out.println("suma: "+sum);
        //System.out.println("srednia: "+avg);
      //  int[] tabs= {1,0,3,4,5,6,9,0};
       // int[] tabs2={0,34,89,90,11,87,2};
      //  LiczbyParzyste(tabs);
       // System.out.println("druga tab");
       // LiczbyParzyste(tabs2);
       // Zadanie3();
       // Zadanie4();
        //Zadanie5();
       // Zadanie6();
        Zadanie7();

    }




    //public static int RandomInt(int min, int max){
    //return (int) (Math.random() * (max+1-min))+min;
    //}
    //public static int Suma(int[] tablica){
    //  int suma=0;
    //for (int x:tablica){
    //  suma=suma+x;
    //}
    //return suma;
    //}
    //public static int Srednia(int [] tablica){
    //      int ilo=tablica.length;
    //    int suma=0;
    //  for (int i=0; i<tablica.length; i++){
    //    suma=suma+tablica[i];
    //}
    //int avg=suma/ilo;
    // return avg;

    //  }
    public static void LiczbyParzyste(int [] tablica){

        for( int i=0; i<tablica.length; i++){
            if(i%2==0){
                System.out.println(tablica[i]);
            }
        }
    }
    public static void Zadanie3(){
        String [] slowa = {"Ala", "ma", "kota", "Poniedziałek", "Sroda"};
        for (String element: slowa){
            System.out.println(element.toUpperCase());
        }
    }
    public static void Zadanie4(){
        String tab[] = new String[5];
               System.out.println("Podaj 5 słów: ");
               for(int i=0; i<5; i++){
                  System.out.println("Podaj "+(i+1)+" słowo: ");
                   tab[i] = getString();
               }
               for(int i = tab.length-1; i>=0; i--){
                   for(int j=tab[i].length()-1; j>=0;j--){
                       System.out.print(tab[i].charAt(j));
                   }
                }
    }
    public static void Zadanie5(){
        int tab[] = new int[10];

        System.out.println("Podaj 10 liczb: ");
        for(int i=0; i<10; i++){
            System.out.println("Podaj "+(i+1)+" liczbe: ");
            tab[i] = getInt();
        }

        for (int i = 0; i < tab.length; i++) {
            int key = tab[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && tab[j] > key) {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
            tab[j + 1] = key;
        }
        printArray(tab);
        }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void Zadanie6() {
        int tab[] = new int[5];

        System.out.println("Podaj 5 liczb: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe: ");
            tab[i] = getInt();
        }
        for (int i = 0; i < tab.length; i++) {
            int silnia=1;
            for (int j=1; j<=tab[i];j++){
             silnia=silnia*j;
            }
            System.out.println("Silnia liczby nr"+i+" wynosi: "+silnia);
        }
    }
    public static void Zadanie7() {
        int test=0;
        String tab[] = {"ala", "kotek", "pies"};
        String arr[] = {"ala", "kot", "pies"};
      for (int i=0;i<tab.length;i++){
          if (tab[i]==arr[i]){

          }
          else{
              test=1;
          }
      }
      if (test==0){
          System.out.println("Tablice sa takie same");
      }
      else {
          System.out.println("Tablice sa rozne");
      }
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static String getString(){
        return new Scanner(System.in).nextLine();
    }
}