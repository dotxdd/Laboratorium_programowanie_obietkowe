public class Gatunek implements Cloneable {
    String NazwaRodzaju, NazwaGatunku, opis;
    int chromosom2n, chromosomx;

    public Gatunek(String nazwaRodzaju, String nazwaGatunku, String opis, int chromosom2n, int chromosomx) {
        this.NazwaRodzaju = nazwaRodzaju;
        this.NazwaGatunku = nazwaGatunku;
        this.opis=opis;
        this.chromosom2n=chromosom2n;
        this.chromosomx=chromosomx;

    }

    public String getNazwa() {
        return (NazwaRodzaju+ NazwaGatunku);
    }

    public int getChromosomx() {
        return chromosomx;
    }

    @Override
    public String toString() {
        return "Gatunek{" +
                "NazwaRodzaju='" + NazwaRodzaju + '\'' +
                ", NazwaGatunku='" + NazwaGatunku + '\'' +
                ", opis='" + opis + '\'' +
                ", chromosom2n=" + chromosom2n +
                ", chromosomx=" + chromosomx +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
