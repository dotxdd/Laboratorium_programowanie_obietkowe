
class Prostokat extends Figura implements iFigury  {
    int wys=0;
    int szer=0;

    Prostokat(int wys,int szer,String kolor){
        this.wys = wys;
        this.szer = szer;
        super.kolor = kolor;
    }
    public void skaluj(float skala){
        wys*=skala;
        szer*=skala;
    }
    public String opis(){
        return "Prostokat o wymairach: "+szer+" x "+wys;
    }
    @Override
    public float getPowierzchnia(){
        return (szer*wys);
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }


}