public class Prostokat {
    double wys, szer;

    public Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
    }
    public double Pole(){
        return wys*szer;
    }
    public double Obwod(){
        return 2*wys+2*szer;
    }
    public double Przekatna(){
        return Math.sqrt(Math.pow(wys,2)+(Math.pow(szer,2)));
    }
    public void Opis(){
        System.out.println("Prostokat o boku a:"+wys+" i boku b:"+ szer+"\nPole prostokata: "+Pole()+"\nObwod prostokata: "+Obwod()+"\nPrzekatna prostokata: "+Przekatna());
    }

}
