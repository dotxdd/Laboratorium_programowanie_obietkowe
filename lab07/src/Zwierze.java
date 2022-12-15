public abstract class Zwierze implements iPlywanie, iLatanie {

    // Nadpisanie metod z interfejsu Pływanie
    @Override
    public void plyn() {
        System.out.println("Zwierzę płynie.");
    }

    @Override
    public void wynurz() {
        System.out.println("Zwierzę wynurza się.");
    }

    @Override
    public void zanurz() {
        System.out.println("Zwierzę zanurza się.");
    }

    // Nadpisanie metod z interfejsu Latanie
    @Override
    public void lec() {
        System.out.println("Zwierzę leci.");
    }

    @Override
    public void wyladuj() {
        System.out.println("Zwierzę wylądowuje.");
    }

    public abstract void jedz();

    public abstract void wydalaj();
}