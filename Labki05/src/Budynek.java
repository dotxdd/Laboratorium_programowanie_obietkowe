import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int LiczbaPieter;
    //final int rokConst=1999;
    LocalDate rokBudowy;

    public Budynek(String nazwa, int liczbaPieter, LocalDate rokBudowy) {
        this.nazwa = nazwa;
        LiczbaPieter = liczbaPieter;
        this.rokBudowy = rokBudowy;
    }

    @Override
    public String toString() {
        return "Budynek{" +
                "nazwa='" + nazwa + '\'' +
                ", LiczbaPieter=" + LiczbaPieter +
                ", rokBudowy=" + rokBudowy +
                '}';
    }
    public long IleLat(){
        LocalDate today= LocalDate.now();
        long ileLat = ChronoUnit.YEARS.between(rokBudowy, today);
        return ileLat;
    }
}
