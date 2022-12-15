

class Trojkat extends Figura implements iFigury{
    int wys=0;
    int podst=0;
    Trojkat(int wys,int podst,String kolor){

        this.wys = wys;
        this.podst = podst;
        super.kolor = kolor;
    }
    public void skaluj(float skala){
        wys*=skala;
        podst*=skala;
    }
    public String opis(){
        return "Trojkat o wymairach: "+wys+"  "+podst;
    }

    @Override
    public float getPowierzchnia() {
        return 0;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }
}