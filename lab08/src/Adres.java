class NieprawidlowyAdresException extends Exception {
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}
public class Adres {
    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        String message = "";

        if (ulica == null) {
            message += "Ulica nie może być nullem. ";
        }

        if (numerDomu <= 0) {
            message += "Numer domu nie może być mniejszy lub równy 0. ";
        }

        if (kodPocztowy == null) {
            message += "Kod pocztowy nie może być nullem. ";
        }

        if (miasto == null) {
            message += "Miasto nie może być nullem. ";
        }

        if (!message.equals("")) {
            throw new NieprawidlowyAdresException(message);
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }


}


    public List<Uczestnik> getUczestnicyNiepelnoletni() {
        List<Uczestnik> niepelnoletni = new LinkedList<>();
        for (Uczestnik uczestnik : uczestnicy) {
            if (uczestnik.getWiek() < 18) {
                niepelnoletni.add(uczestnik);
            }
        }
        return niepelnoletni;
    }
}