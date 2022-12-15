public class Wieloryb extends Zwierze{
    String wieloryb="Janek";

    @Override
    public String toString() {
        return "Wieloryb{" +
                "wieloryb='" + wieloryb + '\'' +
                '}';
    }

    public String getWieloryb() {
        return wieloryb;
    }

    @Override
    public void jedz() {
        System.out.println("Wieloryb je!");
    }

    @Override
    public void wydalaj() {
        System.out.println("Wieloryb wydala!");
    }
}
