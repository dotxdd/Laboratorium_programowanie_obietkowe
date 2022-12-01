public class Okrag {
    Punkt srodek;
    // kompozycja
    double promien;

    public double getPowierzchnia(){
        return Math.PI*Math.pow(promien,2);
    }
    public double getSrednica(){
        return 2*promien;
    }
    public void setPromien(double r){
        this.promien=r;
    }
    public double getPromien(){
        return promien;
    }
    public void wSrodku(Punkt punkt){
        if ((Math.pow(srodek.x-punkt.x,2)+Math.pow(srodek.y-punkt.y,2)) <=Math.pow(promien,2)){
            System.out.println("Punkt lezy w srodku okregu");
        }
        else{
            System.out.println("Punkt lezy po za okregiem");
        }
    }

}
