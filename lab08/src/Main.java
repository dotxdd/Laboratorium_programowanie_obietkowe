import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        System.out.println("podaj liczbe: ");
//        Scanner input= new Scanner(System.in);
//        double userInput= 0;
//        while (true){
//            try{
//                userInput = input.nextDouble();
//                break;
//            }
//            catch (InputMismatchException e){
//                System.out.println("Podaj poprawna wartosc!: ");
//                input.next();
//
//            }
//        }
//        if (userInput<0){
//            throw new IllegalArgumentException("pierwiastek z liczby ujemnej "+userInput + "nie istnieje. ");
//        }
//        System.out.println("Pierwiastek z liczby: "+userInput+ " = "+Math.sqrt(userInput));
//        System.out.println(String.format("Pierwiastek z liczby: %.2f wynosi %.4f", userInput, Math.sqrt(userInput)));
//        try{
//            System.out.println("5! ="+silnia(5));
//            System.out.println("-1! ="+silnia(-1));
//        }
//        catch (ErrorSilniaException e){
//            System.out.println("error "+e.getMessage());
//        }
        try {
            Adres adres = new Adres("ulica", -1, "00-000", "miasto");
        } catch (NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
        }
    }
    public static class ErrorSilniaException extends Exception{
        public ErrorSilniaException(String message) {
            super(message);
        }
    }

    public static int silnia (int n) throws ErrorSilniaException{
        if (n<0){
            throw new ErrorSilniaException("silnia z ujemnej wartości nie istenieje");
        }
        int wynik =1;
        for (int i=2; i<=n;i++){
            wynik*=i;
        }
        return wynik;
    }

}